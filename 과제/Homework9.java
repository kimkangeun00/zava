import java.util.*;
import java.io.*;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        try {
            Scanner file = new Scanner(new File("db.txt"));

            while (file.hasNext()) {
                String id = file.next();
                String password = file.next();
                map.put(id, password);
            }

            file.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("db.txt 파일이 존재하지 않습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.print("password : ");
            String password = sc.nextLine().trim();

            if (!map.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

        sc.close();
    }
}