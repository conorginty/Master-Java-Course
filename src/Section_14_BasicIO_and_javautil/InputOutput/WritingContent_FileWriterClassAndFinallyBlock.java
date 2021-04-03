package Section_14_BasicIO_and_javautil.InputOutput;

import Section_14_BasicIO_and_javautil.InputOutput.Adventure.Location;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class WritingContent_FileWriterClassAndFinallyBlock {
    // 231. Writing Content - FileWriter Class and Finally Block

    // N.B. - It would really make more sense to read from a file, rather than hard-coding all the data
    // in the SIB
    // In our contrived Gaming example, we only have 6 locations to worry about, but in the full game there
    // are 140 locations and the exits connecting them together are a lot more complex.
    // Therefore, storing that info in a file is a better solution overall
    // The 1st step is to write the data out to a file

    // The code in the SIB is executed when the class is loaded, and that means that all the data is going to be
    // available by the time we are able to execute any methods in the class.
    // As a result, that means that we can create a main method to write out the locations and exits data to files.
    // One of the simplest ways to do that is using a FileWriter Object, so let's try this.

//    public static void main(String[] args) {
//        Map<Integer, String> locations = new HashMap<>();
//        FileWriter locationsFile = null;
//        locationsFile = new FileWriter("locations.txt");
//        int i = 0;
//        for (String location: locations.values()) {
//            i++;
//            locationsFile.write(i + ". " + location);
//        }
//        locationsFile.close();
//    }

    // Notice that the FileWriter and all its methods have the same error:
    // 'Unhandled exception: java.io.IOException'
    // We mentioned before that there are 2 categories of Exceptions in Java;
    // 1. Checked - CAN'T be ignored (e.g. IOException)
    // 2. Unchecked - CAN be ignored
    // We can handle Checked Exceptions in X ways;
    // 1. Create a try/catch statement to catch the exception
    // 2. Create a try/catch/finally statement to catch the exception
    // 3. Throw the Exception in the Calling Method
    // 4. try-with-resources Statement

}
