package Section_14_BasicIO_and_javautil.InputOutput;

import java.io.FileReader;

public class BufferedReader {
    // 234. BufferedReader

    // In the previous lecture we looked at reading in the directions.txt file with a FileReader
    // In this lecture we look at introducing a BufferedReader
    // A BufferedReader reads text from the Input Stream and buffers the characters into a character array.
    // So, for our example, we'll still create a FileReader, but we're going to use it as an input stream for
    // the BufferedReader to use. Reading chunks of data from a stream (e.g. a file) is more efficient than
    // reading just a few characters at a time, because things like the Overhead of seeking to the correct track
    // and sector on your Disk Drive are significant, so it takes a while to find the correct place on the
    // Disk Drive to read from, and if you have to do that many times because only a few bytes are being read
    // at a time, then the seek times really add up, so consequently BufferedReaders can be a lot more
    // streamlined (i.e. faster and more efficient)

    // You can specify the size of the buffer, but the default is 8KB, and that's enough for most purposes.
    // Both our directions and locations text files are both under 8KB, so the entire contents of each file
    // will be read into the Buffer in a single Read, and be available from there for the scanner to use
    // use it as it needs more data.

    // The code will look something like this;
//    scanner = new Scanner(new java.io.BufferedReader(new FileReader("directions.txt")));
    // What's happening is the FileReader object is passed to the BufferedReader's Constructor, then the
    // BufferedReader itself is passed to the scanner's Constructor.
    // The classes are designed to be used in this way and closing the scanner will also close the BufferedReader
    // as it also implements the Closeable Interface

    // Another way to parse data is to read it in line by line, and then we can use the String.split() method
    // to get each part of the line into a String array. It's then quite simple to parse the values that really
    // should be integers.
}
