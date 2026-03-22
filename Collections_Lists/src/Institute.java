import java.util.ArrayList;
import java.util.List;

public class Institute {
    String nameInstitute;
    List<Faculty> faculties;

    public Institute(String nameInstitute, List<Faculty> faculties) {
        this.nameInstitute = nameInstitute;
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
