// Given a fixed length array arr of integers, duplicate each occurrence of zero,
// shifting the remaining elements to the right.

package Arrays;

class DuplicateZeroes {

    public static void duplicateZeros(int[] arr) {
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) {
                for(int j = (arr.length - 1); j > i; j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
        
    }

    public static void printArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};

        System.out.println("Array before duplicating zeros: ");
        DuplicateZeroes.printArray(arr);
        DuplicateZeroes.duplicateZeros(arr);
        System.out.println("\nArray after duplicating zeros: ");
        DuplicateZeroes.printArray(arr);
    }
}