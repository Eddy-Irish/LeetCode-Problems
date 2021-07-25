/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
  The relative order of the elements may be changed.

  Since it is impossible to change the length of the array in some languages, you must instead
  have the result be placed in the first part of the array nums. More formally, if there are k elements
  after removing the duplicates, then the first k elements of nums should hold the final result.
  It does not matter what you leave beyond the first k elements.

  Return k after placing the final result in the first k slots of nums.
  Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

  EXAMPLE: Input: nums = [3,2,2,3], val = 3
           Output: k = 2, nums = [2,2,0,0] 
*/

package Arrays;

public class RemoveArrayElement {

    public static int removeElement(int[] nums, int val) {
        
        int valInstances = 0;
        int temp;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                valInstances += 1;
                for(int j = (i+1); j < nums.length; j++){
                    temp = nums[i];
                    if(nums[j] != nums[i]) {
                        nums[i] = nums[j];
                        nums[j] = temp;
                        i++;
                    }
                }
            }
        }
        
        int newLength = (nums.length - valInstances);

        //Replace removed array value with zeros
        for(int x = nums.length - 1; x >= newLength; x--) { nums[x] = 0; }

        return newLength;  
    }

    public static void printArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
    
        System.out.print("Input: nums = [ ");
        RemoveArrayElement.printArray(nums);
        System.out.print("], val = " + val);
        int k = RemoveArrayElement.removeElement(nums, val);
        System.out.print("\nOutput: k = " + k + ", nums = [ ");
        RemoveArrayElement.printArray(nums);
        System.out.print("]");

    } 
    
}
