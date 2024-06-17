public class Paciente{
    private String nome;
    private double altura, peso;

    public Paciente(String nome, double altura, double peso){
        this.nome=nome;
        this.altura=altura;
        this.peso=peso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public double calculaImc(){
        double imc;
        double res= Math.pow(altura,2);
        imc=peso/res;
        return imc;
    }

    @Override
    public String toString(){
        String str="";
        double imc =calculaImc();
        if (imc<18.5){
        str= "Voce esta abaixo do peso ideal";
        }else if(imc>=18.5 && imc<=24.9){
        str= "Parabens, voce esta no seu peso normal!";
        }else if(imc>=25 && imc <=29.9){
        str= "Sobrepeso.";
        }else if(imc>=30 && imc <=34.9){
        str= "Obesidade grau I";
        }else if(imc>=35 && imc <=39.9){
        str= "obesidade grau II";
        } else{
        str= "Obesidade grau III";  
    }
    return  "Nome: "+nome+ " Altura: "+getAltura()+ " Peso: "+getPeso()+ " Situacao: "+calculaImc() +" "+str ;
    
    }

}