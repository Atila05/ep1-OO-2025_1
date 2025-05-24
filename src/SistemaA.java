public class SistemaA extends Nota {
    private float notaFinal = 0;

    // Métodos

    public void calcularNota(){
        this.notaFinal = (this.getProva1() + this.getProva2() + this.getProva3() + this.getListaexercicios() + this.getSeminario())/5;
    }



    // Métodos especiais

    public SistemaA(Alunos aluno, Turma turma, float prova1, float prova2, float listaexercicios, float seminario){
        super(aluno, turma, prova1, prova2, listaexercicios, seminario);
        aluno.adicionarNota(this);
        turma.adicionarNota(this);
        this.calcularNota();
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }


}
