// Gabimi 1. Kafeneja.
// Duhet: me B (ose b) printon "Zgjodhët: Kafe me qumësht".
void main() {
    // 1. menuja dhe zgjedhja
    IO.println("A. Espresso  B. Kafe me qumësht  C. Çaj");
    var typed = IO.readln("Zgjedhja: ");
    var choice = typed.trim().toUpperCase();
    // 2. emri sipas zgjedhjes
    var name = switch (choice) {
        case "A" -> "Espresso";
        case "B" -> "Kafe me qumësht";
        case "C" -> "Çaj";
        default -> "E panjohur";
    };
    // 3. mesazhi
    IO.println("Zgjodhët: " + name);
}