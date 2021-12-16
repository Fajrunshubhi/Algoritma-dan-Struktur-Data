package arraylist;


public class ArrayListTest {
    
        public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        
        System.out.println("Current size: " + test.size());
        System.out.println("Is the Array List empty? : " + test.isEmpty());
        
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");
        test.add("g");
        test.add(2,"x");
        test.add(5,"e");
        test.add(6,"f");
        test.add("h");
        test.add("i");
        test.add("j");
        test.add(11,"k");
        
        test.resizeArray();
         
        
        /*
        [1] Replace this code to remove object "x"
        */
        
        test.remove("x");
//        System.out.println(test.get(2));
        
        /*
        [2] Replace this code to remove an object at index 10
        */
        
        test.remove(10);
//        System.out.println(test.get(10));

        
        /*
        [3] Replace this code to display all elements off ArrayList
        */        
        
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        
        

        System.out.println("\nCurrent size: " + test.size());
        System.out.println("Is the Array List empty? : " + test.isEmpty());
        System.out.println("\nClearing the ArrayList...");
        test.clear();
        System.out.println("\nCurrent size: " + test.size());
        System.out.println("Is the Array List empty? : " + test.isEmpty());
        
    }

    
}
