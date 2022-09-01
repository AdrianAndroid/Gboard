package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jyb  reason: default package */
/* loaded from: classes.dex */
public abstract class jyb extends Service {
    private static final long d = TimeUnit.MINUTES.toMillis(3);
    public PowerManager.WakeLock a;
    public boolean c;
    public boolean b = true;
    private final BroadcastReceiver e = new jya(this);
    private final Handler f = new Handler(Looper.getMainLooper(), new fre(this, 2));

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Notification a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g();

    public final void h() {
        long j = d;
        long currentTimeMillis = System.currentTimeMillis();
        lug lugVar = jsh.a;
        new Date(currentTimeMillis + j);
        this.f.removeMessages(1);
        Handler handler = this.f;
        handler.sendMessageDelayed(handler.obtainMessage(1), j);
        PowerManager.WakeLock wakeLock = this.a;
        if (wakeLock != null) {
            try {
                wakeLock.acquire(j);
            } catch (SecurityException e) {
                ((luc) ((luc) ((luc) jsh.a.c()).i(e)).k("com/google/android/libraries/micore/superpacks/scheduling/AbstractForegroundTaskService", "resetTimeout", (char) 294, "AbstractForegroundTaskService.java")).t("Failed to acquire foreground service wakelock");
            }
        }
    }

    protected abstract void i();

    public final void j() {
        lug lugVar = jsh.a;
        if (this.c) {
            i();
            f();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.micore.superpacks.scheduling.fg_cancel");
        intentFilter.addAction("com.google.android.libraries.micore.superpacks.scheduling.fg_reset_timeout");
        ahh.a(this).b(this.e, intentFilter);
        int a = uv.a(this, "android.permission.WAKE_LOCK");
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (powerManager != null && a == 0) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "superpacks:foreground_service");
            this.a = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.b = jyp.f(getApplicationContext(), getClass());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ahh.a(this).c(this.e);
        this.f.removeMessages(1);
        this.c = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        lug lugVar = jsh.a;
        if (this.c) {
            return 2;
        }
        this.c = true;
        if (this.b) {
            Notification a = a();
            jdg.u(a);
            startForeground(1, a);
        }
        h();
        g();
        return 2;
    }
}
