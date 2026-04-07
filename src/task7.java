public class task7 {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4};
        int middle1 = a.length / 2;
        int middle2 = (a.length / 2) - 1;
        int[] NEW = {a[middle2],a[middle1]};
        for(int i = 0; i< a.length; i++) {
            System.out.println(a[i]);
        }
        for(int i = 0; i < NEW.length; i++) {
            System.out.println(NEW[i]);
        }
    }
}
