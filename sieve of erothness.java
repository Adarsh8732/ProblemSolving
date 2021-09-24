public static void printPrimeUsingSieve(int n) {
    boolean[] dp = new boolean[n+1];
    Arrays.fill(dp,true);
    for(int i=2;i<=Math.sqrt(n);i++){
        if(dp[i]==true){
            int j=2*i;
            while(j<=n){
                dp[j]=false;
                j=j+i;
            }
        }
    }
    for(int i=2;i<=n;i++){
        if(dp[i])
        System.out.print(i+" ");
    }
}
