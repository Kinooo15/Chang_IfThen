package mcm.edu.ph.chang_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView storyBackground = findViewById(R.id.txtBG);
        TextView outcome = findViewById(R.id.txtAns);

        Button btnDecision1 = findViewById(R.id.btnD1);
        Button btnDecision2 = findViewById(R.id.btnD2);
        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);

        storyBackground.setText("You got locked up in a room because of the bullies at your school.The room you were locked in was a abandoned building so no one really goes there that much.You have enough load on your cellphone for a one phone call.");

        outcome.setText("The first decision is that you would call your mother or father who are busy at work.\n \n" +
                "The second decision is that you would call you bestfriend who would be at busy party.");

    }
    @Override
    public void onClick(View view) {

        TextView outcome = findViewById(R.id.txtAns);
        TextView storyBackground = findViewById(R.id.txtBG);

        if(view.getId() == R.id.btnD1){
            storyBackground.setText("Your father answered and alerted your mother and the school about what happened to you and a janitor came to save you. And the bullies got suspended right away by the principal.");
        }
        else if (view.getId() == R.id.btnD2) {
            storyBackground.setText("Your bestfriends phone was confiscated by his mother because he was misbehaving at the party that is why he didn't answer. You got locked in the room overnight until a janitor went there to clean up and saw you and you are saved.");
        }
    }
}