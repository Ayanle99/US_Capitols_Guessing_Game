import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


// we extend/inherit Jframe, because we want to create a window,
// we implemennt Actionlistener because we want to handle the clicks when each state is clicked.
public class Quiz extends JFrame implements ActionListener {

    // this label shows how many questions you got right.
    static JLabel counterLabel = new JLabel("\tCorrect: ");
    // an int that goes up as we answer questions correctly
    static int counter = 0;


    // An arraylist that holds State objects, we can add as much States as we want
    static ArrayList<State> allStates = new ArrayList<>();

    // this is the main panel which will hold all the components in the window
    static JPanel mainPanel = new JPanel();
    // this panel will hold the individual states inside the array
    static JPanel stateContainer = new JPanel();
    // this a the question label which I initilize with 'What is the Capitol of Alabama?'
    static JLabel questionLabel = new JLabel("What is the Capitol of " +
            new State().getStateName().get(0) + "?");

    // here are all the state buttons in an array 50 of them
    static JButton[] states = new JButton[50];

    // here are the four choices that each state has
    static JButton choice1 = new JButton("Choice 1");
    static JButton choice2 = new JButton("Choice 2");
    static JButton choice3 = new JButton("Choice 3");
    static JButton choice4 = new JButton("Choice 4");

   // Here is scrollpane so that I ccan scroll the 50 states horizontally
    static JScrollPane scrollPane = new JScrollPane(stateContainer);

   // the Quiz constructor
    public Quiz(){

        // I set the main panel layout to null, because I want to 
        // to positionn components exactly where I want to.
        mainPanel.setLayout(null);


        // here I create my first state information, the question,
        // set the four options, and the correct answer at last.
      
        allStates.add(new State("What is the Capitol city of Alabama?",
                new State().getCapitolName().get(36),
                new State().getCapitolName().get(11),
                new State().getCapitolName().get(0),
                new State().getCapitolName().get(22),
                new State().getCapitolName().get(0)));

        // here I create my second state information, the question,
        // set the four options, and the correct answer at last.
      
        allStates.add(new State("What is the Capitol city of Alaska?",
                new State().getCapitolName().get(23),
                new State().getCapitolName().get(19),
                new State().getCapitolName().get(33),
                new State().getCapitolName().get(1),
                new State().getCapitolName().get(1)));

       // and so on...
        allStates.add(new State("What is the Capitol city of Arizona?",
                new State().getCapitolName().get(2),
                new State().getCapitolName().get(37),
                new State().getCapitolName().get(20),
                new State().getCapitolName().get(48),
                new State().getCapitolName().get(2)));

        allStates.add(new State("What is the Capitol city of Arkansas?",
                new State().getCapitolName().get(15),
                new State().getCapitolName().get(3),
                new State().getCapitolName().get(25),
                new State().getCapitolName().get(35),
                new State().getCapitolName().get(3)));

        allStates.add(new State("What is the Capitol city of California?",
                new State().getCapitolName().get(31),
                new State().getCapitolName().get(34),
                new State().getCapitolName().get(4),
                new State().getCapitolName().get(44),
                new State().getCapitolName().get(4)));


       // I created a for loop because I want to initilize all
      // 50 state buttonns. 
        for (int i = 0; i < states.length;i++){
          // when the loop runs, it will set title to the state name,
          // and we get the state name from the State class which has all the states in an arraylist.
            states[i] = new JButton(new State().getStateName().get(i));
          // this is important, add actionlistener to each button/state,
          // if you forget to add listener to the states, when you click a state nothing will happen.
            states[i].addActionListener(this);
            stateContainer.add(states[i]);
        }


       // here we set where the scrollpane will sit inside the mian panel
      // it will sit 10 pixels from left, 20 from top, 300 wide, and 60 high.
        scrollPane.setBounds(10, 20, 360, 60);

       // here we set where the questionLabel will sit inside the mian panel
       // it will sit 50 pixels from left, 105 ( because it will be underneeth the scrollpane)
      // from top, 300 wide, and 40 high.
        questionLabel.setBounds(50, 105, 300, 40);

        // I set the position similarly for the choices
       // you can play around the positioning as you like.
        choice1.setBounds(50, 160, 200, 40);
        choice2.setBounds(50, 200, 200, 40);
        choice3.setBounds(50, 240, 200, 40);
        choice4.setBounds(50, 280, 200, 40);

        // we set the postion for the counter label  
        counterLabel.setBounds(10,360, 300, 40);

        // and we add all the componennts to the main panel
        mainPanel.add(counterLabel);
        mainPanel.add(questionLabel);
        mainPanel.add(choice1);
        mainPanel.add(choice2);
        mainPanel.add(choice3);
        mainPanel.add(choice4);

      // we add scrollpane to the mainpanel
        mainPanel.add(scrollPane);
      // we add mainpanel to the frame itself, otherwise you will not see anything
        add(mainPanel);
       // setting the size of the window, 400 wide, 500 high
        setSize(400, 500);
      // setting what happens when you click the red x of your window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // setting visible for the frame, otherwise you see nothing
        setVisible(true);
    }

