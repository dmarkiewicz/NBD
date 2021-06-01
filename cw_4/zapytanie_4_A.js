db.people.aggregate([
    {"$project": {
        "nationality": 1,
        "BMI": {
            "$divide": [
                "$weight", { "$multiply": [{"$divide": ["$height", 100]}, {"$divide": ["$height", 100]}] }
            ]
        }
    }},
    {"$group": {
        "_id": "$nationality",
        "avgBMI": { "$avg": "$BMI" },
        "minBMI": { "$min": "$BMI" },
        "maxBMI": { "$max": "$BMI" },
    }},
    {"$out": "aggregate_4"}
]);

printjson(db.aggregate_4.find().toArray())