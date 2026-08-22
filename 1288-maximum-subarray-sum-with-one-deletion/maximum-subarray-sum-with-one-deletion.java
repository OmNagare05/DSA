class Solution {
    public int maximumSum(int[] arr) {

        int onedel = Integer.MIN_VALUE;
        int nodel = arr[0];
        int result = arr[0];
        int n = arr.length;

        for(int i=1; i<n; i++){

            int prevonedel = onedel;
            int prevnodel = nodel;

            nodel = Math.max(nodel + arr[i] , arr[i]);
                 int v2 =0;
            if(onedel == Integer.MIN_VALUE){

                v2 = arr[i];

            }else{
                v2 = onedel +arr[i];
            }

            onedel = Math.max(v2 , prevnodel );

            result = Math.max(result , Math.max(onedel , nodel));

        }
       return result;
        
    }
}