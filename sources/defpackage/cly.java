package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cly  reason: default package */
/* loaded from: classes.dex */
public final class cly {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSuperpacksManager");
    static final hhl b = hhq.h("emoji_superpacks_manifest_url", "https://www.gstatic.com/android/keyboard/modelpack/emoji/20190807165503/superpacks_manifest.zip");
    static final hhl c = hhq.f("emoji_superpacks_manifest_version", 20190807);
    private static volatile cly l;
    public final bze d;
    public final Context e;
    public final Executor f;
    private final hhk flagManifestUrlObserver = new bvl(this, 7);
    private final hhk flagManifestVersionObserver = new bvl(this, 8);
    public final AtomicInteger g = new AtomicInteger(-1);
    public final AtomicReference h = new AtomicReference(null);
    public final AtomicReference i = new AtomicReference(null);
    public final Map j = new ConcurrentHashMap(2);
    public final Map k = new ConcurrentHashMap(2);

    private cly(Context context) {
        bze a2 = bzd.a(context);
        mks a3 = gxo.a(10);
        hrx.y(context);
        this.e = context;
        this.d = a2;
        this.f = a3;
    }

    public static cly a(Context context) {
        cly clyVar = l;
        if (clyVar == null) {
            synchronized (cly.class) {
                clyVar = l;
                if (clyVar == null) {
                    clyVar = new cly(context.getApplicationContext());
                    b.e(clyVar.flagManifestUrlObserver);
                    c.e(clyVar.flagManifestVersionObserver);
                    jan janVar = jan.b;
                    mks a2 = gxo.a(10);
                    bze bzeVar = clyVar.d;
                    bzt a3 = bzu.a("emoji");
                    a3.e = 300;
                    a3.f = 300;
                    bzeVar.i(a3.a());
                    bze bzeVar2 = clyVar.d;
                    bzt a4 = bzu.a("bundled_emoji");
                    a4.b(new cls(clyVar.e, janVar, a2, 0));
                    a4.b(new cls(clyVar.e, janVar, a2, 1, null));
                    a4.e = 300;
                    a4.f = 300;
                    bzeVar2.i(a4.a());
                    kcu.U(clyVar.d.c("emoji"), new buo(clyVar, 6), clyVar.f);
                    l = clyVar;
                }
            }
        }
        return clyVar;
    }

