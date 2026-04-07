public class task21 {
    public static void main(String[] args){
        int[] A= {4, 5};
        System.out.println(has23(A));
    }
    public static Boolean has23(int[] nums){
        if(nums[0]==2||nums[1]==3){
            for(int i=0; i<nums.length; i++){
                return true;
            }
        }else{
            return false;
        }
        return null;
    }
}
