public class UserDTO {
    private Long id; // מזהה משתמש
    private String name; // שם מלא
    private String email; // דואר אלקטרוני
    private String membershipDate; // תאריך הצטרפות

    // Constructors, getters, setters
    public UserDTO() {}

    public UserDTO(Long id, String name, String email, String membershipDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.membershipDate = membershipDate;
    }
    public UserDTO(Long id,String membershipDate) {
        this.id = id;
        this.membershipDate = membershipDate;
    }

    // Getters & Setters
}

