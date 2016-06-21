package xyz.virtual_diving.nomoveviewpagersample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizactivity_main);

        //画面表示
        setViews();
    }

    private void setViews(){
        FragmentManager manager = getSupportFragmentManager();
        QuizViewPager viewPager = (QuizViewPager)findViewById(R.id.quiz_viewpager);
        QuizFragmentPagerAdapter adapter = new QuizFragmentPagerAdapter(manager);
        viewPager.setAdapter(adapter);
    }
}
