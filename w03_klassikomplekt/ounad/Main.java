import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("jagasis.txt"));
        int AppleCount = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        List<Integer> Bascets = new ArrayList<>();

        while(line != null){
            Bascets.add(Integer.parseInt(line));
            line = reader.readLine();
        }
        reader.close();

        int Sum = 0;
        for(int n = 0; n < AppleCount; n++){
            Sum += Bascets.get(n);
        }

        int Half = Sum / 2;
        int Jagaja = 1;
        boolean solved = false;

        while(solved == false){
            int Half2 = 0;
            for(int n = 0; n < Jagaja; n++){
                Half2 += Bascets.get(n);
            }

            if(Half2 >= Half){
                if(Math.abs(Sum - 2* Half2) <= Math.abs(Sum - 2* Half2 - 2* Bascets.get(Jagaja))){
                    solved = true;
                }else{
                    Jagaja--;
                    solved = true;
                }
            }else{
                Jagaja++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("---Tere! Programm alustab oma tööd.---");
        System.out.println();
        System.out.println("Parim joone tõmbamise koht on " + Jagaja + "-da korvi järel.");
        BufferedWriter writer = new BufferedWriter(new FileWriter("jagaval.txt"));
        writer.write(Integer.toString(Jagaja));
        writer.close();
        System.out.println();
        System.out.println("---Programm on lõpetanud töö. Nägemist!---");
        System.out.println();
    }
}