  // main method
    public static void main(String[] args) {

      // inititilizing the Quiz class and running it.
        new Quiz();
    }

  
  // the actionPerformed method which keep tracks on which button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        // get what state user cliccked
        String stateClicked = e.getActionCommand();

      // checking what the name of the state is
        switch (stateClicked){

            // if the name that the user is clicked is Alabama,
            // the inside code will execute, otherwise nothing will happen
            
            case "Alabama":
            
              // if the code reaches here, the user clicked Alabama so
            // the question and the choices has to change.
            // we set the questionlabel to the first element of allStates which contains all the 
            // intitialized states ( in our case we only made 5 state)
                questionLabel.setText(allStates.get(0).getQuestion());

            // the choice1 will contain the first state's first option
                choice1.setText(allStates.get(0).getOp1());
           // the choice2 will contain the second state's first option
                choice2.setText(allStates.get(0).getOp2());
           // the choice3 will contain the third state's first option
                choice3.setText(allStates.get(0).getOp3());
           // the choice4 will contain the forth state's first option
                choice4.setText(allStates.get(0).getOp4());


              // we have to check what the user clicked and compared that against Alabama's correct Answer/Capitol.
                choice1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                      // initilize the state of Alabama
                        State alabama = allStates.get(0);

                      // check if the alabama correct answer/capitol matches choice1's text/user choice
                      // if it is, add 1 to counter, and set choice1 to green
                        if (alabama.getAnswer().equals(choice1.getText())){

                            choice1.setBorderPainted(false);
                            choice1.setBackground(Color.GREEN);
                            choice1.setOpaque(true);

                            counter += 1;

                            counterLabel.setText("");
                            counterLabel.setText("\tCorrect: " + counter);

                        }


                    }
                });
            
            // the choice2 is teh same thing, check if choice2/user click matches Alabama's correct answer

                choice2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State alabama = allStates.get(0);

                        if (alabama.getAnswer().equals(choice2.getText())){

                            choice2.setBorderPainted(false);
                            choice2.setBackground(Color.GREEN);
                            choice2.setOpaque(true);

                            counter += 1;

                            counterLabel.setText("");
                            counterLabel.setText("\tCorrect: " + counter);


                        }
                    }
                });
            
             // and so on...

                choice3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State alabama = allStates.get(0);

                        if (alabama.getAnswer().equals(choice3.getText())){

                            choice3.setBorderPainted(false);
                            choice3.setBackground(Color.GREEN);
                            choice3.setOpaque(true);


                            counter += 1;

                            counterLabel.setText("");
                            counterLabel.setText("\tCorrect: " + counter);


                        }
                    }
                });

                choice4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State alabama = allStates.get(0);

                        if (alabama.getAnswer().equals(choice4.getText())){

                            choice4.setBorderPainted(false);
                            choice4.setBackground(Color.GREEN);
                            choice4.setOpaque(true);

                            counter += 1;

                            counterLabel.setText("");
                            counterLabel.setText("\tCorrect: " + counter);


                        }
                    }
                });

                refreshChoices();

                break;

            case "Alaska":

            // if user clicks the second state Alaska, we repeat the steps up
            // by checking the user's click against Alaska's correct answer/capitol,
            // if they match set button to green, else do nothinng.
                refreshChoices();

                questionLabel.setText(allStates.get(1).getQuestion());

                choice1.setText(allStates.get(1).getOp1());
                choice2.setText(allStates.get(1).getOp2());
                choice3.setText(allStates.get(1).getOp3());
                choice4.setText(allStates.get(1).getOp4());


                choice1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State alaska = allStates.get(1);

                        if (alaska.getAnswer().equals(choice1.getText())){

                            choice1.setBorderPainted(false);
                            choice1.setBackground(Color.GREEN);
                            choice1.setOpaque(true);

                            counter += 1;

                            counterLabel.setText("");
                            counterLabel.setText("\tCorrect: " + counter);


                        }


                    }
                });

                choice2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State alaska = allStates.get(1);

                        if (alaska.getAnswer().equals(choice2.getText())){

                            choice2.setBorderPainted(false);
                            choice2.setBackground(Color.GREEN);
                            choice2.setOpaque(true);

                            counter += 1;

                            counterLabel.setText("");
                            counterLabel.setText("\tCorrect: " + counter);


                        }


                    }
                });

                choice3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State alaska = allStates.get(1);

                        if (alaska.getAnswer().equals(choice3.getText())){

                            choice3.setBorderPainted(false);
                            choice3.setBackground(Color.GREEN);
                            choice3.setOpaque(true);

                            counter += 1;

                            counterLabel.setText("");
                            counterLabel.setText("\tCorrect: " + counter);


                        }


                    }
                });

                choice4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State alaska = allStates.get(1);

                        if (alaska.getAnswer().equals(choice4.getText())){

                            choice4.setBorderPainted(false);
                            choice4.setBackground(Color.GREEN);
                            choice4.setOpaque(true);

                            counter += 1;

                            counterLabel.setText("");
                            counterLabel.setText("\tCorrect: " + counter);


                        }


                    }
                });


                break;

            case "Arizona":

            // I call this refresh method because I want to remove the green background (if there is any)
            // from teh previous state/questiion. The steps are the same.
                refreshChoices();
                questionLabel.setText(allStates.get(2).getQuestion());

                choice1.setText(allStates.get(2).getOp1());
                choice2.setText(allStates.get(2).getOp2());
                choice3.setText(allStates.get(2).getOp3());
                choice4.setText(allStates.get(2).getOp4());


                choice1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State arizona = allStates.get(2);

                        if (arizona.getAnswer().equals(choice1.getText())){

                            choice1.setBorderPainted(false);
                            choice1.setBackground(Color.GREEN);
                            choice1.setOpaque(true);

                        }


                    }
                });


                choice2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State arizona = allStates.get(2);

                        if (arizona.getAnswer().equals(choice2.getText())){

                            choice2.setBorderPainted(false);
                            choice2.setBackground(Color.GREEN);
                            choice2.setOpaque(true);

                        }


                    }
                });

                choice3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State arizona = allStates.get(2);

                        if (arizona.getAnswer().equals(choice3.getText())){

                            choice3.setBorderPainted(false);
                            choice3.setBackground(Color.GREEN);
                            choice3.setOpaque(true);

                        }


                    }
                });

                choice4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State arizona = allStates.get(2);

                        if (arizona.getAnswer().equals(choice4.getText())){

                            choice4.setBorderPainted(false);
                            choice4.setBackground(Color.GREEN);
                            choice4.setOpaque(true);

                        }


                    }
                });

                break;

            case "Arkansas":

                refreshChoices();

                questionLabel.setText(allStates.get(3).getQuestion());

                choice1.setText(allStates.get(3).getOp1());
                choice2.setText(allStates.get(3).getOp2());
                choice3.setText(allStates.get(3).getOp3());
                choice4.setText(allStates.get(3).getOp4());


                choice1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State arkansas = allStates.get(3);

                        if (arkansas.getAnswer().equals(choice1.getText())){

                            choice1.setBorderPainted(false);
                            choice1.setBackground(Color.GREEN);
                            choice1.setOpaque(true);

                        }


                    }
                });


                choice2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State arkansas = allStates.get(3);

                        if (arkansas.getAnswer().equals(choice2.getText())){

                            choice2.setBorderPainted(false);
                            choice2.setBackground(Color.GREEN);
                            choice2.setOpaque(true);

                        }


                    }
                });

                choice3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State arkansas = allStates.get(3);

                        if (arkansas.getAnswer().equals(choice3.getText())){

                            choice3.setBorderPainted(false);
                            choice3.setBackground(Color.GREEN);
                            choice3.setOpaque(true);

                        }


                    }
                });

                choice4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State arkansas = allStates.get(3);

                        if (arkansas.getAnswer().equals(choice4.getText())){

                            choice4.setBorderPainted(false);
                            choice4.setBackground(Color.GREEN);
                            choice4.setOpaque(true);

                        }


                    }
                });

                break;

            case "California":

                refreshChoices();
                questionLabel.setText(allStates.get(4).getQuestion());

                choice1.setText(allStates.get(4).getOp1());
                choice2.setText(allStates.get(4).getOp2());
                choice3.setText(allStates.get(4).getOp3());
                choice4.setText(allStates.get(4).getOp4());


                choice1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State california = allStates.get(4);

                        if (california.getAnswer().equals(choice1.getText())){

                            choice1.setBorderPainted(false);
                            choice1.setBackground(Color.GREEN);
                            choice1.setOpaque(true);

                        }


                    }
                });

                choice2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State california = allStates.get(4);

                        if (california.getAnswer().equals(choice2.getText())){

                            choice2.setBorderPainted(false);
                            choice2.setBackground(Color.GREEN);
                            choice2.setOpaque(true);

                        }


                    }
                });


                choice3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State california = allStates.get(4);

                        if (california.getAnswer().equals(choice3.getText())){

                            choice3.setBorderPainted(false);
                            choice3.setBackground(Color.GREEN);
                            choice3.setOpaque(true);

                        }


                    }
                });

                choice4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        State california = allStates.get(4);

                        if (california.getAnswer().equals(choice4.getText())){

                            choice4.setBorderPainted(false);
                            choice4.setBackground(Color.GREEN);
                            choice4.setOpaque(true);

                        }


                    }
                });

                break;

        }
    }
  
  // in this method all we do is to refresh the 4 buttons/choices
  // background color, each time state name changes or user go to the next 
  // question the background of the buttons go back to its defaults.

    public static void refreshChoices(){


        choice1.setOpaque(true);
        choice1.setBorderPainted(true);

        choice2.setOpaque(true);
        choice2.setBorderPainted(true);

        choice3.setOpaque(true);
        choice3.setBorderPainted(true);

        choice4.setOpaque(true);
        choice4.setBorderPainted(true);


        choice1.setBackground(new JButton().getBackground());
        choice2.setBackground(new JButton().getBackground());
        choice3.setBackground(new JButton().getBackground());
        choice4.setBackground(new JButton().getBackground());




    }
}
