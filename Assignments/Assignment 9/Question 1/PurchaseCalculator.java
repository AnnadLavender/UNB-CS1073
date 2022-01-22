/**
This is a driver program.
Ngoc Phuong Anh Nguyen 3712361
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

public class PurchaseCalculator extends Application
{
  private TextField unitPriceInput;
  private TextField quantityInput;
  private Text enter;
  private Text itemSubtotal;
  private Text itemTax;
  private Text itemTotal;
  private Text orderTotal;
  private Button calculate;
  private Button clear;
  private double tempOrderTotal = 0;

  public void start(Stage primaryStage)
  {
// Primary Stage Opening
    primaryStage.setTitle("Purchase Calculator");
// Labels
    Label unitPriceLabel = new Label("Unit Price:");
    Label quantityLabel = new Label("Quantity:");
// Text Fields
    unitPriceInput = new TextField();
    unitPriceInput.setPrefWidth(100);
    quantityInput = new TextField();
    quantityInput.setPrefWidth(100);
// Buttons
    calculate = new Button("Calculate");
    calculate.setOnAction(this::processButtonPress);
    clear = new Button("Clear");
    clear.setOnAction(this::processButtonPress);
// Texts
    enter = new Text("Enter the purchase information.");
    itemSubtotal = new Text("Subtotal for this Item:");
    itemTax = new Text("NB Sales Tax for this Item:");
    itemTotal = new Text("Total for this Item:");
    orderTotal = new Text("Order Total (All Items):");
// Flow Panes
    FlowPane mainPane = new FlowPane(unitPriceLabel,unitPriceInput, quantityLabel, quantityInput, calculate, clear, enter, itemSubtotal, itemTax, itemTotal, orderTotal);
    mainPane.setAlignment(Pos.CENTER);
    mainPane.setHgap(10);
    mainPane.setVgap(20);
// Scene
    Scene scene = new Scene(mainPane, 240,370);
// Primary Stage Ending
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void processButtonPress(ActionEvent event)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
// Input variables
    double unitPrice = Double.parseDouble(unitPriceInput.getText());
    double quantity = Double.parseDouble(quantityInput.getText());
// Output variables
    double tempSubtotal = unitPrice * quantity;
    double tempTax = tempSubtotal * 0.15;
    double tempItemTotal = tempSubtotal + tempTax;

    if(event.getSource()==calculate)
    {
      tempOrderTotal +=tempItemTotal;
      enter.setText("Purchase Cost Breakdown:");
      itemSubtotal.setText("Subtotal for this Item: " + formatter.format(tempSubtotal));
      itemTax.setText("NB Sales Tax for this Item:" + formatter.format(tempTax));
      itemTotal.setText("Total for this Item:" + formatter.format(tempItemTotal));
      orderTotal.setText("Order Total (All Items):" + formatter.format(tempOrderTotal));
    }
    else if(event.getSource()==clear)
    {
      tempOrderTotal = 0;
      enter.setText("Enter the purchase information.");
      itemSubtotal.setText("Subtotal for this Item:");
      itemTax.setText("NB Sales Tax for this Item:");
      itemTotal.setText("Total for this Item:");
      orderTotal.setText("Order Total (All Items):");
    }
  }
}
