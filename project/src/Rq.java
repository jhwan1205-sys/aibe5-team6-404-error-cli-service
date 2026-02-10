
public class Rq {
    private String command;
    private String actionPath;
    private int id;

    public Rq(String command) {
        this.command = command;
        String[] bits = command.split(" ");
        this.actionPath = bits[0]; // write, detail 등
        
        if (bits.length > 1) {
            this.id = Integer.parseInt(bits[1]); // 1
        }
    }
    // actionPath와 id를 꺼내 쓸 수 있는 Getter들...
}