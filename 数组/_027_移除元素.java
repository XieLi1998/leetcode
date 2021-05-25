package 数组;

public class _027_移除元素 {

    public int removeElement(int[] nums, int val) {

        int res = 0;
        for (int num : nums) {
            if (num != val) {
                nums[res++] = num;
            }
        }

        return res;
    }

}
