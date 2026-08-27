# [Maximum Consecutive Good Numbers](https://takeuforward.org/plus/dsa/contest/arrays/maximum-consecutive-good-numbers?tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers **nums** and an array g **oodNumbers** , return the **maximum** number of **consecutive** good numbers in the array.

Any number present in the **goodNumbers** array is a good number.

### Example 1

<p>

**Input:** nums = [1, 2, 3, 5, 4, 5, 1], goodNumbers = [3, 5]</p><p>

**Output:** 2</p><p>

**Explanation:** </p>[1, 2, <u>3, 5</u>, 4, 5, 1] the underlined numbers are all good numbers and give the maximum length.

### Example 2

<p>

**Input:** nums = [4, 8, 1, 2, 0, 4, 6], goodNumbers = [1, 4, 2, 6]</p><p>

**Output:** 2</p><p>

**Explanation:** </p>[4, 8, <u>1, 2</u>, 0, 4, 6] the underlined numbers are all good numbers and give the maximum length.

Note that the segment with index **[5, 6]** (0 - Based) was also a possible answer.

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
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
