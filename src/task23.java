public class task23 {
    public static void main(String[] args){
        int[] A= {1, 2};
        int[] B= {3, 4};
        System.out.println(biggerTwo(A,B));
    }
    public static int [] biggerTwo(int[] a,int[] b){
        int suma=a[0]+a[1];;
        int sumb=b[0]+b[1];
        if(suma>sumb){
            for(int i=0; i<a.length;i++){
                System.out.println(a[i]);
            }
        } else if(sumb>suma){
            for(int i=0; i<b.length;i++){
                System.out.println(b[i]);
            }
        } else{
            for(int i=0; i<a.length;i++){
                System.out.println(a[i]);
            }
        }
        return a;
    }
}
