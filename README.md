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
