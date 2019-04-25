class CountAndSay {
    
    public String countAndSay(int n) {

     String countSay = "1";

     for (int i = 1; i < n; i++) {

         countSay = utilityCountSay(countSay);
     }
     return countSay;

 }

 public String utilityCountSay(String s) {

     int i = 0;
     int j =0;
     char value='c';
     String temp = "";
     while (i < s.length()) {

         char c = s.charAt(i);
         value =s.charAt(i);
         j = 0;
         while (i<s.length()&& c == s.charAt(i)) {
             
             j++;
             i++;
         }
         temp = temp + j + value;
     }

     return temp;
 }
}