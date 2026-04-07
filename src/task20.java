public class task20 {
    public static void main(String[] args){
        int[] A= {1, 2, 3};
        System.out.println(sum2(A));
    }
    public static int sum2(int[] nums){
        int sum=0;
        if(nums.length<2){
            for(int i=0; i< nums.length; i++){
                System.out.println(nums[i]);
            }
        }else if(nums.length>=2){
            sum=nums[0]+nums[1];
            System.out.println("sum of first tow: "+sum);
        }
        return sum;
    }
}
