class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s: strs){
            char charArray[]=s.toCharArray();  //String to array convertion
            Arrays.sort(charArray);   //Sorting the array
            String sorted=new String(charArray);  //Sorted array to String 

            //checking whether a group is present for the key or not, if not create the new group
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<String>());

            }
            map.get(sorted).add(s);  //Adding the real String not the sorted one; 
        }
        return new LinkedList<>(map.values());
    }
}
