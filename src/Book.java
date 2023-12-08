public class Book extends Author {
        Author author ;
        int pageAmount;
        int published;
        String title;

        public Book( Author author, int pageAmount, int published, String title) {
            this.author = author;
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