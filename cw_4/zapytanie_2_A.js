db.people.aggregate([
    {"$unwind": "$credit"},
    {"$group": {
        "_id": "$credit.currency",
        "totalAmount": { "$sum": "$credit.balance" }
    }},
    {"$out": "aggregate_2"}
]);

printjson(db.aggregate_2.find().toArray());