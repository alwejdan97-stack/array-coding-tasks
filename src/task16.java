public class task16 {
    public static void main(String[] args){
        int[] A = {1, 2, 3};
        System.out.println(maxTriple(A));
    }
    public static int[] maxTriple(int[] num){
        if(num[0]>num[1] && num[0]>num[2]){
            System.out.println(num[0]);
        }else if(num[1]>num[0] && num[1]>num[2]){
            System.out.println(num[1]);
        }else if(num[2]>num[0] && num[2]>num[1]){
            System.out.println(num[2]);
        }
        return num;
    }
}
