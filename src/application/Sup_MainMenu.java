package application;



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

public class Sup_MainMenu extends Application {

	public void start(Stage ps) {
		
		BorderPane main = new BorderPane();
		main.setPadding(new Insets(15,15,15,15));
		main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
		
		Text title = new Text("Customer Support");
		title.setFont(Font.font(30));
		main.setTop(title);
		
		ComboBox<String> cbo = new ComboBox<>();
		cbo.setPrefWidth(200);
		cbo.setValue("Ticket1");
		
		ObservableList<String> tickets = FXCollections.observableArrayList("Ticket1","Ticket2","Ticket3","Ticket4");
		cbo.getItems().addAll(tickets);
		
		Label ticketsL = new Label("Select Ticket: ",cbo);
		ticketsL.setContentDisplay(ContentDisplay.RIGHT);
		
		
		Button reply = new Button("Reply"),
		 an = new Button("Send Public Announcement");
		
		TextArea replyText = new TextArea("Write here to reply to the Selected ticket or to send Public Announcement."),
				complainText = new TextArea("Ticket1 Complain...................................");
		
		RadioButton notSolved = new RadioButton("Not Solved"),
				solved = new RadioButton("Solved");
		notSolved.setSelected(true);
		ToggleGroup group = new ToggleGroup();
		notSolved.setToggleGroup(group);
		solved.setToggleGroup(group);
		HBox status = new HBox(15);
		Button edit = new Button("Edit Status");
		status.getChildren().addAll(notSolved,solved,edit);
		
		
		Label statusL = new Label("Ticket Status: ",status);
		statusL.setContentDisplay(ContentDisplay.RIGHT);
		
		replyText.setMaxHeight(100);
		complainText.setMaxHeight(100);
		
		VBox vBox1 = new VBox(10);
		vBox1.setPadding(new Insets(10,10,10,10));
		vBox1.getChildren().addAll(ticketsL,complainText,statusL);
		main.setCenter(vBox1);
		
		
		HBox hBox2 = new HBox(10);
		hBox2.setAlignment(Pos.BOTTOM_RIGHT);
		hBox2.getChildren().addAll(reply,an);
		VBox vBox = new VBox(10);
		vBox.setPadding(new Insets(10,10,10,10));
		vBox.setAlignment(Pos.BOTTOM_RIGHT);
		vBox.getChildren().addAll(hBox2,replyText);
		main.setBottom(vBox);
		
		
		
		
		Scene s = new Scene(main, 600, 400);
		ps.setTitle("");
		ps.setScene(s);
		ps.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}
	
}