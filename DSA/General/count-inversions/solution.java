class Solution {
    long merge(int[] nums, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = 0;
        long count = 0;
        int[] temp = new int[high - low + 1];

        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
                count+= mid - i + 1;
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= high){
            temp[k++] = nums[j++];
        }

        for(int l = low; l <= high; l++){
            nums[l] = temp[l - low];
        }
        return count;
    }

    long mergesort(int[] nums, int low, int high){
        long count = 0;
        if(low >=high) return count;

        int mid = low + (high - low) / 2;
        count+= mergesort(nums, low, mid);
        count+= mergesort(nums, mid + 1, high);
        count+= merge(nums, low,mid,high);
        return count;
    }
    public long numberOfInversions(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }
}