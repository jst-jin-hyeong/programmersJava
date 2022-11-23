import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] cnt = new int[nums.length+1];
        HashSetInteger set = new HashSetInteger();  
        int kinds = 0;
        for(int i = 0; inums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()2nums.length){
            answer = set.size();
        }
        if(set.size()2=nums.length){
            answer = (int)(nums.length2);
        }

        return answer;
    }
}