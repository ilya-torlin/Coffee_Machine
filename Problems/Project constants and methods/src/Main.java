public class Main {

    public static void main(String[] args) {
        // write your code using the existing class ConstantsAndUtilities
        ConstantsAndUtilities newClass = new ConstantsAndUtilities();

        System.out.println(ConstantsAndUtilities.A_CONSTANT_TTT);
        System.out.println(ConstantsAndUtilities.B_CONSTANT_QQQ);
        System.out.println(newClass.getMagicString());
        System.out.println(newClass.convertStringToAnotherString("aa"));
    }

}

// Don't change this class
class ConstantsAndUtilities extends HiddenClassWithValues {

}