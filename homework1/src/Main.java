import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("                                  Вы попали в игру ВИСЕЛИЦА");
        System.out.println("\n----------------------------------------- ПРАВИЛА --------------------------------------------------------------");
        System.out.println("Виселица - это игра в угадывание для одного (игра по умолчанию), двух или более игроков (любой режим игры). \nОдин игрок загадывает слово, фразу или предложение, а другой (другие) пытается угадать его, \nпредлагая буквы или цифры в пределах определенного количества попыток.");
        System.out.println("Угадывающему также предоставляется одна подсказка.");
        System.out.println("--------------------------------------- РЕЖИМЫ ИГРЫ ------------------------------------------------------------");
        System.out.println("-> Пользовательская игра -  вы загадываете слово, его длинна должна быть минимум ДВЕ буквы, \nдалее выбираете один из уровней сложности - EASY, NORMAL или HARD и далее вводите категорию - подсказку.");
        System.out.println("-> Игра по умолчанию - слово, уровень сложности и подсказка будут сгенерированы автоматически.");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("\nВведите задуманное слово или нажмите ENTER, если хотите продолжить с игрой по умолчанию");
        System.out.println("\n                                      УДАЧНОЙ ИГРЫ!!!");
        System.out.println("\nВаш выбор:");

        String input = scanner.nextLine().trim();

        if (input.isEmpty()){
            randomGame(scanner);
        }
        else{
            userGame(scanner, input);
        }
    }

    public static void startPrint(TypesOfDifficulties type, String word){
        System.out.println("\n-------- Параметры игры --------");
        System.out.println("Уровень сложности: " + type.toString());
        if (type == TypesOfDifficulties.Easy) {
            System.out.println("Количество попыток: 6");
        }
        else if (type == TypesOfDifficulties.Normal) {
            System.out.println("Количество попыток: 7");
        }
        else{
            System.out.println("Количество попыток: 8");
        }
        System.out.println("Длинна слова: " + word.length());
        System.out.println("--------------------------------");
    }

    public static void randomGame(Scanner scanner){
        System.out.println("НАЧИНАЕМ");
        System.out.println("      ИГРУ");
        System.out.println("          ПО УМОЛЧАНИЮ");

        Words words = new Words();
        Category category = words.getRandomCategory();
        TypesOfDifficulties type = words.getRandomTypeOfDifficulties();
        String word = words.getWord(category, type);

        String hint = words.getHintForCategory(category);

        startPrint(type, word);
        startGame(scanner, word, type, hint);
    }

    public static void userGame(Scanner scanner, String word) {
        System.out.println("НАЧИНАЕМ");
        System.out.println("      ПОЛЬЗОВАТЕЛЬСКУЮ");
        System.out.println("                     ИГРУ");

        System.out.println("\nВведите уровень сложности:");
        System.out.println("1 - EASY (6 попыток)");
        System.out.println("2 - NORMAL (7 попыток)");
        System.out.println("3 - HARD (8 попыток)");
        System.out.println("\nВаш выбор (1-3):");

        String inputType = scanner.nextLine().trim();
        TypesOfDifficulties type;

        if (inputType.equals("1")) {
            type = TypesOfDifficulties.Easy;
        }
        else if (inputType.equals("2")) {
            type = TypesOfDifficulties.Normal;
        }
        else if (inputType.equals("3")) {
            type = TypesOfDifficulties.Hard;
        }
        else{
            type = TypesOfDifficulties.Normal;
            System.out.println("Некорректный ввод, нужно число! \n По умолчанию установлена сложность NORMAL");
        }

        System.out.println("Введите категорию-подсказку - как бы вы могли обобщить загаданное вами слово (одно слово) \nКатегория будет использована в качестве подсказки!");
        String hint = scanner.nextLine().trim();
        if (hint.isEmpty()){
            hint = "Разное";
        }

        startPrint(type, word);

        startGame(scanner, word, type, hint);
    }

    public static void startGame(Scanner scanner, String word, TypesOfDifficulties type, String hint){
        int maxAttempts;
        boolean isHintUsed = false;

        if (word.length() < 2){
            System.out.println("ОШИБКА! Слово содержит меньше двух букв! \nИгра не может быть начата. Попробуйте снова!");
            return;
        }
        if (type == TypesOfDifficulties.Easy){
            maxAttempts = 6;
        }
        else if (type == TypesOfDifficulties.Normal){
            maxAttempts = 7;
        }
        else {
            maxAttempts = 8;
        }
        System.out.println("\n LETS GO!!!");
        GameSession game = new GameSession(word, maxAttempts);

        while (true){
            System.out.println('\n');

            int wrongAttempts = maxAttempts - game.getAttempts();
            Visualisator.draw(wrongAttempts, type);

            System.out.println("\nСлово: " + game.getGuesser());

            String used = game.getUsedLetters();
            if (!used.isEmpty()){
                System.out.println("Использованные буквы: " + used);
            }

            System.out.println("Осталось попыток: " + game.getAttempts());

            if (game.isWordGuessed()){
                System.out.println("\nУРААА!!! Вы победили!");
                System.out.println("Слово: " + game.getWord());
                break;
            }

            if (game.isGameOver()){
                System.out.println("\nОЧЕНЬ ЖАЛЬ :(");
                System.out.println("Слово: " + game.getWord());
                break;
            }

            if (!isHintUsed) {
                System.out.println("\nВведите одну букву (или '0' для получения подсказки):");
            } else {
                System.out.println("Введите одну букву:");
            }
            String inputLetter = scanner.nextLine().trim().toUpperCase();

            if (inputLetter.isEmpty()){
                System.out.println("Введите букву!!!");
                continue;
            }

            if (inputLetter.length() > 1){
                System.out.println("Считтерить не получиться :) \nТолько одну букву!!!");
                continue;
            }

            if (inputLetter.equals("0")){
                System.out.println("-> Подсказка: " + hint);
                isHintUsed = true;
                continue;
            }

            char letter = inputLetter.charAt(0);

            if (!Character.isLetter(letter)){
                System.out.println("Это не буква!");
                continue;
            }

            if (game.getUsedLetters().contains(inputLetter)) {
                System.out.println("Эта буква уже была! Внимательнее!");
                continue;
            }

            boolean correct = game.guessLetter(letter);

            if (correct){
                System.out.println("Верно!");
            }
            else{
                System.out.println("Неверно!");
            }
        }
        System.out.println("\nКонец игры!");
    }
}
