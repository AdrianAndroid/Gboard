package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* renamed from: afy  reason: default package */
/* loaded from: classes.dex */
public class afy extends Service implements afv {
    private final gkn a = new gkn((afv) this);

    @Override // defpackage.afv
    public final afq I() {
        return (afq) this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.a.f(afo.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.f(afo.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        gkn gknVar = this.a;
        gknVar.f(afo.ON_STOP);
        gknVar.f(afo.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.f(afo.ON_START);
        super.onStart(intent, i);
    }
}
