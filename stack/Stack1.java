package stack;

public class Stack1 {
    private int[] arr;
    private int n;
    private int top;

    Stack1(int n) {
        this.n = n;
        arr = new int[n];
        top = -1;
    }

    public boolean push(int x) {
        if (top == n - 1) return false;
        arr[++top] = x;
        return true;
    }

    public int pop() {
        if (top == -1) return -1;
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public int search(int x) {
        for (int i = top; i >= 0; i--) {
            if (arr[i] == x) return (top - i + 1);
        }
        return -1;
    }

    public int peek() {
        if (top == -1) return -1;
        return arr[top];
    }
}
