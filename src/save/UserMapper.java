package save;

import Name.Cons;

public class UserMapper {
    public String map(Cons cons) {
        return String.format("%s,%s,%s,%s", cons.getName(), cons.getPrice());
    }

    public Cons map(String line) {
        String[] lines = line.split(",");
        return new Cons(lines[0], lines[1]);
    }
}