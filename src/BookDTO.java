public class BookDTO {
        private Long id; // מזהה ספר
        private String title; // שם הספר
        private String author; // שם המחבר
        private String isbn; // מספר ספר
        private int year; // שנת פרסום
        private boolean available; // אם הספר זמין להשאלה

        // Constructors, getters, setters
        public BookDTO() {}

        public BookDTO(Long id, String title, String author, String isbn, int year, boolean available) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.year = year;
            this.available = available;
        }

        // Getters & Setters
    }

