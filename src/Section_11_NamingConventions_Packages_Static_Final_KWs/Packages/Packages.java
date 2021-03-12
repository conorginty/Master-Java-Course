package Section_11_NamingConventions_Packages_Static_Final_KWs.Packages;

import org.w3c.dom.Node;

public class Packages {
    // 142. Packages

    // There are over 9 million Java Developers worldwide, therefore class or interface clashes are inevitable
    // Java developed a mechanism to fully specify the class
    // As a result, we can use classes with the same name in the same project (or even the same class)
    // I THINK HE MEANS WE CAN CREATE OUR OWN LIST CLASS AND STILL VALIDLY IMPLEMENT THE LIST INTERFACE???

    public static void main(String[] args) {
        // We have several options of which "Node" class we wish to use
        Node node = null;
        // We have gone with Node from "org.w3c.dom", but there are plenty of other options

        // The mechanism by which people can reuse names is actually packages
        // So a package is a way of grouping related classes and interfaces together
        // The actual package mechanism provides a way to manage the name space of object types, and also
        // extends access protection beyond the traditional access modifiers.

        // Another way of doing it, which doesn't require an import;
        org.w3c.dom.Node anotherNode = null;
        // HOWEVER, you'd have to write like this EVERY time you create an instance of Node
        // Therefore, better to import.

        // Some reasons to use packages are;
        // - Programmers can easily determine that the classes are related
        // - It is easy to know where to find the classes and interfaces that can provide the functions provided by the package
        // - Because the package creates a new namespace: class and interface name conflicts are avoided
        // - Classes within the package can have unrestricted access to one another while still restricting access for classes outside the package

        // java.util.Scanner is an example of a class we are deriving from a package
        // java.util.ArrayList is another one we have used

        // java.lang contains the class object that is used to support our classes, as well as Integer, Double
        // etc and all the fundamental building blocks of a Java program.
        // That happens automatically when you create even the most basic Java programs.
        // N.B. - You WON'T see an import for java.lang, because it's automatically imported for us

        // The package names: "com.example" and "org.example" are reserved and can be used for packages that
        // you're never going to distribute, and this is very useful if you haven't your own domain
        // e.g. "package com.example.mypackage"
    }
}
