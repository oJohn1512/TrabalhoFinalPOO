import model.TipoAssento;
import service.CrudGenerico;

public class main {
    
    public static void main(String[] args) {  
        CrudGenerico<Object> crud = new CrudGenerico<>();

        TipoAssento tipoAssento = new TipoAssento(1, "Assento top", "Inclinavel");
        crud.criar(tipoAssento, tipoAssento.getFilePath());
        // crud.ler();
    }
}
