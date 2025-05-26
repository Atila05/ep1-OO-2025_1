import java.util.ArrayList;
import java.util.List;

public class Alunos {
    private String nome;
    private int matricula;
    private String curso; 
    private int semestre;
    protected List<Turma> turmas = new ArrayList<>();
    private List<Nota> notas = new ArrayList<>();
    private List<Frequencia> frequencias = new ArrayList<>();




    //Vou add ainda os atributos de Disciplina/Turma e Avaliacao/Frequencia

    public void adicionarTurma(Turma turma){
        turmas.add(turma);
    }

    public void removerTurma(Turma turma){
        turmas.remove(turma);
    }

    public void adicionarNota(Nota nota){
        notas.add(nota);
    }

    public void removerNota(Nota nota){
        notas.remove(nota);
    }

    public void adicionarFrequencia(Frequencia frequencia){
        frequencias.add(frequencia);
    }

    public void removerFrequencia(Frequencia frequencia){
        frequencias.remove(frequencia);
    }


    //Metodos especiais


    public Alunos(String nome, int matricula, String curso, int semestre){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }



}
