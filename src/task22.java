public class task22 {
    public static void main(String[] args){
        int[] A= {2, 3};
        System.out.println(double23(A));
    }
    public static boolean double23(int[] nums) {
        if (nums.length == 2) {
            return (nums[0] == 2 && nums[1] == 2) ||
                    (nums[0] == 3 && nums[1] == 3);
        }else {
            return false;
        }
    }
}
