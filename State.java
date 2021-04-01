import java.util.ArrayList;

// creating a state class
public class State {

  // creating question, four options, and the answer of the question.
    private String question, op1, op2, op3,op4, answer;
   
  // an empty constructor
  public State(){}

  // constructor with arguments, this constructor takes question,
  // and four options/choices and an answer
    public State(String question, String op1, String op2, String op3, String op4, String answer) {
        this.question = question;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.answer = answer;
    }

  // below are the getters and setters of the question, four choices, and the answer
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

  // Here I ccould have created a Map with State and its capitols, but
  // I chose this instead. Two arraylists the first will contain states, and
  // the second capitol names.
    private ArrayList<String> states = new ArrayList<>();
    private ArrayList<String> capitols = new ArrayList<>();

  // this will return an arraylist containing all 50 state's capitol names
    public ArrayList<String> getCapitolName(){

        capitols.add("Montgomery");
        capitols.add("Juneau");
        capitols.add("Phoenix");
        capitols.add("Little Rock");
        capitols.add("Sacramento");
        capitols.add("Denver");
        capitols.add("Hartford");
        capitols.add("Dover");
        capitols.add("Tallahassee");
        capitols.add("Atlanta");

        capitols.add("Honolulu");
        capitols.add("Boise");
        capitols.add("Springfield");
        capitols.add("Indianapolis");
        capitols.add("Des Moines");
        capitols.add("Topeka");
        capitols.add("Frankfort");
        capitols.add("Baton Rouge");
        capitols.add("Augusta");
        capitols.add("Annapolis");

        capitols.add("Boston");
        capitols.add("Lansing");
        capitols.add("St. Paul");
        capitols.add("Jackson");
        capitols.add("Jefferson City");
        capitols.add("Helena");
        capitols.add("Lincoln");
        capitols.add("Carson City");
        capitols.add("Concord");
        capitols.add("Trenton");
        capitols.add("Santa Fe");

        capitols.add("Albany");
        capitols.add("Raleigh");
        capitols.add("Bismarck");
        capitols.add("Columbus");
        capitols.add("Oklahoma City");
        capitols.add("Salem");
        capitols.add("Harrisburg");
        capitols.add("Providence");
        capitols.add("Columbia");
        capitols.add("Pierre");
        capitols.add("Nashville");
        capitols.add("Austin");
        capitols.add("Salt Lake City");
        capitols.add("Montpelier");
        capitols.add("Richmond");
        capitols.add("Olympia");
        capitols.add("Charleston");
        capitols.add("Madison");
        capitols.add("Cheyenne");

        return capitols;

    }
  // this will return state names, this also returns an arraylist.

    public ArrayList<String> getStateName(){

        states.add("Alabama");
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");
        states.add("Delaware");
        states.add("Florida");
        states.add("Georgia");
        states.add("Hawaii");
        states.add("Idaho");
        states.add("Illinois");
        states.add("Indiana");
        states.add("Iowa");
        states.add("Kansas");
        states.add("Kentucky");
        states.add("Louisiana");
        states.add("Maine");
        states.add("Maryland");
        states.add("Massachusetts");
        states.add("Michigan");
        states.add("Minnesota");
        states.add("Mississippi");
        states.add("Missouri");
        states.add("Montana");
        states.add("Nebraska");
        states.add("Nevada");
        states.add("New Hampshire");
        states.add("New Jersey");
        states.add("New Mexico");
        states.add("New York");
        states.add("North Carolina");
        states.add("North Dakota");
        states.add("Ohio");
        states.add("Oklahoma");
        states.add("Oregon");
        states.add("Pennsylvania");
        states.add("Rhode Island");
        states.add("South Carolina");
        states.add("South Dakota");
        states.add("Tennessee");
        states.add("Texas");
        states.add("Utah");
        states.add("Vermont");
        states.add("Virginia");
        states.add("Washington");
        states.add("West Virginia");
        states.add("Wisconsin");
        states.add("Wyoming");


        return states;
    }
}
