import java.util.Arrays;

public class Arrayscaler {
    public static void main(String[] args){
        int[] numbers={2,5,8,1,4};
        int scalar =3;

        for(int i=0;i< numbers.length;i++){
            numbers[i] *= scalar;
        }
        System.out.println("Moify Array: " + Arrays.toString(numbers));
    }
}
