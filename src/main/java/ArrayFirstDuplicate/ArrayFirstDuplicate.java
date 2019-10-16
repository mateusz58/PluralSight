package ArrayFirstDuplicate;

import java.util.Arrays;

public class ArrayFirstDuplicate {
    public int removeDuplicates(int[] nums)
    {
        int end = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[end] = nums[i + 1];
                end++;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, end);
        return nums.length;
    }
    public void removeDuplicates2(int[] nums)
    {
        String[] array = {"matt", "jason", "michael"};
        Arrays.stream(array)
            .map(name -> name.charAt(0))
            .distinct()
            .map(ch -> Arrays.stream(array).filter(name -> name.charAt(0) == ch).findAny().get())
            .forEach(System.out::println);
    }
}
