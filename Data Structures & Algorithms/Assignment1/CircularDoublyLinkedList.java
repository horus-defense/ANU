public class CircularDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Node count
    public int countNodes() {
        return size;
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node tmp = head;
        System.out.print("Forward: ");

        // Check Idea to avoid infinite loop
        boolean firstNode = true;
        while (tmp != head || firstNode) {
            firstNode = false;
            System.out.print(tmp.data + " <-> ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node tmp = tail;
        System.out.print("Backward: ");

        boolean firstNode = true;
        while (tmp != tail || firstNode) {
            firstNode = false;
            System.out.print(tmp.data + " <-> ");
            tmp = tmp.prev;
        }
        System.out.println();
    }

    public void addToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
        size = size  + 1;
    }

    public void addToTail(int data) {
        if (head == null) {
            addToHead(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.prev = tail;
        newNode.next = head;
        tail.next = newNode;
        head.prev = newNode;
        tail = newNode;
        size = size  + 1;
    }

    public void insertAt(int data, int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Wrong Position");
            return;
        }

        if (pos == 0) {
            addToHead(data);
            return;
        }

        if (pos == size) {
            addToTail(data);
            return;
        }

        Node newNode = new Node(data);
        Node tmp = head;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }

        Node previousNode = tmp.prev;
        previousNode.next = newNode;
        newNode.prev = previousNode;
        newNode.next = tmp;
        tmp.prev = newNode;
        size = size  + 1;
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size = size - 1;
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            deleteHead();
            return;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        size = size - 1;
    }

    public void removeAt(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Wrong position");
            return;
        }

        if (pos == 0) {
            deleteHead();
            return;
        }

        if (pos == size - 1) {
            deleteTail();
            return;
        }

        Node tmp = head;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }

        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;
        size = size - 1;
    }

    public void deleteElement(int target) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node tmp = head;
        int index = 0;
        boolean firstNode = true;

        while (tmp != head || firstNode) {
            firstNode = false;
            if (tmp.data == target) {
                removeAt(index);
                return;
            }
            tmp = tmp.next;
            index = index + 1;
        }

        System.out.println("Element " + target + " not in list");
    }

    public boolean search(int target) {
        if (head == null) {
            return false;
        }

        Node tmp = head;
        boolean firstNode = true;

        while (tmp != head || firstNode) {
            firstNode = false;
            if (tmp.data == target) {
                return true;
            }
            tmp = tmp.next;
        }

        return false;
    }
}
