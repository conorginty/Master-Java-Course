package Section_14_BasicIO_and_javautil.Exceptions;

public class StackTraceAndCallStack {
    // 227. Stack Trace and Call Stack

    // Java Documentation defines an Exception as;
    // An Event which occurred during the Execution of a Program that disrupts the normal flow of the Program's Instructions
    // i.e. Something went wrong somewhere

    // Exception and RuntimeException are classes defined in java.lang, and the different types of Exceptions that
    // can be called are sub-classes of 1 of these 2 Exceptions.
    // Normally when catching an Exception, you'd specify which Subclass of Exception to catch
    // We saw this earlier when we tried catching Exceptions of type ArithmeticException and InputMismatchException
    // We could just catch the generalised Exception, BUT it's far better practice to be more specific

    // The type of Exception thrown answers the question of what went wrong, so that's another good reason to be more
    // specific, so we can really understand the type of error that's been encountered in the Program, so when our
    // code got an InputMismatchException, we can then decide what to do about it.
    // So, as it happened, our code didn't do very much in terms of resolution - any invalid input just resulted in 0
    // being returned. This could be a reasonable response in certain scenarios, but in others, the Calling Method
    // might need to know that there was a problem, rather than effectively being told that the User entered the
    // number 0, which is what we did.
    // To let the Calling Method know that there was a problem, the code could have thrown the exception, which means
    // passing the Exception back to the Calling Method

    // The Call Stack is the list of all the Method Calls at any particular point in a program's execution.
    // In our case, usually, it consists of all the Method Calls at the point where the Program crashed.
    // Each Thread of Execution has its own Call Stack, and the Thread is shown as the 1st line of the Stack Trace
    // at the bottom (the bottom red line), typically the main method.
    // Every time a new Method is called, it's actually placed onto the Stack, and when a Method returns, it's popped
    // from the Stack

    // Exception itself extends Throwable. The Throwable Constructor fills in the Stack Trace for the Exception.
    // When an Exception gets thrown, the Java Runtime looks to see what can handle it, and it does that by working
    // back up the Call Stack. Each Method on the Stack gets the Exception, and if it doesn't handle it, the Exception
    // gets passed on to the previous method on the stack, and so on. The Exception is said to "propagate" up the
    // Call Stack, and it keeps getting passed to the Calling Methods until there is one that can actually handle
    // the Exception.
    // Looking at the way the Stack Trace is printed, it might make more sense to talk about propagating DOWN the
    // Call Stack, BUT  Stacks tend to be implemented growing downwards, so we talk about going back UP the Stack.
    // Eventually, if nothing handles the Exception, then the main Java entry point just prints the Stack Trace and
    // the Java Runtime terminates

    // Generally speaking, there's no point catching an Exception unless your code can do something sensible with it
    // as a result

}
