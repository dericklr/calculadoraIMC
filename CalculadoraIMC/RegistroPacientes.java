public class RegistroPacientes{
    private Paciente[] paciente;
    private int cont;
    

    public RegistroPacientes(int tamanho){
        paciente= new Paciente[tamanho];
        cont=0;
    }

    public RegistroPacientes() {
    }

    public void adicionaPaciente(Paciente p){
        paciente[cont]=p;
        cont++;
    }

    public int getTamanho(){
         return cont;   
        }

      public Paciente retornaPaciente(String nome){
        for(int i=0; i<cont; i++){
            if(paciente[i].getNome().equals(nome)){
                return paciente[i];
            }
          
        }
          return null;
      }  

      public void listaTodosPacientes(){
        if(getTamanho()==0)
            System.out.println("Não existe paciente cadastrado.");
        
        for(int i =0; i<cont;i++){
            System.out.println(paciente[i].toString());
        }
      }
    }
