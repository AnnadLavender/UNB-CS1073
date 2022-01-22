/**
This is a driver program.
@author Ngoc Phuong Anh Nguyen 3712361
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

public class Driver extends Application
{
  private TextField firstField;
  private TextField secondField;
  private Button check;
  private Text output;

  Anagrams anagram = new Anagrams();

  public void start(Stage primaryStage)
  {
    // Labels
    Label firstLabel = new Label("First Word: ");
    Label secondLabel = new Label("Second Word:");
    // Text Fields
    firstField = new TextField();
    firstField.setPrefWidth(140);
    secondField = new TextField();
    secondField.setPrefWidth(140);
    // Button
    check = new Button("Are these Anagrams?");
    check.setOnAction(this::processButtonPress);
    // Text
    output = new Text("Let's test some possible anagrams!");
    // Flow Panes
    FlowPane pane = new FlowPane(firstLabel, firstField, secondLabel, secondField, check, output);
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(30);
    pane.setVgap(30);

    Scene scene = new Scene(pane, 350, 320);

    primaryStage.setTitle("Anagram Tester");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void processButtonPress(ActionEvent event)
  {
    String string1 = firstField.getText();
    String string2 = secondField.getText();
    if(anagram.checkAnagram(string1,string2)==true)
    {
      output.setText(string2 + " is an anagram of " + string1);
    }
    else
    {
      output.setText(string2 + " is not an anagram of " + string1);
    }
  }
}
