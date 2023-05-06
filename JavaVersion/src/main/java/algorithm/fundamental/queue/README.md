# 队列

## 迭代版本

1. 实现一个单一类型固定的栈
2. **支持泛型**
3. **支持迭代**

## API
- void enqueue(T elem): 从尾部添加元素
- T dequeue(): 从头部删除元素
- int size(): 队列元素数量
- boolean isEmpty(): 队列是否为空

## 实现

### 队列的数组实现 (ArrayQueue)
- 动态调整数组容量

### 队列的链表实现 (LinkedQueue)
- 链表实现不需要数组实现那样的动态扩容机制

#### 用链表达到了最优设计目标：
1. 它可以处理任意类型的数据（支持泛型）
2. 所需的空间总是和集合的大小成正比（不需要数组实现那样的动态扩容机制）
3. 操作所需的时间总是和集合的大小无关（总是O(1)的时间复杂度）

### 环形链表实现队列 (CircularLinkedListQueue)

### 双向队列：链表实现 (LinkedListDeque)
- 支持两端添加和删除元素
- API: pushLeft、popLeft、pushRight、popRight

### 栈队列 (LinkedListSteque)
- 支持两端添加元素，一端删除元素，双向队列去掉一个删除操作。
- API: push、pop、enqueue

### 优先队列 (MaxPriorityQueue)
- 支持删除最大元素和插入元素。这种数据类型叫做优先队列
- API
  - MaxPriorityQueue() 创建一个优先队列
  - MaxPriorityQueue(int max) 创建一个初始容量为 max 的优先队列
  - MaxPriorityQueue(Key[] a) 用 a[] 中的元素创建一个优先队列 
  - void Insert(Key v) 向优先队列中插入一个元素
  - Key max() 返回最大元素
  - Key delMax() 删除并返回最大元素
  - boolean isEmpty() 返回队列是否为空
  - int size() 返回优先队列中的元素个数
- 堆
  - 堆中某个结点的值总是不大于或不小于其父结点的值；
  - 堆总是一棵完全二叉树。
- insert和delMax方法的时间复杂度都是O(logn)
