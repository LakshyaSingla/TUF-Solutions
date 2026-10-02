# [LFU Cache](https://takeuforward.org/practice/dsa/lfu-cache?category=faqs&source=strivers-a2z-dsa-sheet)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Design and implement a data structure for a **Least Frequently Used (LFU)** cache.

Implement the LFUCache class with the following functions:

**LFUCache(int capacity):** Initialize the object with the specified capacity.

**int get(int key):** Retrieve the value of the key if it exists in the cache; otherwise, return -1.

**void put(int key, int value):** Update the value of the key if it is present in the cache, or insert the key if it is not already present. If the cache has reached its capacity, invalidate and remove the least frequently used key before inserting a new item. In case of a tie (i.e., two or more keys with the same frequency), invalidate the least recently used key.

A use counter is maintained for each key in the cache to determine the least frequently used key. The key with the smallest use counter is considered the least frequently used.

When a key is first inserted into the cache, its use counter is set to 1 due to the put operation. The use counter for a key in the cache is incremented whenever a get or put operation is called on it.

Ensure that the functions get and put run in **O(1)** average time complexity.

### Example 1:

Input:

["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]

[[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]

Output:

[null, null, null, 1, null, -1, 3, null, -1, 3, 4]

Explanation:

// cnt(x) = the use counter for key x

// cache=[] will show the last used order for tiebreakers (leftmost element is most recent)

LFUCache lfu = new LFUCache(2);

lfu.put(1, 1);&nbsp;&nbsp;// cache=[1,_], cnt(1)=1

lfu.put(2, 2);&nbsp;&nbsp;// cache=[2,1], cnt(2)=1, cnt(1)=1

lfu.get(1);&nbsp;&nbsp;&nbsp;// return 1

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[1,2], cnt(2)=1, cnt(1)=2

lfu.put(3, 3);&nbsp;&nbsp;// 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[3,1], cnt(3)=1, cnt(1)=2

lfu.get(2);&nbsp;&nbsp;&nbsp;// return -1 (not found)

lfu.get(3);&nbsp;&nbsp;&nbsp;// return 3

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[3,1], cnt(3)=2, cnt(1)=2

lfu.put(4, 4);&nbsp;&nbsp;// Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[4,3], cnt(4)=1, cnt(3)=2

lfu.get(1);&nbsp;&nbsp;&nbsp;// return -1 (not found)

lfu.get(3);&nbsp;&nbsp;&nbsp;// return 3

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[3,4], cnt(4)=1, cnt(3)=3

lfu.get(4);&nbsp;&nbsp;&nbsp;// return 4

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[4,3], cnt(4)=2, cnt(3)=3

### Example 2:

Input:

["LFUCache", "put", "put", "put", "put", "put", "get", "get", "get", "get", "get"]

[[3], [5, 7], [4, 6], [3, 5], [2, 4], [1, 3], [1], [2], [3], [4], [5]]

Output:

[null, null, null, null, null, null, 3, 4, 5, -1, -1]

Explanation:

// cnt(x) = the use counter for key x

// cache=[] will show the last used order for tiebreakers (leftmost element is most recent)

LFUCache lfu = new LFUCache(3);

lfu.put(5, 7);&nbsp;&nbsp;// cache=[5], cnt(5)=1

lfu.put(4, 6);&nbsp;&nbsp;// cache=[4,5], cnt(4)=1, cnt(5)=1

lfu.put(3, 5);&nbsp;&nbsp;// cache=[3,4,5], cnt(3)=1, cnt(4)=1, cnt(5)=1

lfu.put(2, 4);&nbsp;&nbsp;// 5 is the LFU key because cnt(5)=1 is the smallest, invalidate 5.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[2,3,4], cnt(2)=1, cnt(3)=1, cnt(4)=1

lfu.put(1, 3);&nbsp;&nbsp;// 4 is the LFU key because cnt(4)=1 is the smallest, invalidate 4.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[1,2,3], cnt(1)=1, cnt(2)=1, cnt(3)=1

lfu.get(1);&nbsp;&nbsp;&nbsp;// return 3

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[1,2,3], cnt(1)=2, cnt(2)=1, cnt(3)=1

lfu.get(2);&nbsp;&nbsp;&nbsp;// return 4

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[2,1,3], cnt(1)=2, cnt(2)=2, cnt(3)=1

lfu.get(3);&nbsp;&nbsp;&nbsp;// return 5

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// cache=[3,2,1], cnt(1)=2, cnt(2)=2, cnt(3)=2

lfu.get(4);&nbsp;&nbsp;&nbsp;// return -1 (not found)

lfu.get(5);&nbsp;&nbsp;&nbsp;// return -1 (not found)

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= capacity <= 10^3
- 0 <= key <= 10^4
- 0 <= value <= 10^5
- At most 10^5 calls will be made to get and put.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
