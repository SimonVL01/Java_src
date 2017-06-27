package java24hours;

import java.util.*;
import javax.jws.*;

@WebService(endpointInterface = "com.java24hours.SquareRootServer")

public class SquareRootImpl implements SquareRootServer {
        public double getSquareRoot(double input) {
            return Math.sqrt(input);
        }

        public String getTime() {
            Date now = new Date();
            return now.toString();
        }
}
