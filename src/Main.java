import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.reverse;
import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        List<String> li = new ArrayList<>();

        try {
            try(DataOutputStream data = new DataOutputStream(new FileOutputStream(name));){
                data.writeUTF("jew");
                data.writeUTF("as");
                data.writeUTF("fd");
                data.writeUTF("lwo");
                data.writeUTF("bfd");
                data.writeUTF("httrt");
                data.writeUTF("oo");
                data.writeUTF("mkf");
            }
            try (DataInputStream data = new DataInputStream(new FileInputStream(name));){
                String n = "";
                char c;
                while (true) {

                    li.add(data.readUTF());

                }

            }
            catch (EOFException e1){
                System.out.println("all words are passed");
            }
            catch (IOException e2){

            }
        }
        catch (Exception e){

        }
        sort(li);
        reverse(li);
        System.out.println(li);

    }
}