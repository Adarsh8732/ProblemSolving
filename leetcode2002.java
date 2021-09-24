class Solution {
    int ans = 0;
    public int maxProduct(String s) {
        helper(0,s,"","");
        return ans;
    }
    public void  helper(int idx,String s,String s1,String s2){
        if(idx == s.length()){
            if(ispalindrom(s1)&&ispalindrom(s2)){
                ans = Math.max(ans, s1.length()*s2.length());   
            }
            return ;
        }
         helper(idx+1,s,s1+s.charAt(idx),s2);
         helper(idx+1,s,s1,s2+s.charAt(idx));
         helper(idx+1,s,s1,s2);
    }
    public boolean ispalindrom(String s){
        // System.out.println(s);
        int i = 0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}