package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User("MAD",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                        " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

        TextView nameView = findViewById(R.id.textView2);
        nameView.setText(user.getName());
        TextView descView = findViewById(R.id.textView);
        descView.setText(user.getDescription());

        Button followButton = findViewById(R.id.followButton);
        updateFollowButton(user.isFollowed(), followButton);


        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setFollowed(!user.isFollowed());
                updateFollowButton(user.isFollowed(), followButton);
            }
        });
    }

    protected void updateFollowButton(boolean isFollowed, Button followButton) {
        if (isFollowed == true) {
            followButton.setText("unfollow");
        } else {
            followButton.setText("follow");
        }
    }

}