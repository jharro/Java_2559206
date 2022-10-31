package poo;

public class Empleado {
    //Atributos
    private String cedula;
    private String nombre;
    private String cargo="Obrero";
    private float salario=1000000;


    //Métodos
    //Constructor vacío
    public Empleado(){

    }
//Setter
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        if(salario>0){
            this.salario = salario;
        }

    }

    //toString

    @Override
    public String toString() {
        return "Empleado:" + '\n'+
                "# de cédula :'" + cedula + '\n' +
                "Nombre :'" + nombre + '\n' +
                "Cargo='" + cargo + '\n' +
                "Salario=" + salario+'\n'+
                "Su incremento es de: "+calcularIncrementoSalario(salario);
    }
    //Salario: 1.000.000
    //Incremento: 5%
    //$ incremento: 50.000
        public double  calcularIncrementoSalario(float salario){
            double incremento = salario * 0.05;
            return incremento;

        }
    }

    /*
    *1-Constructor
    * --->Invisible
    * --->Vacío
    * --->Con parámetros
    * 2-Setter------->Verificar/Validar
    * 3-Getter
    * 4-toString - @Override
    * 5-Otros métodos: void-retorno
    **/

