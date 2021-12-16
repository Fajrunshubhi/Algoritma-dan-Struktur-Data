package arraylist;


public class ArrayListIntTest {
    
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        
        System.out.println("Current size: " + test.size());
        System.out.println("Is the Array List empty? : " + test.isEmpty());
        
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(7);
        test.add(2,100);
        test.add(5,5);
        test.add(6,6);
        test.add(8);
        test.add(10);
        test.add(9,9);
        test.add(11);
        
        test.resizeArray();
        
        
        /*
        [1] Replace this code to remove object 100
        */
        
        System.out.println("ArrayList sebelum 100 dihapus!");
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        
        test.remove(2);
        
        /*
        [2] Replace this code to display all elements off ArrayList
        */
        
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        
        System.out.println("Current size: " + test.size());
        System.out.println("Is the Array List empty? : " + test.isEmpty());
    }

    
}
