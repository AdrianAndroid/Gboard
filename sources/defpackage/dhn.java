package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: dhn  reason: default package */
/* loaded from: classes.dex */
public abstract class dhn {
    public static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacks");
    private final hqq a;
    public final ExecutorService j;
    public final bze k;
    public final String l;
    public final Object m = new Object();
    public Map n = new HashMap();

    public dhn(bze bzeVar, Context context, ExecutorService executorService, String str) {
        dhl dhlVar = new dhl(this);
        this.a = dhlVar;
        this.k = bzeVar;
        this.l = str;
        bzeVar.i(b(context));
        this.j = executorService;
        ijl.b().h(dhlVar, hqr.class, gyc.b);
    }

    public abstract int a();

    public abstract bzu b(Context context);

    public abstract dhm c();

    public abstract String d();

    public abstract void e();

    public final dhu g(jav javVar) {
        dhu dhuVar;
        c();
        synchronized (this.m) {
            dhuVar = (dhu) this.n.get(javVar);
            if (dhuVar == null && javVar.j != null) {
                jau J = javVar.J();
                J.g(null);
                jav a = J.a();
                c();
                dhuVar = (dhu) this.n.get(a);
            }
            if (dhuVar == null) {
                String str = javVar.g;
                c();
                dhuVar = (dhu) this.n.get(jav.f(javVar.g));
            }
        }
        return dhuVar;
    }

    public final mko h() {
        if (k()) {
            return kcu.K(true);
        }
        return j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mko i() {
        boolean z = false;
        if (((Boolean) dho.b.c()).booleanValue() && ((bzr) this.k).j.a()) {
            z = true;
        }
        String d = d();
        int a = a();
        ((ltd) ((ltd) i.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacks", "register", 242, "HandwritingSuperpacks.java")).J("register(): version '%d', url '%s' [%s]", Integer.valueOf(a), d, c());
        jsu j = jsv.j();
        j.a = d;
        j.d(2);
        if (z) {
            j.g(1);
        }
        return this.k.e(this.l, a, j.a());
    }

    public final mko j() {
        c();
        return mio.g(this.k.b(this.l), new cus(this, 6), this.j);
    }

    public final boolean k() {
        boolean z;
        synchronized (this.m) {
            z = !this.n.isEmpty();
        }
        return z;
    }

    public final dxs l(jav javVar) {
        byy byyVar;
        c();
        dhu g = g(javVar);
        if (g == null) {
            c();
            return null;
        }
        bze bzeVar = this.k;
        try {
            byyVar = new byy(((jqx) ((bzr) bzeVar).k.get()).b(this.l));
        } catch (Exception unused) {
            byyVar = byy.a;
        }
        c();
        return new dxs(byyVar, g);
    }
}
