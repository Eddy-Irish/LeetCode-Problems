/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
  and two integers m and n, representing the number of elements in nums1 and nums2
  respectively.

  Merge nums1 and nums2 into a single array sorted in non-decreasing order.
  The final sorted array shouldn't be returned by the function, but instead
  stored inside the array "nums1", to accomodate this "nums1.length = m + n;""

  EXAMPLE: Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
           Output: nums1 = [1,2,2,3,5,6]
*/

package Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int nums2Index = 0;
        
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[nums2Index];
            nums2Index++;
        }
        
         for(int x = 0; x < nums1.length; x++) { 
            for(int j = (x + 1); j < nums1.length; j++){
                int temp = 0;
                if(nums1[j] < nums1[x]){
                    temp = nums1[x];
                    nums1[x] = nums1[j];
                    nums1[j] = temp;
                }
            }
         }
        
    }

    public static void printArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3, n = 3;

        System.out.println("Array before merge/sort: ");
        MergeSortedArray.printArray(nums1);
        MergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println("\nArray after merge/sort: ");
        MergeSortedArray.printArray(nums1);
    } 
}
