# [Minimum Window Subsequence](https://takeuforward.org/practice/dsa/minimum-window-subsequence?category=longest-and-smallest-window-problems&source=strivers-a2z-dsa-sheet)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

<u>﻿</u>Given strings&nbsp;s1&nbsp;and&nbsp;s2, return&nbsp; *the minimum contiguous&nbsp;substring part of* s1 *, so that* s2 *is a subsequence of the part* .

If there is no such window in&nbsp;s1&nbsp;that covers all characters in&nbsp;s2, return the empty string&nbsp;"". If there are multiple such minimum-length windows, return the one with the&nbsp; **left-most starting index** .

### Example 1:

**Input: s1 = "abcdebdde", s2 = "bde"**

**Output: "bcde"**

**Explanation:**

**"bcde" is the answer because it occurs before "bdde" which has the same length.**

**"deb" is not a smaller window because the elements of s2 in the window must occur in order.**

### Example 2:

**Input: s1 = "jmeqsiwvaovvnbstl", s2 = "u"**

**Output: ""**

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s1.length <= 2 * 10^4
- 1 <= s2.length <= 100
- s1&nbsp;and&nbsp;s2&nbsp;consist of lowercase English letters.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
