import java.util.Stack;

public class Mystack2{
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum<this.getmin()){
            this.stackMin.push(newNum);
        }else{
            int newMin=this.stackMin.peek();
            this.stackMin.push(newMin);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public int getmin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackMin.peek();
    }
}