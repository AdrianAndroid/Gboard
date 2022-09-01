package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: kyj  reason: default package */
/* loaded from: classes.dex */
public final class kyj {
    private static kyj e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new kyh(this));
    public kyi c;
    public kyi d;

    private kyj() {
    }

    public static kyj a() {
        if (e == null) {
            e = new kyj();
        }
        return e;
    }

    public final void b(kyi kyiVar) {
        int i = kyiVar.a;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(kyiVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, kyiVar), i);
    }

    public final void c() {
        kyi kyiVar = this.d;
        if (kyiVar != null) {
            this.c = kyiVar;
            this.d = null;
            opu opuVar = (opu) ((WeakReference) kyiVar.c).get();
            if (opuVar != null) {
                kye.a.sendMessage(kye.a.obtainMessage(0, opuVar.a));
            } else {
                this.c = null;
            }
        }
    }

    public final boolean d(kyi kyiVar, int i) {
        opu opuVar = (opu) ((WeakReference) kyiVar.c).get();
        if (opuVar != null) {
            this.b.removeCallbacksAndMessages(kyiVar);
            kye.a.sendMessage(kye.a.obtainMessage(1, i, 0, opuVar.a));
            return true;
        }
        return false;
    }

    public final void e(opu opuVar) {
        synchronized (this.a) {
            if (g(opuVar)) {
                kyi kyiVar = this.c;
                if (!kyiVar.b) {
                    kyiVar.b = true;
                    this.b.removeCallbacksAndMessages(kyiVar);
                }
            }
        }
    }

    public final void f(opu opuVar) {
        synchronized (this.a) {
            if (g(opuVar)) {
                kyi kyiVar = this.c;
                if (kyiVar.b) {
                    kyiVar.b = false;
                    b(kyiVar);
                }
            }
        }
    }

    public final boolean g(opu opuVar) {
        kyi kyiVar = this.c;
        return kyiVar != null && kyiVar.a(opuVar);
    }

    public final boolean h(opu opuVar) {
        kyi kyiVar = this.d;
        return kyiVar != null && kyiVar.a(opuVar);
    }
}
