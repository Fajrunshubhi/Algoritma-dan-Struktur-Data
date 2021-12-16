package Linked.List;


public class TestLinkedList {
    
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        cars.addFirst("Toyota");
        cars.addLast("Mitsubishi");
        
        System.out.println("Size of Linked List: "+cars.size());
        System.out.println("First element: "+cars.getFirst());
        System.out.println("Last element: "+cars.getLast());
        System.out.println("Element at index 4 ->  "+cars.get(4));
        
        cars.add(6, "Wuling");
        System.out.println("\nAdd Wuling at index 6");
        System.out.println("Wuling in this LinkedList? "+cars.contains("Wuling"));
        
        System.out.println("Remove first -> "+cars.removeFirst());
        
        System.out.println("Remove last -> "+cars.removeLast());
        
        System.out.println("Remove at index 3 -> "+cars.remove(3));

        System.out.println("\nSize of Linked List: "+cars.size());
        
        System.out.println("\nAdd last -> Nissan");
        cars.addLast("Nissan");
        System.out.println("Add first -> Ferrari");
        cars.addFirst("Ferrari");
        System.out.println("\nSize of Linked List: "+cars.size());
        System.out.println("First element: "+cars.getFirst());
        System.out.println("Last element: "+cars.getLast());
        
        /*
        Replace this code to display all elements of LinkedList
        */   
        System.out.println();
        System.out.println("Berikut adalah element yang ada di list cars: ");
        for (int i=0; i<cars.size; i++){
            System.out.println(cars.get(i));
        }
    }
}
