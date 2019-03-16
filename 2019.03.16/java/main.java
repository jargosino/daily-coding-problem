class Main {
    public static void main(String[] args) {
        Node node = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));
        String serial = node.serialize();
        System.out.println(serial);

        Node node2 = Node.deserialize(serial);
        System.out.println(node2.serialize());
    }
}

class Node {
    private String val;
    private Node left;
    private Node right;

    public Node(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(String val) {
        this(val, null, null);
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setRight(Node right) {
        this.left = right;
    }

    public Node getRight() {
        return this.right;
    }

    public String serialize(Node node) {
        if (node == null) {
            return "null";
        }

        Node left = node.getLeft();
        Node right = node.getRight();

        return node.getVal() + '-' + node.serialize(left) + "-" + node.serialize(right);
    }

    public String serialize() {
        return this.serialize(this);
    }

    private static Node deserialize(String[] vals) {
        // if (i >= vals.length) {
        //     return null;
        // }
        System.out.println(index + " " + vals[index] );
        if (vals[index].equals("null")) {
            index++;
            return null;
        }

        Node node = new Node(vals[index++]);

        node.setLeft(node.deserialize(vals));
        node.setRight(node.deserialize(vals));
        return node;
    }

    private static int index;

    public static Node deserialize(String s) {
        String[] vals = s.split("-");
        index = 0;
        return deserialize(vals);
    }
}