public class StringManipulator {
    public String trimAndConcat(String value1, String value2){
        return value1.trim().concat(value2.trim());
    }

    public String getIndexOrNull(String val, char c) {
        int index = val.indexOf(c);
        if(index == -1){
            return null;
        } else {
            return "" + index;
        }
    }

    public String getIndexOrNull(String val1, String val2){
        int index2 = val1.indexOf(val2);
        if(index2 == -1){
            return null;
        } else {
            return "" + index2;
        }
    }

    public String concatSubstring(String name1, int val1, int val2, String name2){
        String result2 = name1.substring(val1, val2);
        return result2.concat(name2);
    }
}
