package jobApps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import jobApps.EasyScanner;
import jobApps.stringFiles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import jobApps.EasyScanner;
import jobApps.stringFiles;

public class Mainfx extends Application
{
    private final int WIDTH = 500;
    private final int HEIGHT = 250;
    Label headingLabel;
    Label Number;
    TextField noField;
    Label Name;
    TextField NameField;
    Button AddTeamButton;
    Button DisplayTeamsButton;
    Button RemoveJobButton;
    Button saveAndQuitButton;
    Button filterButton;
    TextArea displayArea1;
    Label filterJob;
    TextField filterField;
    Button DisplayMatchs;
    TextArea displayArea2;
    //------------------------------
    Label personFirstName;
    TextField firstNameField;
    Label personLastName;
    TextField lastNameField;
    Label location;
    TextField locationField;
    
    public Mainfx() {
        this.headingLabel = new Label("Job Application System");
        this.Number = new Label("Unique Job No.");
        this.noField = new TextField();
        this.Name = new Label("Job");
        this.NameField = new TextField();        
        this.AddTeamButton = new Button("Add Job(s).");
        this.DisplayTeamsButton = new Button("Display Job(s).");
        this.RemoveJobButton = new Button("Remove Job.");
        this.saveAndQuitButton = new Button("Save & Quit.");
        this.displayArea1 = new TextArea();
        this.filterJob = new Label("Enter Phrase");
        this.filterField = new TextField();
        this.DisplayMatchs = new Button("Filter");
        this.displayArea2 = new TextArea();
        //-----------------------------------------
        this.personFirstName = new Label ("First Name ");
        this.firstNameField = new TextField();
        this.personLastName = new Label ("Last Name ");
        this.lastNameField = new TextField();
        this.location = new Label ("Location");
        this.locationField = new TextField();
    }
    
    public void start(final Stage stage) {
    	 List<stringFiles> Jobs = new ArrayList<>();
		 List<stringFiles> Details = new ArrayList<>();
        save.readList((List)Jobs);
        final HBox user = new HBox(10.0);
        final HBox Teams = new HBox(10.0);
        final HBox TeamsButtons = new HBox(10.0);
        final HBox MatchDetails = new HBox(10.0);
        final HBox MatchButtons = new HBox(10.0);
        user.getChildren().addAll((Node[])new Node[] { (Node)this.personFirstName, (Node)this.firstNameField, (Node)this.personLastName, (Node)this.lastNameField, (Node)this.location, (Node)this.locationField });
        Teams.getChildren().addAll((Node[])new Node[] { (Node)this.Number, (Node)this.noField, (Node)this.Name, (Node)this.NameField });
        TeamsButtons.getChildren().addAll((Node[])new Node[] { (Node)this.AddTeamButton, (Node)this.DisplayTeamsButton, (Node)this.RemoveJobButton, (Node)this.saveAndQuitButton });
        MatchDetails.getChildren().addAll((Node[])new Node[] { (Node)this.filterJob, (Node)this.filterField });
        MatchButtons.getChildren().addAll((Node[])new Node[] { (Node)this.DisplayMatchs });
        final VBox root = new VBox(10.0);
        root.getChildren().addAll((Node[])new Node[] { (Node)this.headingLabel, (Node)user, (Node)Teams, (Node)TeamsButtons, (Node)this.displayArea1, (Node)MatchDetails, (Node)MatchButtons, (Node)this.displayArea2 });
        final Scene scene = new Scene((Parent)root, (Paint)Color.DARKCYAN);
        final Font font = new Font("Arial", 40.0);
        this.headingLabel.setFont(font);
        user.setAlignment(Pos.CENTER);
        Teams.setAlignment(Pos.CENTER);
        TeamsButtons.setAlignment(Pos.CENTER);
        MatchDetails.setAlignment(Pos.CENTER);
        MatchButtons.setAlignment(Pos.CENTER);
        root.setAlignment(Pos.CENTER);
        user.setMinWidth(1000.0);
        user.setMaxWidth(1000.0);
        Teams.setMinWidth(1000.0);
        Teams.setMaxWidth(1000.0);
        TeamsButtons.setMinWidth(1000.0);
        TeamsButtons.setMaxWidth(1000.0);
        MatchDetails.setMinWidth(1000.0);
        MatchDetails.setMaxWidth(1000.0);
        MatchButtons.setMinWidth(1000.0);
        MatchButtons.setMaxWidth(1000.0);
        root.setMinSize(1000.0, 500.0);
        root.setMaxSize(1000.0, 500.0);
        this.displayArea1.setMaxSize(920.0, 100.0);
        this.displayArea2.setMaxSize(920.0, 100.0);
        stage.setWidth(1000.0);
        stage.setHeight(500.0);
        final BorderStroke style = new BorderStroke((Paint)Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii(0.0), new BorderWidths(2.0));
        root.setBorder(new Border(new BorderStroke[] { style }));
        root.setBackground(Background.EMPTY);
        this.AddTeamButton.setBackground(new Background(new BackgroundFill[] { new BackgroundFill((Paint)Color.WHITESMOKE, new CornerRadii(10.0), Insets.EMPTY) }));
        this.DisplayTeamsButton.setBackground(new Background(new BackgroundFill[] { new BackgroundFill((Paint)Color.ANTIQUEWHITE, new CornerRadii(10.0), Insets.EMPTY) }));
        this.RemoveJobButton.setBackground(new Background(new BackgroundFill[] { new BackgroundFill((Paint)Color.CYAN, new CornerRadii(10.0), Insets.EMPTY) }));
        this.saveAndQuitButton.setBackground(new Background(new BackgroundFill[] { new BackgroundFill((Paint)Color.SILVER, new CornerRadii(10.0), Insets.EMPTY) }));
        this.DisplayMatchs.setBackground(new Background(new BackgroundFill[] { new BackgroundFill((Paint)Color.LIGHTPINK, new CornerRadii(10.0), Insets.EMPTY) }));
        this.RemoveJobButton.setOnAction(e -> this.deleteJobs(Jobs));
        this.DisplayTeamsButton.setOnAction(e -> this.displayJobs(Jobs));
        this.saveAndQuitButton.setOnAction(e -> this.saveAndQuit(Jobs));
        this.AddTeamButton.setOnAction(e -> this.existingJobs(Jobs));
        this.DisplayMatchs.setOnAction(e -> this.allMatchs(Jobs));
        stage.setScene(scene);
        stage.setTitle("Job Application System");
        stage.setResizable(false);
        stage.show();
    }
    
