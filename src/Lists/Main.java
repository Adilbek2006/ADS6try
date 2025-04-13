package Lists;

public class Main {
    public static void main(String[] args) {
        System.out.println("MyArrayList Test:");
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("\nMyLinkedList Test:");
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Mouse");
        linkedList.remove(1);
        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println("\nMyStack Test:");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println("\nMyQueue Test:");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());

        System.out.println("\nMyMinHeap Test:");
        MyMinHeap heap = new MyMinHeap();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        System.out.println(heap.extractMin());
        System.out.println(heap.peek());
    }
}
