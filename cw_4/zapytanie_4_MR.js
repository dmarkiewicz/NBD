function mapFn() {
    const BMI = this.weight / ((this.height / 100) ** 2);

    emit(this.nationality, {
        count: 1,
        BMI,
        minBMI: BMI,
        maxBMI: BMI 
    })
}

function reduceFn(key, values) {
    return {
        count: Array.sum(values.map(v => v.count)),
        BMI: Array.sum(values.map(v => v.BMI)),
        minBMI: Math.min(...values.map(v => v.minBMI)),
        maxBMI: Math.max(...values.map(v => v.maxBMI)),
    };
}

function finalizeFn(key, reducedValue) {
    return {
        avgBMI: reducedValue.BMI / reducedValue.count,
        minBMI: reducedValue.minBMI,
        maxBMI: reducedValue.maxBMI
    }
}

db.people.mapReduce(
    mapFn,
    reduceFn,
    {
        finalize: finalizeFn,
        out: "map_reduce_4"
    }
);

printjson(db.map_reduce_4.find().toArray())

