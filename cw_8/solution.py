import requests

def __main__():
    requests.put('http://localhost:8098/buckets/s15302/keys/Ivern', json={
        "name": "Ivern",
        "type": "Jungler",
        "health": 1000,
        "mana": 150
    })
    ivern = requests.get('http://localhost:8098/buckets/s15302/keys/Ivern').json()
    print("Original Ivern:")
    print(ivern)
    print()

    requests.put('http://localhost:8098/buckets/s15302/keys/Ivern', json={
        "name": "Ivern",
        "type": "Support",
        "health": 1000,
        "mana": 150
    })
    print("Modified Ivern:")
    ivern = requests.get('http://localhost:8098/buckets/s15302/keys/Ivern').json()
    print(ivern)
    print()

    requests.delete('http://localhost:8098/buckets/s15302/keys/Ivern')
    ivern = requests.get('http://localhost:8098/buckets/s15302/keys/Ivern')
    print("Getting non existent Ivern:")
    print(ivern.status_code)
    print(ivern.text)


__main__()


