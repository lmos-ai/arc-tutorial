# Step 2 Integrate an API.

## Goal

The goal of this exercise set up integrate an API that is
used to generate a response in the prompt function.


## Instructions

APIs can be integrated into an Agent in different ways.

1. Injecting API calls into the prompt function.

```kts
agent {
    name = "weather"
    description = "Agent that provides weather data."
    prompt { 
        val data = httpGet("my-api")
        """ Use the following data to generate an answer -> $data""" 
    }
}
```

2. Injecting API calls into a function.

```kts
function(
    name = "get_data_from_api",
    description = "Returns some data",
) { 
    httpGet("my-api")
}
```

See https://eclipse.dev/lmos/docs/arc/dsl/defining_functions/



