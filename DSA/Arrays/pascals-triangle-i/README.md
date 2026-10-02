# [Pascal's Triangle I](https://takeuforward.org/practice/dsa/pascals-triangle-i?category=faqs-medium&source=strivers-a2z-dsa-sheet)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given two integers **r** and **c** , return the value at the **r** ^ **th** row and **c** ^ **th** **** column (1-indexed) in a Pascal's Triangle.

In **Pascal's triangle** :

- The first row contains a single element 1.

- Each row has one more element than the previous row.

- Every row starts and ends with 1.

**For all interior elements (i.e., not at the ends), the value at position (r, c) is computed as the sum of the two elements directly above it from the previous row:**

```
Pascal[r][c]=Pascal[r−1][c−1]+Pascal[r−1][c]
```

- where indexing is 1-based

### Example 1:

**Input:** r = 4, c = 2

**Output:** 3

**Explanation:**

The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

....

Thus, value at row 4 and column 2 = 3

### Example 2:

**Input:** r = 5, c = 3

**Output:** 6

**Explanation:**

The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

1 4 6 4 1

....

Thus, value at row 5 and column 3 = 6

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= r, c <= 30
- c <= r
- All values will fit inside a 32-bit integer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
