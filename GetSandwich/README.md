## Practice: Get Sandwich | Difficulty: Easy

**Requirements:**
- Create a method `public String getSandwich(String str)` that returns the text between the first occurrence of `"bread"` and the next occurrence of `"bread"`.
- If the string contains fewer than two occurrences of `"bread"`, return an empty string (`""`).
- The method must be case-sensitive, so `"Bread"` does not count as `"bread"`.
- The returned string may contain letters, numbers, spaces, or symbols.
- If the two occurrences of `"bread"` are next to each other, return an empty string.
- If the string contains more than two occurrences of `"bread"`, only use the first two occurrences.

**Examples:**

- `getSandwich("xxbreadjambreadyy")` → `"jam"`
- `getSandwich("breadjambread")` → `"jam"`
- `getSandwich("breadjam")` → `""`
- `getSandwich("breadbread")` → `""`
- `getSandwich("breadpeanut butterbread")` → `"peanut butter"`
- `getSandwich("breadonebreadtwobread")` → `"one"`
- `getSandwich("nothing here")` → `""`
- `getSandwich("BreadjamBread")` → `""`

**Goal:** Correctly identify the text between the two `"bread"` markers without including the markers themselves.
