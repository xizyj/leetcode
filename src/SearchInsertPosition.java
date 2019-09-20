public class SearchInsertPosition {
    /*
    Given a sorted array and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.
    给定排序数组和目标值，如果找到目标，则返回索引。如果没有，请返回索引按顺序插入的索引。
     */

    public static int searchInsert(int[] nums, int target) {
        if (nums.length <= 0) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(high<0){
            return 0;
        }
        if(target>nums[high]&&target>nums[low]){
            return high+1;
        }

        return high;

    }

    public static void main(String[] args) {
        int[] s={1,3,5,6};
        System.out.println(searchInsert(s,2));
    }

}
