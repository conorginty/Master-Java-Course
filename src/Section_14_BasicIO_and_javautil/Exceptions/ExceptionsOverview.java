package Section_14_BasicIO_and_javautil.Exceptions;

public class ExceptionsOverview {
    // 226. Exceptions

    // Many of the methods we'll be using to read and write files require that exceptions are handled.
    // There's 2 main approaches to dealing with errors when programming;
    // 1. LBYL - Look Before You Leap
    //    - More common in Java
    //    - e.g. testing that an object is not null before attempting to use it
    // 2. EAFP - Easy to Ask for Forgiveness than Permission
    //    - Go ahead and perform the Operation, then respond to an Exception if something goes wrong
    //    - Code that may cause a problem is wrapped in a 'try' block, and then catch is used to deal with the exception
    //    - You generally need to decide which exceptions to catch etc
}
