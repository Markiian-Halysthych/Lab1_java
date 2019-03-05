public class Main {

    public static void main(String[] args){
        Interview date = new Interview();
        System.out.println("Date of interview: " + date.printStaticDay());
        System.out.println(date.printDay());
        System.out.println();

        Interview journalist = new Interview("Ivan",3);
        System.out.println("Journalist`s name: " + journalist.name);
        System.out.println("Journalist`s age: " + journalist.getJournalistAge());
        System.out.print("Interview time: " + journalist.time + " hours");
        System.out.println();
        System.out.println("Result of interview: " + journalist.result);

        Interview person = new Interview("Pedro");
        System.out.println();
        System.out.println("Person`s name: " + person.name);
        System.out.println("Person`s age: " + person.getPersonsAge());

        Interview location = new Interview();
        System.out.println();
        System.out.println("Interview location: " + location.getPlace());
        System.out.println("Service quality: " + location.getPlaceQuality());

    }
}