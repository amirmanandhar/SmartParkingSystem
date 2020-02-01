package com.example.smartparkingsystem;

public class Global {

    public static void setTimeOut(long milliSeconds, final callbackRun toRun){
        Runnable runnable = null;
        new android.os.Handler().removeCallbacks(runnable);
        runnable = new Runnable() {
            @Override
            public void run() {
                toRun.toRun();
            }
        };
        new android.os.Handler().postDelayed(runnable,milliSeconds);
    }

    public static interface callbackRun{
        void toRun();
    }


}
