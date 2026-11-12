class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] word=s.split(" ");
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,word[i]);
            }
            else{
                if(!map.get(ch).equals(word[i])){
                    return false;
                }
            }
        }
        return true;
    }
}