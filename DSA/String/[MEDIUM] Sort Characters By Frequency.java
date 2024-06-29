public class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[123]; //A:65 z:122
        for(char ch:s.toCharArray())
            freq[ch]++;
        
        Map<Integer, List<Character>> map=new HashMap<>();
        for(int i=48;i<123;i++) //ASCII 48='0'
        {
            if(freq[i]==0) continue;
            if(!map.containsKey(freq[i]))
                map.put(freq[i],new ArrayList());
            map.get(freq[i]).add((char)i);
        }

        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());

        StringBuilder str=new StringBuilder();
        for(int frq2:list)
        {
            for(char l:map.get(frq2))
            {
                for(int i=0;i<frq2;i++)
                    str.append(l);
            }
        }

        return str.toString();


    }
}

//Referred Solution
// class Solution {
//     public String frequencySort(String s) {
//         // Store frequency of characters
//         int freqMap[] = new int[123];
//         for (char ch : s.toCharArray()) {
//             freqMap[ch]++;
//         }

//         // Map frequencies to letters
//         Map<Integer, List<Character>> occurs = new HashMap<>();
//         for (int i = 48; i < 123; i++) {
//             if (freqMap[i] == 0) continue; // Skip if frequency is 0
//             if (!occurs.containsKey(freqMap[i])) { // If frequency not present in map
//                 occurs.put(freqMap[i], new ArrayList()); // Create a new list
//             }
//             occurs.get(freqMap[i]).add((char) i); // Add character to list
//         }

//         // List of frequencies
//         List<Integer> keyList = new ArrayList<>(occurs.keySet());
//         // Sort the list based on keys in decreasing order
//         Collections.sort(keyList, Collections.reverseOrder());

//         // StringBuilder to store the result
//         StringBuilder sb = new StringBuilder("");
//         for (int frq : keyList) { // Traverse frequencies in decreasing order
//             for (char ch : occurs.get(frq)) { // For all characters with current frequency
//                 for (int i = 1; i <= frq; i++) { // Append character frq times
//                     sb.append(ch); // Add them to result
//                 }
//             }
//         }
//         return sb.toString(); // Return the final sorted string
//     }
// }
