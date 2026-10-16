void main() {
    LinkedList list = new LinkedList();
    list.addToHead(8);
    list.addToHead(4);
    list.addToTail(12);
    list.insertAt(6, 1);
    list.addToTail(15);
    list.deleteHead();
    list.deleteAt(2);
    list.deleteTail();
    list.displayAll();
    list.countNodes();
}
