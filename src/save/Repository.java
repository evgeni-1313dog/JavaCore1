package save;
import Name.Cons;

import java.util.List;

public interface Repository {
    List<Cons> getAllUsers();
    String CreateUser(Cons cons);


}