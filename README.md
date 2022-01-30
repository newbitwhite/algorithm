# LeetCode101

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
