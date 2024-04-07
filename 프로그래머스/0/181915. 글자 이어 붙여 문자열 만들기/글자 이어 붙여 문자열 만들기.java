class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        for(int i =0;i < index_list.length;i++){
            builder.append(my_string.charAt(index_list[i]));
        }
        return builder.toString();
    }
}