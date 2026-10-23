// Variabla ne Java
void main() {
    // tipi label(emri) = vlera
    int age = 19;
    IO.println(age); // 19
    // String + number (bashkohen) nuk mblidhen
    IO.println("age: " + age);
    age = 30;
    IO.println("age: " + age);
//    int age = 40; ERROR: ekziston nje variabel me emrin age

    // Deklarimi
    boolean isStudent;

//    IO.println(isStudent); // ERROR: Smundesh me printu pa e inicializu variablen
    // Inicializmi
    isStudent = true;
    IO.println(isStudent);

    // Deklarim + Inicializim
    String name = "Albina";
    IO.println("Emri: " + name);

    // Data Types
    // int
    int one = 1;

    // long
    long population = 8_100_000_000L;

    // double
    double price = 2.5; // ERROR: 2,5 => mendon java qe jon 2 numra
    double length = 1.80;

    // boolean
    boolean isMarried = false;

    // char
    char questionMark = '?';
    char firstLetter = 'A';

    // String
    String word = "AB";

    // var
    var firstName = "Filan"; // String
//    String firstName = "Filan";
    var two = 2; // int
    var letterB = 'B'; // char
    var isEmployed = true; // boolean
    two = 3; // int
//    two = 2.5; // ERROR
//    two = "Two" // ERROR
    int three = 3;
    three = 4;
//    three = "Three" // ERROR

//    Menyrat e emerimit
//    var 1name; // ERROR
    String name1;
//    var name2; // ERROR nuk e din cfar tipi ka variabla

    // Konstantet fjala kyqe (final)
//    double TVSH = 0.18;
//    TVSH = 0.19;
    final double TVSH = 0.18;
//    TVSH = 0.19; // ERROR: Konstante nuk mund te ndryshet vlera
    final int WEEK_DAYS = 7;
}









