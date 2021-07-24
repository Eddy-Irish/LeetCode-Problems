public class RotateArray {

    public static void main(String[] args){

        int[] array = new int[]{1,2,3,4,5,6,7};
        rotate(array, 3);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }



    
    }

    public static void rotate(int[] nums, int k) {
        //check for Edge Case (where the array is only 1 element in this problem)
        if(nums.length <= 1){
            return;
        }

        //Run number of rotations (k) modulo on the array.length, so if
        // there are more steps than the length of the array, you'll
        // just end up with the apparent number of steps needed for the result
        k %= nums.length;

        //Reverse the Entire Array first
        reverse(nums, 0, nums.length - 1);

        //Reverse the elements from 0 to the number of rotations
        reverse(nums, 0, k - 1);

        //Reverse the rest of the elements to the right of the "step" index
        reverse(nums, k, nums.length - 1);
    }

    //Reverse Method
    public static void reverse(int [] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
