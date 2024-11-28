package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CrudGenerico<T> {
    public String arquivo;

    public CrudGenerico(String arquivo) {
        this.arquivo = arquivo;
    }
    public CrudGenerico() {
        this.arquivo = "";
    }

    public void criar(T criarObjeto, String arquivo) {
        try  {
            FileWriter fw = new FileWriter("C:\\Users\\alunot5\\Documents\\GitHub\\TrabalhoFinalPOO\\TrabalhoFinalPOO\\dados\\" + arquivo, true);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(criarObjeto.toString());
            writer.newLine();
            System.out.println("Criado com sucesso");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> ler(){
        List<String> listaObjetos = new ArrayList<>();
        try {
            FileReader fr = new FileReader("dados.txt");
            BufferedReader leitor = new BufferedReader(fr);
            String linha;
            while ((linha = leitor.readLine()) !=null){
                listaObjetos.add(linha);
            }
            leitor.close();
            return listaObjetos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

