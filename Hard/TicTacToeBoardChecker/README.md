# Tic-Tac-Toe Board Checker
![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)
Check a tic-tac-toe board to see who won
## Requirements
- Accept a char[3][3] board containing only 'X', 'O', or ' '.
- Check all rows, columns, and both diagonals.
- Return exactly `"X wins"`, `"O wins"`, or `"No winner"`.
- Use nested for loops where appropriate.
- Do not hard-code the winner.

## Examples
```java
checkBoard(new char[][]{
    {'X','X','X'},
    {'O',' ','O'},
    {' ',' ',' '}
}); // "X wins"

checkBoard(new char[][]{
    {'X','O',' '},
    {'O','X',' '},
    {' ',' ','X'}
}); // "X wins" (diagonal)

checkBoard(new char[][]{
    {'O','X',' '},
    {'O','X',' '},
    {'O',' ','X'}
}); // "O wins" (column)

checkBoard(new char[][]{
    {'X','O','X'},
    {'O','X','O'},
    {'O','X','O'}
}); // "No winner"
```
