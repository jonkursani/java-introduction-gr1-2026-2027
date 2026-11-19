void main() {
    // Lexojme kilometrat
    int km = Integer.parseInt(IO.readln("Kilometrat: "));

    // Lexojme harxhimin
    double consumption = Double.parseDouble(IO.readln("Harxhimi (L/100km): "));

    // Cmimi i litrit
    double price = Double.parseDouble(IO.readln("Cmimi i litrit (€): "));

    // Sa persona
    int people = Integer.parseInt(IO.readln("Sa persona? "));

    // Sfida 1
    if (people > 0) {
        // Kalkulimi
        // Sa litra?
        double litres = km * consumption / 100;

        // Sa ka kushtu?
        double cost = litres * price;

        // Cmimi per person
        double perPerson = cost / people;

        // Sfida 2
//        double rounded = Math.ceil(perPerson);
//        int whole = (int) rounded;

//        5.0 => 5
        int whole = (int) Math.ceil(perPerson);

        // Output-i
        System.out.printf("Litra: %.2f%n", litres);
        System.out.printf("Kosto: %.2f €%n", cost);
        System.out.printf("Per person: %.2f €%n", perPerson);
        System.out.printf("Secili jep: %d €%n", whole);
    } else {
        IO.println("Duhet të paktën 1 person.");
    }
}