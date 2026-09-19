# [Find row with maximum 1's](https://takeuforward.org/plus/dsa/problems/find-row-with-maximum-1's?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given a non-empty grid mat consisting of only 0s and 1s, where all the rows are sorted in ascending order, find the **index** of the row with the **maximum number** of ones.

If two rows have the same number of ones, consider the one with a smaller index. If **no 1 exists** in the matrix, return -1.

### Example 1

Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]

Output: 0

Explanation: The row with the maximum number of ones is 0 (0 - indexed).

### Example 2

Input: mat =&nbsp;[ [0, 0], [0, 0] ]

Output: -1

Explanation: The matrix does not contain any 1. So, -1 is the answer.

### Constraints

- &nbsp;&nbsp;n == mat.length&nbsp;
- &nbsp;&nbsp;m == mat[i].length&nbsp;
- &nbsp;&nbsp;1 <= n, m <= 100&nbsp;
- &nbsp;&nbsp;mat[i][j] is either 0 or 1.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
