public class RemoveElement {

    /*
        Given an array nums and a value val, remove all instances of that value in-place and return the new length.
    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
    The order of elements can be changed. It doesn't matter what you leave beyond the new length.

    给定数组nums和值val，在适当位置删除该值的所有实例并返回新长度。
    不要为另一个数组分配额外的空间，必须通过使用O（1）额外内存修改输入数组来实现此目的。
    元素的顺序可以改变。你留下的新长度并不重要。
     */
    public static int removeElement(int[] nums, int val) {
        if(nums.length<=0){
            return 0;
        }
        int res=0;
        int end=nums.length-1;
        while(res<end){
            if(nums[res]==val){
                while(nums[end]==val&&end>res){
                    end--;
                }
                if(end>res){
                    int flag=nums[res];
                    nums[res]=nums[end];
                    nums[end]=flag;
                    end--;
                    res++;
                }

            }else{
                res++;
            }
        }
        if(nums[res]!=val){
            res++;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] s={2,3,3};
        System.out.println(removeElement(s,3));
    }
}


