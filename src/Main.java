
//Opgave 1: Shopping cart
//Opgave:
//
//Erklær variable for prisen på tre varer (fx. 25.50, 15.00 og 30.00).
//Erklær en variable for subtotalen (summen af de tre varer).
//Erklær en variable for momsprocenten (fx. 25.0).
//Erklær en variable for den samlede pris inklusiv moms.
//Udskriv subtotalen og den samlede pris med moms
//
//    void main () {
//
//        double vare1 = 25.50;
//        double vare2 = 15.00;
//        double vare3 = 30.00;
//
//        int momsPct = 25;
//
//        double samletPris = vare1 + vare2 + vare3;
//        System.out.println(samletPris);
//
//        double prisMedMoms = samletPris + (samletPris * momsPct / 100.0);
//        System.out.println(prisMedMoms);
//    }

//Opgave 2: Split restaurant bill
//Opgave:
//
//Erklær variable for mad (fx. 450.0), drikkevarer (fx. 120.0), drikkepenge (fx. 50.0) og antal personer (fx. 4).
//Erklær en variable for den samlede regning.
//Erklær en variable for beløbet pr. person.
//Udskriv beløbet pr. person.
//
//int mad = 450;
//int drikkeVarer = 120;
//int drikkePenge = 50;
//int antalPersoner= 4;
//
//void main () {
//
//    int check = drikkePenge + drikkeVarer + mad;
//
//    int payPrPerson = check / antalPersoner;
//
//    System.out.println(payPrPerson);
//}

//Opgave 3: Discount calculation
//Opgave:
//
//Erklær en variable for den oprindelige pris (fx. 300.0).
//Erklær en variable for rabatprocenten (fx. 20.0) og beregn prisen efter rabat.
//Erklær en variable for momsprocenten (fx. 25.0) og beregn den endelige pris inklusiv moms.
//Udskriv den oprindelige pris, prisen efter rabat og den endelige pris.
//
//
//int ogPrice = 300;
//double rabat = 20.0;
//double tax = 25.0;
//
//
//void main () {
//
//    System.out.println(ogPrice);
//
//double priceRabat = ogPrice - (ogPrice * rabat / 100);
//    System.out.println(priceRabat);
//
//    double priceWithTax = priceRabat + (ogPrice *rabat/100);
//    System.out.println(priceWithTax);
//
//}
//
//opgave 4: Party planning
//Opgave:
//
//Du planlægger en fest. Erklær variable for antal gæster (fx. 15) og antal cupcakes (fx. 40).
//Erklær en variable for hvor mange cupcakes hver gæst får (brug division).
//Erklær en variable for hvor mange cupcakes der er til overs (brug modulo).
//Udskriv hvor mange cupcakes hver gæst får og hvor mange der er til overs.
//
//int guest = 15;
//int cakes = 40;
//int cakesPerPerson = cakes/guest;
//
//int cakesLeft = cakes % guest;
//
//void main () {
//
//    System.out.println("Each person gets " + cakesPerPerson + " cakes");
//    System.out.println(cakesLeft);
//}
//

//Opgave 5: Build greeting message
//Opgave: Opret en StringBuilder til at bygge en hilsen.
//Erklær variable for et navn (fx. "Anna") og en alder (fx. 25).
//Brug append-metoden til at tilføje tekst stykke for stykke: "Hello, ", navnet, "! ", "You are ", alderen og " years old."
//Udskriv den samlede tekst.
//
//String name = "Anna";
//int alder = 25;
//
//void main () {
//
//    StringBuilder sb = new StringBuilder ("Hello");
//    sb.append(" ");
//    sb.append(name);
//    sb.append("! ");
//    sb.append("You are ");
//    sb.append(alder);
//    sb.append(" years old");
//    System.out.println(sb.toString());
//
//}

//Opgave 6: Using +=
//Opgave:
//
//Erklær en variable for en score (fx. 100).
//Udskriv scoren.
//Læg 50 til scoren ved at bruge += operatoren og udskriv igen.
//Læg 25 til scoren og udskriv igen.
//
//int score = 100;
//
//void main () {
//
//    System.out.println(score);
//    score += 50;
//    System.out.println(score);
//    score += 25;
//    System.out.println(score);
//}

//Opgave 7: Using -=
//Opgave:
//
//Erklær en variable for liv/health (fx. 100).
//Træk 15 fra ved at bruge -= operatoren (spilleren tager skade) og udskriv.
//Træk 20 mere fra (mere skade) og udskriv igen.
//
//int health = 100;
//
//void main () {
//
//health -= 15;
//    System.out.println(health);
//    health -= 20;
//    System.out.println(health);
//}

