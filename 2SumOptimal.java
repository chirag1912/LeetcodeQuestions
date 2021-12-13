

//Brute Force Approach:
TC: O(nsquare)
SC: O(1)
class Solution {
        //Comparing directly with the nums[target]-i is the best way to achieve as integer overflow might happen otherwise;
    public int[] twoSum(int[] nums, int target) {
        
        int ans;
        // int arr[]={-1,-1};
        System.out.println(nums.length);
        
        for(int i=0;i<nums.length-1;i++){
            // ans=target-nums[i];
            // System.out.println("nums[i]:"+nums[i]);

            for(int j=i+1;j<nums.length;j++){
            // System.out.println("Values:"+nums[i]+","+nums[j]);
                if(nums[j]==target-nums[i]){
                    // arr[0]=i;
                    // arr[1]=j;
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }   
}


//Struggling to understand how to store in the hashMap; if for the given elements of the array should i store the array elements or the index of the array?


//Hey so only storing the target-nums[i] saving this as a key and using index as value for this key in the hashMap();
// And then next time checking if the new array element coming is already present in the hashMap()

//TC: O(1) finding in O(1) TC;
//SC: O(1) asusing hashMap with limited values;

class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else{
                map.put(target-nums[i],i);
            }
        }
        
        return new int[]{-1,-1};
    }
}
