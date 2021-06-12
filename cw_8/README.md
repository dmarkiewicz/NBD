# Setup

## Run Riak
```docker run --name=riak -d -p 8087:8087 -p 8098:8098 basho/riak-kv```

## Setup virtual env
```
python3 -m venv solution-env
source solution-env/bin/activate
```

## Install requirements
```
pip install -r requirements.txt
```

## Run code
```
python solution.py
```
