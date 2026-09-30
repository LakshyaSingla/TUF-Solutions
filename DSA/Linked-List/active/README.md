# [Special Linked List](https://takeuforward.org/practice/dsa/contest/385/active?source=strivers-a2z-dsa-sheet&category=linked-list)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the **head** of Linked List and an integer **val** , **partition** the list as a **special Linked List.**

A **special linked list** is one in which all nodes with values less than val come **before** all nodes equal to or greater than val. You have to keep the **relative ordering** of the nodes within the partition the same as the initial list.

### Example 1:

**Input:** head -> 5 -> 2 -> 4 -> 1 -> 3 -> 4, val = 3

**Output:** head -> 2 -> 1 -> 5 -> 4 -> 3 -> 4

**Explanation:** head -> 5 -> <u>2</u> -> 4 -> <u>1</u> -> 3 -> 4

The underlined nodes are less than val, so they come before others.

Note that the ordering of elements within the group is maintained.

### Example 2:

**Input:** head -> 3 -> 7 -> 2 -> 5 -> 3 -> 1, val = 4

**Output:** head -> 3 -> 2 -> 3 -> 1 -> 7 -> 5

**Explanation:** head -> <u>3</u> -> 7 -> <u>2</u> -> 5 -> <u>3</u> -> <u>1</u>

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= Number of Nodes in the Linked List <= 10^5
- -10^4 <= ListNode.val <= 10^4
- -10^4 <= val <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
