void main() {
    ArrayList<Motorcycle> motorcycles = new ArrayList<>();
    ArrayList<StreetLegal> streetLegal = new ArrayList<>();

    Dirtbike yamaha = new Dirtbike("Yamaha", "yz250", 90, 250, 1, "two stroke", 12);
    Cruiser harley = new Cruiser("Harley Davidson", "Dyna", 115, 1340, 2, 15, false, "a5l986");
    Sportbike gixxer = new Sportbike("Suzuki", "GSXR", 190, 1000, 2, 55, 10, "r91jn6");

    motorcycles.add(yamaha);
    motorcycles.add(gixxer);
    motorcycles.add(harley);

    streetLegal.add(gixxer);
    streetLegal.add(harley);

    System.out.println("Printing Ride Function");
    System.out.println("----------------------");

    for (Motorcycle m : motorcycles) {
        System.out.println(m.Ride());
    }


    System.out.println("Printing RideStreetLegal Function");
    System.out.println("----------------------");

    for (StreetLegal s : streetLegal) {
        System.out.println(s.RideStreetLegal());
    }
}