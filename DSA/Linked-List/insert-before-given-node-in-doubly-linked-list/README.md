# [Insert before given node in Doubly Linked List](https://takeuforward.org/plus/dsa/problems/insert-before-given-node-in-dll?subject=dsa&approach=brute&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given a node's reference within a doubly linked list and an integer X, insert a node with value X before the given node in the linked list while preserving the list's integrity.

You will only be given the node's reference, not the head of the list. It is guaranteed that the given node will not be the head of the list.

### Example 1

<p>

**Input:** head = [1, 2, 6], node = 6, X = 7</p><p>

**Output:** head = [1, 2, 7, 6]</p><p>

**Explanation:** Note that the head was not given to the function.</p>

### Example 2

<p>

**Input:** head = [7, 5, 15], node = 5, X = 10</p><p>

**Output:** head = [7, 10, 5, 15]</p>Explanation: The node with value 5 was referenced, thus the new node was added before the given node.

### Constraints

- n == Number of nodes in the Linked List
- 2 <= n <= 100
- 0 <= ListNode.val <= 100
- 0 <= X <= 100
- It is guaranteed the given node will be a part of a doubly linked list and will not be its head.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
