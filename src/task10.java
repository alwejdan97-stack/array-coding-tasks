public class task10 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(sameFirstLast(a));
    }

    public static Boolean sameFirstLast(int[] b) {
        if (b.length >= 1) {
           return b[0] == b[b.length-1];
        }
        return false;
    }
}