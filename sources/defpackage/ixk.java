package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ixk  reason: default package */
/* loaded from: classes.dex */
public final class ixk implements ixm, hhk {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/trainer/dynamictrainer/DynamicTrainer");
    public static final hic b = hhq.k("dynamic_federated_trainer_population_list", njc.b);
    public final ino c;
    public final Executor d;
    private final Context e;
    private mko f;
    private ija g;
    private ija h;

    public ixk(Context context, Executor executor) {
        this.e = context;
        this.c = ino.K(context, null);
        this.d = executor;
    }

    private final mko e(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            fwl a2 = fwm.a();
            a2.e(str);
            a2.a = str.hashCode();
            a2.c("bogus");
            arrayList.add(mio.h(c(a2.a()), cex.h, this.d));
        }
        return kcu.G(arrayList);
    }

    public final mko c(fwm fwmVar) {
        return gni.c(gbh.c(this.e, this.d, fwmVar));
    }

    public final void d() {
        mko g;
        mko mkoVar = this.f;
        if (mkoVar != null) {
            mkoVar.cancel(false);
        }
        Set e = this.c.e("pref_scheduled_trainer_session_names", lrr.a);
        if (!ijf.i(itl.a) || !ijf.i(itl.b)) {
            g = mio.g(e(e), new iul(this, 8), this.d);
        } else {
            HashMap hashMap = new HashMap();
            for (String str : ((njc) b.j()).a) {
                hashMap.put("FEDERATED_".concat(String.valueOf(jdg.Y(str.replace('/', '_')))), str);
            }
            g = mio.g(mio.h(mkh.q(kcu.H(e(lvw.i(e, hashMap.keySet())))), new hzb(this, hashMap, 4), this.d), new fyn(this, hashMap, 15), this.d);
        }
        this.f = g;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Dynamic trainer scheduled trainers: ".concat(String.valueOf(String.valueOf(this.c.S("pref_scheduled_trainer_session_names")))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "DynamicTrainer";
    }

    @Override // defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        kcu.U(kcu.N(new ihi(this, 13), this.d), new ivq(12), this.d);
        if (this.g == null) {
            this.g = ijf.c(new ihi(this, 13), new ihi(this, 13), itl.a);
        }
        this.g.d(this.d);
        if (this.h == null) {
            this.h = ijf.c(new ihi(this, 13), new ihi(this, 13), itl.b);
        }
        this.h.d(this.d);
        b.f(this, this.d);
    }

    @Override // defpackage.ifw
    public final synchronized void gn() {
        b.g(this);
        ija ijaVar = this.g;
        if (ijaVar != null) {
            ijaVar.f();
        }
        ija ijaVar2 = this.h;
        if (ijaVar2 != null) {
            ijaVar2.f();
        }
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        d();
    }
}
