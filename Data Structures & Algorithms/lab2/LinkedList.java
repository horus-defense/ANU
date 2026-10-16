public class LinkedList {
    Node head;
    public void displayAll(){
        Node tmp = head;
        if (head == null) {
            System.out.print("List is Empty");
            return;
        } else {
            while (tmp != null) {
                System.out.print(tmp.data + " --> ");
                tmp = tmp.next;
            }
        }
    }

    public void addToHead(int el) {
        Node newNode = new Node(el);

        if (head == null) {
             head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addToTail(int el) {
        Node newNode = new Node(el);
        if (head == null) {
            head = newNode;
        } else {
            Node tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            tmp.next.next = newNode;
        }
    }
    public void insertAt(int el, int pos) {
        if (pos == 0) {
            addToHead(el);
        } else {
            Node newNode = new Node(el);
            Node tmp = head;
            for (int i = 0; i < pos - 1; i++) {
                tmp = tmp.next;
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
    }
    public void deleteHead() {
        if (head == null) {
            return;
        }
        head = head.next;
    }
    public void deleteTail() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node tmp = head;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        tmp.next = null;
    }
    public void deleteAt(int pos) {
        if (pos == 0) {
            deleteHead();
            return;
        }
        Node tmp = head;
        for (int i = 0; i < pos - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
    }
    public void countNodes() {
        Node tmp = head;
        int count = 0;
        while(tmp != null) {
            tmp = tmp.next;
            count++;
        }
        System.out.println(count);

    }
}
