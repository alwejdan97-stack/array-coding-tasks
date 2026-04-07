public class task19 {
    public static void main(String[] args){
        int[] A= {1, 2, 3};
        System.out.println(rotateLeft3(A));
    }
    public static int[] rotateLeft3(int[] nums){
        int[] result =new int[3];
        result[0]=nums[1];
        result[1]=nums[2];
        result[2]=nums[0];

        for(int i=0; i< result.length;i++) {
                System.out.println(result[i]);
        }return nums;
    }
}
