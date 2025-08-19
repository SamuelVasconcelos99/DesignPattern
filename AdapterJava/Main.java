public class Main {
    public static void main(String[] args) {
        // Cria lógica de seleção entre Excel e PDF

        // Adaptado
        ExcelFormatter excelFormatter = new ExcelFormatter();

        // Adaptador
        PDFFormatter pdfFormatter = new PDFFormatter(excelFormatter);

        pdfFormatter.executaPDF();


    }
}
