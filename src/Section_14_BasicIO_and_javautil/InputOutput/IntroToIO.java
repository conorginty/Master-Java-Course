package Section_14_BasicIO_and_javautil.InputOutput;

public class IntroToIO {
    // 230. Introduction to I/O

    // There are several different approaches to Java I/O.
    // The java.io package has a ton of Objects dealing with different I/O methods
    // In this section we'll focus on the most useful ways of getting data into and out of programs, and also
    // consider the Advantages of the various methods as we encounter them.
    // We'll also look at the java.nio package, which was introduced in Java7.

    // Input = Reading data from a source
    // Output = Writing data to some destination
    // Often the Source and Destination are files on the Computer's Disk Drives, but can also be Network Connections,
    // Pipes, as well as the Keyboard and Screen.
    // We've often used Scanner to read input from the Keyboard. Strictly speaking we're not reading from the
    // keyboard, though - we're reading from system.in.
    // We'll also look at dealing with Disk Files and Directories, because often you want to create a new
    // Directory to store your data, or present the User with a list of files to choose from, and the File class
    // provides Methods for doing things like that.

    // === Theory ===
    // I/O can be performed using byte or character data, and the methods used are basically the same for each (just
    // the actual Classes used will vary).
    // So, when reading and writing character data, the data is in a readable format, and you can open the resulting
    // files (if it's files being read or written) in a Text Editor, and you can probably make sense of it.
    // Whereas Binary Data involves writing bytes that will not look meaningful if you open the files in a normal
    // text editor.
    // Which Type you decide to use really depends on what Data represents, and if you're creating a Report File to be
    // imported into a Spreadsheet, you'd probably choose a character stream.
    // Similarly, character should probably be the correct type for writing XML or JSON data (it really depends on
    // what you're trying to achieve).

    // Another distinction needs to be made between Serial/Sequential Access Files and Random Access Files
    // 1. Sequential Access - can be thought of as a Stream of Data that arrives to or sent from a Program in a
    //    Defined Order with each Piece of Data following in sequence
    // 2. Random Access - only really applies to Files, and allows you to jump within the File, retrieving or
    //    overriding any data in any location within that chosen file. This is more like how a Database Program
    //    would work with some sort of Index showing you where a particular Record is in the File so that it can
    //    be read without having to read through all the previous Records first.
    // Sequential Data is comparable to a Stream, and in fact Java uses Stream String Objects to deal with it.
    // To see this in action, we'll need to have some Data to use, so we'll use the Location data from the
    // Adventure Game we modified previously.
}
