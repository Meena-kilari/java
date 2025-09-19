package arraylist;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2,4);
        list.addFirst(5);
        list.addLast(40);
        System.out.println("Size: " + list.size());
        System.out.println("Contains 20 or not : " + list.contains(20));
        System.out.println("Contains 99 or not : " + list.contains(99));
        list.remove(2);
        System.out.println("Size after removing an element : " + list.size());
        list.add(2, 99);
        System.out.println("Size after insert an element : " + list.size());
    }
}

