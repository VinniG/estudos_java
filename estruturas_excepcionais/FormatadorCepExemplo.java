public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CEPInvalidoException e) {
            e.printStackTrace();
            System.out.println("CEP INVÁLIDO!");
        }
    }
    static String formatarCep(String cep) throws CEPInvalidoException{
        if(cep.length() != 8)
          throw new CEPInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
