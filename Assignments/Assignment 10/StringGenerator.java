/**This is a String generator program
@uthor Ngoc Phuong Anh Nguyen 3712361*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

import java.util.Scanner;

public class StringGenerator extends Application
{
  private TextField phraseInput;
  private Button acronymButton;
  private Button passwordButton;
  private Button resetButton;
  private Text output;

  public void start(Stage primaryStage)
  {
    // Primary Stage Opening
    primaryStage.setTitle("String Generator");
    // Labels
    Label input = new Label("Enter a title or phrase:");
    // Text Fields
    phraseInput = new TextField();
    phraseInput.setPrefWidth(420);
    // Buttons
    acronymButton = new Button("Generate Acronym");
    acronymButton.setOnAction(this::processButtonPress);
    passwordButton = new Button("Generate Password");
    passwordButton.setOnAction(this::processButtonPress);
    resetButton = new Button("Reset");
    resetButton.setOnAction(this::processButtonPress);
    // Texts
    output = new Text("Let's create an acronym or password!");
    // Flow Panes
    FlowPane pane = new FlowPane(input, phraseInput, acronymButton, passwordButton, resetButton,output);
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(30);
    pane.setVgap(20);
    // Scenes
    Scene scene = new Scene(pane, 450,250);
    // Primary Stage Ending
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void processButtonPress(ActionEvent event)
  {
    // Input variable
    String phrase = phraseInput.getText();
    // Output
    if(event.getSource()==acronymButton)
    {
      output.setText(generateAcronym(phrase));
    }
    else if(event.getSource()==passwordButton)
    {
      output.setText(generatePassword(phrase));
    }
    else if(event.getSource()==resetButton)
    {
      output.setText("Let's create an acronym or password!");
    }
  }

  public static String generateAcronym(String text)
  {
    Scanner tokenizer = new Scanner (text);
          char ch;
          String result = "";

          while (tokenizer.hasNext()) {
              ch = tokenizer.next().charAt(0);

              if (Character.isUpperCase(ch)) {
                  result= result + ch;
              }
          }
          return result;
  }

  public static String generatePassword(String text)
  {
    String password="";
    String letter="";
    Scanner tokenizer = new Scanner(text);
    int count = 0;
    while(tokenizer.hasNext())
    {
      String temp = tokenizer.next();
      if(temp.length()>=3)
      {
        if(count%2==1)
        {
          for(int i=0;i<2;i++)
          {
            letter = "" + temp.charAt(i);
            password += letter.toUpperCase();
          }
        }
        else if(count%2==0)
        {
          for(int i=temp.length()-2;i<temp.length();i++)
          {
            letter = "" + temp.charAt(i);
            password += letter.toLowerCase();
          }
        }
        count++;
      }
    }

    password=password.replace('B','3');
    password=password.replace('l','!');
    password=password.replace('H','#');
    password=password.replace('t','+');
    return password;
  }
}
