class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for (Integer integer : map.keySet()) {
            if(map.get(integer) > n/3){
                ans.add(integer);
            }
        }
        return ans;
        
    }
}