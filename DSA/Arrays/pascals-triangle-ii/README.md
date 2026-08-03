# [Pascal's Triangle II](https://takeuforward.org/plus/dsa/problems/pascals-triangle-ii?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer **r** , return all the values in the **r** ^ **th** **row** (1-indexed) **** in Pascal's Triangle in correct order.

In **Pascal's triangle** :

- The **first** row has one element with a value of **1** .

- Each row has one more **** element in it than its **previous** row.

- The value of each element is equal **** to the sum **** of the elements directly **** above it when arranged in a triangle format.

### Example 1

<p>

**Input:** r = 4</p><p>

**Output:** [1, 3, 3, 1]</p><p>

**Explanation:** </p>The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

....

Thus the 4th row is [1, 3, 3, 1]

### Example 2

<p>

**Input:** r = 5</p><p>

**Output:** [1, 4, 6, 4, 1]</p><p>

**Explanation:** </p>The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

1 4 6 4 1

....

Thus the 5th row is [1, 4, 6, 4, 1]

### Constraints

- 1 <= r <= 30
- All values will fit inside a 32-bit integer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
