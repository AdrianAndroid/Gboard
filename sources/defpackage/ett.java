package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.inputmethod.latin.R;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: ett  reason: default package */
/* loaded from: classes.dex */
public final class ett implements etd {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/ThemeIndicesSuperpacksManager");
    public static final hhl b = hhq.h("theme_indices_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/modelpack/theme_indices/201903111437/superpacks_manifest.json");
    static final hhl c = hhq.f("theme_indices_superpacks_manifest_version", 1);
    private static volatile ett j;
    public final bze d;
    public final Executor e;
    public final AtomicReference f = new AtomicReference(null);
    public final AtomicInteger g = new AtomicInteger(-1);
    public final AtomicReference h = new AtomicReference(null);
    public final Set i = Collections.newSetFromMap(new IdentityHashMap());
    private final Resources k;
    private mko l;

    private ett(Context context) {
        bze a2 = bzd.a(context);
        mks a3 = gxo.a(10);
        this.k = context.getResources();
        this.d = a2;
        this.e = a3;
    }

    public static ett c(Context context) {
        ett ettVar = j;
        if (ettVar == null) {
            synchronized (ett.class) {
                ettVar = j;
                if (ettVar == null) {
                    ettVar = new ett(context.getApplicationContext());
                    bze bzeVar = ettVar.d;
                    bzt a2 = bzu.a("theme_indices");
                    a2.e = 300;
                    a2.f = 300;
                    bzeVar.i(a2.a());
                    kcu.U(ettVar.d.c("theme_indices"), new eay(ettVar, 6), ettVar.e);
                    j = ettVar;
                }
            }
        }
        return ettVar;
    }

    @Override // defpackage.etd
    public final void a(etc etcVar) {
        mko h;
        this.i.add(etcVar);
        int intValue = ((Long) c.c()).intValue();
        if (this.l == null || intValue != this.g.get()) {
            mko P = kcu.P(new lcc(this, intValue, 1), this.e);
            this.l = P;
            h = mio.h(mio.h(mio.g(P, new ego(this, intValue, 4), this.e), new eoi(this, 2), this.e), new eoi(this, 3), this.e);
        } else {
            h = mio.h(kcu.P(new clc(this, 4), this.e), new eoi(this, 4), this.e);
        }
        kcu.U(h, new ets(this), this.e);
    }

    @Override // defpackage.etd
    public final void b(etc etcVar) {
        this.i.remove(etcVar);
    }

    public final mko d() {
        return this.d.b("theme_indices");
    }

    public final mko e() {
        String f = f();
        jyu g = jsq.g();
        g.e("device_locale", f);
        jsq b2 = g.b();
        bze bzeVar = this.d;
        return bzeVar.h("theme_indices", new etr(((bzr) bzeVar).j), b2);
    }

    public final String f() {
        String string = this.k.getString(R.string.f150540_resource_name_obfuscated_res_0x7f1401a9);
        return string.startsWith("-") ? string.substring(1) : string;
    }
}
