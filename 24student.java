class Student{
        public static void main(String[] args) {
            //double cityTemp[][] = new double[10][30];
            double studentMark[][] ={
                                    {0,0,0},
                                    {60,32,43},
                                    {49,23,60},
                                    {32,47,43},
                                    {86,23,43},
                                    {66,32,88},
                                    };
    
            for (int i = 0; i < 6; i++) {
                if(i==0 ) System.out.print("\t\t\t   ");
                else System.out.print("Student id: SSq"+(i)+" Marks :\t");
                for (int j = 0; j < 3; j++) {
                    if(i==0 ) System.out.print("Subject s"+(j+1)+"\t    ");
                    else System.out.print(studentMark[i][j] + "\t\t");
                }
                System.out.println();
            }

            System.out.println();
            int[] totals = new int[6];
            int[] avgs = new int[6];
            
            totals[0]=0; 
            avgs[0]=0;
            for (int i = 1; i < 6; i++) {
                int sum =0;               
                for (int j = 0; j < 3; j++) {
                    sum += studentMark[i][j];
                }               
                totals[i]=sum;
                avgs[i]= sum/3;
            }
            for (int i = 1; i < 6; i++) {
                System.out.println("student id SSq"+i+"'s total marks "+ totals[i] + " & avg is "+ avgs[i]);
            }

            double[] highMarks = new double[3];
            for (int j = 1; j < 6; j++) {
                double hig = -1;
                for (int k = 0; k < 3; k++) {
                        if(studentMark[j][k]>hig) hig = studentMark[j][k];
                    }
                //highMarks[j]=hig;
            }           
            for (int j = 0; j < 3; j++) {
                System.out.println("Subject id s"+j+"'s highest marks "+ highMarks[j] + " & avg is ");
            }
            System.out.println();
            double max1 = -1;
            double max2 = -1;
            double max3 = -1;
            for (int i = 1; i < 6; i++) {   
                int j=0;
                if(studentMark[j][i]>max1) max1 = studentMark[j][i];
                j=2;
                if(studentMark[j][i]>max1) max2 = studentMark[j][i];
                j=3;
                if(studentMark[j][i]>max1) max3 = studentMark[j][i];     
            }
                System.out.println("Subject 1 heighest marks : "+max1);
                System.out.println("Subject 2 heighest marks : "+max2);
                System.out.println("Subject 3 heighest marks : "+max3);  
            double min = 101;
            for (int i = 1; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    if(studentMark[i][j]<min) min = studentMark[i][j];
                }
            }
            System.out.print("minimum Marks is "+min);
            for (int i = 1; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    if(studentMark[i][j]==max1) System.out.println(" in Day :"+(i));
                }
            }
        }

}