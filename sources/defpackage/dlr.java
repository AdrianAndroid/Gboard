package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dlr  reason: default package */
/* loaded from: classes.dex */
public final class dlr implements hho {
    public static final hhl b;
    public static final hhl c;
    private static final hhl[] g;
    private static volatile dlr h;
    public final bze e;
    public final AtomicReference f = new AtomicReference(bze.a);
    private final Executor i;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/keycorrection/KeyCorrectionTfliteModelSuperpacksManager");
    public static volatile boolean d = false;

    static {
        hhl h2 = hhq.h("key_correction_tflite_model_superpacks_manifest_url", "");
        b = h2;
        hhl f = hhq.f("key_correction_tflite_model_superpacks_manifest_version", 2020062001L);
        c = f;
        g = new hhl[]{h2, f};
    }

    private dlr(bze bzeVar, Executor executor) {
        this.e = bzeVar;
        this.i = executor;
        bzt a2 = bzu.a("kc_tflite_model");
        a2.e = 300;
        a2.f = 300;
        bzeVar.i(a2.a());
    }

    public static dlr b(Context context) {
        dlr dlrVar = h;
        if (dlrVar == null) {
            synchronized (dlr.class) {
                dlrVar = h;
                if (dlrVar == null) {
                    dlrVar = new dlr(bzd.a(context.getApplicationContext()), gxo.a(19));
                    hhq.p(dlrVar, g);
                    h = dlrVar;
                }
            }
        }
        return dlrVar;
    }

    public static final String g(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            String path = file2.getPath();
            if (path.endsWith(".tflite")) {
                return path;
            }
        }
        return null;
    }

    private static File h(byy byyVar, String str) {
        for (String str2 : byyVar.h()) {
            if (!str.isEmpty() || (!str2.contains("common") && !str2.contains("space"))) {
                if (str.isEmpty() || str2.contains(str)) {
                    return byyVar.f(str2);
                }
            }
        }
        return null;
    }

    public final String c() {
        byy byyVar = (byy) this.f.get();
        if (!byyVar.i()) {
            File h2 = h(byyVar, "common");
            if (h2 == null) {
                return null;
            }
            return h2.isDirectory() ? g(h2) : h2.getPath();
        }
        f();
        return null;
    }

    public final String d() {
        byy byyVar = (byy) this.f.get();
        if (!byyVar.i()) {
            File h2 = h(byyVar, "");
            if (h2 == null) {
                return null;
            }
            return h2.isDirectory() ? g(h2) : h2.getPath();
        }
        f();
        return null;
    }

    public final String e() {
        byy byyVar = (byy) this.f.get();
        if (!byyVar.i()) {
            File h2 = h(byyVar, "space");
            if (h2 == null) {
                return null;
            }
            return h2.isDirectory() ? g(h2) : h2.getPath();
        }
        f();
        return null;
    }

    final void f() {
        jsu j = jsv.j();
        j.a = (String) b.c();
        j.d(1);
        j.g(2);
        hiz v = hiz.k(this.e.e("kc_tflite_model", ((Long) c.c()).intValue(), j.a())).v(new coa(this, 12), this.i).v(new coa(this, 11), this.i);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new bxj(this, 20));
        e2.h(bxl.p);
        v.E(hjg.a(this.i, null, afpVar, z, e, e2, e3));
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        f();
    }
}
