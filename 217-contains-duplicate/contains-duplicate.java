class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> num = new HashSet<>();
         for(int n : nums){
            if(num.contains(n)){
                return true;
            }
            num.add(n);
         }
         return false;
    }
}