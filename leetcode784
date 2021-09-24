class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        helper(0,s.toCharArray(),ans);
        return ans;
    }
    public void helper(int i,char[] chs,List<String> ans){
        if(i==chs.length){
            ans.add(String.valueOf(chs));
            return ;
        }
        
        char ch = chs[i];
        
        if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'){
            if(ch>='a'&&ch<='z'){
                helper(i+1,chs,ans);
                chs[i]=(char)(ch-'a'+'A');
                helper(i+1,chs,ans);
                chs[i]=ch;
            }else{
                helper(i+1,chs,ans);
                chs[i]=(char)(ch+'a'-'A');
                helper(i+1,chs,ans);
                chs[i]=ch;
            }
        }
        else{
            helper(i+1,chs,ans);
        }
    }
}