    private final void e(final boolean z, boolean z2) {
        mko P;
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSuperpacksManager", "triggerSync", 378, "EmojiSuperpacksManager.java")).w("triggerSync() : isBundled = %s", Boolean.valueOf(z));
        final String str = true != z ? "emoji" : "bundled_emoji";
        final int intValue = ((Long) c.c()).intValue();
        mko mkoVar = (mko) this.k.get(str);
        if (mkoVar == null || intValue != this.g.get()) {
            if (TextUtils.equals(str, "bundled_emoji")) {
                P = kcu.P(new kef(this, str, intValue, 1), this.f);
            } else {
                final String str2 = (String) b.c();
                final boolean z3 = this.g.get() == -1 && ((bzr) this.d).j.a();
                final String str3 = str;
                P = kcu.P(new mix() { // from class: clw
                    @Override // defpackage.mix
                    public final mko a() {
                        cly clyVar = cly.this;
                        String str4 = str3;
                        int i = intValue;
                        String str5 = str2;
                        boolean z4 = z3;
                        bze bzeVar = clyVar.d;
                        jsu j = jsv.j();
                        j.a = str5;
                        j.b = "zip";
                        j.d(2);
                        j.g(z4 ? 1 : 0);
                        return bzeVar.e(str4, i, j.a());
                    }
                }, this.f);
            }
            mkoVar = P;
            this.k.put(str, mkoVar);
        } else {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSuperpacksManager", "sync", 433, "EmojiSuperpacksManager.java")).w("Already registered manifest for %s", str);
        }
        mko mkoVar2 = mkoVar;
        llp b2 = hqr.b();
        Locale[] localeArr = new Locale[b2.size()];
        for (int i = 0; i < b2.size(); i++) {
            localeArr[i] = ((hqt) b2.get(i)).i().q();
        }
        jyu g = jsq.g();
        g.e("enabled_locales", localeArr);
        hiz h = hiz.k(mio.h(mio.h(mkoVar2, new jkd(this, str, z2, g.b(), 1), this.f), new bxo(this, str, 17), this.f)).h(lfl.IS_NULL, mjl.a);
        afp afpVar = afp.STARTED;
        boolean z4 = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new hiu() { // from class: clv
            @Override // defpackage.hiu
            public final void a(Object obj) {
                cly clyVar = cly.this;
                boolean z5 = z;
                String str4 = str;
                byy byyVar = (byy) obj;
                String str5 = "bundled_emoji";
                if ((z5 && clyVar.j.get(str5) == null) || !byyVar.i()) {
                    ((ltd) ((ltd) cly.a.b()).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSuperpacksManager", "processPackSet", 502, "EmojiSuperpacksManager.java")).w("processPackSet() : isBundled = %s", Boolean.valueOf(z5));
                    if (true != z5) {
                        str5 = "emoji";
                    }
                    byy byyVar2 = (byy) clyVar.j.put(str5, byyVar);
                    if (byyVar2 != null) {
                        byyVar2.close();
                    }
                    opu opuVar = (opu) clyVar.h.get();
                    if (opuVar == null || byyVar.h().isEmpty()) {
                        ((ltd) ((ltd) cly.a.b()).k("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/EmojiSuperpacksManager", "processPackSet", 515, "EmojiSuperpacksManager.java")).t("processPackSet() : listener is null.");
                    } else {
                        Delight5Facilitator delight5Facilitator = (Delight5Facilitator) opuVar.a;
                        Delight5Facilitator.v(kcu.P(new cba(delight5Facilitator, delight5Facilitator.j, delight5Facilitator.f, delight5Facilitator.l), delight5Facilitator.b), "Delight5ReloadEmoji");
                    }
                } else {
                    byyVar.close();
                }
                clyVar.k.remove(str4);
            }
        });
        e2.h(new bqx(this, str, 3));
        h.E(hjg.a(this.f, null, afpVar, z4, e, e2, e3));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.io.File f(java.util.Locale r6, int r7, defpackage.byy r8) {
        /*
            r5 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            android.content.Context r1 = r5.e
            java.util.Collection r2 = r8.g()
            juc r6 = defpackage.cxq.a(r1, r6, r2)
            if (r6 != 0) goto L11
            return r0
        L11:
            java.lang.String r6 = r6.i()
            java.io.File r6 = r8.f(r6)
            java.io.File[] r6 = r6.listFiles()
            if (r6 != 0) goto L20
            return r0
        L20:
            int r8 = r6.length
            r1 = 0
        L22:
            if (r1 >= r8) goto L4b
            r2 = r6[r1]
            r3 = 2
            java.lang.String r4 = ".shortcuts"
            if (r7 != r3) goto L36
            java.lang.String r3 = r2.getAbsolutePath()
            boolean r3 = r3.endsWith(r4)
            if (r3 != 0) goto L40
            goto L48
        L36:
            java.lang.String r3 = r2.getAbsolutePath()
            boolean r3 = r3.endsWith(r4)
            if (r3 != 0) goto L48
        L40:
            boolean r3 = r2.exists()
            if (r3 == 0) goto L48
            r0 = r2
            goto L4b
        L48:
            int r1 = r1 + 1
            goto L22
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cly.f(java.util.Locale, int, byy):java.io.File");
    }

    public final void b() {
        e(false, false);
    }

    public final boolean c(Locale locale) {
        return (f(locale, 1, (byy) this.j.get("bundled_emoji")) == null && f(locale, 1, (byy) this.j.get("emoji")) == null) ? false : true;
    }

    public final File d(boolean z, Locale locale, int i) {
        File f = f(locale, i, (byy) this.j.get("emoji"));
        if (f != null) {
            return f;
        }
        e(false, z);
        Context context = this.e;
        List<Locale> a2 = jaz.a(context, locale);
        Iterable<String> i2 = cxq.a.i(context.getResources().getStringArray(R.array.f1070_resource_name_obfuscated_res_0x7f030005)[0]);
        for (Locale locale2 : a2) {
            for (String str : i2) {
                if (jay.i(jay.f(str), locale2)) {
                    File f2 = f(locale, i, (byy) this.j.get("bundled_emoji"));
                    if (f2 != null) {
                        return f2;
                    }
                    e(true, false);
                    return null;
                }
            }
        }
        return null;
    }
}
