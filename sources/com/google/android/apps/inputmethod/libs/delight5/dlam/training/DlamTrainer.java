package com.google.android.apps.inputmethod.libs.delight5.dlam.training;

import android.content.Context;
import com.google.android.keyboard.client.delight5.LanguageIdentifier;
import j$.util.Map;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DlamTrainer implements Callable, cda {
    final cdf c;
    private final LanguageIdentifier e;
    private final cdb f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final idk h;
    private final ccx i;
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/delight5/dlam/training/DlamTrainer");
    static final hhl a = hhq.e("dlam_language_identify_prob_threshold", 0.5d);
    public static final hhl b = hhq.f("dlam_prob_buckets_num", 4);

    static {
        hhq.e("dlam_language_ratio", 0.5d);
    }

    public DlamTrainer(Context context) {
        cdb b2 = cdb.b(context);
        LanguageIdentifier languageIdentifier = new LanguageIdentifier(context, 2);
        ieh j = ieh.j();
        ccu.a(context);
        ccx a2 = ccx.a(context);
        cdf cdfVar = new cdf();
        hrx.y(context);
        this.f = b2;
        this.e = languageIdentifier;
        this.h = j;
        this.i = a2;
        this.c = cdfVar;
    }

    private final void b() {
        if (ccu.c() && !this.f.d()) {
            ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/delight5/dlam/training/DlamTrainer", "reschedule", 490, "DlamTrainer.java")).t("There was a problem rescheduling the DLAM training task.");
        }
    }

    private static final cdc c(Map map, Object obj, float f, int i, float f2) {
        cdc cdcVar = (cdc) Map.EL.computeIfAbsent(map, obj, byw.e);
        double d2 = cdcVar.b;
        double d3 = f;
        Double.isNaN(d3);
        cdcVar.b = d2 + d3;
        cdcVar.a++;
        cdcVar.c += i;
        if (f >= f2) {
            cdcVar.d++;
        }
        return cdcVar;
    }

    @Override // defpackage.cda
    public final void a() {
        this.g.set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x08d3, code lost:
        if (r6.c.size() == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x08d5, code lost:
        r7 = defpackage.hqr.b();
        r8 = r7.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x08de, code lost:
        if (r9 >= r8) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x08e0, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x08f4, code lost:
        if (r6.c.contains(((defpackage.hqt) r7.get(r9)).i().n) == false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0724  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 2340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.delight5.dlam.training.DlamTrainer.call():java.lang.Object");
    }
}
