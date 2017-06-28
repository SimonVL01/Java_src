package JAV820;

import java.io.File;

/**
 * Created by simon on 28/06/17.
 */
public class Oefening1_2 {
    public static void main(String[] args) {
        File f = new File("/Users/simon/Desktop/Predictive_Analytics_by_Eric_Siegel_Excerpts.pdf");
        File fRenamed = new File("/Users/simon/Desktop/Predictive_Analytics_by_Eric_Siegel.pdf");
        f.renameTo(fRenamed);
    }
}
