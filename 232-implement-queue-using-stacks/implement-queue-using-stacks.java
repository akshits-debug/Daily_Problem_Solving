class MyQueue {
    Stack<Integer>a=new Stack<>(),b=new Stack<>();

    public void push(int x){a.push(x);}

    public int pop(){
        peek();
        return b.pop();
    }

    public int peek(){
        if(b.empty()) while(!a.empty()) b.push(a.pop());
        return b.peek();
    }

    public boolean empty(){return a.empty()&&b.empty();}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */