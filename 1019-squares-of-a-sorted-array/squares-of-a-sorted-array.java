class Solution {
    public int[] sortedSquares(int[] nums) {

       // step1 check the length of negative and postive part or array
        int negativelength =0;
        int positivelength = 0; 
        

        for(int i=0; i<nums.length; i++){

            if(nums[i] < 0){
               negativelength++;
            }else{
               positivelength++;
            }
        }

        //step 2 spilt the nums array into pos and neg part
        int a[] = new int[negativelength];  // negative no is st
        int b[] = new int[positivelength];  // positive no is store
        int indx1 =0;
        int indx2 =0;

       for(int i=0; i<nums.length; i++){
        if(nums[i] >=0){
            b[indx1] = nums[i];
            indx1++;
        }else{
            a[indx2] = nums[i];
            indx2++;
        }

       }

       // step3 special cases if no negative value square it only and if negative value is present then 
       //square it and sort in ascending order
       if(a.length == 0){   // no negative value in nums array
           for(int i=0; i<nums.length; i++){
             nums[i] = nums[i] * nums[i];
           }
           return nums;
       }
       if(b.length ==0){   // no postive value in nums array
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        int left =0;
        int right = nums.length-1;
        // array having both value positive and negative
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;

       }

       // step4 sqauring and ascending order of negative value
       for(int i=0; i<a.length; i++){
        a[i] = a[i] * a[i];
       }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1-i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp; 
                }
            }
        }
       for(int i=0; i<b.length; i++){
        b[i] = b[i] * b[i];
       }
   
    
    // step5 merg to sorting array

        int i=0; 
        int j=0; 
        int newarr[] = new int[positivelength + negativelength];
        int indx=0;
        while(i< negativelength && j<positivelength){

            if(a[i] < b[j]){
                  newarr[indx] = a[i];
                  i++;
                  indx++;
                
            }else{
                newarr[indx] = b[j];
                indx++;
                j++;
            }
        }
        while(i<negativelength){
            newarr[indx] = a[i];
            indx++;
            i++;
        }
        while(j<positivelength){
            newarr[indx] = b[j];
            indx++;
            j++;
        }
        return newarr;
        
    }
}