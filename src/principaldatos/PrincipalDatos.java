package principaldatos;
import java.util.*;
public class PrincipalDatos{
    public static void main(String[] args) {
 Scanner leer=new Scanner(System.in);
        persona e1=new persona();
        double IMC;
        System.out.println("Ingresa tu nombre");
        e1.setNombre(leer.nextLine());
        System.out.println("Ingresa tu sexo");
        e1.setSexo(leer.nextLine());
        System.out.println("Ingresa tu edad");
        e1.setEdad(leer.nextDouble());
        System.out.println("Ingresa tu peso");
        e1.setPeso(leer.nextDouble());
        System.out.println("Ingresa tu altura");
        e1.setAltura(leer.nextDouble());
        IMC=operaciones.msc(e1.getPeso(), e1.getAltura());
        operaciones.Peso(e1.getNombre(),e1.getSexo(),e1.getEdad(),e1.getPeso(),e1.getAltura(),IMC);
        }
    }

