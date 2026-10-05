Create additional Java practice problems using the exact format and style below.

I want TWO outputs:

1. MARKDOWN
   Return each practice problem in this format:

# Problem Name

Difficulty: Easy/Medium/Hard

## Requirements

* Requirement
* Requirement
* Requirement

2. JSON
   Return one JSON array containing every problem. Each object must have exactly these fields:

{
"name": "...",
"difficulty": "...",
"requirements": [
"...",
"..."
],
"file": "..."
}

For the Java code, use this exact style:

* Class names MUST be abbreviated according to the problem name. For example:

  1. Random Number Analyzer → RNA
  2. Username Validator → UV
  3. Grade Analyzer → GA
  4. Tic-Tac-Toe Board Checker → TTTB
  5. Simple Command Parser → SCP
* No comments in the Java code.
* Use normal Java class/method formatting like a high-school CS class assignment.
* The student should ONLY have to implement the method. Leave the method body empty.
* Put all testing inside main().
* Tests must look like individual unit tests, similar to:

public static void main(String[] args)
{
if(method(input) == expected)
System.out.println("correct");
else
System.out.println("incorrect");
}

* Each individual test should generally be 4–5 lines.
* Do NOT create separate test methods.
* Do NOT create a large testing framework.
* Do NOT independently recreate the entire student's algorithm in the test code.
* The expected answer should be determined from the specific test case and written directly in the individual if statement, just like a normal CS class assignment.
* Use multiple tests to cover the requirements and edge cases.
* Make the tests actually test the requirements rather than repeating the same simple case.
* Do not put answers or implementation hints inside the student's method.
* Do not use placeholders such as "// Your code here" or "// Their code". Just leave the method body empty.
* Do not include comments anywhere in the Java code.
* Make sure every test and expected result is correct.
* Make the problems appropriate for high-school Java students.
* Gradually include harder concepts such as arrays, ArrayLists, strings, loops, nested loops, methods, conditionals, 2D arrays, and basic object-oriented programming when appropriate.
* Do not make every problem unnecessarily complicated.
* Keep the requirements specific enough that the student knows exactly what they need to implement.

After the Markdown and JSON, provide the complete Java practice code for every problem.

Do not change this format unless I explicitly ask you to.
