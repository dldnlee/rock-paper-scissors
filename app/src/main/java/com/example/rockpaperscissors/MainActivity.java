package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rockpaperscissors.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rock.setOnClickListener(v -> pickrock());

        binding.paper.setOnClickListener(v -> pickpaper());

        binding.scissor.setOnClickListener(v -> pickscissor());


    }

    private void pickrock() {
        int random = rand.nextInt(3);

        if (random == 0) {
            binding.aiPic.setImageResource(R.drawable.rock);
            binding.result.setText("AI가 바위를 냈습니다\n당신은 바위를 냈습니다\n비겼습니다");
        } else if (random == 1) {
            binding.aiPic.setImageResource(R.drawable.paper);
            binding.result.setText("AI가 보를 냈습니다\n당신은 바위를 냈습니다\n졌습니다");
        } else if (random == 2) {
            binding.aiPic.setImageResource(R.drawable.scissor);
            binding.result.setText("AI가 가위를 냈습니다\n당신은 바위를 냈습니다\n이겼습니다");
        }
    }

    private void pickpaper() {
        int random = rand.nextInt(3);

        if (random == 0) {
            binding.aiPic.setImageResource(R.drawable.rock);
            binding.result.setText("AI가 바위를 냈습니다\n당신은 보를 냈습니다\n이겼습니다");
        } else if (random == 1) {
            binding.aiPic.setImageResource(R.drawable.paper);
            binding.result.setText("AI가 보를 냈습니다\n당신은 보를 냈습니다\n비겼습니다");
        } else if (random == 2) {
            binding.aiPic.setImageResource(R.drawable.scissor);
            binding.result.setText("AI가 가위를 냈습니다\n당신은 보를 냈습니다\n졌습니다");
        }
    }

    private void pickscissor() {
        int random = rand.nextInt(3);

        if (random == 0) {
            binding.aiPic.setImageResource(R.drawable.rock);
            binding.result.setText("AI가 바위를 냈습니다\n당신은 가위를 냈습니다\n졌습니다");
        } else if (random == 1) {
            binding.aiPic.setImageResource(R.drawable.paper);
            binding.result.setText("AI가 보를 냈습니다\n당신은 가위를 냈습니다\n이겼습니다");
        } else if (random == 2) {
            binding.aiPic.setImageResource(R.drawable.scissor);
            binding.result.setText("AI가 가위를 냈습니다\n당신은 가위를 냈습니다\n비겼습니다");
        }
    }
}