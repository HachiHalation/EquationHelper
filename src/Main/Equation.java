package Main;
import java.math.*;
import java.util.*;

public class Equation {

    /**
     * Takes in an arraylist of parameters and an arraylist of operations to perform
     */
    ArrayList<Object> parameters;
    ArrayList<Object> operations;

    public Equation(){

    }

    public void setParameters(ArrayList<Object> parameters1){
        parameters = new ArrayList<>(parameters1);
    }

    private void rearrange(){
        //figure out which parameter must be solved for
        //rearrange to isolate it
    }

    public ArrayList<Object> solve(){
        //solve and return parameters
        return parameters;
    }


}
