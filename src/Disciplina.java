public class Disciplina {
    private String nomeDisciplina;
    private String codigo;
    private String carga;
    private String preRequisitos;
    private String semestre;



    // Métodos especiais

    public Disciplina(){
        this.nomeDisciplina = null;
        this.codigo = null;
        this.carga = null;
        this.preRequisitos = null;
    }

    public Disciplina(String nomeDisciplina, String codigo, String carga, String preRequisitos){
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.carga = carga;
        this.preRequisitos = preRequisitos;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }



}
