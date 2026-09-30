# [Search in a 2D Matrix](https://takeuforward.org/practice/dsa/search-in-a-2d-matrix)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given a 2-D array mat where the elements of each row are sorted in non-decreasing order, and the first element of a row is greater than the last element of the previous row (if it exists), and an integer target, determine if the **target** exists in the given mat or not.

### Example 1:

Input: mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8

Output: True

Explanation: The target = 8 exists in the 'mat' at index (1, 3).

### Example 2:

Input: mat = [ [1, 2, 4], [6, 7, 8], [9, 10, 34] ], target = 78

Output: False

Explanation: The target = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- &nbsp;&nbsp;n == mat.length
- &nbsp;&nbsp;m == mat[i].length
- &nbsp;&nbsp;1 <= m, n <= 100
- &nbsp;&nbsp;-10^4 <= mat[i][j], target <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
