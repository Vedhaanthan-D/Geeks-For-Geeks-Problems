class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n=arr.length;
        int presum=0 ,count=0;
        Map<Integer,Integer> res=new HashMap<>();
        res.put(0,1);
        for(int i=0;i<n;i++){
            presum+=arr[i];
            int remove=presum-k;
            count+=res.getOrDefault(remove,0);
            res.put(presum,res.getOrDefault(presum,0)+1);
        }
        return count;
    }
}