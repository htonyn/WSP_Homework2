package wsp_homework2;
    
import com.sun.javafx.scene.text.TextLine;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.scene.layout.Region;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;


public class GuessingGameWidget extends GridPane {
    ToggleGroup tga;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    Button b;
    int correct;
    int guesses;
    TextField score;
    
    public GuessingGameWidget() {
        correct = 0;
        guesses = 0;
        score = new TextField();
        add(score, 3, 1);
        tga = new ToggleGroup();
        rb1 = new RadioButton("");
        add(rb1, 0, 0);
        rb1.setToggleGroup(tga);
        rb2 = new RadioButton("");
        add(rb2, 0, 1);
        rb2.setToggleGroup(tga);
        rb3 = new RadioButton("");
        add(rb3, 1, 0);
        rb3.setToggleGroup(tga);
        rb4 = new RadioButton("");
        add(rb4, 1, 1);
        rb4.setToggleGroup(tga);
        tga.selectToggle(rb1);
        Region r = new Region();
        add(r, 2, 0);
        setHgrow(r, Priority.ALWAYS);
        
        b = new Button("Guess");
        add(b, 3, 0);
        
        b.setOnAction(
            (event) -> {
                guesses++;
                if (Math.random() < 0.25) {
                    correct++;
                }
                score.setText("Score:"+correct+"/"+guesses);
            }
        );
    }
}
