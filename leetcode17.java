class Solution {
    HashMap<Integer,String> codes = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        /// method 1
        if(digits.length()==0)
            return new ArrayList<>();
        codes.put(2,"abc");
        codes.put(3,"def");
        codes.put(4,"ghi");
        codes.put(5,"jkl");
        codes.put(6,"mno");
        codes.put(7,"pqrs");
        codes.put(8,"tuv");
        codes.put(9,"wxyz");
        return helper(digits);
        
        /// method 2
        
        
		// LinkedList<String> ans = new LinkedList<String>();
		// if(digits.isEmpty()) return ans;
		// String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		// ans.add("");
		// for(int i =0; i<digits.length();i++){
		// 	int x = Character.getNumericValue(digits.charAt(i));
		// 	while(ans.peek().length()==i){
		// 		String t = ans.remove();
		// 		for(char s : mapping[x].toCharArray())
		// 			ans.add(t+s);
		// 	}
		// }
		// return ans;
    }
    public List<String> helper(String digits){
        if(digits.length()==0){
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = digits.charAt(0);
        String rem = digits.substring(1);
        
        List<String> ans = new ArrayList<>();
        List<String> sans = helper(rem);
        
        String codestr = codes.get(ch-'0');
        
        for(int i=0;i<codestr.length();i++){
            char codechar = codestr.charAt(i);
            for(String s:sans){
                  ans.add(codechar+s);
            }
        }
        
        return ans;
    }
}