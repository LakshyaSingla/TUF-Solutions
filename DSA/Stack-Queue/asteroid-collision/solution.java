class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    List<Integer> temp = new ArrayList<>();
    int n = asteroids.length;
    for(int i = 0; i < n; i++){
        if(asteroids[i] > 0){
            temp.add(asteroids[i]);
        }else{
            while(!temp.isEmpty() && temp.get(temp.size() - 1) > 0 && temp.get(temp.size() - 1) < Math.abs(asteroids[i])){
                temp.remove(temp.size() - 1);
            }
            if(!temp.isEmpty() && temp.get(temp.size() - 1) == Math.abs(asteroids[i])){
                temp.remove(temp.size() - 1);
            }else if(temp.isEmpty() || temp.get(temp.size() - 1) < 0){
                temp.add(asteroids[i]);
            }
        }
    }
    int[] ans = new int[temp.size()];
    for(int i = 0; i < temp.size(); i++){
        ans[i] = temp.get(i);
    }
    return ans;
    }
}