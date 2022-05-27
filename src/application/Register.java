import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class Register extends Application{

	public void start(Stage ps) {
		
		BorderPane main = new BorderPane();
		main.setPadding(new Insets(20,20,20,20));
		main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
		
		
		Text title = new Text("Login or Register");
		title.setFont(Font.font(30));
		main.setTop(title);
		
		TextField userName = new TextField(), password = new TextField();
		Label userNameL = new Label("User Name: "), passWordL = new Label("Password: ");
		userNameL.setPrefWidth(80);
		passWordL.setPrefWidth(80);
		
		HBox hBox1 = new HBox(10), hBox2 = new HBox(10);
		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);
		hBox1.getChildren().addAll(userNameL,userName);
		hBox2.getChildren().addAll(passWordL,password);
		
		
		
		
		Button login = new Button("Login") , register = new Button("Register");
		HBox btns = new HBox(20);
		btns.getChildren().addAll(login,register);
		btns.setAlignment(Pos.CENTER);
		VBox vBox = new VBox(20);
		vBox.setAlignment(Pos.CENTER);
		vBox.getChildren().addAll(hBox1,hBox2,btns);
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