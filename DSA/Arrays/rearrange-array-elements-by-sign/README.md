# [Rearrange array elements by sign](https://takeuforward.org/plus/dsa/problems/rearrange-array-elements-by-sign?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an&nbsp;integer array&nbsp; **nums** of&nbsp;even&nbsp;length consisting of an&nbsp;equal&nbsp;number of positive and negative **** integers.Return the answer array in such a way that the given conditions are met:

- Every&nbsp;consecutive **** pair&nbsp;of integers have&nbsp; **opposite signs** .

- For all integers with the same sign, the&nbsp;order&nbsp;in which they were present in&nbsp;nums **** is&nbsp;preserved.

- The rearranged **** array begins with a positive **** integer.

### Example 1

<p>

**Input:** nums = [2, 4, 5, -1, -3, -4]</p><p>

**Output:** [2, -1, 4, -3, 5, -4]</p><p>

**Explanation:** </p>The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions

### Example 2

<p>

**Input:** nums = [1, -1, -3, -4, 2, 3]</p><p>

**Output:** [1, -1, 2, -3, 3, -4]</p><p>

**Explanation:** </p>The positive number 1, 2, 3 maintain their relative positions and -1, -3, -4 maintain their relative positions

### Constraints

- 2 <= nums.length <= 10^5
- 1 <= | nums[i] | <= 10^4
- nums.length is an even number.
- Number of positive and negative numbers are equal.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
