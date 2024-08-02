import java.util.Scanner;

public class RotatedSortedArraySearchP7 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of your array:");
        size = s.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < size; i++)
            nums[i] = s.nextInt();
        int target;
        System.out.println("Enter the target:");
        target = s.nextInt();
        System.out.println("Index of target " + target + ": " + search(nums, target));
    }
}
