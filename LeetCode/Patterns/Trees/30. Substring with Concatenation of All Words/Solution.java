class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(words.length==0){
            return ans;
        }
        int wordLen=words[0].length();
        int wordCount=words.length;
        int total=wordLen*wordCount;
        if(s.length()<total){
            return ans;
        }

        HashMap<String,Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(int i=0;i<wordLen;i++){
            int left=i;
            int count=0;

            HashMap<String,Integer> seen=new HashMap<>();
            for(int right=i;right+wordLen<=s.length();right+=wordLen){
                String word=s.substring(right,right+wordLen);
                
                if(!map.containsKey(word)){
                    seen.clear();
                    count=0;
                    left=right+wordLen;
                }
                else{
                    seen.put(word,seen.getOrDefault(word,0)+1);
                    count++;
                    while(seen.get(word)>map.get(word)){
                        String leftword=s.substring(left,left+wordLen);
                        seen.put(leftword,seen.getOrDefault(leftword,0)-1);
                        left+=wordLen;
                        count--;
                    }
                    if(count==wordCount){
                        ans.add(left);
                        String leftword=s.substring(left,left+wordLen);
                        seen.put(leftword,seen.getOrDefault(leftword,0)-1);
                        left+=wordLen;
                        count--;
                    }
                }
            }
        }
        return ans;
    }
}