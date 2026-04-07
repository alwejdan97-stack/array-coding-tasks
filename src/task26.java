public class task26 {
    public static void main(String[] args){
        int[] A ={1, 2, 3};
        int[] B={7, 9, 8};
        System.out.println(front11(A,B));
    }
    public static int[] front11(int[] a,int[] b){
        int[] result = new int[2];
        if(a.length>1 && b.length>1) {
            result = new int[]{a[0], b[0]};
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }else if(a.length<1){
            result =new int[] {b[0]};
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }else if(b.length<1){
            result =new int[] {a[0]};
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
        return result;
    }
}
