public static void main(String[] args) {
    Settlement[] settlements = {
            new Settlement("Kyiv", "city", 2950000, 835.58),
            new Settlement("Podilsk", "city", 40000, 25.44),
            new Settlement("Manevychi", "village", 11775, 4.41)
    };

    Arrays.stream(settlements).forEach(s -> {
        System.out.println(s);
        System.out.println(s.getName() + " has a density of: " + s.calculateDensity());
    });

    settlements[2].changePopulation();
    settlements[2].changePopulation(500);
    System.out.println(settlements[2]);
    Settlement.printTotalCount();

    Intersection[] cityIntersections = {
            new Intersection("Khreshchatyk", "Institutska", 1500),
            new Intersection("Victory Avenue", "Chornovil", 2200),
            new UncontrolledIntersection("Garden", "Quiet", 400, false, 10),
            new UncontrolledIntersection("Kyiv", "Field", 1200, true, 5)
    };

    settlements[0].setIntersections(cityIntersections);
    System.out.println(settlements[0].findIntersectionsByStreet("Kyiv"));
    System.out.println(settlements[0].getMostBusyIntersection());
    System.out.println(Arrays.toString(settlements[0].sortIntersectionsByDanger()));
}