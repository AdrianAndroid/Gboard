package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dyt  reason: default package */
/* loaded from: classes.dex */
public final class dyt implements hho {
    public static final hhl b;
    public static final hhl c;
    public static final hhl[] e;
    public static volatile dyt f;
    public final bze g;
    public final AtomicReference h = new AtomicReference(bze.a);
    private final Executor i;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/ranking/RankingModelSuperpacksManager");
    public static volatile boolean d = false;

    static {
        hhl h = hhq.h("ranking_model_superpacks_manifest_url", "");
        b = h;
        hhl f2 = hhq.f("ranking_model_superpacks_manifest_version", 2021100801L);
        c = f2;
        e = new hhl[]{h, f2};
    }

    public dyt(bze bzeVar, Executor executor) {
        this.g = bzeVar;
        this.i = executor;
        bzt a2 = bzu.a("ranking_model");
        a2.e = 300;
        a2.f = 300;
        bzeVar.i(a2.a());
    }

    public final void b() {
        jsu j = jsv.j();
        j.a = (String) b.c();
        j.d(2);
        j.g(((bzr) this.g).j.a() ? 1 : 0);
        hiz v = hiz.k(this.g.e("ranking_model", ((Long) c.c()).intValue(), j.a())).v(new coa(this, 14), this.i).v(new coa(this, 15), this.i);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e2 = llp.e();
        llk e3 = llp.e();
        llk e4 = llp.e();
        e2.h(new dys(this, 0));
        e3.h(bxl.q);
        v.E(hjg.a(this.i, null, afpVar, z, e2, e3, e4));
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        b();
    }
}