//Opgave 8: Using *=
//Opgave:
//
//Erklær en variable for en pris (fx. 50.0).
//Udskriv prisen.
//Fordobl prisen ved at bruge *= operatoren og udskriv igen.
//
//double price = 50.0;
//
//void main () {
//    System.out.println(price);
//    price *= 2;
//    System.out.println(price);
//}

//Opgave 9: Increment og decrement med 1
//Opgave:
//
//Erklær en variable for en tæller (fx. 10).
//Udskriv tælleren.
//Brug ++ operatoren til at øge tælleren med 1 og udskriv igen.
//        Brug -- operatoren til at mindske tælleren med 1 og udskriv igen.

//int counter = 10;
//
//void main () {
//    System.out.println(counter);
//    counter ++;
//
//    System.out.println(counter);
//    counter --;
//
//    System.out.println(counter);
//
//}

//Opgave 10: All compound operators
//Opgave:
//
//Erklær en variable for et tal (fx. 10).
//Læg 5 til ved at bruge += og udskriv.
//Træk 3 fra ved at bruge -= og udskriv.
//Øg med 1 ved at bruge ++ og udskriv.
//Mindsk med 1 ved at bruge -- og udskriv.

//int variable = 10;
//
//void main () {
//    variable += 5;
//    System.out.println(variable);
//
//    variable -=3;
//    System.out.println(variable);
//
//    variable ++;
//    System.out.println(variable);
//
//    variable --;
//    System.out.println(variable);
//
//}


//Opgave 11: E-commerce product
//Scenario: Her ser du nogle værdier. De er hentet fra en webshop. Du skal give værdierne navne.
//
//Opgave: Erklær og initialiser variable med GODE navne til:
//
//String produktNavn = "Laptop";
//double priceProdukt = 7999.99;
//boolean anyLeft = true;
//int produktLeft = 15;
//double rabat = 10.00;
//String kategori ="Electronics";
//
//void main () {
//
//    System.out.println(produktNavn);
//    System.out.println(priceProdukt);
//    System.out.println(anyLeft);
//    System.out.println(produktLeft);
//    System.out.println(produktLeft);
//    System.out.println(rabat);
//    System.out.println(kategori);
//
//}
//
//String studentName = "Anna";
//int testResult = 85;
//int assignmentPoints = 92;
//double finalGrade = 88.5;
//boolean studentPass = true;
//
//void main () {
//    System.out.println(studentName);
//    System.out.println(testResult);
//    System.out.println(assignmentPoints);
//    System.out.println(finalGrade);
//    System.out.println(studentPass);
//}
//
//Opgave 13: Bookingsystem
//Scenario: Her ser du nogle værdier fra et hotels bookingsystem. Du skal give værdierne navne.
//Opgave: Erklær og initialiser variable med GODE navne til:
//
//String guestName = "Peter Hansen";
//int roomNumber = 204;
//int nightsStaying = 3;
//double pricePerNight = 899.00;
//boolean breakfeast = true;
//double totalPrice = 2697;
//
//
//void main () {
//    System.out.println(guestName);
//    System.out.println(roomNumber);
//    System.out.println(nightsStaying);
//    System.out.println(pricePerNight);
//    System.out.println(breakfeast);
//    System.out.println(totalPrice);
//
//}

//Opgave 14: Fitness-tracker
//Scenario: Her ser du nogle værdier fra en fitness-app, der registrerer daglig aktivitet. Du skal give værdierne navne.
//
//Opgave: Erklær og initialiser variable med GODE navne til:
//
//int stepsDay = 8527;
//int stepGoal = 10000;
//double kmTracker = 6.2;
//double caloriesBurned = 420;
//boolean goalReached = false;
//
//void main () {
//
//    System.out.println(stepsDay);
//    System.out.println(stepGoal);
//    System.out.println(kmTracker);
//    System.out.println(caloriesBurned);
//    System.out.println(goalReached);
//}
//
//Opgave 15: Bibliotekssystem
//Scenario: Her ser du beskrivelser af data fra et bibliotekssystem. Du skal finde på gode variabelnavne.
//
//Opgave: Erklær variable med PERFEKTE navne til at gemme:

String bookTitle = "?";
String author = "?";
String IBSN ="?";
int bookPages = 67;
boolean bookAvailable = false;
String currentRenter = "?";
String dueDate = "2026-1-1";
double bookFine = 420;
boolean bestSeller = false;
double bookRating = 0.2;

void main () {
    System.out.println(bookTitle);
    System.out.println(author);
    System.out.println(IBSN);
    System.out.println(bookPages);
    System.out.println(bookAvailable);
    System.out.println(currentRenter);
    System.out.println(dueDate);
    System.out.println(bookFine);
    System.out.println(bestSeller);
    System.out.println(bookRating);
}