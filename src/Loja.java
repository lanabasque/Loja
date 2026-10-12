public abstract class Loja {

    private String cnpj;
    private String razaoSocial;
    private boolean aberta;

    public void abrir(){
        aberta = true;
    }
    public void fechar(){
        aberta = false;
    }

    public Loja(String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public boolean isAberta(){
        return aberta;
    }


}
