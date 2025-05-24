public class Avaliacao {
    private Alunos aluno;
    private SistemaA notaA;
    private SistemaB notaB;
    private Frequencia frequencia;
    private Turma turma;
    private boolean aprovado;

    // Métodos

    public void situacaoFinalA(SistemaA nota){
        this.notaA = nota;
        if (nota.getNotaFinal() >= 5) {
            this.aprovado = true;
        } else {
            this.aprovado = false;
        }
    }

    public void situacaoFinalB(SistemaB nota){
        this.notaB = nota;
        if (nota.getNotaFinal() >= 5) {
            this.aprovado = true;
        } else {
            this.aprovado = false;
        }
    }



    //Métodos especiais

    public Avaliacao(Alunos aluno, Frequencia frequencia, Turma turma, SistemaA nota){
        this.aluno = aluno;
        this.frequencia = frequencia;
        this.turma = turma;
        this.situacaoFinalA(nota);
    }
    public Avaliacao(Alunos aluno, Frequencia frequencia, Turma turma, SistemaB nota){
        this.aluno = aluno;
        this.frequencia = frequencia;
        this.turma = turma;
        this.situacaoFinalB(nota);
    }

    public String getAprovado(){
        if (this.aprovado){
            return "APROVADO!!!";
        } else {
            return "REPROVADO!";
        }
    }




}
