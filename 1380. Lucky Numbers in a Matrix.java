class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        ArrayList<Integer> ans=new ArrayList<Integer>();

        for(int i=0;i<matrix.length;i++){

            int rowMin=Integer.MAX_VALUE;
            int index=-1;

            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<rowMin){
                    rowMin=matrix[i][j];
                    index=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][index]>rowMin){
                    flag=false;
                }
            }
            if(flag){
                ans.add(rowMin);
            }
        }
        return ans;

    }
}
