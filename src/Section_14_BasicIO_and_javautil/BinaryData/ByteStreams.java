package Section_14_BasicIO_and_javautil.BinaryData;

public class ByteStreams {
    // 238. Byte Streams

    // In previous videos we've looked at how to read and write text data to files using FileReader and FileWriter.
    // We also looked at buffering the data to make the program more efficient (as this reduces the disk access
    // time by reading large chunks of the file into memory (in the case of a read operation) or writing data
    // to a Buffer then saving a large chunk of data to a file in a single operation when writing).

    // Here we'll look at Byte Streams (i.e. Binary data)
    // One advantage of dealing with Binary Data (Byte Stream) is that we don't have to pass the data into the various
    // data types that were stored because a byte stream itself can be used to read and write any of the Java
    // primitive types (e.g. int, double, byte etc) and can also handle String variables (even though String
    // isn't a primitive type).

    // Working with Byte Streams follows the same pattern, the differences being we use a FileInputStream and
    // FileOutputStream classes instead of FileReaders and FileWriters.
    // We'll buffer the data again using the BufferedInputStream and BufferedOutputStream classes.
    // We could work directly with these objects, but they only handle raw bytes, so reading or writing either
    // a single byte or a specified number of bytes. There are occasions where that'll probably be all you need,
    // but generally speaking when storing and retrieving data, you probably want to work with Java types.
    // The java.io package makes this easy by providing the DataInputStream and DataOutputStream classes which
    // provide methods (e.g. readInt(), which reads an integer value from the stream, and it does this by reading
    // 4 bytes from the stream and building up the integer from those 4 bytes)

    // N.B. - This required editing the Adventure game package files again, but they were already becoming
    // unreadable, so I didn't do any of the coding part of this lecture.
}
