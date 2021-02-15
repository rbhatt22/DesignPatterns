package LinkedList;

/**
 * Created by rbhatt22 on 1/5/20.
 */
public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        Node resultNode = new Node(head.val);

        Node current = head;
        int i = 0;
        while (current.next != null) {
            Node newNode = new Node(current.val);
            Node nextNode = current.next;
            Node randomNode = current.random;

            resultNode.next = nextNode;
            resultNode.random = randomNode;


        }
        //last node

        return resultNode;
    }

    public static void main(String[] args) {

        Node node4 = new Node(1);
        Node node3 = new Node(10);
        Node node2 = new Node(11);
        Node node1 = new Node(13);
        Node node0 = new Node(7);

        node0.next = node1;
        node0.random = null;

        node1.next = node2;
        node1.random = node0;

        node2.next = node3;
        node2.random = node4;

        node3.next = node4;
        node3.random = node2;

        node4.next = null;
        node4.random = node0;

        CopyListWithRandomPointer ob = new CopyListWithRandomPointer();
        Node result = ob.copyRandomList(node0);
        System.out.println(result);
    }

}
