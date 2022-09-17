

import java.util.Stack;

//Array implementation of Stack
public class App {
public static void main(String[] args) {

 // Create new Stack Object
	Stack<String> ValorantTeam = new Stack<>();

 // Insert new elements into the stack
 ValorantTeam .push("Astra");
 ValorantTeam .push("Jett");
 ValorantTeam .push("Phoenix");
 ValorantTeam .push("Sage");

 // Show the size of the stack
 System.out.println("The size of Valorant Team is: " + ValorantTeam.size());

 // Show top element in the stack
 System.out.println("The top of the Team is " + ValorantTeam.peek());

 // Remove top element in the stack
 ValorantTeam.pop();

 System.out.println("After pop");

 // Show all elements in Stack
 printStack(ValorantTeam);

 // Show top element in the stack
 System.out.println("The top of the Team now is: " + ValorantTeam.peek());
}

private static void printStack(Stack<String> ValorantTeam ) {
}
}
