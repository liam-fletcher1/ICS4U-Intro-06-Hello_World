
/*
* The "Hello Word!" program, just proves you can show print to terminal.
*
* @author  Liam Fletcher
* @version 1.0
* @since   2021-11-18
*/

/**
* This is the standard "Hello, World!" program.
*/
final class HelloWorld {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private HelloWorld() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // print out "Hello, World!"
        System.out.println("Hello, World!");

        System.out.println("\nDone.");
    }
}
