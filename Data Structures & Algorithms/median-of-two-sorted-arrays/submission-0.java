class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        float res = 0;

        int first = nums1.length - 1;
        int second = nums2.length - 1;
        

        int[] temp = new int[nums1.length + nums2.length];
        int r = temp.length-1;

        while(first >=0 && second >= 0){

            if(nums1[first] < nums2[second]){

                temp[r--] = nums2[second--];
            
            }
            else{
                temp[r--] = nums1[first--];
            }

        }
        while(first>=0){
            temp[r--] = nums1[first--];
        }
        while(second >= 0){
            temp[r--] = nums2[second--];
        }

        if(temp.length%2 == 0){
            int mid = temp.length/2;
            res = ((float)temp[mid]+(float)temp[mid-1])/2f;
        }
        else {
            int mid = temp.length/2;
            res = temp[mid];
        }

        return res;
        
    }
}
