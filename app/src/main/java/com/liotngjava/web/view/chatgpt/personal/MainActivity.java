package com.liotngjava.web.view.chatgpt.personal;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;


public class MainActivity extends AppCompatActivity {

  private WebView myWebView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    getSupportActionBar().hide(); //隐藏ActionBar
    setContentView(R.layout.activity_main);

    String url = "https://chat.openai.com/";
    CustomTabsIntent intent = new CustomTabsIntent.Builder()
      .setUrlBarHidingEnabled(true)
      .build();
    intent.launchUrl(MainActivity.this, Uri.parse(url));
  }

  @Override
  protected void onResume() {
    super.onResume();
    // 在这里调用 finish() 来结束您的应用程序
    finish();
  }
}