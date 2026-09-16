# [Removing given node in Doubly Linked List](https://takeuforward.org/plus/dsa/problems/removing-given-node-in-dll?subject=dsa&approach=brute&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given a node's reference within a doubly linked list, remove that node from the linked list while preserving the list's integrity.

You will only be given the node's reference, not the head of the list. It is guaranteed that the given node will not be the head of the list.

### Example 1

<p>

**Input:** head = [1, 3, 5], node = 3</p><p>

**Output:** [1, 5]</p><p>

**Explanation:** </p>
- The referenced node with value 3 was removed.

### Example 2

<p>

**Input:** head = [1, 3, 7], node = 7</p><p>

**Output:** head = [1, 3]</p><p>

**Explanation:** </p>
- The referenced node with value 7 was removed.

### Constraints

- 2 <= Number of nodes in the list <= 100
- 0 <= ListNode.val <= 100
- Node is guaranteed to be a part of the linked list and will not be the head

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
