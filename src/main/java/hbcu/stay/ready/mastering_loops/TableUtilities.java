package hbcu.stay.ready.mastering_loops;

public class TableUtilities {

        public static String getMultiplicationTable(int tableSize) {
             final Integer dimension = tableSize;
             Integer[][]multTablen =new Integer[dimension][dimension];
             String matrix = "";
             int rows =1; int cols=1;
                for(int i=0;i<dimension; i++)
                {
                    for(int k = 0; k<dimension; k++)
                     {
                        multTablen[i][k]= rows * cols;
                         matrix = matrix + multTablen[i][k] + " | ";
                        cols++;
                    }
                     rows++;
                    cols=1;
                     matrix =matrix +"\n";
                    }
                return matrix.trim();
    }



    public static String getSmallMultiplicationTable() {
    
        final Integer dimension = 5;
        Integer[][]multTablen =new Integer[dimension][dimension];
        String matrix = "";
        int rows =1; int cols=1;
           for(int i=0;i<dimension; i++)
           {
               for(int k = 0; k<dimension; k++)
                {
                   multTablen[i][k]= rows * cols;
                    matrix = matrix + multTablen[i][k] + " | ";
                   cols++;
               }
                rows++;
               cols=1;
                matrix =matrix +"\n";
               }
            return matrix.trim();
    
     }

    public static String getLargeMultiplicationTable() {
        final Integer dimension =10;
        Integer[][] multTable9 = new Integer[dimension][dimension];
        String matrix = "";
        int rows =1; int cols=1; 
        for(int i = 0; i<dimension; i++)
        {
            for(int k=0; k < dimension;k++)
            {
                multTable9[i][k]= rows * cols; 
                matrix = matrix + multTable9[i][k]+ " | ";
                cols++;
            }
            rows++;
            cols =1;
            matrix = matrix + "\n";
        }
        return matrix.trim();
    }

    
}
