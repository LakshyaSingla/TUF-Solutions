# [Insertion before the value X in Linked List](https://takeuforward.org/plus/dsa/problems/insertion-before-the-value-x-in-ll?subject=dsa&approach=better&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given the head of a singly linked list and two integers X and val.

Insert a node with value val before the node with value X in the linked list and return the head of the modified list.

### Example 1

<p>

**Input:** linkedList = [1, 2, 3], X = 2, val = 5</p><p>

**Output:** [1, 5, 2, 3]</p><p>

**Explanation:** </p>The node with value 5 was added before the node with value 2

### Example 2

<p>

**Input:** linkedList = [1, 2, 3], X = 7, val = 5</p><p>

**Output:** [1, 2, 3]</p><p>

**Explanation:** </p>No node was added as X was not found in the list.

### Example 3

<p>

**Input:** linkedList = [1], X = 1, val = 10</p>Output:

[10, 1]

### Constraints

- n == number of nodes in the Linked List
- 1 <= n <= 1000
- 0 <= ListNode.val <= 100
- 0 <= X <= 100
- 0 <= val <= 100
- Number of nodes with value X is 0 or 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
