# [Group Words by Anagrams](https://takeuforward.org/practice/dsa/contest/380/active?source=strivers-a2z-dsa-sheet&category=hashing)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of strings strs, group the words that are anagrams of each other.

An anagram is a word formed by rearranging the letters of another word using all the original letters exactly once. You may return the groups in any order.

### Example 1:

**Input:** strs = ["race", "care", "acre", "bake", "beak", "keep"]

**Output:** [["race", "care", "acre"], ["bake", "beak"], ["keep"]]

**Explanation:**

"race", "care", and "acre" are anagrams and can be rearranged to form each other.

"bake" and "beak" are anagrams and form another group.

"keep" does not have any anagrams in the list and forms its own group.

### Example 2:

**Input:** strs = ["bob", "obb", "boo", "oob", "bbo"]

**Output:** [["bob", "obb", "bbo"], ["boo", "oob"]]

**Explanation:**

"bob", "obb", and "bbo" are anagrams and can be rearranged to form each other.

"boo" and "oob" are anagrams and form another group.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= strs.length <= 10^4
- 0 <= strs[i].length <= 100

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
