function mapFn() {
    if (this.nationality === 'Poland' && this.sex === 'Female') {
        this.credit.forEach(c => {
            emit(c.currency, {
                count: 1,
                balance: c.balance
            })
        })
    }
}

function reduceFn(key, values) {
    return {
        count: Array.sum(values.map(v => v.count)),
        balance: Array.sum(values.map(v => v.balance)),
    };
}

function finalizeFn(key, reducedValue) {
    return {
        totalBalance: reducedValue.balance,
        avgBalance: reducedValue.balance / reducedValue.count,
    }
}

db.people.mapReduce(
    mapFn,
    reduceFn,
    {
        finalize: finalizeFn,
        out: "map_reduce_5"
    }
);

printjson(db.map_reduce_5.find().toArray())

