# [826. Maximum Consecutive Good Numbers](https://takeuforward.org/practice/dsa/maximum-consecutive-good-numbers)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers **nums** and an array g **oodNumbers** , return the **maximum** number of **consecutive** good numbers in the array.

Any number present in the **goodNumbers** array is a good number.

### Example 1:

**Input:** nums = [1, 2, 3, 5, 4, 5, 1], goodNumbers = [3, 5]

**Output:** 2

**Explanation:**

[1, 2, <u>3, 5</u>, 4, 5, 1] the underlined numbers are all good numbers and give the maximum length.

### Example 2:

**Input:** nums = [4, 8, 1, 2, 0, 4, 6], goodNumbers = [1, 4, 2, 6]

**Output:** 2

**Explanation:**

[4, 8, <u>1, 2</u>, 0, 4, 6] the underlined numbers are all good numbers and give the maximum length.

Note that the segment with index **[5, 6]** (0 - Based) was also a possible answer.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^5
- 1 <= goodNumbers.length <= 10^5
- -10^4 <= nums[i], goodNumbers[i] <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
