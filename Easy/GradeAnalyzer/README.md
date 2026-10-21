# Grade Analyzer
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

Analyze test scores for a class - [Solutions](solutions/)
## Requirements
- Accept an int[] of test scores.
- Return one formatted String with the average, highest, lowest, passing count (>= 65), and failing count (< 65).
- Use the exact format shown in the examples.
- Use an enhanced for loop for at least one calculation.
- Do not hard-code the results.

## Examples
```java
gradeAnalyzer(new int[]{65})            // "Average: 65.0 | Highest: 65 | Lowest: 65 | Passing: 1 | Failing: 0"
gradeAnalyzer(new int[]{100, 50})       // "Average: 75.0 | Highest: 100 | Lowest: 50 | Passing: 1 | Failing: 1"
gradeAnalyzer(new int[]{90, 80, 70})    // "Average: 80.0 | Highest: 90 | Lowest: 70 | Passing: 3 | Failing: 0"
gradeAnalyzer(new int[]{60, 64, 65, 100}) // "Average: 72.25 | Highest: 100 | Lowest: 60 | Passing: 2 | Failing: 2"
```
