package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: clr  reason: default package */
/* loaded from: classes.dex */
public final class clr {
    public static final hhl a = hhq.a("emotion_model_enabled_in_gif_tab", false);
    public static final hhl b = hhq.f("emotion_model_topk_in_gif_tab", 3);
    public final lgb c;
    private final AtomicReference d = new AtomicReference(clp.a);
    private final Executor e = gxo.a(6);

    public clr(Context context) {
        this.c = jdg.n(new boh(context, 8));
    }

    public static clr a() {
        return clq.a;
    }

    private final void c(clp clpVar) {
        ((clp) this.d.getAndSet(clpVar)).c.cancel(true);
    }

    public final hiz b() {
        bxd q = ffb.q();
        String c = q.e() ? q.c() : "";
        if (c.isEmpty()) {
            c(clp.a);
            return clp.a.c;
        }
        clp clpVar = (clp) this.d.get();
        if (c.equals(clpVar.b)) {
            return clpVar.c;
        }
        hiz p = hiz.p(new brs(this, c, 9), this.e);
        c(clp.a(c, p));
        return p;
    }
}
