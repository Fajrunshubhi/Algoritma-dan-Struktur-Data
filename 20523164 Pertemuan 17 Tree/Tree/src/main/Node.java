package main;

/**
 *
 * @author fajrun shubhi
 */

public class Node<E>{
    private E data = null;
    private ArrayList<Node> children = new ArrayList<>();
    private Node parent = null;
    private int level = 0;

    public Node(E data) {
        this.data = data;
    }
    
    public Node(){
        
    }

    public void addChild(Node child) {
        child.setParent(this);
        this.children.add(child);
    }
    
    public void addChild(E data) {
        Node<E> newChild = new Node<>(data);
        this.addChild(newChild);
    }
    
    private void setParent(Node parent) {
        this.parent = parent;
        this.level = parent.getLevel() + 1;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }
    
    public int getNumChild() {
        return this.children.size();
    }
    
    public int getLevel(){
        return this.level;
    }

    public Object getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getParent() {
        return parent;
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }
}

