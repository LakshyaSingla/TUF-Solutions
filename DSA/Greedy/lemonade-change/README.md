# [Lemonade Change](https://takeuforward.org/plus/dsa/problems/lemonade-change?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Each lemonade at a booth sells for $5. Consumers are lining up to place individual orders, following the billing order. Every consumer will purchase a single lemonade and may pay with a $5, $10, or $20 bill. Each customer must receive the appropriate change so that the net transaction is $5. Initially, there is no change available.

Determine if it is possible to provide the correct change to every customer. Return **true** if the correct change can be given to every customer, and **false** otherwise.

Given an integer array bills, where bills[i] is the bill the ith customer pays, return true if the correct change can be given to every customer, and false otherwise.

### Example 1

<p>

**Input:** bills = **** [5, 5, 10, 5, 20]</p>

<p>

**Output:** true</p>

<p>

**Explanation:** Initially we have $0 available for change.</p>From first two customers, we will collect two $5 bills in order. After the first two customers we have two $5 bills available with us for change.

From the third customer , we collect bill of $10 and give back $5. After third customer we have one $5 and one $10 bill available with us for change.

From fourth customer , we collect $5 bill. After fourth customer we have two $5 and one $10 bills available with us for change if required.

From fifth customer , we collect bill of $20 and give back $15 (one $10 + one $5 bill).

Since all the customers did receive the change correctly , so we return true.

### Example 2

<p>

**Input:** bills = [5, 5, 10, 10, 20]</p>

<p>

**Output:** false</p>

<p>

**Explanation:** From first two customers, we will collect two $5 bills in order. After the first two customers we have two $5 bills available with us for change.</p>From third customer , we collect $10 and give back $5. After the third customer we have one $5 and one $10 bill available with us for change.

From fourth customer , we collect $10 and give back $5. After the fourth customer we have two $10 bill available with us for change.

From fifth customer , we collect $20 , we cannot give the $15 change as we have two $10 bills.

Since all the customers did not receive the change correctly , the we return false.

### Constraints

- 1 <= bills.length <= 10^5
- bills[i] = {5 , 10 , 20}

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
