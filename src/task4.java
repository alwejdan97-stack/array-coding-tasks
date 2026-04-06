public class task4 {
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int aMiddle = a.length / 2;
        int bMiddle = b.length / 2;
        int[] c = {a[aMiddle],b[bMiddle]};
        for(int i = 0; i< c.length; i++){
            System.out.println(c[i]);
        }
    }
}
