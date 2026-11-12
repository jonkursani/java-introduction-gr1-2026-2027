/*
* Cili if i perket else-it
*
* */
void main() {
//    var age = 16;
   var age = 20;
    var license = "jo";

    if (age >= 18) {
        if (license.equals("po")) {
            IO.println("Mund te drejtoni automjetin.");
        }
        else {
            IO.println("Nuk mund te drejtoni automjetin pa patent shoferi.");
        }
    } else {
        IO.println("Je ende i ri");
    }
}