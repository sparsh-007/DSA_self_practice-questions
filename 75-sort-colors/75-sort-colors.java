class Solution {
    
    public void sortColors(int[] nums) {
        int temp=0;
        int low,mid,high;
        low=0;
        high=nums.length-1;
        mid=0;
        while(mid<=high){
          switch(nums[mid]){
                case 0:{
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
                 break;}
              case 1:
                  mid++;
                  break;
              case 2:{
                  temp=nums[mid];
                  nums[mid]=nums[high];
                  nums[high]=temp;
                  high--;
                  break;
              }
                    
            }
        }
        
        
        
    }
}