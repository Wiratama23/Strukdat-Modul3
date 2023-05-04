class Queue {
    Node front;
    Node rear;

    public Queue() {
        front = rear = null;
    }

    public void enqueue(String data) {
        String[] splitData = data.split(",\\s*");
        if (splitData.length != 3) {
            System.out.println("Format input tidak valid\n\n");
            return;
        }
        String name = splitData[0];
        int age = Integer.parseInt(splitData[1].trim());
        String occupation = splitData[2];
        Node newNode = new Node(name, age, occupation);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(name + ", " + age + ", " + occupation + " \nberhasil dimasukkan ke database\n\n");
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("pegawai kosong\n\n");
            return;
        }
        String name = front.name;
        int age = front.age;
        String occupation = front.occupation;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(name + ", " + age + ", " + occupation + " \nPegawai berhasil dikeluarkan\n\n");
    }

    public Node peek() {
        if (front == null) {
            System.out.println("Pegawai kosong\n\n");
            return null;
        }
        return front;
    }


    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
