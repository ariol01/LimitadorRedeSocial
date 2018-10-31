package com.uniron.applimitador;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.app.ActivityManager;

import java.util.List;
import java.util.Timer;


public class InicioActivity extends Activity {


    ImageButton config;
    private Application.ActivityLifecycleCallbacks myLifecycleHandler;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        config = findViewById(R.id.imgConfig);

        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MenuActivity();
            }
        });







    }



public  void MenuActivity(){



        Intent intent = new Intent(this, MenuActivity.class);
    startActivity(intent);
}


       //public static String isApplicationBroughtToBackground(final Activity activity) {
        //ActivityManager activityManager = (ActivityManager) activity.getSystemService(Context.ACTIVITY_SERVICE);
        //List<ActivityManager.RunningTaskInfo> tasks = activityManager.getRunningTasks(1);
        //return String.valueOf(tasks);
   //}

    //public static String isApplicationBroughtToBackground(final Activity activity) {
    //ActivityManager activityManager = (ActivityManager) activity.getSystemService(Context.ACTIVITY_SERVICE);
    //List<ActivityManager.AppTask> tasks = activityManager.getAppTasks();
    //return String.valueOf(tasks);
    //}



    //private boolean isMyServiceRunning(Class<?> serviceClass) {
      //  ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        //for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
          //  if (serviceClass.getName().equals(service.service.getClassName())) {
            //    return true;
            //}
        //}
        //return false;
    //}

    public static String getCurProcessName(Context context) {

        int pid = android.os.Process.myPid();

        ActivityManager activityManager = (ActivityManager) context
                .getSystemService(Context.ACTIVITY_SERVICE);

        for (ActivityManager.RunningAppProcessInfo appProcess : activityManager
                .getRunningAppProcesses()) {

            if (appProcess.pid == pid) {
                return appProcess.processName;
            }
        }
        return null;
    }






}

