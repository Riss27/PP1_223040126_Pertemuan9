public class QueueMain2 {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        // sebelum enqueue 4x
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.print("Elemen Queue : ");
        queue.displayElements();
        System.out.println();

        // Enqueue 4x
        System.out.println("### Enqueue 4x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.print("Elemen Queue : ");
        queue.displayElements();
        System.out.println("Front : " + queue.front());

        // Dequeue
        System.out.println("\n### Dequeue ###");
        queue.dequeue();
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.print("Elemen Queue : ");
        queue.displayElements();
        System.out.println("Front : " + queue.front());
    }    
}
