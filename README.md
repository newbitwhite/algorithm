# [algorithm.algorithm_4th](JavaVersion/src/main/java/algorithm_4th) 《算法4》部分习题题解

# algorithm.fundamental (基础数据结构与算法的实现)
- [数组](JavaVersion/src/main/java/fundamental/array)
- [链表](JavaVersion/src/main/java/fundamental/linked)
- [栈](JavaVersion/src/main/java/fundamental/stack)
- [队列](JavaVersion/src/main/java/fundamental/queue)
- [排序（十大常见排序算法实现）](JavaVersion/src/main/java/fundamental/sort)

# [LeetCode101](JavaVersion/src/main/java/leetcode101) (LeetCode101题解)

## [Greedy](JavaVersion/src/main/java/leetcode101/greedy)

顾名思义，贪心算法或贪心思想采用贪心的策略，保证每次操作都是局部最优的，从而使最
后得到的结果是全局最优的。

### 典型题目类型：

- [分配问题](JavaVersion/src/main/java/leetcode101/greedy/assign_cookies)
- [区间问题](JavaVersion/src/main/java/leetcode101/greedy/non_overlapping_intervals)

## [Two Pointers](JavaVersion/src/main/java/leetcode101/two_pointers)

双指针主要用于遍历数组，两个指针指向不同的元素，从而协同完成任务。也可以延伸到多个数组的多个指针。

若两个指针指向同一数组，遍历方向相同且不会相交，则也称为滑动窗口（两个指针包围的区域即为当前的窗口），经常用于区间搜索。

若两个指针指向同一数组，但是遍历方向相反，则可以用来进行搜索，待搜索的数组往往是排好序的。

### 典型题目类型：

- [用方向相反的双指针:用于搜索](JavaVersion/src/main/java/leetcode101/two_pointers/two_sum_ii_input_array_is_sorted)
- [归并两个有序数组](JavaVersion/src/main/java/leetcode101/two_pointers/merge_sorted_array)
- [快慢指针](JavaVersion/src/main/java/leetcode101/two_pointers/linked_list_cycle_ii)
- [滑动窗口](JavaVersion/src/main/java/leetcode101/two_pointers/minimum_window_substring)

## [Binary Search](JavaVersion/src/main/java/leetcode101/binary_search)

二分查找也常被称为二分法或者折半查找，每次查找时通过将待查找区间分成两部分并只取一部分继续查找，将查找的复杂度大大减少。对于一个长度为O(n)的数组，二分查找的时间复杂度为O(log n)

### 典型题目类型：
- [求开方](JavaVersion/src/main/java/leetcode101/binary_search/sqrt_x)
- [查找区间](JavaVersion/src/main/java/leetcode101/binary_search/find_first_and_last_position_of_element_in_sorted_array)
- [旋转数组查找数字](JavaVersion/src/main/java/leetcode101/binary_search/search_in_rotated_sorted_array_ii)
