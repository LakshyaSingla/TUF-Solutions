class Solution {
    void merge(int[] nums, int low, int mid, int high){
        int i = low, j = mid + 1, k= 0;
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
    int countJumps(int[] nums, int low, int mid, int high, int k){
        int i = low, j = mid + 1, count = 0;
        while(i <= mid){
            while(j <= high && nums[i] + k >= nums[j]){
                j++;
            }
            count += high - j + 1;
            i++;
        }
        return count;
    }
    int mergesort(int[] nums, int low, int high, int k){
        int count = 0;
        if(low >= high) return count;
        int mid = low + (high - low) / 2;
        count+= mergesort(nums, low, mid, k);
        count+=mergesort(nums, mid + 1, high, k);
        count+=countJumps(nums, low, mid, high, k);
        merge(nums, low, mid, high);
        return count;
    }
    public int NumberOfJumps(int[] nums, int k) {
        return mergesort(nums, 0, nums.length - 1, k);
    }
}