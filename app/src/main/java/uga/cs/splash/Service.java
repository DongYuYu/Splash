package uga.cs.splash;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.util.Log;

public class Service extends IntentService {

    MediaPlayer song;













    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */

    public Service() {


        super("service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("Service", intent.getExtras().getString("data"));


        song.start();

    }

    @Override
    public void onCreate() {
        super.onCreate();


       // song = MediaPlayer.create(this, );
    }
}
