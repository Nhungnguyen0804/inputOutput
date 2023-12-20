
public class Main {
    public static void main(String[] args) {
        String path_read = "read.txt";
        String path_ghiDe = "ghiDeFile.txt";
        String path_ghiTiep = "ghiTiepFile.txt";


        String res = Utils.readContentFromFile(path_read);
        System.out.println(res);

        System.out.println("--------------------------------------");

        // xoa noi dung cu, ghi them noi dung moi
        Utils.writeContentToFile(path_ghiDe);
        System.out.println(Utils.readContentFromFile(path_ghiDe));

        System.out.println("--------------------------------------");

        // ghi tiep noi dung moi vao cuoi file

        Utils.writeAddContentToFile(path_ghiTiep);
        System.out.println(Utils.readContentFromFile(path_ghiTiep));
    }
}