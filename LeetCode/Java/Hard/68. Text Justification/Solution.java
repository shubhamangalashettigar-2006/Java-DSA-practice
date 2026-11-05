class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
       List<String> result=new ArrayList<>();
       int i=0;
       while(i<words.length){
        int j=i;
        int letters=0;

        
        while(j<words.length && letters+words[j].length()+(j-i)<=maxWidth){
            letters+=words[j].length();
            j++;
        }
        int gaps=j-i-1;
        int spaces=maxWidth-letters;

        StringBuilder line=new StringBuilder();
        if(j==words.length||gaps==0){
            for(int k=i;k<j;k++){
                line.append(words[k]);
                if(k<j-1){
                    line.append(" ");
                }
            }
            while(line.length()<maxWidth){
                line.append(" ");
            }
        }
        else{
            int eachSpace=spaces / gaps;
            int extraSpace=spaces % gaps;

            for(int k=i;k<j;k++){
                line.append(words[k]);
                if(k<j-1){
                    int spaceCount=eachSpace;

                    if(k-i<extraSpace){
                        spaceCount++;
                    }
                    line.append(" ".repeat(spaceCount));
                }
            }
        }
        result.add(line.toString());
        i=j;
       } 
       return result;
    }
}