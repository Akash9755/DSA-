class Solution {
    public int firstMissingPositive(int[] nums) {
        int n =nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
    }
    for(int num=1; num<=n+1; num++){
        if(!set.contains(num)){
            return num;
        }
    }
    return n+1;
    }
}