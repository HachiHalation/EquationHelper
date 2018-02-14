package Main;
import java.math.*;
import java.util.*;

public class Equation {

    /**
     * Takes in an arraylist of parameters and an arraylist of operations to perform
     */
    private ArrayList<Variable> parameters;
    private ArrayList<Object> operations;
    private char[] validOperations = {};

    /**
     * Breaks a string up into operators and paramaters and creates equation object
     * @param s String representing an equation
     */
    public Equation(String s){
        //convert string to char array
        char[] temp = s.toCharArray();
        //for every character in the string
        for(char c: temp){
            //check if valid operator or a constant
            for(char op: validOperations){
                //if it is add it to list of operations
                if(op == c || op < 10) operations.add(c);
                //if not and its not extra space, it is a variable, add to parameters as well
                else if(c != ' '){
                    Variable var = new Variable(c, null);
                    operations.add(var);
                }
            }
        }

    }

    /**
     * Sets parameters in this equation to new values.
     * @param parameters1 An array list of variable objects
     * @return Returns true if all parameters set successfully. False if input matches this equation's parameters.
     */
    public boolean setParameters(ArrayList<Variable> parameters1){
        boolean check = false;
        //check both lists for the Variable of the same name and set its value to the one given
        for(Variable v: parameters1){
            for(Variable param: parameters){
                if(param.sameName(v)){
                    param.setValue(v.value);
                    check = true; //if same name found, keep going
                }
            }
            if(!check) return false; //if same name not found stop and report mismatch
            check = false; //reset
        }

        return check;
    }

    private void rearrange(){
        //figure out which parameter must be solved for
        //rearrange to isolate it
    }

    public ArrayList<Variable> solve(){
        //solve and return parameters
        return parameters;
    }

    public class Variable{
        private char name; //name of variable
        private Double value; //value of variable

        public Variable(char name, Double value){
            this.name = name;
            this.value = value;
        }

        public void setValue(Double d){
            value = d;
        }

        public boolean sameName(Variable other){
            if(other.name == name) return true;
            else return false;
        }

        public String toString(){
            return name + ": " + value;
        }

    }

}
