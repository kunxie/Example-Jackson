# Example-Jackson

## case 1

## case 2

json string <--> `Map<String, List<String>>`

## case 3 - unwrap the attributes

### source json

```json
{
  "out-key-1": {
    "inner-other-key-1": "inner-val-11",
    "inner-other-key-2": "inner-val-12",
    "inner-target-key": "inner-target-val-1"
  },
  "out-key-2": {
    "inner-other-key-1": "inner-val-21",
    "inner-other-key-2": "inner-val-22",
    "inner-target-key": "inner-target-val-2"
  }
}
```

### target json

```json
{
  "out-key-1": "inner-target-val-1",
  "out-key-2": "inner-target-val-2"
}
```

target Java format should be `Map<String, String>`

## case 4

process JSON array and JSON object at the same time (treat JSON object as the only element of JSON array)

### source json

```json
{
  "person": {
    "name": "jack",
    "gender": "male"
  }
}
```

```json
{
  "person": [
    {
      "name": "Mike",
      "gender": "male"
    },
    {
      "name": "Jane",
      "gender": "female"
    }
  ]
}
```

### target json

```json
{
  "person": [
    {
      "name": "jack",
      "gender": "male"
    }
  ]
}
```

```json
{
  "person": [
    {
      "name": "Mike",
      "gender": "male"
    },
    {
      "name": "Jane",
      "gender": "female"
    }
  ]
}
```