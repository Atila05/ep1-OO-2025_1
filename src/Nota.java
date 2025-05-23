abstract class Nota {
    private Alunos aluno;
    private Turma turma;
    private float prova1;
    private float prova2;
    private float prova3;
    private float listaexercicios;
    private float seminario;

    // Métodos



    // Métodos especiais
    public Nota(Alunos aluno, Turma turma, float prova1, float prova2, float listaexercicios, float seminario){
        this.aluno = aluno;
        this.turma = turma;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.listaexercicios = listaexercicios;
        this.seminario = seminario;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public float getProva3() {
        return prova3;
    }

    public void setProva3(float prova3) {
        this.prova3 = prova3;
    }

    public float getListaexercicios() {
        return listaexercicios;
    }

    public void setListaexercicios(float listaexercicios) {
        this.listaexercicios = listaexercicios;
    }

    public float getSeminario() {
        return seminario;
    }

    public void setSeminario(float seminario) {
        this.seminario = seminario;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }



}
