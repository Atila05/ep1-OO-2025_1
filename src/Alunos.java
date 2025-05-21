public class Alunos {
    private String nome;
    private String matricula;
    private String curso;

    //Vou add ainda os atributos de Disciplina/Turma e Avaliacao/Frequencia
    public void adicionarTurma(Disciplina disciplina){

    }

    


    //Metodos especiais
    public Alunos(){
        this.nome = null;
        this.matricula = null;
        this.curso = null;
    }

    public Alunos(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }





}
