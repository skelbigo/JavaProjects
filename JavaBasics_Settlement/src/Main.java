public static void main(String[] args) {
    Settlement[] settlements = new Settlement[3];
    settlements[0] = new Settlement("Kyiv", "city", 2950000, 835.58);
    settlements[1] = new Settlement();
    settlements[1].setName("Podilsk");
    settlements[1].setType("city");
    settlements[1].setPopulation(40000);
    settlements[1].setArea(25.44);
    settlements[2] = new Settlement("Manevychi", "village", 11775, 4.41);
    Arrays.stream(settlements).forEach(System.out::println);
    Arrays.stream(settlements).map(s -> s.getName() + " has a density of: " + s.calculateDensity()).forEach(System.out::println);
    settlements[2].changePopulation();
    settlements[2].changePopulation(500);
    System.out.println(settlements[2]);
    Settlement.printTotalCount();

    Intersection[] cityIntersections = new Intersection[4];
    cityIntersections[0] = new Intersection("Khreshchatyk", "Institutska", 1500);
    cityIntersections[1] = new Intersection("Victory Avenue", "Chornovil", 2200);
    cityIntersections[2] = new UncontrolledIntersection("Garden", "Quiet", 400, false, 10);
    cityIntersections[3] = new UncontrolledIntersection("Kyiv", "Field", 1200, true, 5);

    settlements[0].setIntersections(cityIntersections);
    List<Intersection> intersectionsByStreet = settlements[0].findIntersectionsByStreet("Kyiv");
    System.out.println(intersectionsByStreet);

    Intersection moostBusyIntersection = settlements[0].getMostBusyIntersection();
    System.out.println(moostBusyIntersection);

    Intersection[] sortedIntersection = settlements[0].sortIntersectionsByDanger();
    System.out.println(Arrays.toString(sortedIntersection));
}