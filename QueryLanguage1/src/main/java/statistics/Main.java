package statistics;

import statistics.matcher.*;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));
          
        Matcher m = new And( new HasAtLeast(10, "goals"),
                             new HasAtLeast(10, "assists"),
                             new PlaysIn("PHI")
        );
        
        Matcher m2 = new And( new Not(new HasFewerThan(10, "goals")),
                              new Not(new HasFewerThan(10, "assists")),
                              new PlaysIn("PHI")
        );
        
        for (Player player : stats.matches(m)) {
            System.out.println( player );
        }
        System.out.println();
        for (Player player : stats.matches(m2)) {
            System.out.println( player );
        }        
    }
}
