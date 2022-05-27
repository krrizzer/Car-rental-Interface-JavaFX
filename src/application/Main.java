package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
	File file=new File("database.txt");
	ArrayList<Inventorymanagers> ims=new ArrayList<>();
	ArrayList<Renter> Renter=new ArrayList<>();
	private Scene s;
	
	public void start(Stage ps) throws IOException {
		loadInventoryManager();
//		for (int i = 0; i < ims.size(); i++) {
//			System.out.println(ims.get(i));
//		}
		//saveRenter(new Renter("username","123","email@","name",30,32223,0505,255,222));
		//loadRenters();
		//System.out.println(Renter.get(0));
		s = new Scene(login(), 600, 500);
		//s.setRoot(renterMain());
		ps.setTitle("");
		ps.setScene(s);
		ps.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}
//***********************************************************************************************************************************************************************
//***********************************************************************************************************************************************************************

		private BorderPane login(){
			
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
			login.setOnAction(e->{
			//Fill later********	******	************* ****** ****** ***** ****
			});
			register.setOnAction(e->{
				s.setRoot(register());
			});
			
			HBox btns = new HBox(20);
			btns.getChildren().addAll(login,register);
			btns.setAlignment(Pos.CENTER);
			VBox vBox = new VBox(20);
			vBox.setAlignment(Pos.CENTER);
			vBox.getChildren().addAll(hBox1,hBox2,btns);
			main.setCenter(vBox);
			
			
			return main;
		
		}
//***********************************************************************************************************************************************************************
		private BorderPane register() {
			
			BorderPane main = new BorderPane();
			main.setPadding(new Insets(20,20,20,20));
			main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
			
			Text title = new Text("Register");
			title.setFont(Font.font(30));
			main.setTop(title);
			
			TextField userName = new TextField(), password = new TextField(),email = new TextField(),
					name = new TextField(), age = new TextField(),licenseNo = new TextField(),
					phone = new TextField(),card = new TextField(),cvv = new TextField();
			
			Label userNameL = new Label("User Name: "), passWordL = new Label("Password: "), emailL = new Label("Email: "),
					nameL = new Label("Name: "),ageL = new Label("Age: "),licensNoL = new Label("License Number: "),
					phoneL = new Label("Phone: "), cardL = new Label("Card Number: "), cvvL = new Label("CVV: ");
		
			GridPane grid = new GridPane();
			grid.setPadding(new Insets(15));
			grid.setHgap(10);
			grid.setVgap(10);
			grid.add(userNameL,0,0);
			grid.add(userName, 1, 0);
			grid.add(passWordL, 0, 1);
			grid.add(password, 1, 1);
			grid.add(emailL, 0, 2);
			grid.add(email, 1, 2);
			grid.add(nameL, 0, 3);
			grid.add(name, 1, 3);
			grid.add(ageL, 0, 4);
			grid.add(age, 1, 4);
			grid.add(licensNoL, 0, 5);
			grid.add(licenseNo, 1, 5);
			grid.add(phoneL, 0, 6);
			grid.add(phone, 1, 6);
			grid.add(cardL, 0, 7);
			grid.add(card, 1, 7);
			grid.add(cvvL, 0, 8);
			grid.add(cvv, 1, 8);
			
			main.setCenter(grid);
			
			Button register = new Button("Register");
			
			grid.add(register,0,9);
			
			Button back = new Button("Back");
			back.setOnAction(e->{
				s.setRoot(login());
			});
			main.setBottom(back);
			return main;
		}
		
//***********************************************************************************************************************************************************************
//***********************************************************************************************************************************************************************
		
		private BorderPane renterMain(){
			BorderPane main = new BorderPane();
			main.setPadding(new Insets(20,20,20,20));
			main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
			
			Text title = new Text("Renter");
			title.setFont(Font.font(30));
			
			Button newOrder = new Button("New Order"), viewOrders = new Button("View Orders");
			newOrder.setPrefWidth(200);
			viewOrders.setPrefWidth(200);
			newOrder.setOnAction(e->{
				s.setRoot(renterNew());
			});
			viewOrders.setOnAction(e->{
				s.setRoot(renterView());
			});
			
			VBox vBox = new VBox(20);
			vBox.setAlignment(Pos.CENTER);
			vBox.getChildren().addAll(title,newOrder,viewOrders);
			main.setCenter(vBox);
			
			Button logout = new Button("Logout");
			logout.setOnAction(e->{
				s.setRoot(login());
			});
			main.setBottom(logout);
			
			return main;
		}
