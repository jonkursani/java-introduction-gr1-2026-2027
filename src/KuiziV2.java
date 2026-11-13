/*
* Kuizi V2 (switch)
*
* */
void main() {
    IO.println("Tung! Kuizi me menu.");
    IO.println("1. Sport");
    IO.println("2. Gjeografi");
    IO.println("3. Matematike");

    String choice = IO.readln("Kategoria (1-3): ");

    boolean isValid = choice.equals("1") || choice.equals("2") || choice.equals("3");

    if (!isValid) {
        IO.println("Kategori e panjohur: " + choice);
    } else {
        int score = 0;
        switch (choice) {
            case "1" -> {
                String answer1 = IO.readln("1. Sa lojtar ka nje skuader futbolli ne fushe? ");
                String clean1 = answer1.trim();

                if (clean1.equals("11") || clean1.equalsIgnoreCase("njembedhjete")) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Skuadra ka 11 lojtar ne fushe.");
                }

                String answer2 = IO.readln("2. Ku u mbajt Olimpiada 2024? ");

                if (answer2.trim().equalsIgnoreCase("paris")) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Olimpiada 2024 u mbajt ne Paris.");
                }
            }
            case "2" -> {
                String answer1 = IO.readln("1. Kryeqyteti i Kosoves? ");

                boolean isAnswerValid = answer1.trim().equalsIgnoreCase("prishtina")
                        || answer1.trim().equalsIgnoreCase("prishtine")
                        || answer1.trim().equalsIgnoreCase("prishtinë");

                if (isAnswerValid) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Kryeqyteti i Kosoves eshte Prishtina.");
                }

                String answer2 = IO.readln("1. Kryeqyteti i Shqiperise? ");

                boolean isAnswer2Valid = answer2.trim().equalsIgnoreCase("tirana")
                        || answer2.trim().equalsIgnoreCase("tirane")
                        || answer2.trim().equalsIgnoreCase("tiranë");

                if (isAnswer2Valid) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Kryeqyteti i Shqiperise eshte Tirana.");
                }
            }
            case "3" -> {
                int answer1 = Integer.parseInt(IO.readln("1. Sa eshte 7 * 8? "));

                if (answer1 == 56) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! 7 * 8 = 56.");
                }

                int answer2 = Integer.parseInt(IO.readln("2. Në Java, sa jep 17 / 5?"));

                if (answer2 == 3) {
                    IO.println("Sakte!");
                    score++;
                } else {
                    IO.println("Gabim! Në Java, 17 / 5 = 3 (pjesa e plotë).");
                }
            }
        }

        // Operatori ternar (shprehja ? T : F)
        String message = score == 2 ? "Shkelqyeshem!" : "Mire.";
        System.out.printf("Piket: %d nga 2. %s%n", score, message);
    }
}