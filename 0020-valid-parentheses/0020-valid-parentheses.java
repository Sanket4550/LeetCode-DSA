class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            //tc = O(N),sc = O(N)

            if(map.containsKey(c)){
                stack.push(c);
            }else{
                //this is closing one
                if(stack.isEmpty()){
                    return false;
                }

                char t = stack.pop();

                if(map.get(t) != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}