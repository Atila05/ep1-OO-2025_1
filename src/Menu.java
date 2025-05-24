public class Menu {
    public void menuPrincipal(){
        System.out.println("==== BEM-VINDO ====\n");
        System.out.println("Selecione uma das opcoes a seguir.\n");
        System.out.println("1. Modo Aluno");
        System.out.println("2. Modo Turma/Disciplina");
        System.out.println("3. Modo Avaliacao/Frequencia");
        System.out.println("4. Fechar o programa");
    }

    public void modoAluno(){
        System.out.println("\n==== MODO ALUNO ====\n");
        System.out.println("1. Cadastrar novo Aluno");
        System.out.println("2. Consultar dados de Aluno");
    }

    public void modoTurma(){
        System.out.println("\n==== MODO TURMA/DISCIPLINA ====\n");
        System.out.println("1. Cadastrar nova Disciplina");
        System.out.println("2. Consultar dados de Disciplina");
        System.out.println("3. Cadastrar nova Turma");
        System.out.println("4. Consultar dados de Turma");
    }

    public void modoAvaliacao(){
        System.out.println("\n==== MODO AVALIACAO/FREQUENCIA ====\n");
        System.out.println("1. Lançar notas");
        System.out.println("2. Lançar frequencia");
    }
}
