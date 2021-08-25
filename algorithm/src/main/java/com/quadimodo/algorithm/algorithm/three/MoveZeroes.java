package com.quadimodo.algorithm.algorithm.three;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        int n = nums.length;
        while (right < n) {
            if (nums[right] != 0) {
                if (right != left) {
                    swap(nums, left, right);
                }
                left++;
            }
            right++;
        }
    }

    private static void swap(int[] nums, int source, int target) {
        int tmp = nums[source];
        nums[source] = nums[target];
        nums[target] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 8, 0, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
