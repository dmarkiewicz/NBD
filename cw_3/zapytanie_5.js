printjson(db.people.find(
    {birth_date: {
        "$gte": ISODate("2001-01-01 00:00:00.000Z"),
        "$lt": ISODate("2101-01-01 00:00:00.000Z")
    }},
    {"first_name": true, "last_name": true, "location.city": true}
).toArray());