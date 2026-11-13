/*
* Operatori Ternar
* (nese keni nje if me else por jo me else-if) preferohet operatori ternar
*
*
* */

void main() {
    int x = 51;

    if (x >= 51) {
        IO.println("Kaloi");
    } else {
        IO.println("Nuk kaloi");
    }

    // Sintaksa e operatorit ternar
//    (x >= 51) ? T : F

    // Përdorimi i operatorit ternar
    String passed = (x >= 51 ? "Kaloi" : "Nuk kaloi");
    IO.println(passed);
    IO.println("Output: " + (x >= 51 ? "Kaloi" : "Nuk kaloi"));
}