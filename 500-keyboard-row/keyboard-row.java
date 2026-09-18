class Solution {
    public String[] findWords(String[] words) {
        int n = words.length;
        int count = 0;
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        String [] result = new String[n];
        for(int i=0; i<n; i++){
            String word = words[i].toLowerCase();
            String row;
            if(first.indexOf(word.charAt(0))!=-1){
                 row = first;
            }
            else if(second.indexOf(word.charAt(0))!=-1){
                row = second;
            }
            else {
                row = third;
            }
            boolean valid = true;
            for(int j=0; j<word.length(); j++){
                if(row.indexOf(word.charAt(j))==-1){
                   valid = false;
                   break;
                }
            }
            if(valid){
                result[count] = words[i];
                count++;
            }
        }
        String[] answer = new String[count];
          for(int i=0; i<count; i++){
            answer[i]= result[i];
          }
        return answer;
    }
}