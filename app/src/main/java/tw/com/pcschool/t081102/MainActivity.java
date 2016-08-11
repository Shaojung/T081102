package tw.com.pcschool.t081102;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationManager notificationManager;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);


    }

    public void click1(View v)
    {
        Notification.Builder builder = new Notification.Builder(context);

        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Test")
                .setContentText("123");
        Notification notification = builder.build();
        notificationManager.notify(123, notification); // 發佈Notification
    }
}
