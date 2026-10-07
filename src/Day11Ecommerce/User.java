package Day11Ecommerce;

class User {
    private String UserId;
    private String name;

    public User(String UserId, String name) {
        this.UserId = UserId;
        this.name = name;
    }

    public String getUserId() {
        return UserId;
    }

    public String getName() {
        return name;
    }

    public void login() {
        System.out.println("Login Successfully");
    }

    public void display_info() {
        System.out.println("User: " + UserId + " - " + name);

    }
}
