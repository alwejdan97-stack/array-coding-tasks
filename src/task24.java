public class task24 {
    public static void main(String[] args){
        int[] A= {4, 2, 3, 1};
        System.out.println(swapEnds(A));
    }
    public static int[] swapEnds(int[] nums){
        int a= nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1] = a;
        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }return nums;
    }
}
