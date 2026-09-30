# [Segregate Nodes into 3 parts in LL](https://takeuforward.org/practice/dsa/contest/385/active?source=strivers-a2z-dsa-sheet&category=linked-list)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the head of a singly linked list, group all nodes based on the **remainder** when their indices are divided by&nbsp;3 (i.e., indices % 3). Rearrange the list so that nodes with the same remainder are grouped together, and the groups appear in the order of **increasing** remainder values (0, 1, then 2). Return the head of the reordered linked list.

Consider the 1^st node to have index 1 and so on. The relative order of the elements inside each group must remain the same as the given input.

### Example 1:

**Input:** head -> 1 -> 2 -> 3 -> 4 -> 5 -> 6

**Output:** head -> 3 -> 6 -> 1 -> 4 -> 2 -> 5

**Explanation:**

head -> 1(1) -> 2(2) -> 3(0) -> 4(1) -> 5(2) -> 6(0)

In brackets, the value of index%3 is given. Ones with the same value are grouped together.

head -> 3(0) -> 6(0) -> 1(1) -> 4(1) -> 2(2) -> 5(2)

### Example 2:

**Input:** head -> 6 -> 7 -> 3 -> 3 -> 7 -> 9 -> 1

**Output:** head -> 3 -> 9 -> 6 -> 3 -> 1 -> 7 -> 7

**Explanation:**

head -> 6(1) -> 7(2) -> 3(0) -> 3(1) -> 7(2) -> 9(0) -> 1(1)

In brackets, the value of index%3 is given. Ones with the same value are grouped together.

head -> 3(0) -> 9(0) -> 6(1) -> 3(1) -> 1(1) -> 7(2) -> 7(2)

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 3 <= Number of nodes in the Linked List <= 10^5
- -10^4 <= ListNode.val <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
