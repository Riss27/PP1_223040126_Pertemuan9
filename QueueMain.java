public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        // sebelum enqueue 3x
        System.out.println("### sebelum enqueue 3x ###");
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.println();

        // Enqueue 3x
        System.out.println("### Enqueue 3x ###");
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.println("Front : " + queue.front());

        // Dequeue
        System.out.println("\n### Dequeue ###");
        queue.dequeue();
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.println("Front : " + queue.front());
    }
}
