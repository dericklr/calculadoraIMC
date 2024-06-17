public class Principal{
    public static void main(String[] args){

        RegistroPacientes r= new RegistroPacientes(10);    

        for(int i=0;i<10;i++){
            String nome= "Paciente" +i;
            double altura= 1.50+(Math.random()*0.4);
            double peso=45+(Math.random()*(75+1));
            
            Paciente p= new Paciente(nome, altura, peso);
            r.adicionaPaciente(p);

            }
        

        System.out.println("Todos os pacientes");
        Paciente p1=r.retornaPaciente("Paciente2");
        System.out.println(p1.toString());
         r.listaTodosPacientes();
    }
        }
