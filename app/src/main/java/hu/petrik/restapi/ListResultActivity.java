package hu.petrik.restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import hu.petrik.restapi.databinding.ActivityListResultBinding;

public class ListResultActivity extends AppCompatActivity {

    ActivityListResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.visszaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListResultActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}