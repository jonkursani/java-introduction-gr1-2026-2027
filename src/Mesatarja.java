void main() {
    IO.println("Bot:\tTung! Une e llogaris mesataren tende.");

    int first = Integer.parseInt(IO.readln("Bot:\tNota e pare: "));
    int second = Integer.parseInt(IO.readln("Bot:\tNota e dyte: "));
    int third = Integer.parseInt(IO.readln("Bot:\tNota e trete: "));

    // Shuma
    int sum = first + second + third;

//    double average = sum / 3.0;
    // Mesatarja (Casting)
    double average = (double) sum / 3;

    // Dy shifra mas pikes
    double twoDigits = (double) Math.round(average * 100) / 100;

    // Nota e plote
    int whole = (int) average;

    // Nota me e madhe dhe me vogel
//    int minFirst = Math.min(first, second);
//    int min = Math.min(minFirst, third);
    int min = Math.min(first, Math.min(second, third));

    int max = Math.max(first, Math.max(second, third));

    // Output
    IO.println("Bot:\tShuma: " + sum);
    IO.println("Bot:\tMesatarja: " + average);
    IO.println("Bot:\tMe dy shifra: " + twoDigits);
    IO.println("Bot:\tNota e rrumbullaksuar: " + whole);
    IO.println("Bot:\tMe e larta: " + max + ", me e uleta: " + min);
}