//***********************************************************************************************************************************************************************	
		
		private  BorderPane renterNew() {
			BorderPane main = new BorderPane();
			main.setPadding(new Insets(20,20,20,20));
			main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
			
			Text title = new Text("New Order");
			title.setFont(Font.font(30));
			
			
			ComboBox<String> cbo = new ComboBox<>();
			cbo.setPrefWidth(200);
			cbo.setValue("Car1");
			ObservableList<String> cars = FXCollections.observableArrayList("Car1","Car2","Car3","Car4");
			cbo.getItems().addAll(cars);
			Label carsL = new Label("Select Car: ",cbo);
			carsL.setContentDisplay(ContentDisplay.RIGHT);
			
			TextField search = new TextField("Search by car number..");
			
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
			
			TextField period = new TextField("7-90 days");
			Label periodL = new Label("Enter Rent Period in Days:",period);
			periodL.setContentDisplay(ContentDisplay.RIGHT);
			
			RadioButton in1 = new RadioButton("Insurance1 9 SR"),
					in2 = new RadioButton("Insurance2 19 SR"),
					in3 = new RadioButton("Insurance3 29 SR");
			ToggleGroup group3 = new ToggleGroup();
			in1.setToggleGroup(group3);
			in2.setToggleGroup(group3);
			in3.setToggleGroup(group3);
			
			HBox inBox = new HBox(15);
			inBox.getChildren().addAll(in1,in2,in3);
			Label inL = new Label("Pick Insurance: ",inBox);
			inL.setContentDisplay(ContentDisplay.RIGHT);
			
			Button order = new Button("Order car");
			Label orderL = new Label("Total price:",order);
			VBox vBox = new VBox(15);
			vBox.setPadding(new Insets(15,15,15,15));
			vBox.getChildren().addAll(title,search,carsL,sortL,desc,periodL,inL,orderL);
			main.setCenter(vBox);
			
			Button mainMenu = new Button("Main Menu");
			main.setTop(mainMenu);
			mainMenu.setOnAction(e->{
				s.setRoot(renterMain());
			});
			return main;
			
		}
//***********************************************************************************************************************************************************************
		private BorderPane renterView() {
			BorderPane main = new BorderPane();
			main.setPadding(new Insets(20,20,20,20));
			main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
			
			Text title = new Text("View Orders");
			title.setFont(Font.font(30));
			
			ComboBox<String> cbo = new ComboBox<>();
			cbo.setPrefWidth(200);
			cbo.setValue("Order1");
			ObservableList<String> orders = FXCollections.observableArrayList("Order1","Order2","Order3","Order4");
			cbo.getItems().addAll(orders);
			Label ordersL = new Label("Select Order: ",cbo);
			ordersL.setContentDisplay(ContentDisplay.RIGHT);
			
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
			
			Button modify = new Button("Modify Order"),
					cancel = new Button("Cancel Order");
			HBox btns = new HBox(15);
			btns.getChildren().addAll(modify,cancel);
			
			TextArea complain = new TextArea("write your complain/feedback here");
			complain.setPrefHeight(60);
			Button sendComp = new Button("Send Complain"),
					feedback = new Button("Send Feedback");
			HBox send = new HBox(15);
			send.getChildren().addAll(sendComp,feedback);
			
			
			
			VBox vBox = new VBox(15);
			vBox.setPadding(new Insets(15,15,15,15));
			vBox.getChildren().addAll(title,ordersL,perLoc,payCar,inBox,btns);
			main.setCenter(vBox);
			
			VBox bot = new VBox(15);
			bot.setPadding(new Insets(15,15,15,15));
			bot.setStyle("-fx-border-color: black");
			bot.getChildren().addAll(complain,send);
			main.setBottom(bot);
			
			Button mainMenu = new Button("Main Menu");
			main.setTop(mainMenu);
			mainMenu.setOnAction(e->{
				s.setRoot(renterMain());
			});
			
			return main;
		}
