public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String sistemaOperacional;

    public iPhone(String modelo, String sistemaOperacional) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void tocarMusica() {
    }
    
    @Override
    public void pausarMusica() {
    }

    @Override
    public void selecionarMusica(String musica) {
    }

    @Override
    public void ligar(String numero) {
    }

    @Override
    public void atender() {
    }

    @Override
    public void iniciarCorreioVoz() {
    }

    @Override
    public void exibirPagina(String url) {
    }

    @Override
    public void adicionarNovaAba() {
    }

    @Override
    public void atualizarPagina() {
    }
}