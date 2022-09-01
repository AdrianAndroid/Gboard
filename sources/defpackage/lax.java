package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lax  reason: default package */
/* loaded from: classes.dex */
public final class lax extends kze {
    private static lax c;
    private final lan e;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Set f = new LinkedHashSet();

    public lax(Context context, lan lanVar) {
        super(new jlt("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context, null, null);
        this.e = lanVar;
    }

    public static synchronized lax f(Context context) {
        lax laxVar;
        synchronized (lax.class) {
            if (c == null) {
                c = new lax(context, lar.a);
            }
            laxVar = c;
        }
        return laxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kze
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        lbh b = lbh.b(bundleExtra);
        lao a = this.e.a();
        if (b.b != 3 || a == null) {
            g(b);
        } else {
            a.b(b.h, new law(this, b, intent, context));
        }
    }

    public final synchronized void g(lbh lbhVar) {
        Iterator it = new LinkedHashSet(this.f).iterator();
        while (it.hasNext()) {
            ((hgo) it.next()).a(lbhVar);
        }
        super.d(lbhVar);
    }

    public final void h(lbh lbhVar, int i, int i2) {
        this.d.post(new dfe(this, lbhVar, i, i2, 5));
    }
}
