# 链表

## 单链表
### API
- void add(T elem)：向链表末尾添加元素
- Node<T> remove()：删除链表末尾的元素 
- boolean isEmpty()：判断链表是否为空 
- int size():链表元素数量

## 双向链表
### API
- void insertFirst(T elem)：向链表表头插入元素
- void insertLast(T elem) 在表尾插入结点
- T removeFirst()：从表头删除结点
- T removeLast()：从表尾删除结点
- void insertAfter(T elem, DoubleNode<T> doubleNode)：在指定结点之前插入新结点
- void insertBefore(T elem, DoubleNode<T> doubleNode)：在指定结点之后插入新结点
- void removeOne(DoubleNode<T> doubleNode)：删除指定结点
- boolean isEmpty()：判断链表是否为空
- int size()：链表元素数量
