void main() {
    BinaryTree tree = new BinaryTree();

    tree.insert(new Student(50, "Ahmed"));
    tree.insert(new Student(30, "Sara"));
    tree.insert(new Student(70, "Omar"));
    tree.insert(new Student(20, "Ali"));
    tree.insert(new Student(40, "Mona"));
    tree.insert(new Student(60, "John"));
    tree.insert(new Student(80, "Peter"));

    Student result = tree.search(40);

    if (result != null) {
        System.out.println("Student found: " + result.id + " " + result.name);
    } else {
        System.out.println("Student not found");
    }

    System.out.println("Inorder:");
    tree.inorder();
}
