

public class task25 {
    public static void main(String[] args){
        int[] A={1, 2, 3};
        System.out.println(frontPiece(A));
    }
    public static int[] frontPiece(int[] nums){
        if(nums.length>2){
            for(int i=0; i<2;i++){
                System.out.println(nums[i]);
            }
        }else{
            for(int i=0; i<nums.length;i++){
                System.out.println(nums[i]);
            }
        }
        return nums;
    }
}
