class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n=arr.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int count=1;
                int x=it;
                while(set.contains(x+1)){
                    x=x+1;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}