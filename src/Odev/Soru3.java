package Odev;
import java.util.Random;

//iskambil destesini diziler ile
// oluşturun sonrasında bu desteki elemanları karıştırın, ve ilk kullanıcıya hangi dört kartın geldiğini yazdırın

public class Soru3 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] suits = {"\u2665", "\u2660", "\u2666", "\u2663"}; // Kupa, Maça, Karo, Sinek
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] deck = new String[52];

        int index = 0 ;
        for(String suit : suits){
            for(String rank : ranks){
                deck[index] = suit + rank;
                index++;
            }
        }

        for(int i = deck.length-1;  i > 0 ; i--){
            int randomIndex = (int) (Math.random() * (i+1));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        for(int i = 0; i<4 ; i++){
            System.out.println("Kart: " + (i+1) + deck[i]);
        }

    }
}
