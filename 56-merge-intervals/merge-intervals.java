class Solution {
    public int[][] merge(int[][] intervals) {

       Arrays.sort(intervals, (a,b) -> a[0]- b[0]);
       int n = intervals.length;
    int [][] result = new int [n][2];
        
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        int indx = 0;

        for(int i=1; i<n; i++){
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if(end1 >= start2){
                end1 = Math.max(end1 , end2);
            }else{
                result[indx][0]= start1;
                result[indx][1]= end1;
                indx++;

                start1 = start2;
                end1 = end2;

            }
        }

         result[indx][0]= start1;
         result[indx][1]= end1;
         indx++;

             int [][] newarr = new int[indx][2];

             for(int i=0; i<indx; i++){
                newarr[i][0] = result[i][0];
                newarr[i][1] = result[i][1];
             }
        return newarr;
        
    }
}