public class task9 {
    public static void main(String[] args){
        int[] b = {1, 3, 4, 5};
        System.out.println(unlucky1(b));
    }
    public static Boolean unlucky1(int[] a){
        for(int i =0; i< a.length; i++){
            if(a[i]==1 && a[i+1]==3){
                return true;
            }
                return false;
        }
        return null;
    }
}
