package com.quadimodo.algorithm.algorithm.five;

/**
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 * 示例 2：
 *
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 *  
 *
 * 提示：
 *
 * 给定链表的结点数介于 1 和 100 之间。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/middle-of-the-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MiddleOfTheLinkedList {


    public static ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        int count = count(head);
        int mid = count / 2;

        return getNode(head, mid);
    }

    private static ListNode getNode(ListNode head, int pos) {
        for (int i = 0; i < pos; i++) {
            head = head.next;
        }
        /*while (head.val != pos) {
            head = head.next;
        }*/
        return head;
    }

    private static int count(ListNode head) {
        if (head == null) {
            return 0;
        }
        return 1 + count(head.next);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(
                1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6)
                                        )
                                )
                        )
                )
        );
        System.out.println(middleNode(head).toString());
    }
}
