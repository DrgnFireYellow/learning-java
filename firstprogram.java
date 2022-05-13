public class firstprogram { // public class <program name> to start a program
    public static void main(String[] args) { // put main code in this
        // this is my first java program
        /* this
        is
        a
        multiline
        comment */
        String name = "Ethan"; // Defines a variable containing the string Ethan
        System.out.print("My name is ");
	System.out.print(name);
        System.out.print("\n"); // like print(end='')
        System.out.println("This is another way to do that: My name is " + name); // string concatenation
        System.out.println("This is my first java program"); // like print() in python
        System.out.println("This is not at all like python...");
        System.out.println("Although math is very similar...");
        System.out.println(5 + 3); // Math is like python
        System.out.println("That was 5 + 3!");
    }
}
