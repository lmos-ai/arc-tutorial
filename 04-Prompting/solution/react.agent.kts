// SPDX-FileCopyrightText: 2025 Deutsche Telekom AG and others
//
// SPDX-License-Identifier: Apache-2.0

agent {
    name = "react-agent"
    description = "A helpful assistant that can provide information and answer questions."
    model { "GPT-4o" }
    tools = AllTools
    prompt {
        """
      Use the following format in your response:

      Question: the input question you must answer.
      Thought: you should always think about what to do.
      Action: the action to take, should be one of [get_time, get_weather, get_location].
      Observation: the result of the action.
      (Note: this Thought/Action/Observation can repeat N times)
      Thought: I now know the final answer.
      Final Answer: the final answer to the original input question.
      """
    }
}
