import java.util.LinkedList;
import java.util.Queue;

public class App
{
	public static void main(String[] args) {
		Queue<String> ClassList = new LinkedList<>();

	//1.Enqueue 5 of your classmates in this section
		ClassList.add("Tenerife, Tristan");
		ClassList.add("Bolanos, Jap");
		ClassList.add("Verzosa, Luis");
		ClassList.add("Papina, Marianne");
		ClassList.add("Bablis, Winna");

		//2.Get the size of the queue
		System.out.println("Size of the queue: " + ClassList.size());
		
		//3.Get the front of the queue
		System.out.println("Front of the queue: " + ClassList.peek());

		//4.Dequeue 5 of your classmates 
		ClassList.remove();
		ClassList.remove();
		ClassList.remove();
		ClassList.remove();
		ClassList.remove();

		//5.Enqueue another 5 of you classmates
		ClassList.add("Masangcay, Jenina");
		ClassList.add("Cinco, Brandon");
		ClassList.add("Banto, John");
		ClassList.add("Monte de Ramos, Mariel");
		ClassList.add("Hermosura, Jonnah");

		//6.Get the size of the queue
		System.out.println("Size of the queue: " + ClassList.size());
		
		//7.Get the front of the queue
		System.out.println("Front of the queue: " + ClassList.peek());

	}	
}
