# Step 2 Integrate an API.

APIs can be integrated into an Agent in different ways.

Injecting API calls into the prompt function.

```kts
agent {
    name = "weather"
    description = "Agent that provides weather data."
    prompt { 
        val data = httpGet()
        """ Use the following data to generate an answer -> $data""" 
    }
}
```


Injecting API calls into a function.

See https://eclipse.dev/lmos/docs/arc/dsl/defining_functions/

## Goal

The goal of this exercise set up integrate an API that is 
used to generate a response in the prompt function.

