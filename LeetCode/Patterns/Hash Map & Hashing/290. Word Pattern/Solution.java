class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map1=new HashMap<>();
        String[] word=s.split(" ");
        if(pattern.length()!=word.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            
            if(map.containsKey(ch) && !map.get(ch).equals(word[i])){
                return false;
            }
            if(map1.containsKey(word[i]) && !map1.get(word[i]).equals(ch)){
                return false;
            }
            map.put(ch,word[i]);
            map1.put(word[i],ch);
        }
        return true;
    }
}