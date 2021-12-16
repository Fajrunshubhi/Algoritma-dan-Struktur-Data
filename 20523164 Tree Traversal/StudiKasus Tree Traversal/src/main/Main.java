package main;

/**
 *
 * @author fajrun shubhi
 */

public class Main {
    
    private static void preOrderCariBawahan(Node<String> NodeNow){
        for(int i = 0; i < NodeNow.getNumChild(); i++){
            Node<String> child = (Node<String>) NodeNow.getChildren().get(i);
            System.out.print(child.getData() + ", ");
            preOrderCariBawahan(child);
        }
    }
    
    public static void CariBawahan(String nama, Tree<String> t){
        System.out.println("Bawahan dari " + nama + " adalah: ");
        Node<String> Awal = t.getNode(nama);
        preOrderCariBawahan(Awal);
    }
    
    
    public static void main(String[] args) {
        
        Tree<String> pohon = new Tree<>("Jim");
        pohon.addChild("Jim", "Roy");
        pohon.addChild("Jim", "Mal");
        pohon.addChild("Jim", "Ali");
        
        
        // child Roy
        pohon.addChild("Roy", "Adi");
        pohon.addChild("Roy", "Ica");
        // child Ica
        pohon.addChild("Ica", "Ana");
        pohon.addChild("Ica", "Gal");
        
        
        // child Mal
        pohon.addChild("Mal", "Boy");
        // child Boy
        pohon.addChild("Boy", "Abu");
        pohon.addChild("Boy", "Kim");
        
        pohon.draw();    
        
        CariBawahan("Roy", pohon);
        System.out.println();
    }
}
