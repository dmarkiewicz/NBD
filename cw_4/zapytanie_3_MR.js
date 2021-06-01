function mapFn() {
    emit(this.job, null)
}

function reduceFn(key, values) {
    return null;
}

db.people.mapReduce(
    mapFn,
    reduceFn,
    {
        out: "map_reduce_3"
    }
);

printjson(db.map_reduce_3.find().toArray())

