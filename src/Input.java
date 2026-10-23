/*
* Leximi i te dhenave ne Java
* */
void main() {
//    Leximi
//    IO.print("Si quhesh? ");
//    var name = IO.readln(); // String
//    String name = IO.readln(); // String
//    int name = IO.readln(); // ERROR
//    IO.println("Tung, " + name + "!");

//    Parsimi
//    IO.print("Sa vjec je? ");
//    var ageString = IO.readln(); // String
//    int age = Integer.parseInt(ageString);
//    int age = Integer.parseInt(IO.readln());
//    IO.println("Vitin tjeter behesh " + (age + 1));

    String name = IO.readln("Si quhesh? ");
    // Double
//    String priceString = IO.readln("Sa kushton kafja? ");
//    double price = Double.parseDouble(priceString);
    double price = Double.parseDouble(IO.readln("Sa kushton kafja? "));
    IO.println(name + " paguan " + price * 2 + " euro per dy kafe.");
}