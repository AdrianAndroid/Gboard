package com.google.android.libraries.inputmethod.mdd;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ForegroundDownloadService extends Service {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/mdd/ForegroundDownloadService");

    public static uh a(Context context) {
        Resources resources = context.getResources();
        String string = resources.getString(R.string.f158040_resource_name_obfuscated_res_0x7f1404fc);
        uh uhVar = new uh(context, context.getPackageName());
        uhVar.i(R.drawable.f48970_resource_name_obfuscated_res_0x7f080281);
        uhVar.g(resources.getText(R.string.ime_name));
        uhVar.f(string);
        uhVar.h(0, 0, true);
        return uhVar;
    }

    public final void b() {
        kcu.U(hyy.a().d(hyy.b), new hyw(this, 3), mjl.a);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            startForeground(1, a(getApplicationContext()).a());
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        b();
        if (Build.VERSION.SDK_INT >= 26) {
            startForeground(1, a(getApplicationContext()).a());
            return 2;
        }
        return 2;
    }
}
