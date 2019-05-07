class StrStr {



    public static void main(String[] args){

        StrStr s = new  StrStr();
        String s1 = "mississippi";
        String s2 = "issipi";

        System.out.println(s.strStr(s1,s2));

        // using subString 
        System.out.println(s.strStr1(s1,s2));
        
    }

    // KMP algorithms, which is used for pattern matching

    // effecient solution

    public int strStr1(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    
    public int strStr(String haystack, String needle) {
    
        
        int i=0;
        int j=0;
        int k=0;
        
        if(needle.length()==0 || needle.length()>haystack.length()) return 0;
        
        for(i=0;i<haystack.length();i++){
            
           j=0;
            k=i;
            if(haystack.charAt(i)== needle.charAt(j)){
                
                while(j<needle.length() && i<haystack.length()){
                    
                   if(haystack.charAt(i)!= needle.charAt(j)){
                                            break;
                    
                }
                     i++;
                     j++;
                }
                
                if(j==needle.length()) return i-needle.length();
            }
            
            i=k+1;
            
        }
        return -1;
        
    }
}