public class DeleteValue {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};

        int deletepos = 2;
        int len = a.length;
        for(int i = deletepos;i<len;i++){
            a[i-1] = a[i];
        }
        len--;
        for(int i=0;i<len;i++){
            System.out.println(a[i]);
        }
    }
}
