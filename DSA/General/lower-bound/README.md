# [Lower Bound](https://takeuforward.org/plus/dsa/problems/lower-bound-?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given a sorted array of nums and an integer x, write a program to find the **lower bound** of **x** .

The lower bound algorithm finds the first and smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.

If no such index is found, return the size of the array.

### Example 1

<p>

**Input:** nums= [1,2,2,3], x = 2</p><p>

**Output:** 1</p><p>

**Explanation:** </p>Index 1 is the smallest index such that arr[1] >= x.

### Example 2

<p>

**Input:** nums= [3,5,8,15,19], x = 9</p><p>

**Output:** 3</p><p>

**Explanation:** </p>Index 3 is the smallest index such that arr[3] >= x.

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
