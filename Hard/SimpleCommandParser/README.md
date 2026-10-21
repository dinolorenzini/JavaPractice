# Simple Command Parser
![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)
Simple CLI command line parsing tool
## Requirements
- Accept a String command with arguments, e.g. `"user Bob123"`.
- The first word is the command; parse it and handle its arguments.
- Supported commands: `hello`, `add <a> <b>`, `reverse <word>`, `user <name>`.
- Unknown commands return `"Unknown command"`.
- Malformed or missing arguments return `"Invalid command"`.
- Never crash on bad input.
- Do not hard-code the results.

## Examples
```java
commandParser("hello")           // "Hello!"
commandParser("add 5 10")        // "15"
commandParser("add 100 25")      // "125"
commandParser("reverse Java")    // "avaJ"
commandParser("user Bob123")     // "Bob123"
commandParser("dance")           // "Unknown command"
commandParser("add 5")           // "Invalid command"
commandParser("add hello 10")    // "Invalid command"
```
