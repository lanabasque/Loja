public class Main{

    public static void main (String[] args){

        LojaComercial loja = new LojaComercial("12.345.678/0001-90", "Doces da Lana");

        loja.abrir();

        System.out.println(loja.isAberta());

        loja.fechar();

        System.out.println(loja.isAberta());



    }


}