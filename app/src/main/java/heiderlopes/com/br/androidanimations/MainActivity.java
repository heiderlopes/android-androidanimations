package heiderlopes.com.br.androidanimations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends Activity  implements Animation.AnimationListener{

    private Animation animation;
    private ImageView ivPersonagem;
    private Spinner spTiposAnimacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivPersonagem = (ImageView) findViewById(R.id.ivPersonagem);
        spTiposAnimacoes = (Spinner)findViewById(R.id.spTiposAnimacoes);
/*
        spTiposAnimacoes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                int anim = MyAnimationExample.getAnimation(position);
                animation = AnimationUtils.loadAnimation(getApplicationContext(), anim);
                ivPersonagem.setAnimation(animation);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });*/
    }

    public void execute(View v) {
        switch (spTiposAnimacoes.getSelectedItemPosition()) {
            case 0:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                break;
            case 1:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                break;
            case 2:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                break;
            case 3:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
                break;
            case 4:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                break;
            case 5:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                break;
            case 6:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequencial);
                break;
            case 7:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
                break;
            case 8:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
                break;
            case 9:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.together);
                break;
            case 10:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
                break;
            case 11:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
                break;
        }
        ivPersonagem.setAnimation(animation);
    }
    @Override
    public void onAnimationEnd(Animation animation) {
        
    }

    @Override
    public void onAnimationRepeat(Animation animation) {


    }

    @Override
    public void onAnimationStart(Animation animation) {

    }
}
