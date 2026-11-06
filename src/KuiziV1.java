/*
*   Mini Kuiz me 3 pyetje
* */
void main() {
    // Titulli
    IO.println("Tung! Loja e kuizit: 3 pyetje.");
    int score = 0;

    // Pyetja 1
    String answer1 = IO.readln("1. Kryeqyteti i Kosoves? ");
    //   "      Prishtina      ".trim()
    String clean1 = answer1.trim(); // "Prishtina" != "prishtina"

//    if (clean1.toLowerCase().equals("prishtina")) {
    if (clean1.equalsIgnoreCase("prishtina") || clean1.equalsIgnoreCase("prishtine")) {
        IO.println("Sakte!");
//        score = score + 1;
//        score += 1;
        score++;
    } else {
        IO.println("Gabim! Kryeqyteti i Kosoves eshte Prishtina.");
    }

    // Pyetja 2
    int answer2 = Integer.parseInt(IO.readln("2. Sa eshte 7 * 8? "));

    if (answer2 == 56) {
        IO.println("Sakte!");
        score++;
    } else {
        IO.println("Gabim! 7 * 8 = 56.");
    }

    // Pyetja 3
    String answer3 = IO.readln("3. Sa dite ka java? ");
    // "    7       ".trim(),  "    shtate ".trim()

    if (answer3.trim().equals("7") ||
            answer3.trim().equalsIgnoreCase("shtate")) {
        IO.println("Sakte!");
        score++;
    } else {
        IO.println("Gabim! Java ka 7 dite.");
    }


    // Output-i
    IO.println("-------------------");

//    IO.println("Piket: " + score + " nga 3");
    System.out.printf("Piket: %d nga %s%n", score, "3");

    if (score == 3) {
        IO.println("Shume mire! Te lumte");
    } else if (score == 2) {
        IO.println("Mire! Por mundesh me mire");
    } else {
        IO.println("Ke deshtuar! Duhet me mesu me shume");
    }

    IO.println("-------------------");
}