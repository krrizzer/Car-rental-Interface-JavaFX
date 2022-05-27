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

public class Mainten_MainMenu extends Application {

	public void start(Stage ps) {

		BorderPane main = new BorderPane();
		main.setPadding(new Insets(20, 20, 20, 20));
		main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, new CornerRadii(0), new Insets(0))));

		Text title = new Text("Maintenance Team");
		title.setFont(Font.font(30));
		main.setTop(title);
		
		
		ComboBox<String> cbo = new ComboBox<>();
		cbo.setPrefWidth(110);
		cbo.setValue("Notfication1");
		ObservableList<String> notfications = FXCollections.observableArrayList("Notfication1", "Notfication2", "Notfication3", "Notfication4");
		cbo.getItems().addAll(notfications);
		Label notficationsL = new Label("Periodic Maintenance: ", cbo);
		notficationsL.setContentDisplay(ContentDisplay.RIGHT);

		TextArea notficationDesc = new TextArea("notfication1 Description......................");
		notficationDesc.setMaxHeight(150);

		Button edit = new Button("Update Status");
		
		RadioButton notFixed = new RadioButton("Not Fixed"),
				beingFixed = new RadioButton("Being Fixed"),
				fixed = new RadioButton("Fixed");
		notFixed.setSelected(true);
		ToggleGroup group = new ToggleGroup();
		notFixed.setToggleGroup(group);
		beingFixed.setToggleGroup(group);
		fixed.setToggleGroup(group);
		HBox status = new HBox(15);
		status.getChildren().addAll(notFixed,beingFixed,fixed);
		Label statusL = new Label("",status);
		statusL.setContentDisplay(ContentDisplay.RIGHT);

		
		ComboBox<String> cbo2 = new ComboBox<>();
		cbo2.setPrefWidth(110);
		cbo2.setValue("Notfication5");
		ObservableList<String> notfications2 = FXCollections.observableArrayList("Notfication5", "Notfication6", "Notfication7", "Notfication8");
		cbo2.getItems().addAll(notfications2);
		Label notfication2L = new Label("Accedint Maintenance: ", cbo2);
		notfication2L.setContentDisplay(ContentDisplay.RIGHT);

		TextArea notfication2Desc = new TextArea("notfication5 Description......................");
		notfication2Desc.setMaxHeight(150);

		Button edit2 = new Button("Update Status");
		

		RadioButton notFixed2 = new RadioButton("Not Fixed"),
				beingFixed2 = new RadioButton("Being Fixed"),
				fixed2 = new RadioButton("Fixed");
		notFixed2.setSelected(true);
		ToggleGroup group2 = new ToggleGroup();
		notFixed2.setToggleGroup(group2);
		beingFixed2.setToggleGroup(group2);
		fixed2.setToggleGroup(group2);
		HBox status2 = new HBox(15);
		status2.getChildren().addAll(notFixed2,beingFixed2,fixed2);
		Label status2L = new Label("Search By: ",status2);
		status2L.setContentDisplay(ContentDisplay.RIGHT);
		
		
		
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 15, 15, 15));
		vBox.getChildren().addAll(notficationsL, notficationDesc, statusL, edit);
		VBox vBox2 = new VBox(15);
		vBox2.setPadding(new Insets(15, 15, 15, 15));
		vBox2.getChildren().addAll(notfication2L, notfication2Desc, status2L, edit2);
		
		HBox hBox = new HBox(15);
		hBox.getChildren().addAll(vBox,vBox2);
		
		main.setCenter(hBox);

		Scene s = new Scene(main, 600, 400);
		ps.setTitle("");
		ps.setScene(s);
		ps.show();
	}

	public static void main(String[] args) {
		launch(args);

	}
}