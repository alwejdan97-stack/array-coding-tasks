public class task13 {
    public static void main(String[] args){
        int[] b = {4, 5, 6};
        for(int result : makeLast(b)) {
            System.out.println(result + " ");
        }
    }
    public static int[] makeLast(int[] nums){
        int[] b = new int[nums.length*2];
        b[b.length-1] = nums[nums.length-1];
        return b;
    }
}
