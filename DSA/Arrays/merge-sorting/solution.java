class Solution {
    void merge(int[] nums, int low, int mid, int high){
        List<Integer> list = new ArrayList<>();
        int i = low;
        int j = mid + 1;

        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                list.add(nums[i]);
                i++;
            }else{
                list.add(nums[j]);
                j++;
            }
        }
        while(i <= mid){
            list.add(nums[i]);
            i++;
        }
        while(j <= high){
            list.add(nums[j]);
            j++;
        }

        for(int k = low; k <= high; k++){
            nums[k] = list.get(k - low);
        }

    }

    public void mergeSortHelper(int[] nums, int low, int high){
        if(low>=high) return ;

        int mid = low + (high - low) /2 ;

        mergeSortHelper(nums, low, mid);
        mergeSortHelper(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }
    public int[] mergeSort(int[] nums) {
        mergeSortHelper(nums, 0, nums.length - 1);
        return nums;
    }
}