class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectAndRemoveCycleLinkedList {
    static Node head = null;

    public static void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean detectCycle() { // FLOYD'S CYCLE DETECTION ALGORITHM
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow != fast) {
            return; // No cycle
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        Node temp = fast;
        while (temp.next != fast) {
            temp = temp.next;
        }
        temp.next = null; // Removing cycle
    }

    public static void main(String[] args) {
        addAtEnd(1);
        addAtEnd(2);
        addAtEnd(3);
        addAtEnd(4);
        addAtEnd(5);

        // Creating a cycle for testing
        head.next.next.next.next.next = head.next; // 5 -> 2 creates a cycle

        // printList();
        // This will run indefinitely due to the cycle

        if (detectCycle()) {
            System.out.println("Cycle detected in the linked list.");
            removeCycle();
            System.out.println("Cycle removed.");
            System.out.println("Linked list after removing cycle:");
            printList();
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}
