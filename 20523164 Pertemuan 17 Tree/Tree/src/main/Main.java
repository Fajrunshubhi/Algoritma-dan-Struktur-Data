package main;

/**
 *
 * @author fajrun shubhi
 */

public class Main {
    public static void main(String[] args) {
        
        Tree<String> pohonKu = new Tree<>("Parent");
        
        pohonKu.addChild("Parent", "Child 1");
        pohonKu.addChild("Parent", "Child 2");
        
        Node<String> childNode3 = new Node<>("Child 3");     
        pohonKu.addChild("Parent", childNode3);
        
        pohonKu.addChild("Child 1", "Grandchild 1");

        Node<String> grandchildNode = new Node<>("Grandchild 2"); 
        pohonKu.addChild("Child 3", grandchildNode);
        
        pohonKu.draw(); 
        
        
        Tree<String> nama = new Tree <>("Agung");
        
        nama.addChild("Agung", "Budi");
        nama.addChild("Agung", "Beni");
        Node<String> anak3 = new Node<>("Basuki");     
        nama.addChild("Agung", anak3);

        nama.addChild("Budi", "Cholis");
        Node<String> anakBudi2 = new Node<>("Cholil");     
        nama.addChild("Budi", anakBudi2);

        nama.addChild("Cholil", "Damar");
        nama.addChild("Basuki", "Chandra");
        nama.draw();

    }
}
