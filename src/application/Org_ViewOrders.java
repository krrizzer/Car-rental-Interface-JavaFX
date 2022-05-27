import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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

public class Org_ViewOrders extends Application {

	public void start(Stage ps) {

		BorderPane main = new BorderPane();
		main.setPadding(new Insets(20, 20, 20, 20));
		main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, new CornerRadii(0), new Insets(0))));

		Text title = new Text("View/Modify Orders");
		title.setFont(Font.font(30));
		main.setTop(title);

		ComboBox<String> cbo = new ComboBox<>();
		cbo.setPrefWidth(200);
		cbo.setValue("Order1");
		ObservableList<String> orders = FXCollections.observableArrayList("Order1", "Order2", "Order3", "Order4");
		cbo.getItems().addAll(orders);
		Label ordersL = new Label("Select Order: ", cbo);
		ordersL.setContentDisplay(ContentDisplay.RIGHT);

		TextField search = new TextField("Search by Order Number..");

		/*
		 * TextArea desc = new TextArea("Order1 Description......................");
		 * desc.setMaxHeight(150);
		 */
		TextField period = new TextField(""), location = new TextField(""), pay = new TextField(""),
				carNo = new TextField("");
		Label periodL = new Label("Period:"), locationL = new Label("Location:"),
				payL = new Label("Payment:"), carNoL = new Label("Car No:");
		periodL.setContentDisplay(ContentDisplay.RIGHT);
		periodL.setPrefWidth(50);
		locationL.setContentDisplay(ContentDisplay.RIGHT);
		locationL.setPrefWidth(50);
		payL.setContentDisplay(ContentDisplay.RIGHT);
		payL.setPrefWidth(50);
		carNoL.setContentDisplay(ContentDisplay.RIGHT);
		carNoL.setPrefWidth(50);
		
		HBox perLoc = new HBox(15);
		perLoc.getChildren().addAll(periodL, period, locationL, location);
		HBox payCar = new HBox(15);
		payCar.getChildren().addAll(payL, pay, carNoL, carNo);
		
		RadioButton in1 = new RadioButton("Insurance1 9 SR"),
				in2 = new RadioButton("Insurance2 19 SR"),
				in3 = new RadioButton("Insurance3 29 SR");
		ToggleGroup group3 = new ToggleGroup();
		in1.setToggleGroup(group3);
		in2.setToggleGroup(group3);
		in3.setToggleGroup(group3);
		
		HBox inBox = new HBox(15);
		inBox.getChildren().addAll(in1,in2,in3);
		Label inL = new Label("Insurance: ",inBox);
		inL.setContentDisplay(ContentDisplay.RIGHT);
		
		RadioButton notDel = new RadioButton("Not Delivered"),
				beingDel = new RadioButton("Being Delivered"),
				del = new RadioButton("Delivered");
		notDel.setSelected(true);
		ToggleGroup group = new ToggleGroup();
		notDel.setToggleGroup(group);
		beingDel.setToggleGroup(group);
		del.setToggleGroup(group);
		HBox status = new HBox(15);
		status.getChildren().addAll(notDel,beingDel,del);
		Label statusL = new Label("Status",status);
		statusL.setContentDisplay(ContentDisplay.RIGHT);
		
		
		Button modify = new Button("Modify Order"), cancel = new Button("Cancel Order"), add = new Button("Add New Order");
		HBox hBox = new HBox(15);
		hBox.getChildren().addAll(modify, cancel,add);

		//TextArea addText = new TextArea("Write new Order's informations here..");
		//desc.setMaxHeight(150);
		

		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 15, 15, 15));
		vBox.getChildren().addAll(search, ordersL, perLoc, payCar, inL,statusL, hBox);
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