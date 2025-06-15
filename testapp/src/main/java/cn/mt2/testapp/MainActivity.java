package cn.mt2.testapp;

import android.app.Activity;
import android.os.Bundle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File file = new File(getExternalCacheDir(), "cache");
        try (FileOutputStream os = new FileOutputStream(file)) {
            os.write(new byte[102400]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        file = new File(getFilesDir(), "file");
        try (FileOutputStream os = new FileOutputStream(file)) {
            os.write(new byte[102400]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}