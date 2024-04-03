package data.structure.problems;// interface Test1 {
//
////    int sum(int i , int j){
////        return i+ j;
////    }
//
//    void Method();
//}
//
// class Test2{
//    public void Method(){
//        System.out.println("inside Test 2");
//    }
//}

import java.util.*;

class B{

    int instanceVar = 5;
    static String staticVar = "Prerna-Prateek";
    static String var;

    public void Mymethod(){
        System.out.println(instanceVar);

    }
    public static void main(String args[]){
        B b = new B();
        b.Mymethod();
        var = "inside main";
        System.out.println(staticVar);

       short s =9;
//        (new Test2()).Method();

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("hona");
        linkedList.addLast("tha");
        linkedList.add("hona");

        //System.out.println(linkedList.get(1));

        ArrayList al = new ArrayList(linkedList);
        al.add("pyar");
        al.add("to");
//        list.add("Apple");
//        list.add("Mango");

        //System.out.println(al);

        Vector<Integer> vector = new Vector<>(linkedList);
        vector.add(1);
       // System.out.println(vector);

        Stack stack = new Stack();
        stack.add("hi");
        stack.push("hello");
        stack.push("Namaste");
        //System.out.println(stack.peek());
        stack.pop();
        //System.out.println(stack);

        Queue<Integer> priorityQ = new PriorityQueue<Integer>();
        priorityQ.add(50);
        priorityQ.add(20);
        priorityQ.add(30);
        priorityQ.add(40);
        System.out.println(priorityQ);
 //       System.out.println(priorityQ.poll());
//        System.out.println(priorityQ);
 //       System.out.println(priorityQ.peek());
//        System.out.println(priorityQ);
        priorityQ.add(70);
        Iterator iterator = priorityQ.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Set<String> set = new HashSet<>();
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        Hashtable hashtable = new Hashtable();

        TreeSet treeSet = new TreeSet();


        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);

        HashMap<String, Integer> result =  sortValues(hm);

        for (Map.Entry<String, Integer> entry :result.entrySet())
                System.out.println(entry.getKey() + " " + entry.getValue());

        // Exception Handling
        // System.out.println(exceptionTest());

        //String printing in multiple ways
        // stringPrint();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);

Integer name = 7;
System.out.println("name is " + name);


    }

    private static HashMap<String, Integer> sortValues(HashMap<String, Integer> hm) {

        LinkedList<Map.Entry<String, Integer>> ll = new LinkedList(hm.entrySet());

       Collections.sort(ll, new Comparator<Map.Entry<String, Integer>>() {
           public int compare(Map.Entry<String, Integer>  o1, Map.Entry<String, Integer> o2) {
               return (o1.getValue()).compareTo(o2.getValue());
           }
       });

        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for(Map.Entry<String , Integer> t1 : ll)
            temp.put(t1.getKey(), t1.getValue());
        return temp;

    }

    private static String exceptionTest() throws ArithmeticException{
        Error er = new Error();
        Exception ex = new Exception();

        try {
            int a[] = new int[5];
            a[3] = 30 / 2;
            return "Hello";
            // throw new ArithmeticException("exception through throw");
           // System.out.println("In try after exception");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
            return "catch";
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }finally {
            System.out.println("in finally");

        }
        System.out.println("End of the code");
        return "DONE";
    }

    private static void stringPrint(){

        String  name = "Prerna Jain";


//        for(int i =0; i < name.length(); i++){
//            System.out.println(name.charAt(i));
//        }

//        char[] ch = name.toCharArray();
//        for(char c : ch){
//            System.out.println(c);
//        }
//
//        String[] strArr  = name.split("");
//        for(String s : strArr){
//            System.out.println(s);
//        }

//        for (Character ch: Lists.charactersOf(name)) {
//            System.out.print(ch);
//        }
    }
}

class A extends B{}
