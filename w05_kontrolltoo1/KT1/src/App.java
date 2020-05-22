import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class App{
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("src/text.txt"));
        
        int countA = 0;
        int countWord = 0;
        float avgWord = 0.0f;
        int r = 0;
        int countMax = 0;

        try{
            String line;
            while((line = reader.readLine()) != null){
                String [] lineContent = line.split(" ");
                countWord += lineContent.length;
                
                for (int i = 0; i < lineContent.length; i++){
                    for (Character character: lineContent[i].toCharArray()) {
                        if (character.equals('a') || character.equals('A')) {
                            r++;
                            countA++;
                        }
                    }
                    if(r > countMax){
                        countMax = r;
                    }
                    r = 0;
                }
            }

        } finally {
            reader.close();
        }
        
        int[] arr = new int[countMax + 1];
        for(int i = 0; i < countMax; i++){
            arr[i] = 0;
        }

        BufferedReader reader2 = new BufferedReader(new FileReader("src/text.txt"));
        try{
            String line;

            while((line = reader2.readLine()) != null){
                String [] lineContent = line.split(" ");
                for (int i = 0; i < lineContent.length; i++){
                    for (Character character: lineContent[i].toCharArray()) {
                        if (character.equals('a') || character.equals('A')) {
                            r++;
                        }
                    }
                    arr[r] += 1;
                    r = 0;
                }

            }

        } finally {
            reader2.close();
        }

        avgWord += (float)countA / (float)countWord;

        System.out.println();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("--Kontrolltöö nr.1 Ülesanne nr.1--");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("1. A- tähti tekstis kokku: " + countA + " tähte.");
        System.out.println();
        System.out.println("2. A- tähti keskmiselt ühes sõnas: " + avgWord + " tähte.");
        System.out.println();
        System.out.println("3. Loeb mitu mitme A-tähega sõnu on:");
        System.out.println();
        
        for(int i = 0; i < arr.length; i++){
            System.out.print("| " + i + " tähega ");
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++){
            System.out.print("| " + arr[i] + " sõna  ");
        }

        System.out.println();
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("--Programm lõpetab oma töö--");
        System.out.println("----------------------------");
        System.out.println();

    }
}