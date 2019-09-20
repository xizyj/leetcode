import java.util.Scanner;

public class Main {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        String strin = scanner.nextLine();
//        String[] str = strin.split(" ");
//        ListNode head = new ListNode(Integer.parseInt(str[0]));
//        ListNode listNode = head;
//        for (int i = 1; i < str.length - 1; i++) {
//            ListNode listNode1 = new ListNode(Integer.parseInt(str[i]));
//            listNode.next = listNode1;
//            listNode = listNode1;
//        }
        String strin = scanner.next();

        ListNode head = new ListNode(Integer.parseInt(strin));
        ListNode listNode = head;
        strin=scanner.next();
        while (!strin.equals("#")){
            ListNode listNode1 = new ListNode(Integer.parseInt(strin));
            listNode.next = listNode1;
            listNode = listNode1;
            strin=scanner.next();
        }
        Scanner scanner1=new Scanner(System.in);
        int num = Integer.parseInt(scanner1.nextLine());
        ListNode res=reverseKGroup(head, num);
        String strRes="";
        while (res!=null){

            strRes+=res.data+"->";
            res=res.next;
        }
        strRes=strRes.substring(0,strRes.length()-2);
        System.out.println(strRes);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
       ListNode dummy=new ListNode(0),prev=dummy,curr=head,next;
       dummy.next=head;
       int length=0;
       while (head!=null){
           length++;
           head=head.next;
       }
       head=dummy.next;
       for(int i=0;i<length/k;i++){
           for(int j=0;j<k-1;j++){
               next=curr.next;
               curr.next=next.next;
               next.next=prev.next;
               prev.next=next;
           }
           prev=curr;
           curr=prev.next;
       }
       return dummy.next;

    }


}
