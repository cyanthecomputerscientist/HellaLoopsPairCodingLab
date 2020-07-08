package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        Integer i = 0;
        for(i = start; i< stop;i++)
        {
            if(i % 2 ==1)
            {
                evenNumbers = evenNumbers + i.toString();
            }
        }
        return evenNumbers.trim();
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumber = "";
        Integer i = 0; 
        for(i = start; i<stop; i++)
        {
            if(i%2 ==0)
            {
                oddNumber = oddNumber +i.toString();
            }
        }
        return oddNumber.trim();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers ="";
        Integer i = 0; 
        for(i = start; i< stop; i+=step)
        {
            Double toDouble = i.doubleValue();
            toDouble = Math.pow(toDouble, 2);
            Integer toInteger = toDouble.intValue();
            squareNumbers = squareNumbers + toInteger.toString();
        }
        return squareNumbers;
    }

    public static String getRange(int start) {
        String range = "";
        Integer i = 0;
        for(i=0; i<start;i++)
        {
            range = range +i.toString();
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        Integer i = 0; 
        for(i=start; i<stop; i++)
        {
            range = range + i.toString();
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        Integer i= 0; 
        for(i=start; i<stop; i+=step)
        {
            range = range + i.toString();
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponentiations = "";
        Integer i = 0; 
        Double product = 1.0;
        for(i= start; i<stop; i+=step)
        {
            product = Math.pow(i, exponent);
            Integer intProduct = product.intValue();
            exponentiations =exponentiations + intProduct.toString();
        }
        return exponentiations;
    }
}
