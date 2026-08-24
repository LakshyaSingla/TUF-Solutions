# [Sudoku Solver](https://takeuforward.org/plus/dsa/problems/sudoko-solver?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Create a program that fills in the blank cells in a Sudoku puzzle to solve it.

Every sudoku solution needs to follow to these guidelines:

1) In every **row** , the numbers 1 through 9 must appear exactly **once** .

2) In every **column** , the numbers 1 through 9 must appear exactly **once** .

3) In each of the grid's nine **3x3** sub-boxes, the numbers 1 through 9 must appear exactly once.

Empty cells are indicated by the '.' character.

### Example 1

<p>

**Input:** board = [ ["5", "3", ".", ".", "7", ".", ".", ".", "."] , ["6", ".", ".", "1", "9", "5", ".", ".", "."] , [".", "9", "8", ".", ".", ".", ".", "6", "."] , ["8", ".", ".", ".", "6", ".", ".", ".", "3"] , ["4", ".", ".", "8", ".", "3", ".", ".", "1"] , ["7", ".", ".", ".", "2", ".", ".", ".", "6"] , [".", "6", ".", ".", ".", ".", "2", "8", "."] , [".", ".", ".", "4", "1", "9", ".", ".", "5"] , [".", ".", ".", ".", "8", ".", ".", "7", "9"] ]</p>

<img src="https://static.takeuforward.org/content/ProblemSetter-9SkzdAoS">

<p>

**Output:** [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]</p>

<img src="https://static.takeuforward.org/content/ProblemSetter-_QLy7-qR">

<p>

**Explanation:** The Input and Output boards are shown above.</p>

### Example 2

<p>

**Input:** board = [ [ ".", ".", ".", ".", ".", ".", "7", ".", ".", ], [ "7", ".", "5", ".", ".", ".", "9", ".", ".", ], [ ".", ".", ".", "9", "7", "5", "4", "3", "1", ], [ "9", ".", ".", ".", "4", "1", ".", ".", "7", ], [ ".", "5", ".", "8", ".", "7", "6", "4", ".", ], [ ".", "7", ".", ".", "2", ".", ".", ".", ".", ], [ ".", "4", ".", ".", ".", ".", ".", "6", "9", ], [ "1", "6", ".", "4", "3", ".", ".", ".", ".", ], [ ".", ".", ".", ".", "6", "2", "3", ".", "4", ] ]</p>

<img src="https://static.takeuforward.org/content/ProblemSetter-8n7tUdQC">

<p>

**Output:** [ [ "4", "1", "9", "3", "8", "6", "7", "5", "2", ], [ "7", "3", "5", "2", "1", "4", "9", "8", "6", ], [ "8", "2", "6", "9", "7", "5", "4", "3", "1", ], [ "9", "8", "3", "6", "4", "1", "5", "2", "7", ], [ "2", "5", "1", "8", "9", "7", "6", "4", "3", ], [ "6", "7", "4", "5", "2", "3", "1", "9", "8", ], [ "3", "4", "7", "1", "5", "8", "2", "6", "9", ], [ "1", "6", "2", "4", "3", "9", "8", "7", "5", ], [ "5", "9", "8", "7", "6", "2", "3", "1", "4", ] ]</p>

<img src="https://static.takeuforward.org/content/ProblemSetter-X2OcxA6t">

<p>

**Explanation:** The Input and output board are shown above.</p>

### Constraints

- board.length = 9
- board[i].length = 9
- board[i][j] is a digit or '.'
- It is **guaranteed** that input board has only one solution.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
