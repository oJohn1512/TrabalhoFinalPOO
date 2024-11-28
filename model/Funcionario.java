package model;

import java.sql.Date;

public class Funcionario {
    private int matricula;
    private Date horarioTrabalho;
    private String filePath = "Funcionario.txt";
    
    public Funcionario(int matricula, Date horarioTrabalho) {
        this.matricula = matricula;
        this.horarioTrabalho = horarioTrabalho;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(Date horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String toString() {
        return "matricula = " + matricula + ", horarioTrabalho = " + horarioTrabalho;
    }
}
