package com.example.calenderapp

import io.flutter.embedding.android.FlutterActivity
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity: FlutterActivity() {
    @Override
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        // Register any Flutter plugins
        GeneratedPluginRegistrant.registerWith(flutterEngine);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Perform any additional setup or initialization here
        AppCenter.start(getApplication(), "{"aa9dae02-31f7-459c-9082-2842cea9209a"}",
                Analytics.class, Crashes.class);
    }
}