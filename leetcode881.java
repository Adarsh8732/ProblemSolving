public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0,l = 0,r = people.length-1;
        Arrays.sort(people);
        while(l<=r){
            int sum = people[l]+people[r];
            if(sum<=limit){
                count++;
                r--;
                l++;
            }
            else if(sum>limit){
                r--;
                count++;
            }
            
        }
        return count;
    }
}
