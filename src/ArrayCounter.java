public class ArrayCounter {
    public static void main(String[] args){
        int[] numbers ={12,7,194,22,15,8};
        int evenCount=0;
        int oddCount=0;
        for(int num:numbers){
            if(num%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
