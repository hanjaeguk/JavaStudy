package interface_object_Queue;

public class QueueExample {

	public static void main(String[] args) {
		QueueClass q = new QueueClass();
		q.push('A'); // char´Â '' StringÀº ""
		q.push('B');
		q.push('C');
		q.push('D');
		q.push('E');
		q.push('F');
		q.empty();
		q.top();
		q.empty();
		q.pop();
		q.empty();
		q.pop();
		q.empty();
		q.pop();
		q.push('B');
		q.size();



		
	}

}
