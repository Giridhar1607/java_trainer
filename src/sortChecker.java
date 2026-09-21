public class sortChecker {
    public static void main(String[] args){
        int[] numbers={3,7,12,18,25};
        boolean isSorted =true;

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>=numbers[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Array is sorted in strict ascending order");
        }else{
            System.out.println("Array is Not sorted in strict ascending order");
        }
    }
}
