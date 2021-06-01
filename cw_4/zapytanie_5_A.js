db.people.aggregate([
    {"$match": {
        "nationality": "Poland",
        "sex": "Female"
    }},
    {"$unwind": "$credit"},
    {"$group": {
        "_id": "$credit.currency",
        "totalBalance": {"$sum": "$credit.balance"},
        "avgBalance": {"$avg": "$credit.balance"}
    }},
    {"$out": "aggregate_5"}
]);

printjson(db.aggregate_5.find().toArray());