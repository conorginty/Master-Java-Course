package Section_12_JavaCollections.ImmutableClasses;

public class ImmutableClasses {
    // 161. Immutable Classes

    // Immutable Classes can't be changed once they are created.
    // This is valuable when you want instances of your class to be immutable,
    // Also using some techniques in immutable classes is a great way to increase encapsulation.
    // Also reduces errors, even if you're going to allow external code to modify your class instances.

    // You may think - it's my code - why would I want to protect the object from external modification?
    // Well, you need to consider modern software that supports third-party extensions or plug-ins
    // If you're using software like IntelliJ IDEA, support for other languages (e.g. Python) is provided by
    // plugins that can be developed by third-parties.
    // Many modern browsers is another example that have supported third-party plug-ins for years, and even
    // some games have allowed external developers to mod their games.
    // Another example is Microsoft Office, which provides access to its objects to macros written in VBA.

    // All of these examples expose the program's inner objects to external developers who don't have access
    // to the source code, and therefore they can't know the implications of changes they might make to
    // objects if they allow it to do that.
    // Reading the API documentation will help them, but it's reasonable for them to assume that if they're
    // permitted to change fields and properties, then they can go ahead and do so.

    // We saw an example of this in the Location.getExits() method, which, rather than returning the exits object
    // directly (which would expose it to the potential for being changed externally), we created a new HashMap
    // that contains all the elements of exits, and return that. Therefore, external code that needs to use the
    // exits (as we did when we displayed the list of available exits to the player in the Main class) can do so,
    // and there's no chance of it changing our internal map. As it turns out, we could've returned the list of
    // available exits as a string, which may have been more convenient for that program, but that would have
    // reduced flexibility, and if that kind of approach is taken as a rule, then we have to consider all the
    // possible uses that external code may actually want to make from our map. So the approach taken with
    // Location.getExits() does NOT restrict external code from doing what it needs to do with a map - it just
    // prevents that from changing our map, which is good from our point of view.

    // The 2nd technique we used in our Location program was to make our our member variables/fields private
    // and final (i.e. locationID, description and exits). This means that once they have been set, they can
    // NOT be changed. You may argue that the use of the 'final' keyword is pointless, as the fields are
    // private, and thus can NOT be accessed externally anyway, BUT while that's true, final provides 2 benefits;
    // 1. Makes it clear to anyone reading the code that the field should NOT be changed (rather than us forgetting
    //    to write a setter)
    // 2. Ensures that we don't inadvertently change the fields if we change the code in the Location class at
    //    some time in the future

    // Obviously we can generate (and IntelliJ makes it very easy) getters and setters, and it can be tempting
    // to automatically generate both setters and getters, just in case you might need them further down the line
    // BUT that's actually a bad habit to get into - it's much better to only provide a setter IF the class
    // actually needs that.
    // It may appear on 1st glance might that the Location class does need a setter for the exits for each
    // location, and we did use it to give each location its exits, and it may have made sense to use and leave
    // a setter in our class so that if someone else wanted to extends the game, they could add new exits from
    // existing locations to the new ones they add.

    // If a class field, or elements of an Mutable class, like a List or a Map, is to be set only once and
    // never changed again, then where it needs to be set is in the Constructor

}
