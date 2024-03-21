public class IrregularArrays {
    public static void main(String[] args) {
        // arrWithObj();
        arrWithError();
    }

    static void arrWithObj() {
        // Array irregular con objetos de tipo int con 3 filas
        int[][] irregularArr = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

        for (int rowIndex = 0; rowIndex < irregularArr.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < irregularArr[rowIndex].length; columnIndex++) {
                System.out.print(irregularArr[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }

    static void arrWithError() {
        // Array irregular con excepción de índice por falta de valores en el ultimo indice
        int[][] irregularArr = new int[7][]; // Cambiar el valor de indece global para ahumentar o disminuir el tamaño del arreglo.
        // irregularArr[0] = new int[] { 1, 2, 3 }; // Se declara el valor de cada indice
        irregularArr[0] = new int[10]; // Se declara el tamaño del arreglo sin valores
        irregularArr[1] = new int[7];

        // for (int rowIndex = 0; rowIndex < irregularArr.length; rowIndex++) {
        // for (int columnIndex = 0; columnIndex < irregularArr[rowIndex].length;
        // columnIndex++) {
        // System.out.print(irregularArr[rowIndex][columnIndex] + " ");
        // }
        // System.out.println();
        // }

        // Solucion de la excepción de índice. Se genera un saltar de línea por que tenemos un array vacio
        for (int rowIndex = 0; rowIndex < irregularArr.length; rowIndex++) {
            irregularArr[rowIndex] = new int[rowIndex + 1];
            for (int columnIndex = 0; irregularArr[rowIndex] != null
                    && columnIndex < irregularArr[rowIndex].length; columnIndex++) {
                irregularArr[rowIndex][columnIndex] = columnIndex + 1;
                System.out.print(irregularArr[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }
}
