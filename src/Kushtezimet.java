/*
*   Kushtezimet: if, else, else-if
*
*   if (T/F) {
*
*   }
* */
void main() { // scope i metodes main()
    int number = 0;

    int a = 1;
    if (number > 0) { // scope i if-it
        a = 1;
        IO.println("Numri eshte pozitiv");
        IO.println(a);
    } else if (number < 0) {
//        var b = 2;
        a = 2;
        IO.println("Numri eshte negativ");
    } else {
//        IO.println(b); // error
        a = 3;
        IO.println("Numri eshte zero");
    }

    IO.println("-------------------");
}