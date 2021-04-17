public class InisialisasiArray2 {
    public static void main (String[] args){
        int i, j;
        int[][] nil_akhir = {{150, 200, 300}, {500, 700, 300}, {320, 890, 540}};

        System.out.print("Data Yang Diinput ke Elemen Array\n");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print("Nilai Akhir Index ["+i+"]["+j+"] ");
                System.out.println(" = "+nil_akhir[i][j]);
            }
            System.out.println();
        }
    }
}
