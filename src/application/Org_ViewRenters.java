import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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

public class Org_ViewRenters extends Application {

	public void start(Stage ps) {

		BorderPane main = new BorderPane();
		main.setPadding(new Insets(20, 20, 20, 20));
		main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, new CornerRadii(0), new Insets(0))));

		Text title = new Text("View Renters Information");
		title.setFont(Font.font(30));

		TextField search = new TextField("Search by renter name...");
		VBox top = new VBox(15);
		top.getChildren().addAll(title, search);
		main.setTop(top);

		ComboBox<String> cbo = new ComboBox<>();
		cbo.setPrefWidth(100);
		cbo.setValue("Renter1");
		ObservableList<String> renters = FXCollections.observableArrayList("Renter1", "Renter2", "Renter3", "Renter4");
		cbo.getItems().addAll(renters);
		Label rentersL = new Label("Select Renter: ", cbo);
		rentersL.setContentDisplay(ContentDisplay.RIGHT);

		TextArea rDesc = new TextArea("Renter1 Description......................");
		rDesc.setMaxHeight(150);

		Button ban = new Button("Ban Renter");

		ComboBox<String> cbo2 = new ComboBox<>();
		cbo2.setPrefWidth(100);
		cbo2.setValue("Renter5");
		ObservableList<String> rentersB = FXCollections.observableArrayList("Renter5", "Renter6", "Renter7", "Renter8");
		cbo2.getItems().addAll(rentersB);
		Label rentersBL = new Label("Select Banned Renter: ", cbo2);
		rentersBL.setContentDisplay(ContentDisplay.RIGHT);
		
		TextArea bDesc = new TextArea("Renter5 Description......................");
		bDesc.setMaxHeight(150);
		
		Button unban = new Button("Unban Renter");

		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 15, 15, 15));
		vBox.getChildren().addAll(rentersL, rDesc, ban);
		VBox vBox2 = new VBox(15);
		vBox2.setPadding(new Insets(15, 15, 15, 15));
		vBox2.getChildren().addAll(rentersBL, bDesc, unban);

		HBox hBox = new HBox(15);
		hBox.getChildren().addAll(vBox, vBox2);
		main.setCenter(hBox);

		ComboBox<String> an = new ComboBox<>();
		an.setValue("Announcement1");
		ObservableList<String>	ans = FXCollections.observableArrayList("Announcement1", "Announcement2", "Announcement3", "Announcement4");
		an.getItems().addAll(ans);
		Label anL = new Label("Announcement:", an);
		anL.setContentDisplay(ContentDisplay.RIGHT);
		
		Button send = new Button("Send Announcement");
		TextArea anText = new TextArea("Announcement Text.............................");
		anText.setMaxHeight(50);
		VBox bot = new VBox(15);
		bot.setPadding(new Insets(15,15,15,15));
		bot.setStyle("-fx-border-color: black");
		bot.getChildren().addAll(anL,anText,send);
		main.setBottom(bot);
		
		Scene s = new Scene(main, 600, 400);
		ps.setTitle("");
		ps.setScene(s);
		ps.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}