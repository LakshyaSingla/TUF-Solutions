# [N Queen](https://takeuforward.org/plus/dsa/problems/n-queen?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

The challenge of arranging **n** **queens** on a n × n chessboard so that no two queens attack one another is known as the "n-queens puzzle."

Return every unique solution to the **n-queens puzzle** given an integer n. The answer can be returned in any sequence.

Every solution has a **unique** board arrangement for the placement of the n-queens, where 'Q' and '.' stand for a queen and an empty space, respectively.

Here are the attack rules for N-Queens:

- Same Row - No two queens can be in the same row.
- Same Column - No two queens can be in the same column.
- Same Diagonal (top-left to bottom-right) - No two queens can share the same diagonal where (row - col) is equal.
- Same Anti-Diagonal (top-right to bottom-left) - No two queens can share the same anti-diagonal where (row + col) is equal.

### Example 1

<p>

**Input:** n = 4</p><p>

**Output:** [[".Q.." , "...Q" , "Q..." , "..Q."] , ["..Q." , "Q..." , "...Q" , ".Q.."]]</p><p>

**Explanation:** There are two possible combinations as shown below.</p>

<img src="https://static.takeuforward.org/content/ProblemSetter-LYFMng9U">

### Example 2

<p>

**Input:** n = 2</p><p>

**Output:** [ [] ]</p><p>

**Explanation:** There is no possible combination for placing two queens on a board of size 2*2.</p>

### Constraints

- 1 <= n <= 9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
