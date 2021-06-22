public class RotateArray {

    //TC: O(NK) Where N is number of elements
    //SC: O(1)
    public void rotateBF(int[] nums, int k) {
        if(nums == null || nums.length == 0) return;
        int m = nums.length;

        k = k % m;
        int temp;
        int previous;
        for (int i = 0; i < k; i++) {
          previous = nums[m - 1];
          for (int j = 0; j < m; j++) {
            temp = nums[j];
            nums[j] = previous;
            previous = temp;
          }
        }
    }

    //TC: O(N) Where N is number of elements
    //SC: O(N) Using an extra space
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return;
        int m = nums.length;
        int[] newArray = new int[m];
        for(int i=0;i<m;i++) {
            newArray[(i+k) % m] = nums[i];
        }
        for(int i=0;i<m;i++) {
            nums[i] = newArray[i];
        }
        
    }

    public static void main(String[] args) {
        RotateArray rot = new RotateArray();
        int[] array = new int[]{2,3,4,5,6,7};
        rot.rotate(array, 3);
        System.out.println("The result is: ");
    }
}