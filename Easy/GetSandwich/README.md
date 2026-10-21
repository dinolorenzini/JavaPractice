# Get Sandwich
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)
Get the string surrounded by "bread"
## Requirements
- Return the text between the first two occurrences of `"bread"`.
- Case-sensitive: `"Bread"` does not count.
- If there are no two occurrences of `"bread"`, or nothing between them, return `""`.
- If there are more than two, only use the first two.

## Examples
```java
getSandwich("xxbreadjambreadyy")  // "jam"
getSandwich("breadjambread")      // "jam"
getSandwich("breadjam")           // ""
getSandwich("breadbread")         // ""
getSandwich("breadonebreadtwo")   // "one"
getSandwich("BreadjamBread")      // ""
```
