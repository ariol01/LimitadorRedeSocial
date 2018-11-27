package com.uniron.applimitador.Models;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

import java.io.IOException;

import static android.content.Context.ACTIVITY_SERVICE;

public class Aplicativo {

    private String nomeAplicativo;
    private Integer pid;
    private double tempoExecucaoAplicativo;

    public String getNomeAplicativo() {
        return nomeAplicativo;
    }

    public void setNomeAplicativo(String nomeAplicativo) {
        this.nomeAplicativo = nomeAplicativo;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public double getTempoExecucaoAplicativo() {
        return tempoExecucaoAplicativo;
    }

    public void setTempoExecucaoAplicativo(double tempoExecucaoAplicativo) {
        this.tempoExecucaoAplicativo = tempoExecucaoAplicativo;
    }




    public static String getCurProcessName(Context context) {

        int pid = Process.myPid();
        java.lang.Process process = null;

        try {
             process = Runtime.getRuntime ().exec("/system/bin/ps");
        } catch (IOException e) {
            e.printStackTrace();
        }

        ActivityManager activityManager = (ActivityManager) context
                .getSystemService(ACTIVITY_SERVICE);

        for (ActivityManager.RunningAppProcessInfo appProcess : activityManager
                .getRunningAppProcesses()) {

            if (appProcess.pid == pid) {
                return appProcess.processName;
            }
        }
        return null;
    }




    public static final String getProcessName(Context context) {
        String processName = null;

        // ActivityManager
        ActivityManager am = ((ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE));

        while (true) {
            for (ActivityManager.RunningAppProcessInfo info : am.getRunningAppProcesses()) {
                if (info.pid == android.os.Process.myPid()) {
                    processName = info.processName;

                    break;
                }
            }

            // go home
            if (!TextUtils.isEmpty(processName)) {
                return processName;
            }

            // take a rest and again
            try {
                Thread.sleep(100L);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }








}


