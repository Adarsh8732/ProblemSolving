class Solution {
    int min = 0;
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
          min = getDirect(needs,price);
        helper(0,price,special,needs,min);
        return min;
    }
    public int getDirect(List<Integer>need,List<Integer>price){
        int ans = 0;
        for(int i=0;i<need.size();i++){
            ans+=need.get(i)*price.get(i);
        }
        return ans;
    }
    public boolean canget(List<Integer>need,List<Integer> off){
        for(int i=0;i<need.size();i++){
            if(off.get(i)>need.get(i)){
                return false;
            }
        }
         return true;

    }
    public void helper(int ioffer,List<Integer> price,List<List<Integer>> special,List<Integer>needs,int used){
        if(used>min){
            return;
        }
        if(ioffer==special.size()){
            int val = getDirect(needs,price);
            used+=val;
            if(used<min){
                min = used;
            }
            return ;
        }
        List<Integer> off = special.get(ioffer);
        if(canget(needs,off)){
            List<Integer> newneed = new ArrayList<>();
            for(int i=0;i<needs.size();i++){
                newneed.add(needs.get(i)-off.get(i));
            }
            
            helper(ioffer+1,price,special,newneed,used+off.get(off.size()-1));
        }
        
        helper(ioffer+1,price,special,needs,used);
    }
}

