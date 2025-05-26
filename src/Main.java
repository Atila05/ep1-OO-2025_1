import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int escolhaPrincipal;
        int matricula = 0;
        Menu menu = new Menu();
        List<Alunos> totalAlunos = new ArrayList<>();
        List<Turma> totalTurmas = new ArrayList<>();
        List<Disciplina> totalDisciplinas = new ArrayList<>();


        do{
            menu.menuPrincipal();
            escolhaPrincipal = leitor.nextInt();
            leitor.nextLine();
            switch(escolhaPrincipal){
                case 1:
                    int escolha1;
                    do{
                        menu.modoAluno();
                        escolha1 = leitor.nextInt();
                        leitor.nextLine();
                        switch (escolha1) {
                            case 1:
                                menu.cadastroAluno();
                                totalAlunos.add(new Alunos(menu.nomeAluno, ++matricula, menu.cursoAluno, menu.semestreAluno));
                                System.out.println("\n Aluno cadastrado com sucesso!");
                                break;
                            case 2:
                                //Implementar cadastro de aluno especial
                                System.out.println("Estamos trabalhando nisso...");
                                break;
                            case 3:
                                for (Alunos aluno : totalAlunos){
                                    System.out.println("Matricula: " + aluno.getMatricula() + 
                                    "\nNome: " + aluno.getNome() + 
                                    "\nCurso: " + aluno.getCurso() + 
                                    "\nSemestre: " + aluno.getSemestre());
                                }
                                break;
                            case 4:
                                int escolhaPorMatricula;
                                int escolhaEdicaoAluno;
                                System.out.println("Escolha qual Aluno você gostaria de editar:\n");
                                for (Alunos aluno : totalAlunos) {
                                    System.out.println(aluno.getMatricula() + ". " + aluno.getNome());
                                }
                                escolhaPorMatricula = leitor.nextInt();
                                leitor.nextLine();
                                do{
                                    String novoNome;
                                    Alunos alunoSelecionado;
                                    System.out.println("O que você deseja mudar?\n");
                                    System.out.println("1. Nome");
                                    System.out.println("2. Semestre");
                                    System.out.println("3. Curso");
                                    System.out.println("0. Voltar");
                                    escolhaEdicaoAluno = leitor.nextInt();
                                    leitor.nextLine();
                                    for(Alunos aluno : totalAlunos){
                                        if(aluno.getMatricula() == escolhaPorMatricula){
                                            alunoSelecionado = aluno;
                                        }
                                    }
                                    switch (escolhaEdicaoAluno){
                                        case 1:
                                            break;
                                        default:
                                            System.out.println("Opção inválida!");
                                            break;
                                    }
                                } while (escolhaEdicaoAluno != 0);
                                break;
                            case 5:
                                // Implementar matricula em materias
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    } while (escolha1 != 0);
                    break;
                case 2:
                    int escolha2;
                    do{
                        menu.modoTurma();
                        escolha2 = leitor.nextInt();
                    } while (escolha2 != 0);
                    break;
                case 3:
                    int escolha3;
                    do{
                        menu.modoAvaliacao();
                        escolha3 = leitor.nextInt();
                    } while (escolha3 != 0);
                    break;
                case 0:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolhaPrincipal != 0);

    }

}