class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        //your code goes here
        int n = Student.length;
        int m = Cookie.length;
        int l = 0;
        int r  = 0;
        Arrays.sort(Student);
        Arrays.sort(Cookie);

        while(l < n && r < m){
            if(Student[l] <= Cookie[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}