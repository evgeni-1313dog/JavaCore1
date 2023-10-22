package save;

import Name.Cons;

import java.util.ArrayList;
import java.util.List;

public class File implements Repository {
    private UserMapper mapper = new UserMapper();
    private FileOperation fileOperation;



    public void File(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Cons> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<Cons> name = new ArrayList<>();
        for (String line : lines) {
            name.add(mapper.map(line));
        }
        return name;
    }

    @Override
    public String CreateUser(Cons cons) {

        List<Cons> name = getAllUsers();
        int max = 0;
        for (Cons item : name) {
            int id = Integer.parseInt(item.getPrice());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);

        name.add(cons);
        saveAllName(name);
        return id;
    }



    private void saveAllName(List<Cons> name){
        List<String> lines = new ArrayList<>();
        for (Cons item: name) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);

    }

}
