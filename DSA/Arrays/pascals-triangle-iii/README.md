# [Pascal's Triangle III](https://takeuforward.org/practice/dsa/pascals-triangle-iii?category=faqs-medium&source=strivers-a2z-dsa-sheet)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer&nbsp; **n,** return the first **n** (1-Indexed) rows of Pascal's **** triangle.

In&nbsp; **Pascal's triangle** :

- The&nbsp; **first** row has one element with a value of&nbsp; **1** .
- Each row has one more **** element in it than its&nbsp; **previous** row.
- The value of each element is equal **** to the sum **** of the elements directly **** above it when arranged in a triangle format.

### Example 1:

**Input:** n = 4

**Output:** [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]

**Explanation:** The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

1st Row has its value set to 1.

All other cells take their value as the sum of the values directly above them

### Example 2:

**Input:** n = 5

**Output:** [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

**Explanation:** The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

1 4 6 4 1

1st Row has its value set to 1.

All other cells take their value as the sum of the values directly above them

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n <= 30
- All values will fit inside a 32-bit integer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
