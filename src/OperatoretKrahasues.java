/*
*   Operatoret krahasues
*   >
*   <
*   >=
*   <=
*   ==
*   !=
*   Rezultati -> Boolean (true, false)
* */
void main() {
    int numri = 20;
    IO.println(numri > 30);
    IO.println(numri < 30);
    IO.println(numri >= 30);
    IO.println(numri <= 30);
    IO.println(numri == 30);
    IO.println(numri != 30);

    // Stringjet krahasohen me .equals() sepse jane tip i reference (Klase)
    // nuk mundesh me i krahasu dy kutija pa e hap permbajtjen e tyne
//    String name = "Arta";
//    String otherName = "Arta";
//    IO.println(name == otherName); // me == nuk i krahason vlerat
//    IO.println(name.equals(otherName)); // me .equals() i krahason vlerat

    String response = IO.readln("A je student? ");

//    if (response == "po") {
//    if (response.equals("po")) {
    if (response.equalsIgnoreCase("po")) {
        IO.println("Po, jam student");
    } else {
        IO.println("Jo, nuk jam");
    }
}