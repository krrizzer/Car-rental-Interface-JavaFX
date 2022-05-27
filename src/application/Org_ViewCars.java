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
import javafx.scene.control.TextArea;
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

public class Org_ViewCars extends Application {

	public void start(Stage ps) {

		BorderPane main = new BorderPane();
		main.setPadding(new Insets(20,20,20,20));
		main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
		
		Text title = new Text("View Cars Information / Modify Prices");
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
		*/
		RadioButton lToH = new RadioButton("Price: Low To High"),
				hToL = new RadioButton("Price: High To Low"),
				color = new RadioButton("Color"),
				model = new RadioButton("Model"),
				size = new RadioButton("size");
				
		ToggleGroup group2 = new ToggleGroup();
		lToH.setToggleGroup(group2);
		hToL.setToggleGroup(group2);
		color.setToggleGroup(group2);
		model.setToggleGroup(group2);
		size.setToggleGroup(group2);
		
		HBox sort = new HBox(15);
		sort.getChildren().addAll(lToH,hToL,color,model,size);
		Label sortL = new Label("Sort By: ",sort);
		sortL.setContentDisplay(ContentDisplay.RIGHT);
		
		TextArea desc = new TextArea("Car1 Description......................");
		desc.setMaxHeight(150);
		
		TextField price = new TextField();
		Label priceL = new Label("Price:",price);
		priceL.setContentDisplay(ContentDisplay.RIGHT);
		Button modify = new Button("Modify Price");
		
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15,15,15,15));
		vBox.getChildren().addAll(/*optionsL,*/search,carsL,sortL,desc,priceL,modify);
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