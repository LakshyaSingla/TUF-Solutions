# [Pascal's Triangle III](https://takeuforward.org/plus/dsa/problems/pascals-triangle-iii?subject=dsa&approach=optimal&sidebar=open&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer&nbsp; **n,** return the first **n** (1-Indexed) rows of Pascal's **** triangle.

In&nbsp; **Pascal's triangle** :

- The&nbsp; **first** row has one element with a value of&nbsp; **1** .
- Each row has one more **** element in it than its&nbsp; **previous** row.
- The value of each element is equal **** to the sum **** of the elements directly **** above it when arranged in a triangle format.

### Example 1

<p>

**Input:** n = 4</p><p>

**Output:** [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]</p><p>

**Explanation:** The Pascal's Triangle is as follows:</p>1

1 1

1 2 1

1 3 3 1

1st Row has its value set to 1.

All other cells take their value as the sum of the values directly above them

### Example 2

<p>

**Input:** n = 5</p><p>

**Output:** [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]</p><p>

**Explanation:** The Pascal's Triangle is as follows:</p>1

1 1

1 2 1

1 3 3 1

1 4 6 4 1

1st Row has its value set to 1.

All other cells take their value as the sum of the values directly above them

### Constraints

- 1 <= n <= 30
- All values will fit inside a 32-bit integer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
