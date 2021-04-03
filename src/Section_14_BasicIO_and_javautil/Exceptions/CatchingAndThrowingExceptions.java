package Section_14_BasicIO_and_javautil.Exceptions;

public class CatchingAndThrowingExceptions {
    // 228. Catching and Throwing Exceptions

    // It is vital that any code in the Exception Handler (i.e the Catch Block) does NOT cause Exceptions itself.
    // The trick is to keep the Catch Block as simple as possible, because the less code you have in it, the less
    // chance there is of another Exception being thrown.

    // A problem with the code that we have written so far as that if the user inputs something invalid, we just
    // turn their input to 0 and then continue as if nothing went wrong. This is obviously problematic in certain
    // circumstances (e.g. you sometimes want systems to fail, if continuing can be dangerous etc).
    // To this end we Throw appropriate errors. To throw an Exception, we create a new Exception Object, and use
    // the 'throw' keyword/statement. Generally we should try be as specific as possible
}
