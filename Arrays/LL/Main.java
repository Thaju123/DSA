class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
      Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}

class LL{
    Node head;
    Node tail;
    int size;

   public LL() {
    this.size = 0;
}


    public void insertbeg(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        if(tail==null){
            tail=head;
        }
        size=size+1;
    }
    public int getsize(){
        System.out.println("size or count="+size);
        return 1;
    }

    public void insertend(int data){
        Node newnode=new Node(data);
        if(tail==null) {
        insertbeg(data);
        return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;

    }
    public void insert(int data,int index){
        if(index==0){
            insertbeg(data);
            return;
        }
        if(index==size){
            insertend(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node newnode=new Node(data,temp.next);

        temp.next=newnode;
        size++;

        }
        public int delfirst(){
            int data=head.data;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return data;
        }

        public int delend(){
            if(size<=1){
                return delfirst();
            }

            Node secondlast=head;
            for(int i=0;i<size-2;i++){
                secondlast=secondlast.next;
            }
            int data=tail.data;
            secondlast.next=null;
            tail=secondlast;
            size--;
            return data;
        }
    public int delete(int index) {


    if (index == 0) {
        return delfirst(); 
    }

    if (index == size - 1) {
        return delend(); 
    }

    Node prev = head;
    for (int i = 1; i < index; i++) {
        prev = prev.next;
    }

    int data = prev.next.data;
    prev.next = prev.next.next;
    size--;

    return data;
}
    



    public void printlist(){
    Node current=head;
    while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
    }
    System.out.println("null");
}
}





public class Main {
    public static void main(String[] args) {
        LL list=new LL();
                list.insertbeg(1);
                list.insertbeg(2);
        list.insertbeg(3);
        list.insertbeg(4);
        list.insertbeg(5);
        list.insertend(1);
        list.insert(100, 6);

// list.printlist();
// list.getsize();
// System.out.println("deleted element is "+list.delfirst());

// list.delfirst();
// list.printlist();


// list.getsize();
// list.printlist();
// list.delend();
// System.out.println(list.delend());

list.printlist();
list.getsize();

list.delete(1);
list.printlist();
list.getsize();

        
    }
}
