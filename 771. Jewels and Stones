class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<Character>();
        int jewelCount=0;
        for(Character jewel : jewels.toCharArray())
            set.add(jewel);
        for(Character stone : stones.toCharArray())
            if(set.contains(stone)) jewelCount++;
        return jewelCount;
    }
}
