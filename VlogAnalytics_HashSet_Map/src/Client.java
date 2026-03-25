import java.util.function.ToLongBiFunction;

public class Client {
    public static void main(String[] args) {
        Videoblog videoblog =new Videoblog("Льоша");
        Video video = new Video("П'ю каву", "url1", 3629, 32, 5092);
        Video video1 = new Video("Граю в гта", "url2", 9579, 10539, 12764);

        video.getComments().add(new Comment("Лох", 5467, 12));

        videoblog.addVideo(video, video1);

        System.out.println("Загальна кількість переглядів: " + new TotalViewsStrategy().execute(videoblog.getVideos()));
        Comment popularComment = new PopularCommentStrategy().execute(videoblog.getVideos());
        System.out.println(popularComment != null ? "Коментар, який набрав більше лайків, ніж відео: " + popularComment
                : "Не існує коментаря, який набрав більше лайків, ніж відео");
        System.out.println("Відео з найбільшою кількістю дізлайків: " + new MostDislikedVideoStrategy().execute(videoblog.getVideos()));
    }
}
