/*
*   Formatimi i Stringjeve (Tekstit)
* */
void main() {
    double avg = 25 / 3.0;
//    IO.printf
    // kjo sillet si print() kursori ne rreshtin e njejte
    System.out.printf("%.2f%n", avg);
    IO.println("Finished");

    // shkurtesa per printf() => souf

    var name = "Arta";
    var age = 20;
    var average = 8.444;
    var grade = 'A';
    System.out.printf("Emri: %s%nMosha: %d%n", name, age);
    System.out.printf("Mesatarja: %.1f%nNota: %c%n", average, grade);


    // %-xs, %xs
    System.out.printf("|%-8s||%8s|%n", "Lenda", "Nota");
    System.out.printf("|%-8s||%8s|%n", "Arta", "8");
    System.out.printf("|%-8s||%8s|%n", "Jon", "7");
}