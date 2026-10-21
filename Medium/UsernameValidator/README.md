# Username Validator
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
Check if a username is valid based on requirements
## Requirements
- Accept a String username and return true if valid, false otherwise.
- Valid usernames are 3–16 characters long, letters and numbers only.
- Use length(), charAt(), and toLowerCase().
- Do not hard-code the results.

## Examples
```java
usernameValidator("Bob123")              // true
usernameValidator("Bo")                  // false (too short)
usernameValidator("Bob Smith")           // false (contains a space)
usernameValidator("Bob!")                // false (contains a symbol)
usernameValidator("ABCDEFGHIJKLMNOP")    // true (exactly 16 chars)
usernameValidator("ABCDEFGHIJKLMNOPQ")   // false (17 chars)
```
