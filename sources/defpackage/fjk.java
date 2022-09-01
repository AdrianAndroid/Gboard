package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

/* compiled from: PG */
/* renamed from: fjk  reason: default package */
/* loaded from: classes.dex */
public final class fjk implements ServiceConnection {
    public final /* synthetic */ fjn a;

    public fjk(fjn fjnVar) {
        this.a = fjnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Log.e("CrossProfileSender", "onBindingDied for component ".concat(String.valueOf(String.valueOf(componentName))));
        this.a.b.execute(new fci(this, 14));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        Log.e("CrossProfileSender", "onNullBinding for component ".concat(String.valueOf(String.valueOf(componentName))));
        this.a.b.execute(new fci(this, 15));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i("CrossProfileSender", "onServiceConnected for component ".concat(String.valueOf(String.valueOf(componentName))));
        this.a.b.execute(new elr(this, iBinder, 19));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.e("CrossProfileSender", "Unexpected disconnection for component ".concat(String.valueOf(String.valueOf(componentName))));
        this.a.b.execute(new fci(this, 16));
    }
}
