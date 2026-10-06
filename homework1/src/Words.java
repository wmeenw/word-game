import java.util.Random;

public class Words {
    private String[] animalsEasy = {"ВОЛК", "КОТ", "ЗАЯЦ"};
    private String[] animalsNormal = {"СОБАКА", "ЖИРАФ", "МЕДВЕДЬ"};
    private String[] animalsHard = {"УТКОНОС", "ПАНТЕРА", "АКСОЛОТЛЬ"};

    private String[] countriesEasy = {"КУБА", "РОССИЯ", "КИТАЙ"};
    private String[] countriesNormal = {"БРАЗИЛИЯ", "ФРАНЦИЯ", "ИТАЛИЯ"};
    private String[] countriesHard = {"ВЕЛИКОБРИТАНИЯ", "НИДЕРЛАНДЫ", "ШВЕЙЦАРИЯ"};

    private String[] foodEasy = {"ХЛЕБ", "СУП", "ТОРТ"};
    private String[] foodNormal = {"ХИНКАЛИ", "ОМЛЕТ", "БУРГЕР"};
    private String[] foodHard = {"БУТЕРБРОД", "КАРБОНАРА", "ЖЮЛЬЕН"};

    private Random random = new Random();

    public TypesOfDifficulties getRandomTypeOfDifficulties(){
        TypesOfDifficulties[] allTypes = TypesOfDifficulties.values();
        int randomIndex = random.nextInt(allTypes.length);
        return allTypes[randomIndex];
    }

    public Category getRandomCategory(){
        Category[] allCategories = Category.values();
        int randomIndex = random.nextInt(allCategories.length);
        return allCategories[randomIndex];
    }

    public String getWord(Category category, TypesOfDifficulties type){
        switch (category){
            case Animals:
                switch (type){
                    case Easy: return getRandomWord(animalsEasy);
                    case Normal: return getRandomWord(animalsNormal);
                    case Hard: return getRandomWord(animalsHard);
                }
                break;
            case Countries:
                switch (type){
                    case Easy: return getRandomWord(countriesEasy);
                    case Normal: return getRandomWord(countriesNormal);
                    case Hard: return getRandomWord(countriesHard);
                }
                break;
            case Food:
                switch (type){
                    case Easy: return getRandomWord(foodEasy);
                    case Normal: return getRandomWord(foodNormal);
                    case Hard: return getRandomWord(foodHard);
                }
                break;
        }
        return "Слово";
    }

    public String getRandomWord(String[] words){
        int index = random.nextInt(words.length);
        return words[index];
    }

    public String getHintForCategory(Category category) {
        if (category == Category.Animals) {
            return "Животные";
        } else if (category == Category.Countries) {
            return "Страны мира";
        }
        return "Еда";
    }
}
