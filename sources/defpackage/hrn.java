package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hrn  reason: default package */
/* loaded from: classes.dex */
public final class hrn extends BroadcastReceiver {
    public final /* synthetic */ hrx a;

    public hrn(hrx hrxVar) {
        this.a = hrxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.LOCALE_CHANGED".equals(action)) {
            ((ltd) ((ltd) hrx.a.b()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$2", "onReceive", 362, "InputMethodEntryManager.java")).w("Receive action: %s", action);
            if (Build.VERSION.SDK_INT <= 29) {
                this.a.I();
                this.a.M = gyc.b.b(new evl(this, 17), 100L, TimeUnit.MILLISECONDS);
                return;
            }
            this.a.L = jav.G();
            this.a.S();
        }
    }
}
