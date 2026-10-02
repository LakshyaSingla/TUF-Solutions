class Solution {
    public int countCollisions(String dir) {
      int n = dir.length();
      int left = 0, right = n - 1, collision = 0;
      while(left < n && dir.charAt(left) == 'L'){
        left++;
      }
      while(right >= 0 && dir.charAt(right) == 'R'){
        right--;
      }

      for(int i = left; i <= right; i++){
        if(dir.charAt(i) != 'S'){
            collision++;
        }
      }
      return collision;
    }
}
