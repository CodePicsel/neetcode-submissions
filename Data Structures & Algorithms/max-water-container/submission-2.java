class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        for(int i =0; i<heights.length; i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j])maxArea=Math.max(maxArea, heights[i]*(j-i));
                else maxArea=Math.max(maxArea, heights[j]*(j-i));
            }
        }
        return maxArea;
    }
}
