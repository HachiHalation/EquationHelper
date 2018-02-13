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

    public Equation(String s){
        char[] temp = s.toCharArray();
        for(char c: temp){
            for(char op: validOperations){
                if(op == c) operations.add(c);
                else if(c != ' '){
                    Variable var = new Variable(c, null);
                    operations.add(var);
                }
            }
        }

    }

    public void setParameters(ArrayList<Variable> parameters1){
        for(Variable v: parameters1){
            for(Variable param: parameters){
                if(param.sameName(v)) param.setValue(v.value);
            }
        }
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
        private char name;
        private Double value;

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
