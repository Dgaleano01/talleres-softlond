package org.example.ejercicios;
public class E18 {
    public static void e18(){

        System.out.println("Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña. ");
        int randomMayuscula = (int) (Math.random() * (91 -65)) + 65;
        int randomMinuscula = (int) (Math.random() * (123 - 97)) +97;
        char letraMayuscula= (char) randomMayuscula;
        char letraMinuscula= (char) randomMinuscula;
        String numeros="";
        for (int i=0;i<6;i++){
            numeros+= String.valueOf((int) (Math.random() * 9) + 1);
        }
        String password= Character.toString(letraMayuscula) + Character.toString(letraMinuscula) + numeros;
        System.out.println("Su contraseña aleatoria es: "+ password);
    }

}
