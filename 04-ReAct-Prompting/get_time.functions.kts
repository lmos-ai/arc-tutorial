function(
    name = "get_time",
    description = "Returns the current time.",
) {
  "14:30"
}

function(
    name = "get_location",
    description = "Returns the customers location.",
) {
    "Berlin"
}

function(
    name = "get_weather",
    description = "Returns the current weather.",
    params = types(
        string("location", "The location of the customer.")
    )
) { (location) ->
    "The weather is sunny in $location"
}