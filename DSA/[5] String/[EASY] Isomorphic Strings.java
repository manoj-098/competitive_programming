class Solution {
    public boolean isIsomorphic(String s, String t) {
    
    //APPROACH: Using two maps for checking one to one relationship between the chars of strings [28ms]
     Map<Character, Character> mapS=new TreeMap<>();
     Map<Character, Character> mapT=new TreeMap<>();

     for(int i=0;i<s.length();i++)
     {
        if(mapS.containsKey(s.charAt(i)))
        {
            if(t.charAt(i)!=(char)mapS.get(s.charAt(i))) return false;
        }
        else mapS.put(s.charAt(i),t.charAt(i));
        if(mapT.containsKey(t.charAt(i)))
        {
            if(s.charAt(i)!=(char)mapT.get(t.charAt(i))) return false;
        }
        else mapT.put(t.charAt(i),s.charAt(i));
     }
     return true;

    // APPROACH - 2 ----------USING A SINGLE MAP [11ms]
    //  if (s == null || t == null || s.length() != t.length())
    //         return false;
    //     Map<Character, Character> map = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         char char_str1 = s.charAt(i), char_str2 = t.charAt(i);
    //         if (map.containsKey(char_str1)) {
    //             if (map.get(char_str1) != char_str2)
    //                 return false;
    //         } else {
    //             if (map.containsValue(char_str2))
    //                 return false;
    //             map.put(char_str1, char_str2);
    //         }
    //     }
    //     return true; 
    }
}
