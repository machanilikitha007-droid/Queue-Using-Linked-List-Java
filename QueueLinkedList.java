import java.util.Scanner;

public class QueueLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Element inserted successfully.");
    }

    static void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Deleted element: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    static void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    static void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue elements:");

        Node current = front;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== QUEUE USING LINKED LIST =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    enqueue(sc.nextInt());
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
