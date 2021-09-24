class Solution {
    HashSet<String> hs = new HashSet<>();
    int max = 0;
    public int maxUniqueSplit(String s) {
         helper(s,0,"");
        return max;
    }
    public void helper(String str,int i,String asf){
        
        if(i==str.length()){
            // System.out.println(asf);
            max = Math.max(max,hs.size());
            return ;
        }
        for(int j=i+1;j<=str.length();j++){
            String s = str.substring(i,j);
            String rem = str.substring(j);
            if(hs.contains(s)==false){
                hs.add(s);
                helper(str,j,asf+"-"+s);
                hs.remove(s);
            }
        }
        
    }
}