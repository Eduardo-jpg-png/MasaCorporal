package principaldatos;
public class persona {
String nombre, sexo;
    double peso, altura, edad;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public double getEdad(){
        return edad;
    }
    public void setEdad(double edad){
        this.edad = edad;
    }
    public double getPeso(){
        return peso;

    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
}

