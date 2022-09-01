package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hbc  reason: default package */
/* loaded from: classes.dex */
public final class hbc implements hho {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/data/GboardBundledEmojiListLoader");
    private static volatile hbc b;
    private final Context c;
    private final mkr d = gxo.c(6);
    private final hzr e;

    public hbc(Context context) {
        hbb hbbVar = new hbb();
        this.e = hbbVar;
        this.c = context;
        hhq.p(this, hdn.b);
        hbbVar.d(mjl.a);
    }

    public static hbc b(Context context) {
        hbc hbcVar = b;
        if (hbcVar == null) {
            synchronized (hbc.class) {
                hbcVar = b;
                if (hbcVar == null) {
                    hbcVar = new hbc(context.getApplicationContext());
                    b = hbcVar;
                }
            }
        }
        return hbcVar;
    }

    public final synchronized mko c(Context context, mkr mkrVar, hdl hdlVar) {
        return har.b().d(context, mkrVar, hdlVar);
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        mko L;
        if (!set.contains(hdn.b)) {
            return;
        }
        har.b();
        Context context = this.c;
        mkr mkrVar = this.d;
        gwk a2 = har.a(context);
        synchronized (a2) {
            Iterator it = a2.b.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    mko mkoVar = (mko) entry.getValue();
                    if (!mkoVar.isDone() && !mkoVar.isCancelled()) {
                        ((ltd) ((ltd) gwk.a.c()).k("com/google/android/libraries/inputmethod/cache/FileCache", "clearAll", 235, "FileCache.java")).H("File: %s is under reading or writing: %s", str, mkoVar.isDone());
                        L = kcu.K(false);
                        break;
                    }
                } else {
                    a2.b.clear();
                    L = kcu.L(mkrVar.hQ(new evl(a2, 9)));
                    break;
                }
            }
        }
        mkh q = mkh.q(L);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e2.h(ebj.e);
        e.h(ebj.f);
        kcu.U(q, hjg.a(mjl.a, null, afpVar, z, e, e2, e3), this.d);
    }
}
