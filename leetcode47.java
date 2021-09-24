class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    HashSet<String> hs = new HashSet<>();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        helper(0,nums,new boolean[nums.length],"",new ArrayList<>());
        return ans;
    }
    public void helper(int idx,int[] nums,boolean[] used,String asf,List<Integer> sans){
        if(idx == nums.length){
            // if(hs.contains(asf)==false){
                // hs.add(asf);
                List<Integer> temp = new ArrayList<>(sans);
                ans.add(temp);
            // }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==false){
                used[i]=true;
                sans.add(nums[i]);
                helper(idx+1,nums,used,asf+nums[i],sans);
                sans.remove(sans.size()-1);
                used[i]=false;
                while(i+1<nums.length && nums[i]==nums[i+1]){
                    i++;
                }
            }
        }
    }
}