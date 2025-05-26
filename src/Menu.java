import java.util.Scanner;

public class Menu {
    Scanner leitor = new Scanner(System.in);
    public String nomeAluno;
    public String cursoAluno;
    public int semestreAluno;


    public void menuPrincipal(){
        System.out.println("\n==== BEM-VINDO ====\n");
        System.out.println("Selecione uma das opcoes a seguir.\n");
        System.out.println("1. Modo Aluno");
        System.out.println("2. Modo Turma/Disciplina");
        System.out.println("3. Modo Avaliacao/Frequencia");
        System.out.println("0. Fechar o programa");
    }

    public void modoAluno(){
        System.out.println("\n==== MODO ALUNO ====\n");
        System.out.println("1. Cadastro de Aluno Regular");
        System.out.println("2. Cadastro de Aluno Especial");
        System.out.println("3. Consultar dados de Aluno");
        System.out.println("4. Editar dados de aluno");
        System.out.println("5. Matricular aluno em matéria");
        System.out.println("0. Voltar");
        
    }

    public void cadastroAluno() {
        System.out.println("\n==== CADASTRO DE ALUNO REGULAR ====\n");
        System.out.println("Digite o nome do aluno:");
        nomeAluno = leitor.nextLine();
        System.out.println("Digite o curso do aluno");
        cursoAluno = leitor.nextLine();
        System.out.println("Digite o semestre que o aluno está:");
        semestreAluno = leitor.nextInt();
    }

    public void modoTurma(){
        System.out.println("\n==== MODO TURMA/DISCIPLINA ====\n");
        System.out.println("1. Cadastrar nova Disciplina");
        System.out.println("2. Consultar dados de Disciplina");
        System.out.println("3. Cadastrar nova Turma");
        System.out.println("4. Consultar dados de Turma");
        System.out.println("0. Voltar");
    }

    public void modoAvaliacao(){
        System.out.println("\n==== MODO AVALIACAO/FREQUENCIA ====\n");
        System.out.println("1. Lançar notas");
        System.out.println("2. Lançar frequencia");
        System.out.println("0. Voltar");
    }
}
