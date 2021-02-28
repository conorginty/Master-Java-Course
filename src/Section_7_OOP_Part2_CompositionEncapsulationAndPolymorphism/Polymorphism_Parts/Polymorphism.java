package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts;

// We're going to create ALL our classes here, just to make things easier to see

// Base Class = Movie
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here...";
    }

    public String getName() {
        return name;
    }
}

// All 4 Subsequent Classes will Inherit from Movie;

class Jaws extends Movie {
//    public Jaws(String name) {
//        super(name);
//    }

    // This is an example of Polymorphism
    public Jaws() {
        super("Jaws");
    }

    // This is another example of Polymorphism
    @Override
    public String plot() {
        return "A shark eats lots of people...";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

// This one will be different to the others...
class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable Movie...");
    }

    // We WON'T override plot here
}

public class Polymorphism {
    // 95. Polymorphism

    // Polymorphism is the mechanism in OOP that allows actions to act differently depending on the object performing it

    public static void main(String[] args) {
        Movie jawsMovie = new Jaws();
        System.out.println(jawsMovie.plot());
        System.out.println("===========");

        for (int i=1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName());
            System.out.println("Movie Plot: " + movie.plot());
            System.out.println("-----");
        }
    }

    public static Movie randomMovie() {
        // returns a random movie (i.e. 1 of our 5 movie classes)

        // Generate a random number between 1-5 inclusive;
        int randomNumber = (int) (Math.random() * 5) + 1;
//        System.out.println(randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
            default:
                return null;
        }
    }
}
