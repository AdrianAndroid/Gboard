package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.inputmethod.libs.framework.core.AppBase;

/* compiled from: PG */
/* renamed from: dbz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dbz implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dbz(cfz cfzVar, boolean z, boolean z2, int i) {
        this.d = i;
        this.c = cfzVar;
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ dbz(AppBase appBase, boolean z, boolean z2, int i) {
        this.d = i;
        this.c = appBase;
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ dbz(dcu dcuVar, boolean z, boolean z2, int i) {
        this.d = i;
        this.c = dcuVar;
        this.a = z;
        this.b = z2;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        guy guyVar;
        iou iouVar;
        llp llpVar;
        hvp hvpVar;
        int i = this.d;
        if (i == 0) {
            Object obj = this.c;
            boolean z = this.a;
            boolean z2 = this.b;
            AppBase appBase = (AppBase) obj;
            appBase.e = null;
            if (!appBase.g) {
                appBase.g = true;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                appBase.i = gwv.a(new cvj(appBase, 10), gxo.a(11));
                if (!z2) {
                    appBase.n(ino.M((Context) obj));
                }
                appBase.j();
                appBase.emojiCompatManagerInitTaskHelper = gwv.a(new cvj(appBase, 11), gyc.b);
                ieh j = ieh.j();
                if (z) {
                    guyVar = guy.APP_PERFORM_USER_UNLOCK_INITIALLY_UNLOCKED;
                } else {
                    guyVar = guy.APP_PERFORM_USER_UNLOCK_INITIALLY_LOCKED;
                }
                j.g(guyVar, SystemClock.elapsedRealtime() - elapsedRealtime);
            }
            ijf.j(gwu.b);
            return;
        }
        int i2 = 0;
        if (i == 1) {
            Object obj2 = this.c;
            boolean z3 = this.a;
            boolean z4 = this.b;
            if (z3 && (iouVar = ((cfz) obj2).l) != null && (llpVar = iouVar.b) != null) {
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                int size = llpVar.size();
                int i3 = 0;
                while (i2 < size) {
                    View view = (View) llpVar.get(i2);
                    view.setScaleX(0.0f);
                    view.setScaleY(0.0f);
                    view.animate().setDuration(150L).setInterpolator(decelerateInterpolator).scaleX(1.0f).scaleY(1.0f).setStartDelay(i3).start();
                    i3 += 50;
                    i2++;
                }
                i2 = (llpVar.size() * 50) + 150;
            }
            if (!z4) {
                return;
            }
            kki.i(new cbq((cfz) obj2, 5), i2);
            return;
        }
        Object obj3 = this.c;
        boolean z5 = this.a;
        boolean z6 = this.b;
        dcu dcuVar = (dcu) obj3;
        dcuVar.Q = null;
        if (!dcuVar.N) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!z6 && (hvpVar = dcuVar.K) != null) {
                hvpVar.d.j();
                hvpVar.e.j();
                hvpVar.f.j();
                hvpVar.g.j();
                hvpVar.h.d();
                hvpVar.k = null;
                hvpVar.f();
                hvpVar.j();
            }
            dcuVar.ac = new jls((Context) obj3, (byte[]) null);
            ?? r0 = dcuVar.ac.b;
            int i4 = ((lrl) r0).c;
            while (i2 < i4) {
                ((isv) r0.get(i2)).d();
                i2++;
            }
            if (dcuVar.bw() && z5) {
                dcuVar.aQ();
            }
            dcuVar.s();
            if (!z5) {
                dcuVar.aQ();
            }
            dcuVar.J = true;
            ieh.j().g(hsq.IMS_PERFORM_USER_UNLOCK, SystemClock.uptimeMillis() - uptimeMillis);
        }
        ijf.j(gwz.b);
    }
}
