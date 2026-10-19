# [Search in 2D matrix - II](https://takeuforward.org/practice/dsa/search-in-2d-matrix-ii?category=2d-arrays&source=strivers-a2z-dsa-sheet&solution=optimal)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given a 2D array matrix where each row is sorted in ascending order from left to right and each column is sorted in ascending order from top to bottom, write an efficient algorithm to search for a specific integer **target** in the matrix.

### Example 1:

Input: matrix = [ [1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30] ], target = 5

Output: True

Explanation: The target 5 exists in the matrix in the index (1,1)

### Example 2:

Input: matrix= [ [1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30] ], target = 20

Output: False

Explanation: The target 20 does not exist in the matrix.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- &nbsp;&nbsp;n == matrix.length
- &nbsp;&nbsp;m == matrix[i].length
- &nbsp;&nbsp;1 <= n, m <= 300
- &nbsp;&nbsp;-10^9 <= matrix[i][j] <= 10^9
- &nbsp;&nbsp;All the integers in each row are sorted in ascending order.
- &nbsp;&nbsp;All the integers in each column are sorted in ascending order.
- &nbsp;&nbsp;-10^9 <= target <= 10^9

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
