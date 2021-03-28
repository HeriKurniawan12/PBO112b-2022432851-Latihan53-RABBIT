/**
 *
 * @author
 * Nama : Heri Kurniawan
 * Kelas : PBO122B
 * NIM : 2022432851
 * Deskripsi Program : Program Ini Berisi Latihan 53 Rabbit
 */
package pbo112b.pkg2022432851.latihan53.rabbit;


public class PBO112b2022432851Latihan53RABBIT {

 
    public static void main(String[] args) {
        
        Rabbit hki = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, His name is "+hki.getName());
        System.out.println(hki.getName()+" is Vegetarian? "+hki.vegetarian);
        System.out.println(hki.getName()+" eats "+hki.getEats());
        System.out.println(hki.getName()+" has "+hki.getNoOflegs()+" legs");
        System.out.println(hki.getName()+" color is "+hki.getColor());

    }
    
}
