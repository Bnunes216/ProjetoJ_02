import java.util.Calendar;
import java.sql.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String obesidade;
    private int idade;
    private double peso;
    private double altura;
    private double imc;
    private Data data_nascimento;

    public Pessoa(String nome, String sobrenome, String obesidade, int idade, double peso, double altura, double imc,
            Data data_nascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.obesidade = obesidade;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getObesidade() {
        return obesidade;
    }
    public void setObesidade(String obesidade) {
        this.obesidade = obesidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    public Data getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(Data data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public int CalculaIdade(){
        Calendar eq = Calendar.getInstance();
        int diaAtual = eq.get(Calendar.DAY_OF_MONTH);
        int mesAtual = eq.get(Calendar.MONTH)+1;
        int anoAtual = eq.get(Calendar.YEAR);

        idade = anoAtual - this.data_nascimento.getAno();
        if(mesAtual < this.data_nascimento.getMes()){
            idade --;
        }else if(mesAtual == this.data_nascimento.getMes() && diaAtual <  this.data_nascimento.getDia()){
            idade --;
        }
        return idade;
    }

    public double calculaIMC(){
        imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public String informaObesidade(){
        if(imc < 18.5){
            setObesidade("Abaixo do Peso");
        }else if(imc >= 18.5 && imc <= 24.9){
            setObesidade("Normal");
        }else if(imc >= 25 && imc <= 29.9){
            setObesidade("Sobrepeso");
        }else if(imc >= 30 && imc <= 34.9){
            setObesidade("Obesidade grau 1");
        }else if(imc >= 35 && imc <= 39.9){
            setObesidade("Obesidade grau 2");
        }else if(imc > 40){
            setObesidade("Obesidade grau 3");
        }
        return obesidade;
    }
}
