public class BinaryTree {
    Node root;

    public void insert(Student student) {
        root = insert(root, student);
    }

    private Node insert(Node node, Student student) {
        if (node == null) {
            return new Node(student);
        }

        if (student.id < node.student.id) {
            node.left = insert(node.left, student);
        } else if (student.id > node.student.id) {
            node.right = insert(node.right, student);
        }

        return node;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.student.id + " " + node.student.name);
            inorder(node.right);
        }
    }

    public Student search(int id) {
        Node tmp = root;

        while (tmp != null) {
            if (id == tmp.student.id) {
                return tmp.student;
            } else if (id < tmp.student.id) {
                tmp = tmp.left;
            } else {
                tmp = tmp.right;
            }
        }

        return null;
    }
}
