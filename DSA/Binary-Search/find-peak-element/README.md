# [Find peak element](https://takeuforward.org/plus/dsa/problems/find-peak-element?subject=dsa&approach=binary-search&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array arr of integers. A peak element is defined as an element greater than both of its neighbors.

Formally, if arr[i] is the peak element, **arr[i - 1] < arr[i]** and **arr[i + 1] < arr[i]** .

Find the index(0-based) of a **peak** **element** in the array. If there are multiple peak numbers, return the index of any peak number.

**Note** :

- As there can be many peak values, " **true"** is given as output if the returned index is a peak number, otherwise the returned value of index.

### Example 1

<p>

**Input:** arr = [1, 2, 3, 4, 5, 6, 7, 8, 5, 1]</p><p>

**Output:** 7</p><p>

**Explanation:** In this example, there is only 1 peak that is at index 7.</p>

### Example 2

<p>

**Input:** arr = [1, 2, 1, 3, 5, 6, 4]</p><p>

**Output:** 1</p><p>

**Explanation:** In this example, there are 2 peak numbers at indices 1 and 5. We can consider any of them.</p>

### Constraints

- &nbsp;1 <= arr.length <= 1000
- &nbsp;-2^31 <= arr[i] <= 2^31 - 1
- &nbsp;arr[i] != arr[i + 1] for all valid i.
- For arr[0], its left element can be considered as -∞
- For arr[n-1], its right element can be considered as -∞

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
