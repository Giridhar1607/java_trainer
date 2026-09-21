public class secondLargest {
    public static void main(String[] args){
        int[] numbers={14,42,8,27,42,31,19};
        if(numbers.length < 2 ){
            System.out.println("Arrays must contain at least two elements");
            return;
        }
        int largest =Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int num: numbers){
            if(num >largest){
                secondlargest=largest;
                largest=num;
            }else if(num>secondlargest){
                secondlargest=num;
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("There is no distinct second largest element");
        }else{
            System.out.println("second Largest element:"+ secondlargest);
        }
    }
}
