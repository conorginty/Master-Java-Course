package Section_11_NamingConventions_Packages_Static_Final_KWs;

public class NamingConventions {
    // 141. Naming Conventions

    // The things you name is Java are;
    // - Packages
    // - Classes
    // - Interfaces
    // - Methods
    // - Constants
    // - Variables
    // - Type Parameters

    // === Packages ===
    // Should always be lowercase
    // Should be unique
    // Use your Internet Domain name, reversed, as a prefix for the package name
    // (e.g. com.timbuchalka...)
    // Invalid Domain name components;
    // - Don't use hyphens (-), use underscores (_)
    //   (e.g. Experts-exchange.com => com.experts_exchange)
    // - Prefix numbers with underscores
    //   (e.g. 1world.com => com._1world)
    // - Java keywords should start with an underscore
    //   (e.g. Switch.supplier.com => com.supplier.switch)
    // Examples of package names: java.lang, java.io, org.xml.sax.helpers etc

    // === Classes ===
    // PascalCase
    // Should be named after Nouns (as they represent "things")

    // === Interfaces ===
    // PascalCase
    // Consider what the objects implementing the Interface will become, or what they will be able to do when naming
    // Examples of interface names: List, Comparable, Serializable

    // === Methods ===
    // camelCase
    // Often named after Verbs (because they reflect the function performed or the result returned)
    // Examples of method names: size(), getName(), addPlayer()

    // === Constants ===
    // ALL UPPERCASE
    // Separate words with underscore (_)
    // Should be declared with the "final" keyword
    // Examples of constant names: PI, ERROR_MESSAGE, MAX_VALUE

    // === Variables/Fields ===
    // camelCase
    // Name should be meaningful and indicative

    // === Type Parameters ===
    // Single Character, capital letter
    // Examples of type parameter names:
    // - E = Element (used extensively by the Java Collections Framework)
    // - K = Key
    // - T = Type
    // - V = Value
    // - S, U etc = 2nd, 3rd etc types
}
