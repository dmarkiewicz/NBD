function mapFn() {
    emit(this.sex, {
        count: 1,
        height: this.height,
        weight: this.weight
    });
}

function reduceFn(key, values) {
    return {
        count: Array.sum(values.map(v => v.count)),
        height: Array.sum(values.map(v => v.height)),
        weight: Array.sum(values.map(v => v.weight)),
    };
}

function finalizeFn(key, reducedValue) {
    return {
        avgWeight: reducedValue.weight / reducedValue.count,
        avgHeight: reducedValue.height / reducedValue.count
    }
}

db.people.mapReduce(
    mapFn,
    reduceFn,
    {
        finalize: finalizeFn,
        out: "map_reduce_1"
    }
);

printjson(db.map_reduce_1.find().toArray())