//***********************************************************************************************************************************************************************
//***********************************************************************************************************************************************************************
		private BorderPane orgMain() {

			BorderPane main = new BorderPane();
			main.setPadding(new Insets(20, 20, 20, 20));
			main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
			
			
			Text title = new Text("Application Organizer");
			title.setFont(Font.font(30));

			Button viewCars = new Button("View Cars Informations / Modify Prices"),
					viewOrders = new Button("View/Modify Orders"), renters = new Button("View Renters Informations");
			
			viewCars.setPrefWidth(250);
			viewOrders.setPrefWidth(250);
			renters.setPrefWidth(250);
			
			viewCars.setOnAction(e->{
				s.setRoot(orgCars());
			});
			viewOrders.setOnAction(e->{
				s.setRoot(orgOrders());
			});
			renters.setOnAction(e->{
				s.setRoot(orgRenters());
			});
			

			VBox vBox = new VBox(20);
			vBox.setAlignment(Pos.CENTER);
			vBox.getChildren().addAll(title, viewCars, viewOrders, renters);
			main.setCenter(vBox);
			
			Button logout = new Button("Logout");
			logout.setOnAction(e->{
				s.setRoot(login());
			});
			main.setBottom(logout);
			
			return main;
		}
		
		private BorderPane orgCars() {
			BorderPane main = new BorderPane();
			main.setPadding(new Insets(20,20,20,20));
			main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE,new  CornerRadii(0), new Insets(0))));
			
			Text title = new Text("View Cars Information / Modify Prices");
			title.setFont(Font.font(30));
			
			
			ComboBox<String> cbo = new ComboBox<>();
			cbo.setPrefWidth(200);
			cbo.setValue("Car1");
			ObservableList<String> cars = FXCollections.observableArrayList("Car1","Car2","Car3","Car4");
			cbo.getItems().addAll(cars);
			Label carsL = new Label("Select Car: ",cbo);
			carsL.setContentDisplay(ContentDisplay.RIGHT);
			
			TextField search = new TextField("Search..");
			
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
			vBox.getChildren().addAll(title,search,carsL,sortL,desc,priceL,modify);
			main.setCenter(vBox);
			
			Button mainMenu = new Button("Main Menu");
			main.setTop(mainMenu);
			mainMenu.setOnAction(e->{
				s.setRoot(orgMain());
			});
			
			return main;
		}
//***********************************************************************************************************************************************************************
		private BorderPane orgOrders() {
			BorderPane main = new BorderPane();
			main.setPadding(new Insets(20, 20, 20, 20));
			main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, new CornerRadii(0), new Insets(0))));

			Text title = new Text("View/Modify Orders");
			title.setFont(Font.font(30));

			ComboBox<String> cbo = new ComboBox<>();
			cbo.setPrefWidth(200);
			cbo.setValue("Order1");
			ObservableList<String> orders = FXCollections.observableArrayList("Order1", "Order2", "Order3", "Order4");
			cbo.getItems().addAll(orders);
			Label ordersL = new Label("Select Order: ", cbo);
			ordersL.setContentDisplay(ContentDisplay.RIGHT);

			TextField search = new TextField("Search by Order Number..");

			
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
			

			VBox vBox = new VBox(15);
			vBox.setPadding(new Insets(15, 15, 15, 15));
			vBox.getChildren().addAll(title,search, ordersL, perLoc, payCar, inL,statusL, hBox);
			main.setCenter(vBox);
			
			Button mainMenu = new Button("Main Menu");
			main.setTop(mainMenu);
			mainMenu.setOnAction(e->{
				s.setRoot(orgMain());
			});
			
			return main;
		}
//***********************************************************************************************************************************************************************
		private BorderPane orgRenters() {

			BorderPane main = new BorderPane();
			main.setPadding(new Insets(20, 20, 20, 20));
			main.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, new CornerRadii(0), new Insets(0))));

			Text title = new Text("View Renters Information");
			title.setFont(Font.font(30));

			TextField search = new TextField("Search by renter name...");
			VBox top = new VBox(15);
			

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
			
			Button mainMenu = new Button("Main Menu");
			top.getChildren().addAll(mainMenu,title, search);
			main.setTop(top);
			mainMenu.setOnAction(e->{
				s.setRoot(orgMain());
			});
			
			
			return main;
			
		}
//***********************************************************************************************************************************************************************
//***********************************************************************************************************************************************************************
		private BorderPane invMng() {

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
			
			Button logout = new Button("Logout");
			logout.setOnAction(e->{
				s.setRoot(login());
			});
			main.setBottom(logout);
			
			
			return main;
		}
		public void loadInventoryManager() throws IOException {
			
			BufferedReader br=new BufferedReader(new FileReader("database.txt"));
			int elements=0;
			String line;
			
			ArrayList<String> list=new ArrayList<>();
			while((line = br.readLine()) != null) {
				Scanner sc=new Scanner(line);
				String check=sc.next();
				if(check.equals("Inventorymanagers")) {
				
					while(sc.hasNext()) {
						list.add(sc.next());
						elements++;
					}
				}
					if(elements==6) {
						ims.add(new Inventorymanagers(list.get(0),list.get(1),Integer.parseInt(list.get(2)),Integer.parseInt(list.get(3)),Integer.parseInt(list.get(4)),Double.parseDouble(list.get(5))));
						elements=0;
						list.clear();
					}
					 
					
				}
				

				

				
			}
	public void saveInventoryManager(Inventorymanagers im) throws IOException {
				PrintWriter pw = new PrintWriter(new FileWriter("database.txt",true));

				pw.println(im.save());
				pw.close();
			}
	
	public void saveRenter(Renter r) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("database.txt",true));

		pw.println(r.save());
		pw.close();
	}
	

			
			
			
}