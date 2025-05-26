public class AlunoEspecial extends Alunos {
    private int quantidadeMaterias = turmas.size();

    @Override
    public void adicionarTurma(Turma turma){
        if(quantidadeMaterias <= 2){
            turmas.add(turma);
        }else{
            System.out.println("Limite máximo permitido: 2 turmas!");
        }
    }

    public AlunoEspecial(String nome, int matricula, String curso, int semestre){
        super(nome, matricula, curso, semestre);
    }
}
