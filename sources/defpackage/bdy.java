package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bdy  reason: default package */
/* loaded from: classes.dex */
public final class bdy implements bdt {
    static final Executor a = AsyncTask.SERIAL_EXECUTOR;
    public final Context b;
    final bcz c;
    public volatile boolean d;
    public volatile boolean e;
    public final BroadcastReceiver f = new bdw(this);
    private final bgd g;

    public bdy(Context context, bgd bgdVar, bcz bczVar) {
        this.b = context.getApplicationContext();
        this.g = bgdVar;
        this.c = bczVar;
    }

    @Override // defpackage.bdt
    public final void a() {
        a.execute(new att(this, 7));
    }

    @Override // defpackage.bdt
    public final boolean b() {
        a.execute(new att(this, 6));
        return true;
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.g.a()).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
