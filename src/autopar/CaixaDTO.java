

package autopar;


public class CaixaDTO {
    
    private int Pagamento;
    private String Tipodepagamento;
    private Float ValordoPagamento;
    private Float Valoratualdocaixa;

    public int getPagamento() {
        return Pagamento;
    }

    public void setPagamento(int Pagamento) {
        this.Pagamento = Pagamento;
    }

    public String getTipodepagamento() {
        return Tipodepagamento;
    }

    public void setTipodepagamento(String Tipodepagamento) {
        this.Tipodepagamento = Tipodepagamento;
    }

    public Float getValordoPagamento() {
        return ValordoPagamento;
    }

    public void setValordoPagamento(Float ValordoPagamento) {
        this.ValordoPagamento = ValordoPagamento;
    }

    public Float getValoratualdocaixa() {
        return Valoratualdocaixa;
    }

    public void setValoratualdocaixa(Float Valoratualdocaixa) {
        this.Valoratualdocaixa = Valoratualdocaixa;
    }
    
    
}
