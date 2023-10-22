package Controller;

import Name.Cons;
import save.Repository;


public class NameController {
    private final Repository repository;

    public NameController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(Cons cons) {
        repository.CreateUser(cons);
    }


}
