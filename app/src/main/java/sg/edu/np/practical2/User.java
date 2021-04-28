package sg.edu.np.practical2;

public class User {
    private String name;
    private String description;
    private int id;
    private boolean followed;
    private static int unique_id = 0;

    public User(String name, String description) {
        this.name = name;
        this.description = description;
        this.id = unique_id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

}
