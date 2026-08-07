class Solution {

    long merge(int[] nums, int low ,int mid, int high){
        int i = low;
        int j = mid + 1;
        long count = 0;
        List<Integer> temp = new ArrayList<>();
        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp.add(nums[i]);
                i++;
            }else{
                temp.add(nums[j]);
                count += mid - i + 1;
                j++;
            }
        }
        while(i <= mid){
            temp.add(nums[i]);
            i++;
        }
        while(j <= high){
            temp.add(nums[j]);
            j++;
        }
        for(int k = low; k <= high; k++){
            nums[k] = temp.get(k - low);
        }
        return count;
    }


    long mergesort(int[] nums, int low, int high){
        long count = 0;
        if(low >= high) return count;
        
        int mid = low + (high - low) / 2;
        count+= mergesort(nums, low, mid);
        count+= mergesort(nums, mid + 1, high);
        count += merge(nums, low, mid, high);
        return count;
    }
    public long numberOfInversions(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
        
    }
}