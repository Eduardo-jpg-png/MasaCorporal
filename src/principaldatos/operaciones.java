package principaldatos;
public class operaciones {
   
    public static double msc(double peso,double altura){
        double IMC=peso/(Math.pow(altura,2));
        return IMC;
    }

    public  static void Peso(String nombre , String sexo , double edad , double peso , double altura , double IMC){
        if(IMC<18.5){
            System.out.println("\nTu nombre es :  " + nombre + "\n Tu sexo es : " + sexo + " \nTu edad es :  " + edad + " \nTu altura es :  " + altura + "\n Tu peso es :  " + peso + "\n Te encuentras bajo de peso y es : " + IMC);
        }else if(IMC>=18.5 && IMC<24.9){
            System.out.println("\nTu nombre es :  " + nombre + "\n Tu sexo es : " + sexo + "\n Tu edad es :  " + edad + "\n Tu altura es :  " + altura + "\n Tu peso es :  " + peso + "\n Ten encuentras en tu peso saludable y es : " + IMC);
        }else if(IMC>=25 && IMC <29.9){
            System.out.println("\nTu nombre es :  " + nombre + "\n Tu sexo es : " + sexo + "\n Tu edad es :  " + edad + "\n Tu altura es :  " + altura + "\n Tu peso es :  " + peso + "\n Tienes sobrepeso y es " + IMC);
        }else if(IMC>30){
            System.out.println("\nTu nombre es :  " + nombre + "\n Tu sexo es : " + sexo + "\n Tu edad es :  " + edad + "\n Tu altura es :  " + altura + "\n Tu peso es :  " + peso + "\n Te encuentras en obesidad y es  : " + IMC);
        }
    }

}


