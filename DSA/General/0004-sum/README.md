# [4 Sum](https://takeuforward.org/plus/dsa/problems/4-sum?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** and an integer **target** . Return all quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

- a, b, c, d are all distinct valid indices of nums.

- nums[a] + nums[b] + nums[c] + nums[d] == target.

Notice that the solution set must not contain duplicate quadruplets. One element can be a part of multiple quadruplets. The output and the quadruplets can be returned in any order.

### Example 1

<p>

**Input:** nums = [1, -2, 3, 5, 7, 9], target = 7</p><p>

**Output:** [[-2, 1, 3, 5]]</p><p>

**Explanation:** </p>nums[1] + nums[0] + nums[2] + nums[3] = 7

### Example 2

<p>

**Input:** nums = [7, -7, 1, 2, 14, 3], target = 9</p><p>

**Output:** []</p><p>

**Explanation:** </p>No quadruplets are present which add upto 9

### Constraints

- 1 <= nums.length <= 200
- -10^4 <= nums[i] <= 10^4
- -10^4 <= target <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
