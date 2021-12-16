package main;

/**
 *
 * @author fajrun shubhi
 */

public class Tree<E> {
    
    public Node<E> rootNode = new Node<>();
    public int treeSize = 1;

    public Tree(E data) {
        this.rootNode.setData(data);
    }
    
    public int size(){
        return this.treeSize;
    }
    
    public void addChild(E parentData, Node<E> child){
        Node<E> parent = getNode(parentData);
        parent.addChild(child);
        this.treeSize++;
    }
    
    public void addChild(E parentData, E dataChild){
        Node<E> newChild = new Node<>(dataChild);
        Node<E> parent = getNode(parentData);
        parent.addChild(newChild);
        this.treeSize++;
    }
    
    public Node<E> getNode(E data){
        return preOrderGetNode(this.rootNode, data);
    }
    
    public void draw(){
        this.preOrderDraw(this.rootNode, 0);
    }
    
    public Node<E> preOrderGetNode(Node<E> node, E data){
        if(node.getData() == data){
            return node;
        } 
        else if(node.isLeaf() == false){
            for(int i=0;i<node.getNumChild();i++){
                Node<E> child = (Node<E>) node.getChildren().get(i);
                Node<E> returnNode = preOrderGetNode(child, data);
                if(returnNode != null)
                    return returnNode;
            }
        }
        return null;
    }
    
    public void preOrderDraw(Node<E> node, int depth){
        for(int i=0;i<depth;i++){
            System.out.print("--");
        }
        System.out.println(" " + node.getData());
        for(int i=0;i<node.getNumChild();i++){
            Node<E> child = (Node<E>) node.getChildren().get(i);
            preOrderDraw(child, depth+1);
        }
    }    

    
}

