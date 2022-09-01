package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: dkh  reason: default package */
/* loaded from: classes.dex */
public abstract class dkh implements hho {
    public static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/hmm/superpacks/SuperpacksManagerBase");
    public final bze d;
    public final hhl f;
    public final hhl g;
    public final ExecutorService h;
    public final irt i = new dkf(this);
    public final String e = "hmmdictionary";

    /* JADX INFO: Access modifiers changed from: protected */
    public dkh(hhl hhlVar, hhl hhlVar2) {
        mks a = gxo.a(2);
        bze a2 = bzd.a(guw.a());
        this.h = a;
        this.d = a2;
        this.f = hhlVar;
        this.g = hhlVar2;
    }

    private final int b() {
        return ((Long) this.g.c()).intValue();
    }

    private final String g() {
        return (String) this.f.c();
    }

    public jqk c(bys bysVar) {
        throw null;
    }

    public abstract void d(byy byyVar);

    protected boolean e() {
        throw null;
    }

    public final void f() {
        String str;
        mko h;
        if (e()) {
            ltg ltgVar = c;
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/SuperpacksManagerBase", "registerSuperpackManifest", 111, "SuperpacksManagerBase.java")).t("registerSuperpackManifest()");
            Long l = (Long) this.g.a();
            int intValue = l != null ? l.intValue() : 0;
            int b = b();
            if (b > intValue) {
                str = g();
            } else {
                str = (String) this.f.a();
            }
            if (b > intValue) {
                intValue = b;
            }
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/SuperpacksManagerBase", "getMetadataUriAndVersion", 275, "SuperpacksManagerBase.java")).z("getMetadataUriAndVersion() :  %d : %s", intValue, str);
            xv a = xv.a(str, Integer.valueOf(intValue));
            String str2 = (String) a.a;
            int intValue2 = ((Integer) a.b).intValue();
            if (str2.isEmpty()) {
                ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/SuperpacksManagerBase", "registerSuperpackManifest", 117, "SuperpacksManagerBase.java")).t("registerSuperpackManifest(): did not sync superpack since metadata url is empty");
                h = kcu.K(-1);
            } else {
                h = mio.h(mio.h(this.d.c(this.e), new dke(this, intValue2, str2, 0), this.h), new coa(this, 9), this.h);
            }
            kcu.U(mio.h(h, new coa(this, 10), this.h), new dkg(this, this.e), this.h);
        }
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        g();
        b();
        f();
    }
}
