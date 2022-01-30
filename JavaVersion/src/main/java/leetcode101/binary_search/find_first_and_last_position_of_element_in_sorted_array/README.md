# 34. Find First and Last Position of Element in Sorted Array
## question:

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
```text
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
```

Example 2:
```text
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
```

Example 3:
```text
Input: nums = [], target = 0
Output: [-1,-1]
```

Constraints:
```text
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
```