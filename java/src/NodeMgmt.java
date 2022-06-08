public class NodeMgmt {
    Node head = null;
    public class Node {
        Node left;
        Node right;
        int value;
        public Node (int data){
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isertNode(int data){
        if (this.head == null){
            this.head = new Node(data);
        }else {
            Node findeNode = this.head;
            while (true){
                if (data < findeNode.value){
                    if (findeNode.left != null){
                        findeNode = findeNode.left;
                    }else {
                        findeNode.left = new Node(data);
                        break;
                    }
                }else {
                    if (findeNode.right != null){
                        findeNode = findeNode.right;
                    }else {
                        findeNode.right = new Node(data);
                        break;
                    }

                }
            }
        }
        return true;
    }
}
