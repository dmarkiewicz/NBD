printjson(db.people.insert(
    {
        "sex" : "Male",
        "first_name" : "Dariusz",
        "last_name" : "Markiewicz",
        "job" : "Software engineer",
        "email" : "fake.mail@gmail.com",
        "location" : {
            "city" : "Warszawa",
            "address" : {
                "streetname" : "Fake",
                "streetnumber" : "999"
            }
        },
        "description" : "vulputate justo in blandit ultrices enim lorem ipsum dolor sit amet consectetuer adipiscing elit proin interdum mauris",
        "height" : 183.0,
        "weight" : 87.0,
        "birth_date" : ISODate("1997-11-04T02:55:03Z"),
        "nationality" : "Poland",
        "credit" : [
            {
                "type" : "switch",
                "number" : "6759888939100098699",
                "currency" : "PLN",
                "balance" : 1000000.00
            }
        ]
    }
));