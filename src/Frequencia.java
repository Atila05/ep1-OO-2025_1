public class Frequencia {
    private Alunos aluno;
    private int frequencia;

    // Métodos

    public void somarFrequencia(){
        this.frequencia += 1;
    }

    // Métodos especiais

    public Frequencia(){
        this.aluno = null;
        this.frequencia = 0;
    }

    public Frequencia(Alunos aluno, int frequencia){
        this.aluno = aluno;
        this.frequencia = frequencia;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

}
