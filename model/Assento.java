package model;

public class Assento {
    private int idAssento;
    private TipoAssento tipoAssento;
    private String filePath = "Assento.txt";
    
    public Assento(int idAssento, TipoAssento tipoAssento) {
        this.idAssento = idAssento;
        this.tipoAssento = tipoAssento;
    }

    public int getIdAssento() {
        return idAssento;
    }

    public void setIdAssento(int idAssento) {
        this.idAssento = idAssento;
    }

    public TipoAssento getTipoAssento() {
        return tipoAssento;
    }

    public void setTipoAssento(TipoAssento tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String toString() {
        return "idAssento = " + idAssento + ", tipoAssento = " + tipoAssento;
    }

    
}
