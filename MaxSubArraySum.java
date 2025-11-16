class MaxSubArraySum {
    public static void  main (String[] args) {
        int[] arr = {1,2,3,4,5};
        int maxSum = Integer.MIN_VALUE;
        for(int st=0;st<arr.length;st++){
            int currSum = 0;
            for(int end=st;end<arr.length;end++) {
                currSum += arr[end];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Subarray Sum is: " + maxSum);
    }
}