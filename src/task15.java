
public class task15 {
    public static void main(String[] args){
        int[] A= {1, 2};
        int[] B= {3, 4};
        System.out.println(plusTwo(A,B));
    }
    public static int[]  plusTwo(int[] a, int[] b){
        int[] result = new int[4];
        result[0]=a[0];
        result[1]=a[1];
        result[2]=b[0];
        result[3]=b[1];
        for(int i=0;i < 4; i++){
            System.out.println(result[i]);
        }
        return result;
    }
}
