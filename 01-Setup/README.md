# Step 1 Setup 


## Goal

The goal of this exercise set up the Arc Framework environment on your local machine and
modify the prompt to respond with "Hello, AI Barcamp Attendee!" when the user types "hello".


## Instructions

Download IntelliJ IDEA Community Edition from the following URL:

https://www.jetbrains.com/idea/download/?section=mac

#### 1. Setup CLI

Documentation https://eclipse.dev/lmos/docs/arc/cli/


#### 2. Run Agent Server

At the root of this project, run the following command to start the Agent Server:

```
arc run agents
```

#### 3. Modify Prompt
Modify the prompt, located in the `assistant.agent.kts`, to respond with "Hello, AI Barcamp Attendee!" 
when the user types "hello".


#### 4. Open Chat Interface and Test Agent

To open the chat interface, navigate to the following URL in your browser:

```
https://eclipse.dev/lmos/chat/index.html?agentUrl=http://localhost:8080
```
