import java.util.Arrays;
class Kodutöö {

    public static void bubbleSrt(int[] arr) {
        System.out.println("Enne sortimist: " + Arrays.toString(arr));
        int loop = 0;
        int arrayPikkus = arr.length;
        int temp;
        for(int i=0; i < arrayPikkus; i++){
            for(int j=1; j < (arrayPikkus-i); j++){
                if(arr[j-1] > arr[j]){
                    loop += 1;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Pärast sorteerimist: " + Arrays.toString(arr) + " Korduste arv on: " + loop);
    }
    public static void main(String args[]) {
        int arr[] ={64,67,3,5,46,90,76};
        bubbleSrt(arr);
        
    }
}