/*
*   Strings ne Java
* */
void main() {
//    String name = "Arta";
    var name = "Arta"; // String

    // Sa shkronja (simbole) ka stringu
    IO.println(name.length());

    // Formatimi i tekstit ne shkronja te medha dhe te vogla
    IO.println(name.toUpperCase()); // ARTA
    IO.println(name.toLowerCase()); // arta

    // Shkronja e pare (pse 0 sepse fillon prej numrit 0)
    IO.println(name.charAt(0)); // A

    // Shkronja e fundit
    IO.println(name.charAt(2));
    String cacttus = "Cacttus Education"; // 0 - 16
    int length = cacttus.length(); // 17
    IO.println(length);
    var last = cacttus.charAt(length - 1); // 17 - 1 = 16
    IO.println(last);

    // largimi i hapesirave => trim()
    var hapesira = "   Trim ";
    IO.println(hapesira.trim().toUpperCase());
}