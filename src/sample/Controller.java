package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import static sample.Main.sumaCifara;



public class Controller {
    public TextField text1;
    public TextField text2;
    public TextField text3;

    public void ispisi(ActionEvent actionEvent) {


            int a = Integer.parseInt(text1.getText());
            int b = Integer.parseInt(text2.getText());
            text3.setText("Radi");

            String result = "";
        for(int i=a; i<=b; i++) {
            if(i%sumaCifara(i)==0)
                result=result + " "+i;
        }
            text3.setText(result);

        }
    }

