db.people.aggregate([
    {"$group": {
        "_id": "$sex",
        "avgWeight": { "$avg": "$weight" },
        "avgHeight": { "$avg": "$height" },
    }},
    {"$out": "aggregate_1"}
]);

printjson(db.aggregate_1.find().toArray())