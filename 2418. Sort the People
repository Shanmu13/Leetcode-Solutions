class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len= names.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(heights[j]<heights[j+1])
                {
                    int htemp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=htemp;

                    String ntemp = names[j];
                    names[j]=names[j+1];
                    names[j+1]=ntemp;
                }
            }
        }
        return names;
    }
}
