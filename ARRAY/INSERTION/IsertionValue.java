public class IsertionValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int posindex = 2;
        int elmnt = 10;
        int temp;
        for(int i=arr.length-1;i>posindex;i--){
            arr[i] = arr[i-1];
        }

        arr[posindex] = elmnt;
        
        System.out.println("Array after insertion : ");

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
}
