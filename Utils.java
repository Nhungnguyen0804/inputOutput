import java.io.*;

public class Utils {


    /**
     * cau a: doc file.
     */

    public static String readContentFromFile(String path) {
        String str = "";

        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = in.readLine()) != null) {
                str += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }

    /**
     * cau b: ghi file, xoa noi dung cu
     */

    public static void writeContentToFile(String path) {
        try (BufferedWriter wri = new BufferedWriter(new FileWriter(path))) {
            String str = "ghi de noi dung cua 1 xau vao file";
            wri.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * cau c: bo sung noi dung moi vao cuoi tep
     */

    public static void writeAddContentToFile(String path) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            String str = "Bo sung noi dung moi vao cuoi tep hien tai";
            writer.write(str);
        } catch (IOException e) {
                e.printStackTrace();
        }
    }




}
