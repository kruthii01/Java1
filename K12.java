package pkg1; 
class TimeTable {
    int year;
    String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    int[] period = {1, 2, 3, 4, 5, 6, 7};
    String[] batch = {"4MW23CS", "4MW23CS", "4MW23CS", "4MW23CS"};
    String[][] subject = {
        {"OOPJ", "DS", "DD", "OS", "MATHS", "DSLAB"},
        {"OOPJLAB", "OOPJ", "OS", "DD", "MATHS", "DS"},
        {"OS", "DS", "OOPJ", "DD", "NSS", "MATHS"},
        {"DS", "OS", "DD", "OOPJ", "OS", "SE"},
        {"OSLAB", "DM", "CN", "DDLAB", "OOPJ", "NSS"},
        {"OS", "DS", "MATHS", "DD", "DSLAB", "OOPJ"}
    };
    String[][] faculty = {
        {"Kuthyar Sir", "Nagaraj sir", "Deepak Sir", "savitha madam", "Renita madam", "sahana madam"},
        {"Chaitra Madam", "Kuthyar Sir", "savitha madam", "Deepak Sir", "Renita madam", "Nagaraj sir"},
        {"savitha madam", "Nagraj sir", "Kuthyar Sir", "Deepak Sir", "Reshma madam", "Renita madam"},
        {"Nagaraj Sir", "Savitha madam", "Deepak sir", "Kuthyar Sir", "savitha madam", "Reshma madam"},
        {"Savitha madam", "savitha madam", "Deepak Sir", "Sowmya madam", "Kuthyar Sir", "Reshma madam"},
        {"savitha madam", "Nagaraj sir", "Renita madam", "Deepak Sir", "Sahana madam", "Kuthyar Sir"}
    };
    boolean isLab;
    String section;

    TimeTable(int y1, String s1) {
        this.year = y1;
        this.section = s1;
    }

    public void printTimeTable() {
        String heading = year + "-" + batch[year - 1];
        System.out.println("TimeTable of Year " + heading + " Section " + section);
        System.out.println("Day\tPeriod\tSubject\tFaculty");
        for (int i = 0; i < day.length; i++) {
            for (int j = 0; j < period.length; j++) {
                System.out.println(day[i] + "\t" + period[j] + "\t" + subject[i][j % subject[i].length] + "\t" + faculty[i][j % faculty[i].length]);
            }
            System.out.println(); // Empty line for better readability
        }
    }
}

public class K12 {
    public static void main(String[] args) {
        TimeTable tt2A = new TimeTable(2, "A");
        TimeTable tt2B = new TimeTable(2, "B");
        tt2A.printTimeTable();
        System.out.println("\n-----------------------------------------------\n");
        tt2B.printTimeTable();
    }
}