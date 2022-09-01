package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cuc  reason: default package */
/* loaded from: classes.dex */
public final class cuc implements hho {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/recommendation/SimilarityMatrixSuperpacksManager");
    static final hhl b = hhq.h("sticker_pack_similarity_superpacks_manifest_url", "");
    static final hhl c = hhq.f("sticker_pack_similarity_superpacks_manifest_version", 2020010921);
    private static volatile cuc g;
    public final bze d;
    public final Context e;
    public final AtomicReference f = new AtomicReference(bze.a);
    private final mkr h;

    private cuc(Context context, bze bzeVar, mkr mkrVar) {
        this.d = bzeVar;
        this.e = context;
        this.h = mkrVar;
        bzt a2 = bzu.a("sticker_pack_similarity");
        a2.e = 300;
        a2.f = 300;
        bzeVar.i(a2.a());
    }

    public static cuc c(Context context) {
        cuc cucVar = g;
        if (cucVar == null) {
            synchronized (cuc.class) {
                cucVar = g;
                if (cucVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    bze a2 = bzd.a(applicationContext);
                    hrx.y(applicationContext);
                    cucVar = new cuc(applicationContext, a2, gxo.a(19));
                    hhq.p(cucVar, b, c);
                    g = cucVar;
                }
            }
        }
        return cucVar;
    }

    public final cub b(Locale locale) {
        int a2;
        juc a3;
        byy byyVar = (byy) this.f.get();
        File f = (byyVar == null || byyVar.i() || (a3 = cxq.a(this.e, locale, byyVar.g())) == null) ? null : byyVar.f(a3.i());
        if (f == null) {
            return null;
        }
        jtr d = byyVar.d();
        if (d == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/expression/recommendation/SimilarityMatrixSuperpacksManager", "getManifestVersion", 277, "SimilarityMatrixSuperpacksManager.java")).w("PackSet %s is not associated to any superpack", byyVar);
            a2 = -1;
        } else {
            a2 = d.a();
        }
        return new cub(f, a2, locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        jsu j = jsv.j();
        j.a = (String) b.c();
        j.d(1);
        j.g(2);
        hiz v = hiz.k(this.d.e("sticker_pack_similarity", ((Long) c.c()).intValue(), j.a())).v(new coa(this, 2), this.h).v(new coa(this, 3), this.h);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new bxj(this, 15));
        e2.h(bxl.m);
        v.E(hjg.a(this.h, null, afpVar, z, e, e2, e3));
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        d();
    }
}
