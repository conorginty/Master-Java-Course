package Section_10_JavaGenerics;

public class OurGenericsClass {
    // 137. Our Generics Class

    // So it's commonly understood in programming terms that the earlier a bug is spotted in the code, the 
    // easier and ultimately cheaper it is to fix, and that's because there's fewer resources and man power
    // invested to actually fix that error. So, if a bug appears in production code, it HAS to be fixed.
    // So as well as being fixed, the code must be fully-tested to ensure that the actual fix that was made
    // didn't introduce another bug, and then finally the updated code containing the fix(es) has to be
    // redeployed and uploaded to the Google Store or online etc.

    // And so any systems - any other apps that rely on the program, also have to be tested, to ensure that
    // the fix hasn't broken inter-operability between the 2 systems. If the bug itself is spotted in testing,
    // the effort is reduced slightly, but there's still a requirement for any tests that previously passed
    // to be performed again. And if the bug is spotted at compile time, no one else actually notices, except
    // you as the programmer, and the fix has had very low impact on anyone else.

    // This is why you want bugs/errors to be fixed early on in your code, as you don't want to find all these
    // surprises later on in the process, as it starts costing a lot of time and resources to fix them.

    // Therefore, it follows that anything we can do to pick up bugs at compile time when we're writing our code
    // the 1st time is well worth the effort to get right.

    // As we've seen before, Generics are useful to ensure that we don't produce a program that compiles fine
    // but actually gives us errors at runtime
}
