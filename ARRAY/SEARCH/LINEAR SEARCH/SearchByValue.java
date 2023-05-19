// search by value

public class SearchByValue{
    public static void main(String[] args) {
        int[] a1 = {1,21,34,2,4,2,52,5};
        boolean flag = false;
        int search = 5;

        for(int i=0;i<a1.length;i++){
            if(a1[i]==search){
                flag=true;
                System.out.println("FOUND AT INDEX " + i);
                break;
            }
        }
        if(flag==false){
            System.out.println("ELEMENT IS NOT FOUND");
        }
    }
}