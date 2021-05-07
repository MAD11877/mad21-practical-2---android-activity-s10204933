package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        int randint = intent.getIntExtra("randint", 0);

        User user = new User("MAD",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                        " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

        TextView nameView = findViewById(R.id.textView2);
        nameView.setText(user.getName() + ' ' + randint);
        TextView descView = findViewById(R.id.textView);
        descView.setText(user.getDescription());

        Button followButton = findViewById(R.id.followButton);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setFollowed(!user.isFollowed());
                updateFollowButton(user.isFollowed(), followButton);
            }
        });
    }

    private void updateFollowButton(boolean isFollowed, Button followButton) {
        String toast = "Followed";
        if (isFollowed == true) {
            followButton.setText("unfollow");
        } else {
            toast = "Unfollowed";
            followButton.setText("follow");
        }
        Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();
    }

}