package homework03;

public class CharacterController {
    public CharacterController() {}

    public int countAlpha(String s) throws CharCheckException {
        if (s.contains(" ")) {
            throw new CharCheckException();
        }

        int count = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                count++;
            }
        }
        return count;
    }
}