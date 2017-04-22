package proj.hackaton.problemtrackerapp.model.instances;

import java.util.Date;

/**
 * Created by sbt-markin-aa on 20.04.17.
 */

public class ProblemPhoto {
    public String getProblemPhotoName(){
        return "IMG_"+ String.valueOf(new Date().getTime())+".jpg";
    }
}
