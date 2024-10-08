class Solution {
    public int[] productExceptSelf(int[] nums) {
          int[] result = new int[nums.length];
        int mul = 1;
        int[] right = new int[nums.length];
        for(int i = nums.length-1 ; i>=0; i--){
            mul *=  nums[i];
            right[i] = mul;
        }
        mul = 1;
        for(int i = 0 ; i < nums.length -1; i++){
            result[i] = mul * right[i+1];
            mul *= nums[i];
        }
        result[nums.length-1] = mul;     
        return result;
    }
}
