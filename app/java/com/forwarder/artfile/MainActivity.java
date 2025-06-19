package com.forwarder.artfile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
  @Override
  protected void onCreate(Bundle s) {
    super.onCreate(s);
    Uri data = getIntent().getData();
    if (data != null) {
      Intent i = new Intent(Intent.ACTION_VIEW);
      i.setDataAndType(data, "*/*");
      i.setPackage("com.limelight.noir");
      i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      startActivity(i);
    }
    finish();
  }
}
