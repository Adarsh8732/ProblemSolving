class Solution {
    HashSet<Character> hs = new HashSet<>();
    int max =0;
    public int maxLength(List<String> arr) {
        helper(0,arr,"");   
        return max;
    }
    public void helper(int i,List<String>arr,String asf){
        if(i==arr.size()){
            max = Math.max(max,asf.length());
            return;
        }
        HashSet<Character> newhs = new HashSet<>(hs);
        boolean isposs = true;
        String currstr = arr.get(i);
        for(int itr=0;itr<currstr.length();itr++){
            char ch = currstr.charAt(itr);
            if(hs.contains(ch)){
                isposs = false;
            }
            hs.add(ch);
        }
        if(isposs){
            helper(i+1,arr,asf+currstr);
        }
        hs = new HashSet<>(newhs);
        helper(i+1,arr,asf);
    }
}