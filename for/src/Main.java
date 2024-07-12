import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        for (int i = 0; i <= 3; i++){
            System.out.println(i);
        }
        */
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        /*
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        */
        for (int i : array){
            System.out.println(i);
        }
        // Arrays.sort(array);
        // int posicao = Arrays.binarySearch(array,7);
    }
}