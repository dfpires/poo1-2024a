package aluno;
public class Aluno {

    private int codigo;
    private int idade;

    private float nota;

    public Aluno(int codigo, int idade, float nota) {
        this.setCodigo(codigo);
        this.setIdade(idade);
        this.setNota(nota);
    }
    public Aluno(){

    }
    public void setCodigo(int codigo){
        if (codigo > 0){
            this.codigo = codigo;
        }
        else {
            System.out.println("código inválido");
        }
    }
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else {
            System.out.println("idade inválida");
        }
    }
    public void setNota(float nota){
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }
        else {
            System.out.println("nota inválida");
        }
    }


    public int getCodigo(){
        return this.codigo;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getNota(){
        return this.nota;
    }

    private void preguica(){
        if (this.nota < 2){
            System.out.println("Aluno preguiçoso");
        }
    }
}
