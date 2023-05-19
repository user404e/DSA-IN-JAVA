// search by index

public class SearchByIndex {
    public static void main(String[] args) {
        int a[] = {4,34,3,35,53,3223,451,7};

        int index = 6;

        if(index>a.length){
            System.out.println("GIVEN INDEX INS GREATER THAN ARRAY LENGTH");
        }
        else{
            for(int i=0;i<a.length;i++){
                if(i==index){
                    System.out.println("ELEMENT AT INDEX " + index + " = " + a[i]);
                    break;
                }
            }
        }
    }    
}
