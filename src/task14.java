public class task14 {
    public static void main(String[] args){
        int[] num1 = {1, 2, 3};
        int[] num2 = {1, 3};
        System.out.println(start1(num1,num2));
    }
    public static int start1(int[] a,int[] b){
        int count = 0;
            if (a[0] == 1) {
                count++;
            }
            if (b[0] == 1) {
                count++;
            }
        return count;
    }
}
