class Solution {
    public String lexicographicallySmallestString(String s) {
        int[] lastIndex = new int[26];
        for(int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(visited[c - 'a']) continue;

            while(!st.isEmpty() && st.peek() > c && lastIndex[st.peek() - 'a'] > i){
                visited[st.pop() -'a'] = false;
            }
            st.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}
