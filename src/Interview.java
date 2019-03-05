public class Interview {
    public String name;
    public int time;
    public String result = "Journalist got new information for his article";

    private String place = "cafe";
    private String placeQuality = "12/10";
    private static String day = "25.04.2018";

    protected int journalistAge = 24;
    protected int personsAge = 40;

    String getPlace() {
        return place;
    }

    String getPlaceQuality() {
        return placeQuality;
    }

    int getJournalistAge() {
        return journalistAge;
    }

    int getPersonsAge() {
        return personsAge;
    }

    static String printStaticDay() {
        return day;
    }

    public String toString() {
        return  name;
    }

    String printDay() {
        return day;
    }

    public Interview (){}

    public Interview (String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Interview (String name) {
        this(name,0);
    }
    }
