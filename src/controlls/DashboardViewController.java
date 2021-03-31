package controlls;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Person;
import models.Professor;
import models.Student;
import utilities.DBUtility;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DashboardViewController implements Intializable {

    @FXML
    private Label studentsLabel;
    @FXML
    private ListView<Student> studentListView;
    @FXML
    private Label proffessorsLabel;
    @FXML
    private ListView<Professor>professorListView;
    @FXML
    private Label courseLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentsListView.getItems().addAll(DBUtility.getStudentsFromDB());
        DBUtility.getProfessorsFromDB();

        //update the label's to show how many students and proffesor  are in each list
        studentsLabel.setText("Students : "+studentListView.getItems().size());
    }
}
