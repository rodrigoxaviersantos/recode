// Faça um programa JAVA que preencha
//  uma matriz de 6 x 8 com * e mostre
//   seu conteúdo ao final.

public class MostraMatriz {
    public static void main(String[] args){
        // Definindo as dimensões da matriz
        final int rows = 6;
        final int cols = 8;

        // Criando a matriz
        char[][] matrix = new char[rows][cols];

       // Preenchendo a matriz com asteriscos
        for(int i = 0; i <rows ; i ++){
            for (int j = 0; j <cols; j++) {
                matrix[i][j] = '*';
            }
        }

        // Exibindo o conteúdo da matriz
        System.out.println("Conteúdo da matriz: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            // Quebra de linha após cada linha da matriz
            System.out.println();
        }
    }


}
