import java.io.FileWriter;

ArrayList<Motorcycle> motorcycles = new ArrayList<>();
ArrayList<StreetLegal> streetLegal = new ArrayList<>();

void main() {


    Dirtbike yamaha = new Dirtbike("Kawasaki", "kx450", 90, 450, 1, "four stroke", 14);
    Cruiser harley = new Cruiser("Harley Davidson", "Nightster", 115, 975, 2, 0, false, "7fn127");
    Sportbike gixxer = new Sportbike("Yamaha", "R1", 190, 1000, 2, 60, 5, "f9a2fg");

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

    System.out.println("----------------------");
    System.out.println("Save file will be saved here: " + System.getProperty("user.dir"));

    try {
        FileWriter fw = new FileWriter("save.txt");
        for (Motorcycle m : motorcycles) {
            fw.write(m.toCSV() + "\n");
        }
        fw.close();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }

    ReadFile();
    System.out.println("----------------------");
    System.out.println("Read SaveFile and created new objects");
    System.out.println("(Will Print Duplicate Objects)");
    System.out.println("----------------------");
    for (Motorcycle m : motorcycles) {
        System.out.println(m.Ride());
    }
}

void ReadFile() {
    try {
        Scanner fileScanner = new Scanner(new File("save.txt"));
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();

            String[] split = line.split(",");

            String type = split[0];
            String make = split[1];
            String model = split[2];
            int topSpeed = Integer.parseInt(split[3]);
            int engineDisplacement = Integer.parseInt(split[4]);
            int passengerCapacity = Integer.parseInt(split[5]);

            if (type.equals("Dirtbike")) {
                String engineType = split[6];
                int suspensionTravel = Integer.parseInt(split[7]);

                motorcycles.add(new Dirtbike(make, model, topSpeed, engineDisplacement,passengerCapacity, engineType, suspensionTravel));
            } else if (type.equals("Sportbike")) {
                int maxLeanAngle =  Integer.parseInt(split[6]);
                int tractionControlLevel = Integer.parseInt(split[7]);
                String licensePlate = split[8];

                motorcycles.add(new Sportbike(make, model, topSpeed, engineDisplacement, passengerCapacity, maxLeanAngle, tractionControlLevel, licensePlate));
            } else if (type.equals("Cruiser")) {
                int saddlebagCapactity = Integer.parseInt(split[6]);
                boolean hasPassengerBackrest =  Boolean.parseBoolean(split[7]);
                String licensePlate =  split[8];

                motorcycles.add(new Cruiser(make, model, topSpeed, engineDisplacement, passengerCapacity, saddlebagCapactity, hasPassengerBackrest, licensePlate));
            }
        }
        fileScanner.close();
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
}