package data.structure.problems;
public class SelectionSort {
    public static void main(String[] args){
        int[] numbers = {5,-4,3,2,-1};
        new SelectionSort().doSelectionSort(numbers);
    }
    void doSelectionSort(int[] numbers){
        int size = numbers.length;
        int min,minIndex, temp, j= 0;

        for(int i = 0; i < size-1; i++){
            min = numbers[i];
            minIndex = i;
            for(j = i+1; j < size; j++){
                if(min > numbers[j]){
                    min = numbers[j];
                    minIndex = j;
                }
            }

            //swap
            temp = numbers[i];
            numbers[i] = min;
            numbers[minIndex] = temp;
        }
        //output
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
