package study;



import java.util.Date;


public class BoardDto {

    private String name;
    private int price;
    private Date date;

    // @NoArgsConstructor
    public BoardDto() {
    }

    // @AllArgsConstructor
    public BoardDto(String name, int price, Date date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "BoardDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public static BoardDtoBuilder builder() {
        return new BoardDtoBuilder();
    }

    // 이너 클래스
    public static class BoardDtoBuilder {


        private String name;
        private int price;
        private Date date;

        public BoardDtoBuilder name(String name) {
            this.name = name;
            return this;
        }
        public BoardDtoBuilder price(int price) {
            this.price = price;
            return this;
        }
        public BoardDtoBuilder date(Date date) {
            this.date = date;
            return this;
        }

        public BoardDto build() {
            BoardDto boardDto = new BoardDto(this.name, this.price, this.date);
            return boardDto;
        }


    }

}
