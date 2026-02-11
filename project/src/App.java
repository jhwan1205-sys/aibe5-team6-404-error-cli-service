import java.util.*;

public class App {
    private Scanner sc = new Scanner(System.in);
    private List<Article> articles = new ArrayList<>(); // 이게 바로 DB입니다!
    private int lastId = 0;

    public void run() {
        System.out.println("== 자바 텍스트 게시판 시작 ==");
        while (true) {
            System.out.print("명령어: ");
            String command = sc.nextLine().trim();
            Rq rq = new Rq(command);
            
            /*
            if (rq.getActionPath().equals("exit")) break;
            
            else if (rq.getActionPath().equals("write")) {
                doWrite();
            } else if (rq.getActionPath().equals("list")) {
                doList();
            }
            */
            //test

            //test
            // detail, update, delete 로직 추가...
        }
    }

    private void doWrite() {
        lastId++;
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("내용: ");
        String body = sc.nextLine();
        
        // 현재 날짜는 직접 구하거나 임시로 작성
        Article article = new Article(lastId, title, body, "2026-02-10");
        articles.add(article); // List에 저장 (INSERT 효과)
        System.out.printf("%d번 게시글이 등록되었습니다.\n", lastId);
    }
}