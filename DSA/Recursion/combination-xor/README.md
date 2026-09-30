# [Combination XOR](https://takeuforward.org/practice/dsa/combination-xor)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of **distinct** integers **nums** and an integer **k** , return all **unique non-empty** combinations of elements with a bitwise **XOR** of **k** . Return an empty vector if no combinations are possible.

Each element can be used only **once** in each combination. Two combinations are **unique** if at least one element is present in only one combination. Answer can be returned in any order.

### Example 1:

**Input:** nums = [57, 21, 8, 52, 41, 73], k = 57

**Output:** [[8, 21, 41, 52, 57], [57]]

**Explanation:**

8 xor 21 xor 41 xor 52 xor 57 = 57

57 itself is another combination.

No other distinct combination exists.

### Example 2:

**Input:** nums = [1, 2, 3, 5], k = 1

**Output:** [[1], [2, 3]]

**Explanation:**

2 ^ 3 = 1

1 itself is another combination.

No other distinct combination exists.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10
- 0 <= nums[i] <= 1000
- 0 <= k <= 1000

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
