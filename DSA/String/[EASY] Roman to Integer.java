class Solution {
    public int romanToInt(String s) {
        //APPROACH 1: Using Map------------Time:5ms
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res=0;
        char prev=s.charAt(0);
        res+=map.get(prev);
        for(int i=1;i<s.length();i++)
        {
                int prevVal=map.get(prev);
                int currVal=map.get(s.charAt(i));

                if(prevVal<currVal)
                {
                    res-=prevVal;
                    res+=(currVal-prevVal);
                }
                else    res+=currVal;
                
                prev=s.charAt(i);
        }
        return res;
    }
}

//APPROACH 2: Without Map-----------Time:2ms
// class Solution {
//     public int translate(char c)
//     {
//         if(c == 'I')
//             return 1;
//         if(c == 'V')
//             return 5;
//         if(c == 'X')
//             return 10;
//         if(c == 'L')
//             return 50;
//         if(c == 'C')
//             return 100;
//         if(c == 'D')
//             return 500;
//         return 1000;
//     }
//     public int romanToInt(String s) 
//     {
//         int sum = 0, current = translate(s.charAt(0)), next;

//         for(int i = 1; i < s.length(); i++)
//         {
//             next = translate(s.charAt(i));
//             if(current < next)
//                 sum -= current;
//             else 
//                 sum += current;
//             current = next;
//         }
//         sum += current;
//         return sum;
//     }
// }
