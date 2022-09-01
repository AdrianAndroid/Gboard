package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: clb  reason: default package */
/* loaded from: classes.dex */
public final class clb implements hho, inm, ijj {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheSuperpacksManager");
    private static final hhl f = hhq.h("content_cache_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/modelpack/contentcache/202010191648/superpacks_manifest.json");
    private static final hhl g = hhq.f("content_cache_superpacks_manifest_version", 2020101916);
    private static volatile clb h;
    public final Context b;
    public final bze c;
    public final AtomicReference d = new AtomicReference(null);
    public final Set e = Collections.newSetFromMap(new IdentityHashMap());
    private final mkr i;

    private clb(Context context, bze bzeVar, mkr mkrVar) {
        this.b = context;
        this.c = bzeVar;
        this.i = mkrVar;
        bzt a2 = bzu.a("content_cache");
        a2.e = 300;
        a2.f = 300;
        bzeVar.i(a2.a());
    }

    public static clb d(Context context) {
        clb clbVar = h;
        if (clbVar == null) {
            synchronized (clb.class) {
                clbVar = h;
                if (clbVar == null) {
                    clbVar = new clb(context.getApplicationContext(), bzd.a(context), gxo.a(19));
                    hhq.p(clbVar, f, g, dzn.c, cit.m, cit.a, cit.l);
                    ino.M(clbVar.b).Z(clbVar, R.string.f160760_resource_name_obfuscated_res_0x7f14066c, R.string.f161060_resource_name_obfuscated_res_0x7f14068a);
                    ijl.b().h(clbVar, hqr.class, gyc.b);
                    h = clbVar;
                }
            }
        }
        return clbVar;
    }

    public final lfb e() {
        int a2;
        byy byyVar = (byy) this.d.get();
        if (byyVar == null) {
            f();
            return ldu.a;
        }
        Set h2 = byyVar.h();
        Objects.requireNonNull(byyVar);
        lmz o = lmz.o(lre.ab(h2, new byi(byyVar, 11)));
        jtr d = byyVar.d();
        if (d == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentCacheSuperpacksManager", "getManifestVersion", 240, "ContentCacheSuperpacksManager.java")).w("PackSet %s is not associated to any superpack", byyVar);
            a2 = -1;
        } else {
            a2 = d.a();
        }
        return lfb.g(new cla(o, a2));
    }

    final void f() {
        jsu j = jsv.j();
        j.a = (String) f.c();
        j.d(1);
        j.g(2);
        hiz k = hiz.k(this.c.e("content_cache", ((Long) g.c()).intValue(), j.a()));
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(bxl.h);
        k.E(hjg.a(this.i, null, afpVar, z, e, e2, e3));
        hiz v = k.v(new bzf(this, 19), this.i).v(new bzf(this, 20), this.i);
        afp afpVar2 = afp.STARTED;
        boolean z2 = jam.b;
        llk e4 = llp.e();
        llk e5 = llp.e();
        llk e6 = llp.e();
        e4.h(new bxj(this, 9));
        e5.h(bxl.g);
        v.E(hjg.a(this.i, null, afpVar2, z2, e4, e5, e6));
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fd(ijg ijgVar) {
        hqr hqrVar = (hqr) ijgVar;
        f();
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        f();
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        f();
    }
}
