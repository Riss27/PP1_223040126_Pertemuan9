public class StrukturQueue {
    private Node FRONT;
    private Node REAR;

    // enqueue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }
    /*
    Method ini bertujuan untuk menambahkan data baru ke dalam antrian. Jika antrian masih kosong, maka 
    data baru akan menjadi elemen pertama (FRONT) dan juga elemen terakhir (REAR) dalam antrian.jika antrian 
    sudah berisi elemen, data baru akan ditambahkan di belakang (REAR) antrian, dan REAR akan diperbarui menjadi elemen baru.
    Parameter 'data' adalah nilai yang akan disimpan dalam elemen baru yang akan ditambahkan ke dalam antrian.
    */ 

    // dequeue
    public void dequeue() {
       Node temp;
       if (FRONT != null) {
        if (FRONT == REAR) {
            FRONT = null;
            REAR = null;
        } else {
            temp = FRONT;
            FRONT = FRONT.getNext();
            temp = null;
            }
        }
    }
    /*
    Method ini berfungsi untuk menghapus elemen dari depan (FRONT) antrian.
    Jika antrian tidak kosong, maka elemen pertama (FRONT) akan dihapus.
    Jika setelah penghapusan, antrian hanya memiliki satu elemen, maka FRONT dan REAR akan diatur menjadi null, menandakan antrian kosong.
    Namun, jika antrian memiliki lebih dari satu elemen, FRONT akan dipindahkan ke elemen berikutnya, dan elemen pertama sebelumnya akan dihapus.
    Variabel 'temp' digunakan untuk menyimpan referensi ke elemen pertama (FRONT) sebelum dihapus.
    */ 

    // menampilkan semua elemen
    public void displayElements() {
        Node curNode = FRONT;
        if (curNode == null) {
            System.out.println("Queue Kosong");
        } else {
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

    // size
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }
    /*  
        Menghitung jumlah elemen dalam antrian dengan mengiterasi dari FRONT hingga ke elemen terakhir.
        Setiap kali menemukan node, variabel 'size' akan ditambahkan satu.
        Jumlah total elemen kemudian dikembalikan.
    */

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }
    /*  
        Mendapatkan nilai data dari elemen depan (FRONT) antrian tanpa menghapusnya.
        Mengembalikan nilai data dari FRONT jika antrian tidak kosong, dan -1 jika kosong.
    */

    public boolean isEmpty() {
        return FRONT == null;
    }
}
