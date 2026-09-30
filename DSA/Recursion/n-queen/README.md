# [N Queen](https://takeuforward.org/practice/dsa/n-queen)

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

### Example 1:

**Input:** n = 4

**Output:** [[".Q.." , "...Q" , "Q..." , "..Q."] , ["..Q." , "Q..." , "...Q" , ".Q.."]]

**Explanation:** There are two possible combinations as shown below.

<img src="https://static.takeuforward.org/content/1789481625_5Yugvbee.webp">

### Example 2:

**Input:** n = 2

**Output:** [ [] ]

**Explanation:** There is no possible combination for placing two queens on a board of size 2*2.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n <= 9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
