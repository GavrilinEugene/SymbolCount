
public class StringUtils {

    public static int countSymbols(String str, char letter){
        int ret  = 0;
        for(int index = 0; index < str.length(); index++){
            if(str.charAt(index) == letter)
                ret++;
        }
        return ret;
    }

    private static boolean testSymbolCount(){
        boolean ret = (countSymbols("how about checking spaces??", ' ') == 3) &&
                      (countSymbols("some other stuff", 'o') == 2) &&
                      (countSymbols("test without some letters", 'v') == 0);
        return ret;
    }

    private static boolean checkTests() {
        System.out.print("running tests: ");
        boolean testResult = testSymbolCount();
        if(testResult == true)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        return testResult;
    }

    public static void main(String[] args){
        if(!checkTests())
            return;

        String demoStr = "some string to show how the program works";
        char letter = 'o';
        int symbolCount = countSymbols(demoStr, letter);
        System.out.println("Number of letters \'" + letter  + "\' in \"" + demoStr + "\" are: " + symbolCount);
    }
}
