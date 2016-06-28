package com.softdesign.devintensive.ui.activities;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG=ConstantManager.TAG_PREFIX+"Main Activity";
    private ImageView mCallImg;
    private CoordinatorLayout mCoordinatorLayout;

    /**
     * метод вызывается при создании активити (после изменении конфигурации/возврата к текущей
     * активности после его уничтожения.
     *
     * в данном методе инициализируются/производится:
     * - UI пользовательский интерфейс (статика)
     * - инициализация статических данных активити
     * - связь данных со списками (инициализация адаптеров)
     *
     * Не запускать длительные операции по работе с данными в OnCreateO !!!
     *
     * @param savedInstanceState - объект со значениями сохраненными в Bundle - состояние UI
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        mCallImg = (ImageView)findViewById(R.id.call_img);
        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.main_coordinator_container);

        mCallImg.setOnClickListener(this);

        if (savedInstanceState == null) {
            // активити запускается впервые
            /*showSnackbar("активити запускается впервые");
            showToast("активити запускается впервые");*/
        } else {
            // активити уже создавалось
            /*showSnackbar("активити уже создавалось");
            showToast("активити уже создавалось");*/
        }
    }

    /**
     * метод вызывается при старте активити перед моментом того как UI станет доступен пользователю
     * как правило в данном методе происходит регистрация подписки на события остановка которых была
     * произведена в onStop
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /**
     * Метод вызывается когда активити становится доступна пользователю для взаимодействия
     * в данном методе как правило происходит запуск анимаций/аудио/видео/запуск BroadcastReceiver
     * необходимых для реализации UI логики/запуск выполнения потоков и т.д.
     * метод должен быть максимально легковестным для максимальной отзывчивости UI
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * метод вызывается когда когда текущая активити теряет фокус, но остается видимой(всплытие
     * диалогового окна/частичное перекрытие другой активити/ и т.д)
     * <р/>
     * в данном методе реализуют сохранение легковесных UI данных/анимаций/аудио/видео и т.д)
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /**
     * метод вызывается когда активити становится невидимым для пользователя.
     * в данном методе происходит отписка от событий, остоновка сложных анимаций, сложные операции по
     * сохранению данных/прерывание запущенных потоков/и т.д.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * метод вызывается при окончании работы активити (когда это происходит системно или после вызова
     * метода finish() )
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * метод вызывается при рестарте активити/возобновлении работы после вызова метода onStop()
     * в данном методе реализуется специфическая бизнес логика которая должна быть реализована именно
     * при рестарте активности - например запрос к серверу которые необходимо вызывать при возвращении
     * из другой активности (обновление данных, подписка на определенное событие проинициализированное
     * на другом экране/специфическая бизнес логика завязанная именно на перезапуске активити)
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.call_img:
                /*showProgress();
                runWithDelay();*/
                break;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    private void  showSnackbar(String message){
        Snackbar.make(mCoordinatorLayout, message, Snackbar.LENGTH_LONG).show();
    }

    /*private void runWithDelay(){
         final Handler handler = new Handler();
         handler.postDelayed(new Runnable(){
             @Override
             public void run() {
                 //TODO: Выполнить с задержкой
                 hideProgress();

             }
         }, 5000);
    }*/
}

