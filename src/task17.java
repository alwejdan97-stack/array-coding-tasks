public class task17 {
    public static void main(String[] args){
        int[] A= {4};
        int[] B= {1, 2, 3};
        System.out.println(make2(A,B));
    }
    public static int[]  make2(int[] a,int[] b){
        int[] result = new int[2];
        if(a.length>=2) {
            result[0] = a[0];
            result[1] = a[1];
        }else if(a.length==1){
            result[0] = a[0];
            result[1] = b[0];
        }else if(a.length<1){
            result[0] = b[0];
            result[1] = b[1];
        }else if(b.length>=2){
            result[0] = b[0];
            result[1] = b[1];
        }
        for(int i=0; i< result.length; i++){
            System.out.println(result[i]);
        }
        return result;
    }
}
