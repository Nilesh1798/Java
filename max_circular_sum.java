class Solution {
    public int maxSubarraySumCircular(int[] a) {
       
        int linear=cadens(a);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            a[i]=a[i]*-1;
        }
        int circle=cadens(a);
        int v=circle+sum;
        if(v==0)
        return linear;
        int res=Math.max(linear,v);
        return res;

    }
    public static int cadens(int []a){
        int n=a.length;
        int ans=Integer.MIN_VALUE;
        int pre=0;
        for(int i=0;i<n;i++){
            pre+=a[i];
            ans=Math.max(ans,pre);
            if(pre<=0){
                pre=0;
            }
           
        }
    return ans;
        
    }
        
    }
