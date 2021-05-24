package 数组;

public class _026_删除有序数组中的重复项 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int p = 0, q = 1;
        while (q < nums.length) {
            while (nums[q] != nums[p]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }

}
