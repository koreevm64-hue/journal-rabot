package ru.servis.journal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;

public class MainActivity extends Activity {
    private static final String URL = "https://koreevm64-hue.github.io/journal-rabot/";
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            try {
                CustomTabsIntent tab = new CustomTabsIntent.Builder()
                    .setShowTitle(true)
                    .build();
                tab.launchUrl(this, Uri.parse(URL));
            } catch (Exception e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(URL)));
            }
        }
        finish();
    }
}
