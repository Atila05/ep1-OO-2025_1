import java.util.ArrayList;
import java.util.List;

public class Turma{
    private Disciplina disciplina;
    private String nomeTurma;
    private String professor;
    private String sala;
    private String horario;
    private int capacidade;
    private char formaAvaliacao;
    private List<Alunos> alunosMatriculados;
    private List<Nota> notas;

    // Métodos

    public void adicionarAluno(Alunos aluno){
        alunosMatriculados.add(aluno);
        this.capacidade -= 1;
    }

    public void adicionarNota(Nota nota){
        notas.add(nota);
    }

    // Métodos especiais


    public Turma(Disciplina disciplina, String nomeTurma, String professor, String sala, String horario, int capacidade, char formaAvaliacao){
        this.disciplina = disciplina;
        this.nomeTurma = nomeTurma;
        this.professor = professor;
        this.sala = sala;
        this.horario = horario;
        this.capacidade = capacidade;
        this.formaAvaliacao = formaAvaliacao;
        this.alunosMatriculados = new ArrayList<>();
        disciplina.adicionarTurma(this);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public char getFormaAvaliacao() {
        return formaAvaliacao;
    }

    public void setFormaAvaliacao(char formaAvaliacao) {
        this.formaAvaliacao = formaAvaliacao;
    }



}
