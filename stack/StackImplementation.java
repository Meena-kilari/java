package stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack1 st = new Stack1(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(31);
        System.out.println("Highest element: " + st.peek());
        System.out.println("Popped element: " + st.pop());
        System.out.println("Stack size: " + st.size());
        System.out.println("Search 10: " + st.search(10));
    }
}

