import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private String codigo;
    private String carga;
    private String preRequisitos;
    private String semestre;
    private int totalAulas;
    private List<Turma> turmas = new ArrayList<>();

    // Métodos

    public void adicionarTurma(Turma turma){
        turmas.add(turma);
    }




    // Métodos especiais

    public Disciplina(){
        this.nomeDisciplina = null;
        this.codigo = null;
        this.carga = null;
        this.preRequisitos = null;
        this.totalAulas = 0;
    }

    public Disciplina(String nomeDisciplina, String codigo, String carga, String preRequisitos, int totalAulas){
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.carga = carga;
        this.preRequisitos = preRequisitos;
        this.totalAulas = totalAulas;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas) {
        this.totalAulas = totalAulas;
    }


}
