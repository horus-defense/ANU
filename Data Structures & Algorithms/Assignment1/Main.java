void main() {
    CircularDoublyLinkedList list = new CircularDoublyLinkedList();

    list.displayForward();

    // Adding Nodes
    list.addToTail(10);
    list.addToTail(20);
    list.addToHead(5);
    list.displayForward();
    list.displayBackward();

    // Inserting at speciific position ( pos 1 )
    list.insertAt(15, 1);
    list.displayForward();

    // Searching for value
    list.search(15);
    list.search(99);

    // Deleting head and tail
    list.deleteHead();
    list.displayForward();

    list.deleteTail();
    list.displayForward();

    // Deleting specific element
    System.out.println("Deleting target 15:");
    list.deleteElement(15);
    list.displayForward();


    // Testing only 1 node in list
    list.displayForward();
    list.deleteHead();
    list.displayForward();
}
