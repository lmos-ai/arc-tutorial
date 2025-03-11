# Exercise 5 - Build Your Own Agent

## Goal

Use your new skills to implement your own agent that has a special expertise! Your imagination is the only limit!

## Instructions

Think of a nice use case for an agent and implement your own agent.

Once done, create a pull request on GitHub against https://github.com/hsudbrock/lmos-barcamp-agents/tree/main/agents.

## Ideas for Tools

Here are some tool suggestions that might be interesting for your agent:

- Spotify API (have an account ready, and let the agent select music) (kotlin lib: https://github.com/adamint/spotify-web-api-kotlin)
- kubernetes (give the tool access to a kubernetes cluster, and make the agent use the tool to get infos about the cluster, or even make the agent create namespaces, restart deployments, etc.)
- OpenWeatherMap: 100 calls / day free: https://openweathermap.org/api
 - Air Quality: https://aqicn.org/data-platform/token/
 - OneBusAway: https://developer.onebusaway.org/api/where
 - OpenUV: https://www.openuv.io/
 - SolCast: https://toolkit.solcast.com.au/register
 - TankerKönig: https://www.tankerkoenig.de/

## Ideas for Agents

Here are some ideas for agents that can be built quickly to give you a starting point for brainstorming:

### Web Service Agents
- Weather Checker - Takes a city name, calls a simple weather API, and formats the current conditions
- Currency Converter - Converts between two currencies using a public exchange rate API
- Random Joke Fetcher - Calls a joke API and delivers jokes based on optional category input
- Word Definition Lookup - Uses a dictionary API to provide definitions of words
- Simple News Headline Agent - Fetches top headlines from a news API for a given topic
- Spotify Agent - Steer spotify playlist based on mood or keywords

### Local System Agents
- File Lister - Runs ls/dir commands and summarizes what's in a directory
- System Info Reporter - Executes simple system commands (uname -a, systeminfo, etc.) and explains the output
- Text File Reader - Reads local text files and provides summaries or answers questions about content
- Simple Calculator - Takes math expressions, evaluates them using local system capabilities, explains steps
- Timer/Reminder - Sets local system timers and notifies when complete

- ### Practical Utilities
- URL Shortener - Takes long URLs and creates shortened versions using a URL shortening API
- Random Password Generator - Creates secure passwords and explains their strength
- Basic Translation Helper - Translates short phrases between languages using a translation API
- IP Geolocation Tool - Looks up geographic information about IP addresses
- Basic Web Page Summarizer - Fetches and summarizes content from web pages using simple HTTP requests

### Creative Mini-Agents
- Rhyme Finder - Uses a rhyming API to find words that rhyme with user input
- Simple Art Prompt Generator - Creates drawing/art prompts and can search for reference images
- Quote Finder - Fetches inspirational quotes based on themes or keywords
- Color Palette Suggester - Generates color combinations using a color API based on a base color
- Markdown Formatter - Converts plain text to properly formatted Markdown