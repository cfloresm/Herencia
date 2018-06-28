//Codigo de la clase profesor subclase persona ejemplo(clasehija)
public class Profesor extends Persona{
 //Campos especificos de la subclase 
    private String IdProfesor;
//Constructor de la subclase
public Profesor (String nombre, String apellidos,int edad){
super(nombre,apellidos,edad);
IdProfesor="Unknown";}
public void setIdProfesor(String IdProfesor){this.IdProfesor=IdProfesor;}
public String getIdProfesor(){return IdProfesor;}
public void mostrarNombreApellidosYCarnet(){
System.out.println("Profesor de nombre:"+getNombre()+""+getApellidos()+"con Id de profesor());}
}
