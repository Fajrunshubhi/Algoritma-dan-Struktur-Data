package Stack;

public class StackArray<E> {
    public Object [] stackArr;
    protected int elementCount;
    
    public StackArray(){
        this.stackArr = new Object[10];
        this.elementCount = 0;
    }
    
    public int capacity(){
        return this.stackArr.length;
    }
    
    public int size(){
        return this.elementCount;
    }
    
    public boolean empty(){
	return this.elementCount == 0;
    }
    
    public int indexOf(Object e){
        for (int i = 0; i < this.elementCount; i++){
            if (e.equals(this.stackArr[i])){
                return i;
            }
        }
        return -1;
    }  
    
    public boolean contains(Object elem){
        return indexOf(elem) >= 0;
    }
    
    public int lastIndexOf(Object e){
        int index = this.elementCount - 1;
        for (int i = index; i >= 0; i--){
            if (e.equals(this.stackArr[i])){
                return i;
            }
        }
        return -1;
    }
    
    public void addCapacity(){
        int newCapacity = this.stackArr.length * 2;
        
        Object [] newArray =  new Object[newCapacity];
        
        for(int i=0; i<this.elementCount; i++){
            newArray[i] = this.stackArr[i];
        }
        
        this.stackArr = newArray;
    }
    
    public void push(E obj){
        if (this.elementCount == this.stackArr.length){
            this.addCapacity();
        }
        this.stackArr[this.elementCount++] = obj;
    }
    
    public Object pop(){
        if (this.elementCount == 0){
            return null;
        }
        Object obj = this.stackArr[--this.elementCount];
        this.stackArr[this.elementCount] = null;
        return obj;
    }
    
    public Object peek(){
        if (this.elementCount == 0){
            return null;
        }
        return this.stackArr[this.elementCount - 1];
    }
    
    public int search(Object o){
        int i = elementCount;
        while (--i >= 0){
            if (o.equals(this.stackArr[i])){
                return elementCount - i;
            }
        }
        return -1;
    }
    
    public void clear(){
        if (this.elementCount == 0){
            return;
        }
        for(int i=0; i<this.elementCount; i++){
            this.stackArr[0] = null;
        }
        this.elementCount = 0;
    }
    
    public void print(){
        if(empty()){
            System.out.println("Stack is empty");
        }else{
            int posisi = 1;
            for(int i=this.elementCount-1; i>=0; i--){
                System.out.println("Elemen ke-"+(posisi)+" : "+this.stackArr[i]);
                posisi++;
            }
        }
    }

    public boolean isOperator(String ch){
        String operators = "^*/+-";
        if(operators.contains(ch)){
            return true;
        }else{
            return false;
        }
    }
    
    public double operation(double a, double b, String op){
        if("+".equals(op)){
            return a+b;
        }else if("-".equals(op)){
            return a-b;
        }else if("*".equals(op)){
            return a*b;
        }else if("^".equals(op)){
            return Math.pow(a, b);
        }else{
            return a/b;
        }
    }
}