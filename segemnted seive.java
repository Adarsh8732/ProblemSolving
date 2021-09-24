
  public static void segmentedSieveAlgo(int a, int b) {
    boolean[] pre = new boolean[(int)Math.sqrt(b)+1];
    Arrays.fill(pre,true);
    for(int i=2;i<=Math.sqrt(b);i++){
        if(pre[i]==true){
            int j=2*i;
            while(j<=Math.sqrt(b)){
                pre[j]=false;
                j=j+i;
            }
        }
    }
    int i = 2;
    boolean[] dp = new boolean[b-a+1];
    Arrays.fill(dp,true);
    while(i<=Math.sqrt(b)){
        if(pre[i]==true){
            int multiple = (int)Math.ceil(a*1.0/i);
            if(multiple == 1){
                multiple++;
            }
            
            int st = multiple*i-a;
            
            while(st<=b-a){
                dp[st]=false;
                st+=i;
            }
        }
        i++;
    }
    if(a==1){
        dp[0]=false;
    }
    for(i=0;i<b-a+1;i++){
        if(dp[i]){
            System.out.println(i+a);
        }
    }