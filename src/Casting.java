void main() {
    var age = 19;
    // widening int -> long
    long length = age;
    int sum = 25;

    // Casting (double)
    IO.println( (double) sum / 3); // 8.333
    IO.println((double) (sum / 3)); // (double) 8 => 8.0

    double price = 9.99;
    int euros = (int) price;
    IO.println(euros);

    char letter = 'A';
    int code = letter; // 65
    char letterB = (char) (code + 1);
    IO.println(letterB);

    int max = Integer.MAX_VALUE;
    IO.println("Vlera max e numrit int: " + max);

    // ++ para apo pas
    int x = 10;
    x = x++;
    IO.println("x++: " + x);
//    IO.println("x++: " + (x++));
    IO.println("x: " + x);
    x = ++x;
    IO.println("++x: " + x);
//    IO.println("++x: " + (++x));
    IO.println("x: " + x);

    // Klasa Math
    // Rrenja katrore => double
    IO.println(Math.sqrt(16));
    // Fuqia 2^3 => double
    IO.println(Math.pow(2, 3));
    // Vlera absolute
    IO.println(Math.abs(-5));
    // Vlera max
    IO.println(Math.max(4, 9));
    // Vlera min
    IO.println(Math.min(3.5, 2));
    // Rrumbullaksimi
    IO.println(Math.round(8.3));
    IO.println(Math.round(2.5));

    // Math.random() // Zari
    int dice = (int) (Math.random() * 6); // 0.0 - 5.9 => 4
    IO.println("Zari: " + (dice + 1));
}