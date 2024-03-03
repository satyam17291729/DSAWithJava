import java.util.Scanner;

public class LinkListUse {

    // create a linked list method 1

    public static Node<Integer> createLinkListMethod1() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> temp;
        while (data != -1) {
            Node<Integer> newnode = new Node<Integer>(data);
            if (head == null) {
                head = newnode;
            } else {
                temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newnode;
            }
            data = s.nextInt();
        }
        s.close();
        return head;
    }


    //create the link list method 2

    public static Node<Integer> cerateLinkListMethod2(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null;
        Node<Integer> tail=null;
        while (data!=-1) {
            Node<Integer> newnode=new Node<Integer>(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                tail.next=newnode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        s.close();
        return head;
    }


    //print the link List

    public static void printLinkList(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        return;
    }

    public static void main(String[] args) {
        Node<Integer> head=cerateLinkListMethod2();
        printLinkList(head);
    }
}