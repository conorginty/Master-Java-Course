package Section_14_BasicIO_and_javautil.BinaryData;

public class ObjectIOIncludingSerialisation {

    // 240. Object IO including Serialisation

    // So far we've written the locations and directions data as text as well as a binary stream.
    // We read and write each object field individually (e.g. we use readInt() and writeInt() methods to read
    // and write a location's ID, and we use readUTF() and writeUTF() methods to read and write a location's
    // description).
    // If an object had 20 fields, we'd have to call 20 methods, so instead of that we can use the ObjectInputStream
    // and ObjectOutputStream classes to read and write objects as a single unit.
    // When we write an object to a file, it has to be translated to a format that can be stored to a file, and
    // then reassembled into an Object later when it's read by an Application.
    // The process of translating the data structure or object into a format that can be stored and recreated
    // is called "Serialisation".
    // In Java, when we want to use an object stream to write and read the objects of a class, we have to make
    // the class Serializable (which we do by making it implement the Serializable Interface).
    // Serializable has no methods, it's just used to give the JVM a heads up that we may want to serialise the
    // object to storage and to read it back again at some point.
    // When we make a class Serializable, it's strongly recommended that we declare a long field called:
    // 'serialVersionUID'. If we don't, the Compiler will give us a warning as the Compiler will declare default
    // values for us. But different compilers produce different default values, which can lead to problems
    // further down the road (e.g. if we change the compiler we're using - i.e. there are other compilers
    // outside of the one included with the JDK).
    // The bottom line here is we don't have to worry about declaring a serialVersionUID field unless:
    // - A: we explicitly use Serialisation (as we do when we use ObjectInputStream and ObjectOutputStream)
    // - B: there may be a compatibility issue down the line (e.g. due to using a different compiler)

    // N.B. - AGAIN no code written, as still using old locations/directions scenario!!!
    // Too messy to modify any further!
}
