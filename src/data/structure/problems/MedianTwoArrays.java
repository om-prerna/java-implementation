package data.structure.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MedianTwoArrays {
    public static void main(String args[]){
        int[] nums1 = {1, 7, 18};
        int[] nums2 = {3,6, 14 };
        MedianTwoArrays sol = new MedianTwoArrays();
        //double median = sol.findMedianSortedArrays(nums1, nums2);
        //System.out.println(median);

        int result = 0;
        //result = sol.firstuniqueChar("leetcode");
        //System.out.println(result);
        int nums[] = {2,3,1,2,4,3};
//        result = sol.minSubArrayLen(7, nums);
//        System.out.println(result);

        System.out.println(sol.fractionToDecimal(1, 6));
    }

    public String fractionToDecimal(int numr, int denr) {

        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder("1234.5");
        sb.insert(4, "(");
        String s = "-1";
        System.out.println(s == "-1");
        String remResult = "";
        String res ="";
        double result = 0;
        int rem;
        int val = 0;
        if( (numr<0 && denr>0) || (numr>0 && denr<0))
            res = "-";
        rem = numr % denr;
        HashMap<Integer, Integer> map = new HashMap<>();
        while((rem != 0 )&& (!map.containsKey(rem))){

            map.put(rem, remResult.length());
            rem = rem * 10;
            val = val * 10 + rem/ denr;

            remResult += String.valueOf(rem/ denr);
            rem = rem % denr;
        }
        if(rem == 0) { // non repeating sequence
            result = (double) numr / denr;
            if(result - (int)result == 0) // no decimal part
                res= Integer.toString((int)result);
            else
                res = Double.toString(result);
        }else{
            remResult = Integer.toString(Math.abs(val));
            res += Integer.toString(numr /denr);
            res = res + "." +
                    remResult.substring(0, map.get(rem)) +
                    "(" + remResult.substring(map.get(rem)) + ")";
        System.out.println(map.get(rem));
        }

        return res;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int i , j ,sum;
        i =0;
        j =0;
        sum =0;
        for(;j < nums.length;){
            sum += nums[j];
            if(sum < target) j++;
            else if(sum == target){
                result = Math.min(result, j-i+1);
                j++;
            }else if(sum > target){
                while (sum > target){
                    result = Math.min(result, j-i+1);
                    sum = sum-nums[i];
                    i++;
                }
                if(sum == target){
                    result = Math.min(result, j-i+1);
                }
                j++;
            }
        }

        if(result == Integer.MAX_VALUE) return 0;
        return result;

//        int i;
//        int j;
//        int sum =0;
//        int temp = 0, minLen = nums.length;
//
//        for(i = 0; i <nums.length; i++ ){
//            for(j  = i; j < nums.length; j++){
//                sum += nums[j];
//                if(sum >= target) {
//                    temp = j - i + 1;
//                    if(temp < minLen) minLen = temp;
//                }
//
//            }
//            if(i == 0 && j == nums.length && sum < target)
//                return 0;
//            sum =0;
//            System.out.println(minLen);
//
//        }
//        return minLen;
    }

    public int firstuniqueChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        char arr[] = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int n = map.get(arr[i]);
                map.put(arr[i], n + 1);
            } else {
                map.put(arr[i], 1);
            }
        }


        int index = s.length();
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                int i = s.indexOf(entry.getKey());
                if ( i < index)
                    index = i;
            }
        }


//        for(char x : map.keySet()){
//            int m = map.get(x);
//            if(m==1){
//                int i = s.indexOf(x);
//                if(i<index){
//                    index = i;
//                }
//            }
//        }

        if(index==s.length()){
            return -1;
        }
        return index;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2)  {
        double median =0;
        int i, j, k =0;

        int[] myArr = new int[nums1.length+nums2.length];
        for(i =0, j =0; i <nums1.length && j<nums2.length ; ){
            if(nums1[i] < nums2[j]){
                myArr[k++] = nums1[i];
                i++;
            }
            else{
                myArr[k++] = nums2[j];
                j++;
            }
        }

        while(i < nums1.length)
        {
            myArr[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length)
        {
            myArr[k] = nums2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(myArr));
        int totalLen = myArr.length ;
        if(totalLen % 2 != 0)
            return myArr[((totalLen+1) /2 ) -1];
        else{
            int evenMid = totalLen / 2;
            median =  (myArr[evenMid - 1] + myArr[evenMid])/(double)2;
            return median;
        }
    }
}
