/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minVal;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        minVal = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        minVal.push(minVal.isEmpty() ? val : Math.min(minVal.peek(), val));
    }
    
    public void pop() {
        stack.pop();
        minVal.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minVal.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

