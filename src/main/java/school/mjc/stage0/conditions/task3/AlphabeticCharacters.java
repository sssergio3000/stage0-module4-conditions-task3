package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            switch (character) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }


        }
        else System.out.println("wrong alphabet!");
    }
    public static void main(String[] args) {
        AlphabeticCharacters ac = new AlphabeticCharacters();
        ac.vowelDeterminer('т');
    }


}



