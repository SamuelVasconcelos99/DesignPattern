
//Adaptado
public class ExcelFormatter implements IExcelFormatter {

    @Override
    public void formatarColunas(){
        System.out.println("Col A, Col B, Col C...");
    }

    @Override
    public void formatarLinhas(){
        System.out.println("Formatando linhas");
    }

    @Override
    public void formatarEstilo(){
        System.out.println("Formatando estilo");
    }

    public void executa(){
        // Extrair do PDF a planilha
        this.formatarColunas();
        this.formatarLinhas();
        this.formatarEstilo();
    }
}