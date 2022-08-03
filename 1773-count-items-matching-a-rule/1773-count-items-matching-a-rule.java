class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int count = 0;

        switch (ruleKey){
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }

        for(List arr: items){
            if(arr.get(index).equals(ruleValue)){
                count += 1;
            }
        }
        return count;
    }
}