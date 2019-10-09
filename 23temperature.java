class temperature{
    public static void main(String[] args) {
        //double cityTemp[][] = new double[10][30];
        double cityTemp[][] ={  {0,0,0,0,0, 0,0,0,0,0},
                                {32,32,43,21,12,32,12,32,21,32},
                                {32,23,43,21,12,32,12,34,21,32},
                                {32,32,43,54,12,32,12,32,21,32},
                                {34,32,43,21,12,32,12,43,21,32},
                                {32,32,43,21,12,34,12,43,21,32},
                                {44,32,43,65,12,32,12,32,21,32},
                                {32,43,43,21,12,32,12,54,21,32},
                                {32,32,43,43,12,32,12,32,21,32},
                                {32,54,43,21,12,32,12,34,21,43},
                                {32,21,32,12,32,12,12,23,12,32},
                                {32,32,43,21,12,32,12,32,21,32},
                                {32,23,43,21,12,32,12,34,21,32},
                                {32,32,43,54,12,32,12,32,21,32},
                                {34,32,43,21,12,32,12,43,21,32},
                                {32,32,43,21,12,34,12,43,21,32},
                                {44,32,43,65,12,32,12,32,21,32},
                                {32,43,43,21,12,32,12,54,21,32},
                                {32,32,43,43,12,32,12,32,21,32},
                                {32,54,43,21,12,32,12,34,21,21},
                                {32,32,43,21,12,32,12,32,21,32},
                                {32,23,43,21,12,32,12,34,21,32},
                                {32,32,43,54,12,32,12,32,21,32},
                                {34,32,43,21,12,32,12,43,21,32},
                                {32,32,43,21,12,34,12,43,21,32},
                                {44,32,43,65,12,32,12,32,21,32},
                                {32,43,43,21,12,32,12,54,21,32},
                                {32,32,43,43,12,32,12,32,21,32},
                                {32,54,43,21,12,32,12,34,21,31},
                                {32,21,32,12,32,12,12,73,12,32},
                                {32,32,43,21,12,32,12,32,21,32},
                                {32,23,43,21,12,32,12,34,21,32},
                                {32,32,43,54,12,32,12,32,21,32},
                                {34,32,43,21,12,32,12,43,21,32},
                                {32,32,43,21,12,34,12,43,21,32},
                                {44,32,43,65,12,32,12,32,21,32},
                                {32,43,43,21,12,32,12,54,21,32},
                                {32,32,43,43,12,32,12,32,21,32},
                                {32,54,43,21,12,32,12,34,21,32},
                                {32,54,43,21,12,32,12,34,21,32} };

        for (int i = 0; i < 31; i++) {
            if(i==0 ) System.out.print("\t\t\t");
            else System.out.print("Day "+(i)+" Temperature :\t");
            for (int j = 0; j < 10; j++) {
                if(i==0 ) System.out.print("City "+(j+1)+"\t");
                else System.out.print(cityTemp[i][j] + "\t");
            }
            System.out.println();
        }
        double max = -400;
        for (int i = 1; i < 31; i++) {
            for (int j = 0; j < 10; j++) {
                if(cityTemp[i][j]>max) max = cityTemp[i][j];
            }
        }
        System.out.print("high temperature is "+max);
        for (int i = 1; i < 31; i++) {
            for (int j = 0; j < 10; j++) {
                if(cityTemp[i][j]==max) System.out.println(" in City :"+(j+1));
            }
        }
        double min = 4000;
        for (int i = 1; i < 31; i++) {
            for (int j = 0; j < 10; j++) {
                if(cityTemp[i][j]<min) min = cityTemp[i][j];
            }
        }
        System.out.print("minimum temperature is "+min);
        for (int i = 1; i < 31; i++) {
            for (int j = 0; j < 10; j++) {
                if(cityTemp[i][j]==max) System.out.println(" in Day :"+(i));
            }
        }
    }
    
}