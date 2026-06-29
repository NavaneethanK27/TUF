class Solution {
    public int numOfStrings(String[] patterns, String word) {
        ArrayList<String>list = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            for(int j=i;j<=word.length();j++){
                list.add(word.substring(i,j));
            }
        }
        int count = 0;
        for(int i=0;i<patterns.length;i++){
            if(list.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}