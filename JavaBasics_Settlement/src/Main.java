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
}