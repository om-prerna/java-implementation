package data.structure.problems;

import java.util.HashMap;

public class Solution {

    public static void main(String args[]){

        String s1 = new String("new") ;
        String s2 = new String("new");
        System.out.println(s1 == s2);
        int[] prices = {7,1,5,3,6, 14, 1, 12,8, 5};
        Solution sol = new Solution();
        //System.out.println(sol.maxProfit(prices));

        HashMap<String, String> map1 = new HashMap<String, String>(12);
    }
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i;
        int min, diff = 0;

        if (prices.length == 1) return 0;

        min = 0;
        for(i = 1; i < prices.length; i++) {
            if (prices[i] >= prices[min]) {
                 diff = prices[i] - prices[min];
                maxProfit = Math.max(maxProfit, diff);
            } else min = i;
        }
        return maxProfit;
    }

    public String lastSubstring(String s) {
        //get all substrings of s and store in a array of string
        //sort the array and return last (space limit exceed)

        int i , j;
        String sub,max;
        max = "";
        for(i = 0; i < s.length(); i++){
            for(j=i+1; j <= s.length(); j++){
                sub = s.substring(i, j);
                max = max(sub, max);
                // System.out.println("max: " +  max);
            }
        }
        return max;
    }
    static String max(String s1, String s2){
        // System.out.println(s1 + "  " + s2);
        if(s1.length() == 0 ) return s2;
        if(s2.length() == 0) return s1;

        int len = s1.length()>s2.length()?s2.length():s1.length();
        int c = 0;
        while(c < len){
            if(s1.charAt(c) > s2.charAt(c))
                return s1;
            else if (s1.charAt(c) < s2.charAt(c))
                return s2;
            else
                c++;
        }
        if(s1.length() == s2.length())
            return s1;
        else if(s1.length() == len)
            return s2;
        else
            return s1;
    }

}