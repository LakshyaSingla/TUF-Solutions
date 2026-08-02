# [Leaders in an Array](https://takeuforward.org/plus/dsa/problems/leaders-in-an-array?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** , return a list of all the leaders in the array.

A leader in an array is an element whose value is **strictly** greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the **order they appear** in the nums array.

### Example 1

<p>

**Input:** nums = [1, 2, 5, 3, 1, 2]</p><p>

**Output:** [5, 3, 2]</p><p>

**Explanation:** </p>2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5 is the largest element in the index range [2, 5]

### Example 2

<p>

**Input:** nums = [-3, 4, 5, 1, -4, -5]</p><p>

**Output:** [5, 1, -4, -5]</p><p>

**Explanation:** </p>-5 is the rightmost element, -4 is the largest element in the index range [4, 5], 1 is the largest element in the index range [3, 5] and 5 is the largest element in the range [2, 5]

### Constraints

- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
