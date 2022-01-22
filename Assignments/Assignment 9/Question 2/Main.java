/**
This is a driver program.
@author Ngoc Phuong Anh Nguyen 3712361
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;

import java.text.NumberFormat;

public class Main extends Application
{
  private TextField passengerNameInput;
  private TextField bagsNumberInput;
  private TextField drinksNumberInput;
  private Button economy;
  private Button firstClass;
  private Button reset;
  private Text groupNumber;
  private Text totalCost;
  public void start(Stage primaryStage)
  {
// Primary Stage Opening
    primaryStage.setTitle("Ticket Calculator");
// Labels
    Label passengerNameLabel = new Label("Passenger Name:");
    Label bagsNumberLabel = new Label("Number of Checked Bags");
    Label drinksNumberLabel = new Label("Number of In-flight Drinks:");
// Text Fields
    passengerNameInput = new TextField();
    passengerNameInput.setPrefWidth(140);
    bagsNumberInput = new TextField();
    bagsNumberInput.setPrefWidth(50);
    drinksNumberInput = new TextField();
    drinksNumberInput.setPrefWidth(50);
// Buttons
    economy = new Button("Economy");
    economy.setOnAction(this::processButtonPress);
    firstClass = new Button("First Class");
    firstClass.setOnAction(this::processButtonPress);
    reset = new Button("Reset");
    reset.setOnAction(this::processButtonPress);
// Texts
    groupNumber = new Text("Welcome to Flights R Us!");
    totalCost = new Text("Enter your ticket information.");
// Flow Panes
    FlowPane mainPane = new FlowPane(passengerNameLabel, passengerNameInput, bagsNumberLabel, bagsNumberInput, drinksNumberLabel, drinksNumberInput, economy, firstClass, reset, groupNumber, totalCost);
    mainPane.setAlignment(Pos.CENTER);
    mainPane.setHgap(10);
    mainPane.setVgap(20);
// Scenes
    Scene scene = new Scene(mainPane, 300,340);
// Primary Stage Ending
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void processButtonPress(ActionEvent event)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
// Input variables
    int bagsNo = Integer.parseInt(bagsNumberInput.getText());
    int drinksNo = Integer.parseInt(drinksNumberInput.getText());
    String passengerName = passengerNameInput.getText();
// Output variables

    // EconomyTicket objectE = new EconomyTicket()
    if(event.getSource() == economy)
    {
      EconomyTicket objectE = new EconomyTicket(passengerName, bagsNo, drinksNo);

      groupNumber.setText("Boarding group number: " + objectE.getGroupNumber());
      totalCost.setText("Total cost of flight: " + formatter.format(objectE.getTotalCost()));
    }
    else if(event.getSource() == firstClass)
    {
      FirstClassTicket objectF = new FirstClassTicket(passengerName, bagsNo, drinksNo);

      groupNumber.setText("Boarding group number: " + objectF.getGroupNumber());
      totalCost.setText("Total cost of flight: " + formatter.format(objectF.getTotalCost()));
    }
    else if(event.getSource() == reset)
    {
      groupNumber.setText("Welcome to Flights R Us!");
      totalCost.setText("Enter your ticket information.");
    }
  }
}
