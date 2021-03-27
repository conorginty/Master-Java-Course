package Section_12_JavaCollections.Overview;

public class CollectionsOverview {
    // 153. Collections Overview

    // In Section 9. we looked at 3 of Java's list types;
    // 1. List interface
    // 2. ArrayList class
    // 3. LinkedList class

    // These form part of the Java collections framework, which also includes things like:
    // - sets
    // - maps
    // - trees
    // - queues
    // etc

    // At the top level of the Collections framework is the Collections class. This exposes static methods
    // that either operate on collections (e.g. the sort method we've seen before: Collections.sort()), or
    // they also return Collections objects, such as the list method (NO CLUE WHAT HE MEANS BY THIS?????)

    // The Interfaces in the Collections framework allow the framework to be extended and they actually define
    // methods for all the fundamental operations that are required for the various collection types.
    // One of the design goals for the collections framework was that there should be good inter-operability
    // amongst various collections, so not just ones included in the framework, but literally anything
    // that may also be created in the future that is a reasonable representation of a collection.
    // Now, that also includes arrays. Arrays themselves couldn't be made part of the collection framework
    // without changing the Java language. However, the framework does include methods that enable
    // collections to be moved into arrays and vice-versa, and additionally methods to allow arrays to be
    // viewed as collections.

    // The core elements/components of the Collections framework are Interfaces. Also included are
    // aggregate operations. Another core element is implementations (i.e. the concrete implementations of
    // the interface - e.g. ArrayList, LinkedList classes etc), and also algorithms

    // 1st we'll review ArrayList and LinkedList classes, as well as the List interface and consider them
    // within the context of the Collections framework.
    // We'll use a simple seat-booking system in a theater to see how these classes that we've used before
    // fit into the Java Collections framework. Theatre Seats will be numbered with a row letter, and a
    // Seat number within each row.
}
