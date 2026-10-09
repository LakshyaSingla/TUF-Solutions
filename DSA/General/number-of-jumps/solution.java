class Solution {
    void merge(int[] nums, int low, int mid, int high){
        int i = low, j = mid + 1, k = 0;
        int[] temp = new int[high - low + 1];
        
        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
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
    }

    int noOfJumps(int[] nums, int low, int mid, int high, int k){
        int r = mid + 1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while(r <= high && nums[i] + k >= nums[r]){
                r++;
            }
            count+= high - r + 1;
        }
        return count;
    }

    int mergesort(int[] nums, int low, int high, int k){
        int count = 0;
        if(low >= high) return count;

        int mid = low + (high - low) / 2;
        count += mergesort(nums, low, mid, k);
        count += mergesort(nums, mid + 1, high, k);
        count += noOfJumps(nums, low, mid, high, k);
        merge(nums, low, mid, high);
        return count;
    }
    public int NumberOfJumps(int[] nums, int k) {
        return mergesort(nums, 0, nums.length - 1, k);
    }
}