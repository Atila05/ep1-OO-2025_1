public class Turma extends Disciplina {
    private String nomeTurma;
    private String professor;
    private String sala;
    private String horario;
    private String capacidade;

    // Métodos especiais

    public Turma(){
        this.nomeTurma = null;
        this.professor = null;
        this.sala = null;
        this.horario = null;
        this.capacidade = null;
    }

    public Turma(String nomeTurma, String professor, String sala, String horario, String capacidade){
        this.nomeTurma = nomeTurma;
        this.professor = professor;
        this.sala = sala;
        this.horario = horario;
        this.capacidade = capacidade;
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

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }



}
