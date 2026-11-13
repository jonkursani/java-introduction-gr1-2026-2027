/*
* Aplikacioni kinemaja
* */
void main() {
    IO.println("1. Animacion (per te gjithe)");
    IO.println("2. Aksion (16+)");
    IO.println("3. Horror (18+)");

    // Zgjedhja e perdoruesit
    String choice = IO.readln("Filmi (1-3): ");

//    var minAge = switch (choice) {
    // Switch qe kthejke vlere (vleren po e ruajme me nje variabel)
    int minAge = switch (choice) {
        case "1" -> 0;
        case "2" -> 16;
        case "3" -> 18;
        default -> -1;
    };

    // Kontrolli i minAge
    if (minAge == -1) {
        IO.println("Zgjedhje e panjohur.");
    } else {
        int age = Integer.parseInt(IO.readln("Mosha: "));

        if (age >= minAge) {
            IO.println("Urdhero bileten!");
        } else {
//            IO.println("Ky film eshte " + minAge + "+");
            System.out.printf("Ky film eshte %d+", minAge);
        }
    }
}