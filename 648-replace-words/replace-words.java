class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String>st=new HashSet<>(dictionary);
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String pre="";
            for(int j=0;j<word.length();j++){
                pre+=word.charAt(j);
                if(st.contains(pre)){
                    words[i]=pre;
                    break;
                

                }
            }
        }
        return String.join(" ",words);
        
    }
}