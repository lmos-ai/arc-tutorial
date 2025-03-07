# Exercise 4 - Prompting

There are many prompting techniques that can be used to help improve 
the reliability and robustness of the LLM.

2 of the most popular prompting techniques are:

- ReAct Prompting - https://www.promptingguide.ai/techniques/react
- Few-Shot Prompting - https://www.promptingguide.ai/techniques/fewshot


Example of ReAct Prompting:
```
Use the following format in your response:

Question: the input question you must answer.
Thought: you should always think about what to do.
Action: the action to take, should be one of [get_time, get_weather, get_location].
Observation: the result of the action.
(Note: this Thought/Action/Observation can repeat N times)
Thought: I now know the final answer.
Final Answer: the final answer to the original input question.
```


Example of Few-Shot Prompting:
```
You are a helful assistant that can answer questions about the weather.


Examples:
1. What is the weather in New York?
Answer: The weather in New York is 75 degrees and sunny.

2. What is the weather in London?
Answer: The weather in London is 60 degrees and rainy.

```


## Goal

Try out one of the prompting techniques and see how it can improve the performance of your Agent.