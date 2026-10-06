public class Visualisator {
    public static void draw(int wrongAttempts, TypesOfDifficulties type) {
        if (type == TypesOfDifficulties.Easy) {
            if (wrongAttempts == 0) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Веревка уже на готове :)");
            } else if (wrongAttempts == 1) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("О нет! Голова...");
            } else if (wrongAttempts == 2) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Теперь вы остались без туловища :(");
            } else if (wrongAttempts == 3) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Если вы левша, то вам не очень повезло");
            } else if (wrongAttempts == 4) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Теперь часы носить точно негде :0");
            } else if (wrongAttempts == 5) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Прощай левая ножка");
            } else if (wrongAttempts == 6) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("...RIP...");
            }
        } else if (type == TypesOfDifficulties.Normal) {
            if (wrongAttempts == 0) {
                System.out.println(" +---+");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Чего-то не хватает...");
            } else if (wrongAttempts == 1) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Веревка уже на готове :)");
            } else if (wrongAttempts == 2) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("О нет! Голова...");
            } else if (wrongAttempts == 3) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Теперь вы остались без туловища :(");
            } else if (wrongAttempts == 4) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Если вы левша, то вам не очень повезло");
            } else if (wrongAttempts == 5) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Теперь часы носить точно негде :0");
            } else if (wrongAttempts == 6) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Прощай левая ножка");
            } else if (wrongAttempts == 7) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("...RIP...");
            }
        } else {
            if (wrongAttempts == 0) {
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("_____|_");
                System.out.println("Мне кажется или тут слишком пусто? ;)");
            } else if (wrongAttempts == 1) {
                System.out.println(" +---+");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Чего-то все еще не хватает...");
            } else if (wrongAttempts == 2) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Веревка уже на готове :)");
            } else if (wrongAttempts == 3) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("О нет! Голова...");
            } else if (wrongAttempts == 4) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Теперь вы остались без туловища :(");
            } else if (wrongAttempts == 5) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Если вы левша, то вам не очень повезло");
            } else if (wrongAttempts == 6) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Теперь часы носить точно негде :0");
            } else if (wrongAttempts == 7) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("Прощай левая ножка");
            } else if (wrongAttempts == 8) {
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("     |");
                System.out.println("_____|_");
                System.out.println("...RIP...");
            }
        }
    }
}

