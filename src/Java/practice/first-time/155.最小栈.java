/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    Deque<Integer> s;
    Deque<Integer> minS;
    /** initialize your data structure here. */
    public MinStack() {
        s = new ArrayDeque<Integer>();
        minS = new ArrayDeque<Integer>();
        minS.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        s.push(val);
        minS.push(Math.min(val, minS.peek()));
    }
    
    public void pop() {
        s.pop();
        minS.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS.peek();
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

