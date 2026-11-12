void main() {
    double first = Double.parseDouble(IO.readln("Numri i pare: "));
    String operator = IO.readln("Veprimi (+ - * /): ");
    double second = Double.parseDouble(IO.readln("Numri i dyte: "));

//    if (operator)
//        else if (operator)

    switch (operator) {
        case "+" -> IO.println("Rezultati: " + (first + second));
        case "-" -> {
            var zbritja = first - second;
            IO.println("Rezultati: " + zbritja);
        }
        case "*" -> IO.println("Rezultati: " + (first * second));
        case "/" -> {
            // Validim nese numri i dyte eshte 0
            if (second == 0) {
                IO.println("Gabim: Nuk mund te behet pjestimi me zero!");
            } else {
                IO.println("Rezultati: " + (first / second));
            }
        }
        default -> IO.println("Veprim i panjohur: " + operator);
    }
}