package stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack1 st = new Stack1(5);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element: " + st.peek());
        System.out.println("Popped: " + st.pop());
        System.out.println("Size: " + st.size());
        System.out.println("Search 10: " + st.search(10));
    }
}
