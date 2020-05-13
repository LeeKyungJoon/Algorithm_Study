
public class Study_36 {
    private int[] arr;
    private int top = 0;
    public Study_36(int stackSize) {
        this.arr = new int[stackSize];
    }

    public static void main(String[] args) {
        Study_36 st = new Study_36(3);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }

    private int peek() {
        return arr[top-1];
    }

    private int pop() {
        if(top > 0) {
            return arr[--top];
        }
        else {
            throw new java.util.NoSuchElementException();
        }
    }

    private void push(int i) {
        if(top < arr.length) {
            arr[top++] = i;
            System.out.println("pushed: "+i);
        }
        else {
            System.out.println("stack is full");
        }
    }
}