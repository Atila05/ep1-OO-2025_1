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
    private List<Alunos> alunos = new ArrayList<>();

    // Métodos

    public void adicionarTurma(Turma turma){
        this.turmas.add(turma);
    }

    public void removerTurma(Turma turma){
        this.turmas.remove(turma);
    }

    public void adicionarAluno(Alunos aluno){
        this.alunos.add(aluno);
    }

    public void removerAluno(Alunos aluno){
        this.alunos.remove(aluno);
    }




    // Métodos especiais

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
