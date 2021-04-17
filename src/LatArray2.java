import java.util.Scanner;

public class LatArray2 {
    public static void main (String[] args){
        int i, j;
        int [][] data_jual;
        data_jual = new int[3][3];
        Scanner input = new Scanner(System.in);

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print("Masukan Data Jual ke ["+i+"]["+j+"] = ");
                data_jual[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n\nData Jual Yang Diinput ke Elemen Array\n");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print("Nilai Data Jual ["+i+"]["+j+"] ");
                System.out.println(" = " + data_jual[i][j]);
            }
            System.out.println();
        }
    }
}
