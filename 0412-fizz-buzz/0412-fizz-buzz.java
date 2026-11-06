class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();


        for(int i = 1; i<= n; i = i+1){
            String out = "";

            if (i % 3 == 0){
                out = out + "Fizz";
            }

             if (i % 5 == 0){
                out = out + "Buzz";
            }

            if(out == ""){
                out = Integer.toString(i);
            }

            res.add(out);
        }

        return res;

        //tc = O(N)
        //sc = O(1)
    }
}