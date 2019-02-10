package mobi.maptrek;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;

import org.greenrobot.eventbus.EventBus;

import java.util.AbstractMap;
import java.util.HashMap;

public abstract class BasePluginActivity extends AppCompatActivity {
    // Plugins
    private AbstractMap<String, Intent> mPluginPreferences = new HashMap<>();
    private AbstractMap<String, Pair<Drawable, Intent>> mPluginTools = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @SuppressWarnings("unused")
    public java.util.Map<String, Intent> getPluginsPreferences() {
        return mPluginPreferences;
    }

    public java.util.Map<String, Pair<Drawable, Intent>> getPluginsTools() {
        return mPluginTools;
    }

    public void initializePlugins() {
    }

    protected void sendExplicitBroadcast(String action) {
    }
}