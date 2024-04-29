class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        StringBuilder answer = new StringBuilder();
        
        for (int k = 0; k < strs[0].length(); k++) {
            char tmp = strs[0].charAt(k);
            boolean check = true;
            for (int i = 1; i < strs.length; i++) {
                if (k >= strs[i].length() || tmp != strs[i].charAt(k)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer.append(tmp);
            } else {
                break;
            }
        }
        
        return answer.toString();
    }
}
