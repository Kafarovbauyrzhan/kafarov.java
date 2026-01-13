public static void printPersonInfo(String name, String surname, String meal){
    System.out.println("Brief Dossier:");
    System.out.println("Name: " + name );
    System.out.println("LastName: " + surname);
    System.out.println("Favorite dish: " + meal );
}


public static void createCrew(String navigator,String pilot,String secondPilot,String flightEngineer) {
    System.out.println("The four to conquer space:");
    System.out.println("Navigator: " + navigator);
    System.out.println("Pilot: " + pilot);
    System.out.println("Co-pilot: " + secondPilot);
    System.out.println("Flight Engineer: " + flightEngineer);
}

public static void reverseArray(int[] array) {
    for(int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = temp;
    }
}
public static void printArray(int[] array) {
    for (int i : array) {
        System.out.print(i + ", ");
    }
    System.out.println();
}

//public class Solution {
//    public static void  main(String[] args) {
//    }
//
//    public static void universalMethod() {
//    }
//
//    public static void universalMethod(int a) {
//    }
//
//    public static void universalMethod(String s) {
//    }
//
//    public static void universalMethod(double d) {
//    }
//
//    public static void universalMethod(int a, int b) {
//    }
//
//    public static void universalMethod(String s, int n) {
//    }
//
//    public static void universalMethod(boolean b1, boolean b2) {
//    }
//
//    public static void universalMethod(int a, int b, int c) {
//    }
//
//    public static void universalMethod(String s1, String s2, String s3) {
//    }
//
//    public static void universalMethod(double d1, double d2, double d3, double d4) {
//    }
//}

/*public class Solution {
    public static void main(String[] args) {
    }

    public static void signIn(String username){
        //write your code here
        if (username.equalsIgnoreCase("user")) {
            return;
        }

        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}*/


/*
public class Solution {
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("In array: ");
        printArray(array);
        System.out.println("Minimum number: " + getMinValue(array));
        System.out.println("Maximum number: " + getMaxValue(array));
    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}*/

/*public class Solution {
    public static String city = "Tokyo";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("The population of the city " + city + " is " + population + " million people.");
        System.out.println("While the most populous city " + Solution.city + " has a population of " + Solution.population + " million people.");
    }
}*/

//public class Skyscraper {
//    public Skyscraper() {
//        System.out.println("Skyscraper built.");
//    }
//    public static void main(String[] args) {
//        Skyscraper skyscraper = new Skyscraper();
//    }
//}

//public class Skyscraper {
//    public static final String SKYSCRAPER_WAS_BUILD =
//            "Skyscraper is built.";
//    public static final String
//            SKYSCRAPER_WAS_BUILD_FLOORS_COUNT =
//            "Skyscraper is built. The number of floors - ";
//    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER
//            =
//            "Skyscraper is built. Developer - ";
//    public Skyscraper() {
//        System.out.println(SKYSCRAPER_WAS_BUILD);
//    }
//    public Skyscraper(int floors) {
//        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT
//                + floors);
//    }
//    public Skyscraper(String developer) {
//        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER +
//                developer);
//    }
//    public static void main(String[] args) {
//        new Skyscraper();
//        new Skyscraper(50);
//        new Skyscraper("JavaRushDevelopment");public class Skyscraper {
//            public static final String SKYSCRAPER_WAS_BUILD =
//                    "Skyscraper is built.";
//            public static final String
//                    SKYSCRAPER_WAS_BUILD_FLOORS_COUNT =
//                    "Skyscraper is built. The number of floors - ";
//            public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER
//                    =
//                    "Skyscraper is built. Developer - ";
//            public Skyscraper() {
//                System.out.println(SKYSCRAPER_WAS_BUILD);
//            }
//            public Skyscraper(int floors) {
//                System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT
//                        + floors);
//            }
//            public Skyscraper(String developer) {
//                System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER +
//                        developer);
//            }
//            public static void main(String[] args) {
//                new Skyscraper();
//                new Skyscraper(50);
//                new Skyscraper("JavaRushDevelopment");
//            }
//        }


/*public class Skyscraper {
    private int floorsCount;
    private String developer;
    public Skyscraper() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }
    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }
    public static void main(String[] args) {
        new Skyscraper();
        new Skyscraper(50, "Unknown");
    }
}*/

/*public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;
    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Orange";
    }
    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Orange";
    }
}*/

/*public class Building {
 private String type;
 public void initialize(String type) {
 this.type = type;
 }
 public static void main(String[] args) {
 Building building = new Building();
 building.initialize("Barbershop");
 }
}*/


/*public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";
    public Bugatti() {
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body=body;
        }
 }*/



//public class Programmer {
//    private int salary = 1000;
//    public int getSalary() {
//        return salary;
//    }
//    public void setSalary(int salary) {
//        if (salary > this.salary) {
//            this.salary = salary;
//        }
//    }
//}



//9
//public class Iphone {
//    private String model;
//    private String color;
//    private int price;
//    public Iphone(String model, String color, int price) {
//        this.model = model;
//        this.color = color;
//        this.price = price;
//    }
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || !(obj instanceof Iphone)) return
//                false;
//        Iphone iphone = (Iphone) obj;
//        return price == iphone.price &&
//                model.equals(iphone.model) &&
//                color.equals(iphone.color);
//    }
//    public static void main(String[] args) {
//        Iphone iphone1 = new Iphone("X", "Black", 999);
//        Iphone iphone2 = new Iphone("X", "Black", 999);
//        System.out.println(iphone1.equals(iphone2));
//    }
//}



//10
//public class Car {
//    private String model;
//    private int year;
//    public Car(String model, int year) {
//        this.model = model;
//        this.year = year;
//    }
//    public int hashCode() {
//        return model.hashCode() + year;
//    }
//}



//11
//public class Memory {
//    public static void executeDefragmentation(String[] array)
//    {
//        int index = 0;
//        for (String s : array) {
//            if (s != null) {
//                array[index++] = s;
//            }
//        }
//        while (index < array.length) {
//            array[index++] = null;
//        }
//    }
//}


//12
//public class Market {
//    private static boolean hasEggs = true;
//    public static void makePurchases(boolean hasEggs) {
//        if (hasEggs) {
//            System.out.println("Bought 10 loaves");
//        } else {
//            System.out.println("Bought 1 loaf");
//        }
//    }
//}



//13
//public class Hedgehog {
//    public void eat(Apple apple) {
//        System.out.println("The apple has been eaten!");
//    }
//    public static void main(String[] args) {
//        Apple apple = new Apple();
//        Hedgehog hedgehog = new Hedgehog();
//        hedgehog.eat(apple);
//    }
//    public static class Apple {
//    }
//}


//14
//public class Solution {
//    public static void showWeather(City city) {
//        System.out.println("In the city of " + city.getName()
//                + " today, the temperature is " +
//                city.getTemperature());
//    }
//    public static void main(String[] args) {
//        City city = new City("Dubai", 40);
//        showWeather(city);
//    }
//}


 void main() {
    int[] array = {11, 22, 33, 44, 55, 55, 66, 77, 88, 99};
    printArray(array);
    reverseArray(array);
    printArray(array);
    printPersonInfo("bauka", "kafarov", "myaso");
}
