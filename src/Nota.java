void main() {
    IO.println("Bot:\tTung! Une ta them noten.");
    int points = Integer.parseInt(IO.readln("Bot:\tSa pike ke? "));
    int grade = 5;

    if (points >= 0 && points <= 100) {
        if (points >= 91) {
            grade = 10;
            IO.println("Bot:\tNota: 10");
        } else if (points >= 81) {
            grade = 9;
            IO.println("Bot:\tNota: 9");
        } else if (points >= 71) {
            grade = 8;
            IO.println("Bot:\tNota: 8");
        } else if (points >= 61) {
            grade = 7;
            IO.println("Bot:\tNota: 7");
        } else if (points >= 51) {
            grade = 6;
            IO.println("Bot:\tNota: 6");
        } else {
            IO.println("Bot:\tNota: 5");
        }

        //    if (grade > 5) {
        if (grade >= 6) {
            IO.println("Bot:\tKalove!");
        } else {
            int remaining = 51 - points;
            IO.println("Bot:\tEnde jo: Te duhen edhe " + remaining + " pike.");
        }
    } else {
        IO.println("Bot:\tPiket duhet te jene nga 0 deri ne 100!");
    }
}