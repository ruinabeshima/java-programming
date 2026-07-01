import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {

        // 入力ファイルを出力ファイルへコピーする / Copy the input file to the output file
        try {
            File file = new File(args[0]);     // 入力ファイルを指定する / Specify the input file
            Scanner sc = new Scanner(file);    // 入力ファイルを読み込む / Read the input file

            FileWriter fw = new FileWriter(args[1]);   // 出力ファイルを指定する / Specify the output file
            BufferedWriter bw = new BufferedWriter(fw);  // 出力を準備する / Prepare output
            PrintWriter pw = new PrintWriter(bw);       // ファイルへ書き込む / Write to the file

            while (sc.hasNextLine()) {
                String line = sc.nextLine();  // 1行読み込む / Read one line
                System.out.println(line);     // 画面に表示する / Display the line
                pw.println(line);             // ファイルに書き込む / Write the line to the file
            }

            sc.close();  // 入力ファイルを閉じる / Close the input file
            pw.close();  // 出力ファイルを閉じる / Close the output file
        }
        catch (Exception e) {
            e.printStackTrace();  // 例外の内容を表示する / Display the exception
            System.exit(1);       // プログラムを終了する / Exit the program
        }
    }
}