    private void deleteJobs(final List<stringFiles> Jobs) {
    	final String Intpos = this.noField.getText();
        final int pos = Integer.parseInt(Intpos);
        this.displayArea1.setText("Enter Unique Job No. to be removed: ");
        Jobs.remove(pos - 1);
    }
                         
    private void displayJobs(final List<stringFiles> Jobs) {
        this.displayArea1.setText("Unique Job No."+ "\t\tJob Name\t\tFirst Name\t\tLast Name\t\tLocation\n");
        for (final stringFiles item : Jobs) {
        	 this.displayArea1.appendText("\n" + item.getJobs());
    }
  }
    
    private void existingJobs(List<stringFiles> Jobs) {
		final String foo1 = this.firstNameField.getText();
		 final String foo2 = this.lastNameField.getText();
		 final String foo3 = this.locationField.getText();
		 final String foo4 = this.noField.getText();
		 final String foo5 = this.NameField.getText();
		 Jobs.add(new stringFiles(foo1 + foo2 + foo3 + foo4 + foo5)); 
	        this.displayArea1.setText("First Name."+ "\t\tLast Name\t\tLocation\t\tNumber\t\tJob\n");
        this.displayArea1.appendText(foo1 + "\t\t" + foo2 + "\t\t" + foo3 + "\t\t" + foo4 + "\t\t" + foo5);
        return;
  
    }
    
    private void allMatchs(final List<stringFiles> Jobs) {
        String filter = this.DisplayMatchs.getText();
 		for (int i = 0; i < Jobs.size(); i++) {
 			if (Jobs.get(i).getJobs().contains(filter)) {
 				this.displayArea2.appendText("\n" + Jobs.get(i).getJobs());
 			} else {
 				this.displayArea2.setText("Nothing found/No jobs available.");
 		}
 			}
 	 }
    
    private void saveAndQuit(final List<stringFiles> Jobs) {
    	this.displayArea1.setText("Successfully saved.");
        save.saveFile((List)Jobs);
        save.saveFile((List)Jobs);
        Platform.exit();
    }
    
    public static void main(final String[] args) {
        launch(args);
    }
}