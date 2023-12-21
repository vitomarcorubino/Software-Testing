package homework1;

public class Main {
    public static void main(String[] args) {
        String str, output;
        boolean capitalizeFirstLetter;
        char[] delimiters;
        CaseUtils caseUtils = new CaseUtils();

        str = "camel case";
        capitalizeFirstLetter = false;
        delimiters = null;
        output = caseUtils.toCamelCase(str, capitalizeFirstLetter, delimiters);

        System.out.println("test: " + str);
        System.out.println("output: " + output);
    }
}