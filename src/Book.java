public class Book {
        Author author ;
        int pageAmount;
        int published;
        String title;

        public Book( String author , int pageAmount, int published, String title) {
            this.pageAmount = pageAmount;
            this.published = published;
            this.title = title;
        }
        public int getPageAmount() {
            return this.pageAmount;
        }
        public int getPublished() {
            return published;
        }

        public void setPublished(int published) {
            this.published = published;

        }
        public String getTitle() {
            return title;
        }
    }
