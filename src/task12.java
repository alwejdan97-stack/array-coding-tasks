public class task12 {
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        System.out.println(makeEnds(a));
    }
    public static int[] makeEnds(int[] nums){
        int[] b ={nums[0],nums[nums.length-1]};
        for(int i=0; i<b.length;i++){
            System.out.println(b[i]);
        }
        return b;
    }
}
