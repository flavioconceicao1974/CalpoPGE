package ttshell;

public class Conjuncao {

    private String conjuncao; //********* MUDAR O NOME PARA CONECTIVO ************
    private String complemento;
    private String tipo; // classificação dada a cada oração. e.g. OCA, OCSd, OCSv,...
    private int caso; // 1.Normal; ************* MUDAR PARA ENUMERACAO **************
                      // 2.Falsos conectivos [e] [nem]; 
                      // 3.ora...ora, seja...seja; 
                      // 4.que (=porque) 
                      // 5. Locução conjuntiva (no entanto, não obstante, por isso,...) 
                      // 6.não só...mas também; 
                      // 7.não...mas sim; // A civilização não se mede pelo aperfeiçoamento material, mas sim pela elevação moral.
                      // 8.não só...como também; 
                      // 9.umas vezes...outras vezes; 
                      // 91.quer...quer não // quer eles queiram, quer não, eu ficarei.
 

    public Conjuncao(String conjuncao, String tipo) {
        this.conjuncao = conjuncao;
        this.tipo = tipo;
        this.caso = 1;
        this.complemento = "";
    }

    public String getConjuncao() {
        return conjuncao;
    }

    public void setConjuncao(String conjuncao) {
        this.conjuncao = conjuncao;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCaso() {
        return caso;
    }

    public void setCaso(int caso) {
        this.caso = caso;
    }
}
