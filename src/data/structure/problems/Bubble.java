package data.structure.problems;

import java.util.Arrays;

class Bubble {
    public static void main(String[] args) {
        int []numbers = {-5, -4,-3,9,-1, 0};
        new Bubble().doBubbleSort(numbers);
    }
    void doBubbleSort(int[] numbers){
        int n = numbers.length;
        boolean flag = false;
        for(int i = 0; i < n-1; i++){ // number of pass

            for(int j = 1; j < n- i; j++){ // number of comparison in each pass

                if(numbers[j-1] > numbers[j]){  //if true swap the element
                    numbers[j-1] = numbers[j-1] + numbers[j];
                    numbers[j] = numbers[j-1]-  numbers[j];
                    numbers[j-1] = numbers[j-1] - numbers[j];
                    flag = true;
                }
            }
            if(!flag) break;
            flag = false;
        }
        //output
        Arrays.stream(numbers).forEach(number -> System.out.println(number));
    }

}


/*Bubble sort can be optimised if array is sorted in no of passes less than n-1
If there is no swap in a pass, means array is sorted already and no task to do further*/

