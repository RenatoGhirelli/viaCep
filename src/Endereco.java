public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(cepApi cepApi) {
        this.cep = cepApi.cep();
        this.logradouro = cepApi.logradouro();
        this.bairro = cepApi.bairro();
        this.cidade = cepApi.cidade();
        this.uf = cepApi.uf();
    }


}