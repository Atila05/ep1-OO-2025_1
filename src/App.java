public class App {
    public static void main(String[] args) {
    Alunos aluno1 = new Alunos("Cleber", "241012345", "Engenharia de Software");
    System.out.println("Nome: " + aluno1.getNome() + "\nMatricula: " + aluno1.getMatricula() + "\nCurso: " + aluno1.getCurso());
    }
}