

public class TwoPointer {
    public static int[] twoSum (int[] arr, int target){
int left = 0;
int right = arr.length -1;

while (left<right){
int currentsum = arr[left] + arr[right];

  if(currentsum == target){
   return  new int[]{left , right};
  }else if(currentsum<target){
    left++;
  }else{
    right--;
  }
}
return new int[]{-1 , -1};// return -1 if no pair found
    }

    public static void main(String [] args){
        int arr[] = {1 , 2 , 3 , 5, 7, 10, 11, 15};
        int target = 15;

        int[] result = twoSum(arr , target);
        System.out.println("Indices:[" + result[0] + " ,"+ result[1] + "]");
    }
}
