// Adaptador
public class PDFFormatter implements IPDFFormatter{
    
    private ExcelFormatter formatador;

    public PDFFormatter(ExcelFormatter formatadorExcel) {
        this.formatador = formatadorExcel;
    }

    @Override
    public void extraiPlanilhaPDF(){
        System.out.println("Extraindo planilha do PDF...");
    }

    public void executaPDF(){
        this.extraiPlanilhaPDF();
        this.formatador.executa();
    }
}
