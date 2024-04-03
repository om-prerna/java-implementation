package data.structure.problems;

public class Demo {
        public static void main(String[] args) {
            int[] nums = {1,2,3,4,5};
            int sizeOfArray = nums.length;
            int[] temp = new int[sizeOfArray];
            int sum = 0;

            System.out.println(3 | 5);
            if(true & false | false & true | false | true )
                System.out.println("sddok");
            //3, 5, 7, 9
            //8, 2, 6
            //0, 8
            // 8

            for(int i = 0; i< sizeOfArray ; i ++){
                for(int j = 0; j < sizeOfArray - i-1 ; j ++ ){
                    sum =  nums[j] + nums[j+1];
                    if(sum > 9) sum = sum % 10;
                    temp[j] = sum;
                }
                for (int a: temp)
                    System.out.println(a);
            }
            System.out.println(temp[0]);
        }

}
