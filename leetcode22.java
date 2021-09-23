class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<String>();
        gnrtprnthss(list,"",n,n);
        return list;   
    }
    public void gnrtprnthss(List<String> list,String str,int open ,int close)
    {
        if(open==0&&close==0)
        {
            list.add(str);
            return ;
        }
        
        // if(open>close)
        //     return ;
        if(open<=close && open>-1 && close>-1){
        gnrtprnthss(list,str+"(",open-1,close);
        gnrtprnthss(list,str+")",open,close-1);
        }
    }
  
}