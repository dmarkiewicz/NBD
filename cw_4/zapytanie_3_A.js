db.people.aggregate([
    {"$group": {
        "_id": "$job",
    }},
    {"$project": {
        "_id": 1,
    }},
    {"$out": "aggregate_3"}
]);

// or printjson(db.people.distinct("job"))

printjson(db.aggregate_3.find().toArray())