# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## About this repo

Java assignments for Waseda University's intro Java course. Each file is a standalone program — no build system, no external dependencies.

## Compile and run

Each `.java` file compiles and runs independently:

```bash
javac FileName.java && java FileName
```

Example:
```bash
javac assignment8A_1W25CF09.java && java assignment8A_1W25CF09
```

## File naming convention

Assignment files follow the pattern: `assignment<week><letter>_1W25CF09.java`  
Report files follow: `Report<section><number>_1W25CF09.java`

The student ID suffix `_1W25CF09` appears on all submitted files. The public class name inside each file must match the filename exactly (without `.java`).

## Structure

```
intro-to-java/
  week5/      # Loops (for, while), random numbers
  week6/      # Arrays
  week8/      # Methods with parameters
  report1/    # Report assignments (matrix operations, etc.)
assignment8A_1W25CF09.java   # Root-level files are misplaced; should be in intro-to-java/week*/
```

## Key patterns used

- All programs use `public static void main(String args[])` as entry point
- Interactive programs use `Scanner(System.in)` and `scan.close()` at the end
- Random behavior uses `new Random(seed)` with a fixed seed for reproducibility
- No packages — all classes are in the default package
