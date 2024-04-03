package data.structure.problems;
public class Test2
{
     int x = 11;
    private int y = 33;
    private static void methid2(){

    }
    public void method1(int w)
    {
        Integer t1 = 3;
        Test2 t = new Test2();
        x = 22;
        y = 44;

        //System.out.println("Test.x: " + Test2.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);


        String s1 = "wpllo";
        String s2 = "world";
        String s3 = s1+s2;
        String s4 = "helloworld";
        System.out.println(s3.equals(s4));

        String str = "hello";
        System.out.println(s1 == str);

        String str1 = new String("piya").intern();
        System.out.println(s1 == str1);

        String str2 = "piya";
        System.out.println(str2 == s1);
        System.out.println(str2 == str1);

        char ascii[] = { 71, 70, 71 };

        String firstString = new String(ascii);
        System.out.println(firstString);

        StringBuilder sb = new StringBuilder("prerna");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        int array[] = {71, 101, 101, 107, 115};
        String s = new String(array, 1, 3);
        System.out.println(s);

        int out = s1.compareTo(s2);
        System.out.println(out);

    }

    public static void main(String args[])
    {
        Test2 t1 = new Test2();
        t1.method1(5);
        System.out.println("t.x: " + t1.x);
        System.out.println("t.y: " + t1.y);
    }
}
