class Solution {
    public static boolean IPv6(String[] arr) {

    if (arr.length != 8)
        return false;

    for (String s : arr) {

        if (s.length() == 0 || s.length() > 4)
            return false;

        for (char c : s.toCharArray()) {

            if (!(Character.isDigit(c) ||
                    (c >= 'a' && c <= 'f') ||
                    (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
    }

    return true;
 }
    public static boolean IPv4(String[] arr){
        for(int i=0;i<arr.length;i++){
             if (arr[i].length() == 0 || arr[i].length() > 3)
            return false;

        for (char c : arr[i].toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }

        if (arr[i].length() > 1 && arr[i].charAt(0) == '0')
            return false;

        int num = Integer.parseInt(arr[i]);

        if (num < 0 || num > 255)
            return false;
        }
        return true;
    }
    public String validIPAddress(String queryIP) {
       if (queryIP.contains(".")) {
        String[] arr = queryIP.split("\\.", -1);

        if (arr.length == 4 && IPv4(arr))
            return "IPv4";
    }

    if (queryIP.contains(":")) {
        String[] arr = queryIP.split(":", -1);

        if (arr.length == 8 && IPv6(arr))
            return "IPv6";
    }
    return "Neither";
    }
}