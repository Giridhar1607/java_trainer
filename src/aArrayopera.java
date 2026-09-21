import java.util.*;
public class aArrayopera {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("enter 10 integer:");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        int largest =Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("No second Largest element found ");
        }else{
            System.out.println("second largest element:"+secondLargest);
        }

        Map<Integer,Integer> freqMap = new LinkedHashMap<>();
        for(int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        System.out.println("Element Frequency");
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            System.out.println(entry.getKey()+"occurs"+ entry.getValue()+"time(S)");
        }

        System.out.println("duplicate elements");
        boolean hasDupicate=false;
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
                hasDupicate=true;
            }

        }
        if(!hasDupicate){
            System.out.println("none");
        }
        System.out.println();
        sc.close();
    }
}
