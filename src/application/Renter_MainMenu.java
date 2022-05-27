import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Renter_MainMenu extends Application {

	public void start(Stage ps) {

		BorderPane main = new BorderPane();
		main.setPadding(new Insets(20,20,20,20));
		main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
		
		Text title = new Text("Renter");
		title.setFont(Font.font(30));
		
		Button newOrder = new Button("New Order"), viewOrders = new Button("View Orders");
		newOrder.setPrefWidth(200);
		viewOrders.setPrefWidth(200);
		
		VBox vBox = new VBox(20);
		vBox.setAlignment(Pos.CENTER);
		vBox.getChildren().addAll(title,newOrder,viewOrders);
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