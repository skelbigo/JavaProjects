public class MovieDataSeeder {
    public static void fillDatabase(MovieDatabase movieDatabase) {
        Movie m1 = new Movie("Гарі Поттер");
        Movie m2 = new Movie("Ілюзія обману");
        Movie m3 = new Movie("Маленькі жінки");

        Actor a1 = new Actor("Деніел Редкліфф");
        Actor a2 = new Actor("Eмма Вотсон");
        Actor a3 = new Actor("Сірша Ронан");
        Actor a4 = new Actor("Меган Фокс");

        m1.addActor(a1);
        m1.addActor(a2);
        m2.addActor(a1);
        m3.addActor(a2);
        m3.addActor(a3);

        movieDatabase.addActor(a1, a2, a3, a4);
        movieDatabase.addMovie(m1, m2, m3);
    }
}
