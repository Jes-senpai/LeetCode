class MyQueue {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int top = -1;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(st1.empty()) top = x;
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.empty()) st2.push(st1.pop());
        int a = st2.pop();
        if(!st2.empty()) top = st2.peek();
        while(!st2.empty()) st1.push(st2.pop());
        return a;
    }
    
    public int peek(){
        return top;
    }
    
    
    public boolean empty() {
        return st1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */