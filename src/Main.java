void main() {
    ArrayList<Motorcycle> party = new ArrayList<>();
    Dirtbike yamaha = new Dirtbike("Yamaha", "yz250", 90, 250, 1, "two stroke", 12);
    Cruiser harley = new Cruiser("Harley Davidson", "Dyna", 115, 1340, 2, 15, false, "a5l986");
    Sportbike gixxer = new Sportbike("Suzuki", "GSXR", 190, 1000, 2, 55, 10, "r91jn6");

    party.add(yamaha);
    party.add(gixxer);
    party.add(harley);

    for (Motorcycle m : party) {
        System.out.println(m.Ride());
    }
}