void main() {
    var age = Integer.parseInt(IO.readln("Mosha: "));

    if (age >= 18) {
        var license = IO.readln("Ke patent shoferi? (po/jo): ");

        if (license.equals("po")) {
            IO.println("Mund te drejtoni automjetin.");
        } else {
            IO.println("Nuk mund te drejtoni automjetin pa patent shoferi.");
        }
    } else {
        IO.println("Je ende i ri");
    }
}