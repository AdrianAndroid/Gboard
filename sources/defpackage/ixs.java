package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ixs  reason: default package */
/* loaded from: classes.dex */
public final class ixs implements AutoCloseable, hho {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/trainer/trainermanagerv2/TrainerLifecycleManager");
    public final Context b;
    public final Executor c;
    private ija m;
    private ija n;
    private ifu o;
    public final Map d = new HashMap();
    public final Set e = new HashSet();
    public final llb f = llb.G();
    private final llb l = llb.G();
    public final llb g = llb.G();
    public final Set h = new HashSet();
    public final Map i = new HashMap();
    public volatile boolean j = false;
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public ixs(Context context, Executor executor) {
        new ConcurrentHashMap();
        this.b = context;
        this.c = executor;
    }

    private final mko i(fwm fwmVar) {
        return gni.c(gbh.c(this.b, this.c, fwmVar));
    }

    private final void j(ixn ixnVar) {
        this.g.E(ixnVar.b(), ixnVar.c());
        kcu.U(mio.h(mkh.q(i(ixnVar.a())), cex.k, this.c), new fel(this, ixnVar, 9), this.c);
    }

    public final synchronized llw b() {
        return llw.k(this.d);
    }

    public final synchronized llw c() {
        return llw.k(this.k);
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        hhq.q(this);
        this.f.o();
        for (Map.Entry entry : this.i.entrySet()) {
            ((ija) entry.getValue()).f();
        }
        this.i.clear();
        for (Map.Entry entry2 : this.l.x()) {
            ijl.b().d((ijj) entry2.getValue(), (Class) entry2.getKey());
        }
        this.l.o();
        ija ijaVar = this.m;
        if (ijaVar != null) {
            ijaVar.f();
        }
        ija ijaVar2 = this.n;
        if (ijaVar2 != null) {
            ijaVar2.f();
        }
        ifu ifuVar = this.o;
        if (ifuVar != null) {
            ifuVar.d();
        }
        for (Map.Entry entry3 : this.d.entrySet()) {
            j((ixn) entry3.getValue());
        }
        this.d.clear();
        this.e.clear();
        this.k.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized lmn d() {
        return llr.g(this.g);
    }

    public final synchronized void e() {
        for (ixn ixnVar : this.d.values()) {
            f(ixnVar);
        }
    }

    public final void f(ixn ixnVar) {
        ixnVar.c();
        if (!ixnVar.e() || !ijf.i(itl.a) || !ijf.i(itl.b) || TextUtils.equals(ixnVar.a().e, "bogusPopulation")) {
            j(ixnVar);
        } else if (ijf.i(ixnVar.b())) {
            h(ixnVar);
        } else {
            this.g.v(ixnVar.b(), ixnVar.c());
            this.k.put(ixnVar.c(), ixr.PENDING);
        }
    }

    public final synchronized void g() {
        if (this.m == null) {
            this.m = ijf.c(new ihi(this, 14), new ihi(this, 14), itl.a);
        }
        this.m.e(this.c);
        if (this.n == null) {
            this.n = ijf.c(new ihi(this, 14), new ihi(this, 14), itl.b);
        }
        this.n.e(this.c);
        if (this.o == null) {
            this.o = new ixq(this);
        }
        this.o.a(this.c);
    }

    @Override // defpackage.hho
    public final synchronized void gW(Set set) {
        HashSet<String> hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.addAll(this.f.b((hhl) it.next()));
        }
        for (String str : hashSet) {
            ixn ixnVar = (ixn) this.d.get(str);
            if (ixnVar != null) {
                f(ixnVar);
            }
        }
    }

    public final void h(ixn ixnVar) {
        kcu.U(mio.h(mkh.q(i(ixnVar.a())), cex.j, this.c), new fel(this, ixnVar, 8), this.c);
    }
}
