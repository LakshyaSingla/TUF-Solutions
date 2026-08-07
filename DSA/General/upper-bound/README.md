# [Upper Bound](https://takeuforward.org/plus/dsa/problems/upper-bound?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given a sorted array of nums and an integer x, write a program to find the **upper bound** of **x** .

The **upper bound** of **x** is defined as the **smallest index** i such that **nums[i] > x** .

If no such index is found, return the size of the array.

### Example 1

<p>

**Input:** n= 4, nums = [1,2,2,3], x = 2</p><p>

**Output:** 3</p><p>

**Explanation:** </p>Index 3 is the smallest index such that arr[3] > x.

### Example 2

<p>

**Input:** n = 5, nums = [3,5,8,15,19], x = 9</p><p>

**Output:** 3</p><p>

**Explanation:** </p>Index 3 is the smallest index such that arr[3] > x.

### Constraints

- &nbsp;&nbsp;1 <= nums.length <= 10^5
- &nbsp;&nbsp;-10^5 < nums[i], x < 10^5
- &nbsp;&nbsp;nums is sorted in ascending order.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
