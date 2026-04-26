class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap();


        for(int i = 0 ; i < nums.length ; i++){
            int diff = target - nums[i];
            Integer ans = map.get(diff);
            if(ans != null){
                int min = Math.min(i, ans);
                int max = Math.max(i, ans);
                return new int[]{min, max};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{-1,-1};

    }
}
