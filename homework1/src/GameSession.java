public class GameSession {
    private String word;
    private char[] guesser;
    private int attempts;
    private String usedLetters;

    public GameSession(String word, int maxAttempts){
        this.word = word.toUpperCase();
        this.attempts = maxAttempts;
        this.usedLetters = "";

        guesser = new char[word.length()];
        for (int i = 0; i < word.length(); ++i){
            guesser[i] = '_';
        }

    }

    public boolean guessLetter(char letter){
        letter = Character.toUpperCase(letter);

        usedLetters += letter;

        boolean correct = false;

        for (int i = 0; i < word.length(); ++i){
            if (word.charAt(i) == letter){
                guesser[i] = letter;
                correct = true;
            }
        }

        if (!correct){
            attempts -= 1;
        }

        return correct;
    }

    public boolean isWordGuessed(){
        for (char c : guesser){
            if (c == '_'){
                return false;
            }
        }
        return true;
    }

    public boolean isGameOver(){
        return attempts <=0;
    }

    public String getGuesser(){
        return new String(guesser);
    }

    public String getWord(){
        return word;
    }

    public int getAttempts(){
        return attempts;
    }

    public String getUsedLetters(){
        return usedLetters;
    }
}
