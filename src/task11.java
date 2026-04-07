public class task11 {
    public static void main(String[] args){
        int[] a={1, 2, 3};
        System.out.println(maxEnd3(a));
    }
    public static int[] maxEnd3(int[] b){
        int max = Math.max(b[0],b[2]);
        b[0] = max;
        b[1] = max;
        b[1] = max;
        for(int i=0; i< b.length; i++){
            System.out.println(b[i]);
        }return b;
    }
}
