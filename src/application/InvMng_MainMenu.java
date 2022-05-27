package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InvMng_MainMenu extends Application {

	public void start(Stage ps) {

		BorderPane main = new BorderPane();
		main.setPadding(new Insets(20,20,20,20));
		main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
		
		Text title = new Text("Inventory Manager");
		title.setFont(Font.font(30));
		main.setTop(title);
		
		
		ComboBox<String> cbo = new ComboBox<>();
		cbo.setPrefWidth(200);
		cbo.setValue("Car1");
		ObservableList<String> cars = FXCollections.observableArrayList("Car1","Car2","Car3","Car4");
		cbo.getItems().addAll(cars);
		Label carsL = new Label("Select Car: ",cbo);
		carsL.setContentDisplay(ContentDisplay.RIGHT);
		
		TextField search = new TextField("Search..");
		
		/*RadioButton name = new RadioButton("Car Name"),
				number = new RadioButton("Car Number");
		name.setSelected(true);
		ToggleGroup group = new ToggleGroup();
		name.setToggleGroup(group);
		number.setToggleGroup(group);
		
		HBox options = new HBox(15);
		options.getChildren().addAll(name,number);
		Label optionsL = new Label("Search By: ",options);
		optionsL.setContentDisplay(ContentDisplay.RIGHT);
		
		
		TextArea desc = new TextArea("Car1 Description......................");
		desc.setMaxHeight(150);
		*/
		
		TextField carName = new TextField(""), carModel = new TextField(""), carColor = new TextField(""),
				seat = new TextField(""), carNo = new TextField(""), price = new TextField(""); 
		Label carNameL = new Label("Car Name:"), carModelL = new Label("Model:"),
				carColorL = new Label("Color:"), seatL = new Label("seats:"), carNoL = new Label("Car Number:"), priceL = new Label("Price:");
		carNameL.setPrefWidth(70);
		carModelL.setPrefWidth(70);
		carColorL.setPrefWidth(70);
		seatL.setPrefWidth(70);
		carNoL.setPrefWidth(70);
		priceL.setPrefWidth(70);
		
		HBox r1 = new HBox(15),r2 = new HBox(15),r3 = new HBox(15);
		r1.getChildren().addAll(carNameL, carName,carModelL,carModel);
		r2.getChildren().addAll(carColorL,carColor,seatL,seat);
		r3.getChildren().addAll(carNoL,carNo,priceL,price);
		
		Button remove = new Button("Remove Car");
		Button add = new Button("Add New Car");
		HBox btns = new HBox(15);
		btns.getChildren().addAll(add,remove);
		
		ComboBox<String> cbo2 = new ComboBox<>();
		cbo2.setPrefWidth(200);
		cbo2.setValue("Location1");
		ObservableList<String> locations = FXCollections.observableArrayList("Location1","Location2","Location3","Location4");
		cbo2.getItems().addAll(locations);
		Label locationL = new Label("Location: ",cbo2);
		locationL.setContentDisplay(ContentDisplay.RIGHT);
		
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15,15,15,15));
		vBox.getChildren().addAll(search,carsL,locationL,r1,r2,r3,btns);
		main.setCenter(vBox);
		
		
		
		Scene s = new Scene(main, 600, 400);
		ps.setTitle("");
		ps.setScene(s);
		ps.show();
		
	}

	public static void main(String[] args) {
		launch(args);

	}
}