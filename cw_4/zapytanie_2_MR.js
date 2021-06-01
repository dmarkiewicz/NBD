function mapFn() {
    this.credit.forEach(c => {
        emit(c.currency, c.balance);
    })
}

function reduceFn(key, values) {
    return Array.sum(values);
}

function finalizeFn(key, reducedValue) {
    return reducedValue;
}

db.people.mapReduce(
    mapFn,
    reduceFn,
    {
        finalize: finalizeFn,
        out: "map_reduce_2"
    }
);

printjson(db.map_reduce_2.find().toArray())

