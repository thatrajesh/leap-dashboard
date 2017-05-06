public class link extends node {
	static node head;
	link() {
		node head = new node();
		this.head=head;
	}

	public static void main(String[] args) throws Exception {
		int i = 10;
		link l = new link();
		l.add(10);
		l.add(3);
		l.add(7);
		l.print(l);
	}

	void add(int i) {
		System.out.println("Adding.." + i);
		node na = new node();
		na.item=i;
		if(head==null) {
			System.out.println("Null..");
			head=na;
		} else {
			System.out.println("Not Null..");
			node runner=head.next;
            		node previous=head;
	                while (runner != null)      {
		              previous=runner;
		              runner=runner.next;
		           }
		           na.next=runner;
		           previous.next=na;
			
		}
	}

	node runner(node n) {
		if (n.next!=null) {
			runner(n);
		} 
		return n;
	}

	  public void print(link list) {
            if (list.head == null)    {
                System.out.println("List is empty");

            }      else {
                node runner = head;
                while (runner != null)  {
                    System.out.println("List value:" + runner.item);
                    runner=runner.next;
                }
            }
    }

}
