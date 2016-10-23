/**
 * класс для определения числа символов в строке
 */
public class SymbolCount {

    /**
     * определение числа символов в строке
     * @param str входная строка
     * @param letter символ для поиска
     * @return
     */
    public static int symbolCount(String str, char letter){
        int count  = 0;
        for(int index =0; index < str.length(); index++){
            if(str.charAt(index) == letter)
                count ++;
        }
        return count;
    }

    /**
     * тест для функции symbolCount
     */
    private static boolean testSymbolCount(){
        int testCountCheck = 0;
        testCountCheck = symbolCount("how about checking spaces??", ' ');
        if(testCountCheck != 3)
            return false;

        testCountCheck = symbolCount("some other stuff", 'o');
        if(testCountCheck != 2)
            return false;

        testCountCheck = symbolCount("test without some letters", 'v');
        if(testCountCheck != 0)
            return false;

        return true;
    }

    public static void main(String[] args){
        System.out.print("running tests: ");
        boolean testResult = testSymbolCount();
        if(testResult == true)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        String demoStr = "some string to show how the program works";
        char letter = 'o';
        int count = symbolCount(demoStr, letter);
        System.out.println("Number of letters \'" + letter  + "\' in \"" + demoStr + "\" are: " + count);
    }
}
