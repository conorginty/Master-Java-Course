package Section_14_BasicIO_and_javautil.InputOutput;

public class BufferedWriterAndChallenge {
    // 237. Buffered Writer and Challenge

    // In the previous sections, we looked at reading and writing data using character streams.
    // To write out the data we used the FileWriter class, and to read it back in again we created FileReader objects.
    // We then discussed the idea of buffering the Stream so that large chunks of the data are read into memory
    // by BufferedReader. This prevents excessive access to disk, because the data is only read from the disk
    // when the Buffer is empty, otherwise the FileReader continues to take data from the Memory Buffer, so it's
    // much more optimised compared to just reading a character at a time.

    // You can also buffer Data when it's written to Disk. This also makes use of a BufferedWriter class.
    // The concept is the same - the FileWriter puts the data into the buffer, and the data is only written
    // to Disk when the Buffer is full (and once again this prevents writing small amounts of data to disk)

    // N.B. - SKIPPED DOING THE CHALLENGE - IT INVOLVED EDITING TOO MUCH OF THE CODE, AND IT WAS ALREADY
    // BECOMING COMPLETELY UNREADABLE
}
