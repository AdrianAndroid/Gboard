package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hkb  reason: default package */
/* loaded from: classes.dex */
public final class hkb implements AutoCloseable {
    private static final ltg d = ltg.j("com/google/android/libraries/inputmethod/hint/TooltipLifecycleManager");
    public final hjv a;
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    private Runnable e;
    private final hst f;
    private final hqo g;
    private final hti h;

    public hkb(hjv hjvVar) {
        hjw hjwVar = new hjw(this);
        this.f = hjwVar;
        hjx hjxVar = new hjx(this);
        this.g = hjxVar;
        hjy hjyVar = new hjy(this);
        this.h = hjyVar;
        this.a = hjvVar;
        hjwVar.g(mjl.a);
        gyc gycVar = gyc.b;
        hjyVar.a(gycVar);
        hjxVar.d(gycVar);
    }

    private final void e(String str, boolean z, hkz hkzVar) {
        this.a.c(str, z, hkzVar);
        this.c.remove(str);
        this.a.i(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(leq leqVar, hkz hkzVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            hlf b = this.a.b(str);
            if (b != null && ((Boolean) leqVar.a(b)).booleanValue()) {
                arrayList.add(str);
            }
        }
        for (String str2 : this.c.keySet()) {
            hlf b2 = this.a.b(str2);
            if (b2 != null && ((Boolean) leqVar.a(b2)).booleanValue()) {
                arrayList.add(str2);
            }
        }
        a(arrayList, true, hkzVar, z);
    }

    private final void g(String str) {
        this.a.e(str, 4);
        this.b.remove(str);
        this.a.i(str);
    }

    public final void a(List list, boolean z, hkz hkzVar, boolean z2) {
        Iterator it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.a.b(str) == null) {
                ((ltd) ((ltd) d.d()).k("com/google/android/libraries/inputmethod/hint/TooltipLifecycleManager", "dismissTooltips", 159, "TooltipLifecycleManager.java")).w("Tooltip with id %s not found in tooltipManager.", str);
            } else if (this.b.containsKey(str)) {
                g(str);
            } else {
                hka hkaVar = (hka) this.c.get(str);
                if (hkaVar != null) {
                    if (System.currentTimeMillis() - hkaVar.b >= 0) {
                        e(str, z, hkzVar);
                        z3 = true;
                    }
                } else {
                    ((ltd) ((ltd) d.d()).k("com/google/android/libraries/inputmethod/hint/TooltipLifecycleManager", "dismissTooltips", 176, "TooltipLifecycleManager.java")).w("Tooltip with id %s is not pending or displaying.", str);
                }
            }
        }
        if (!z2 || !z3) {
            return;
        }
        c();
    }

    public final void b(String str) {
        if (this.b.containsKey(str)) {
            g(str);
        } else if (this.c.remove(str) == null) {
        } else {
            dhx dhxVar = (dhx) ((dhy) this.a).e.get(str);
            if (dhxVar != null) {
                dhy.g(dhxVar.a, hkz.INTERRUPTED);
            }
            this.a.i(str);
            c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkb.c():void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.h();
        this.g.f();
        this.h.d();
        Runnable runnable = this.e;
        if (runnable != null) {
            kki.k(runnable);
        }
        for (String str : this.b.keySet()) {
            this.a.e(str, 4);
            this.a.i(str);
        }
        for (String str2 : this.c.keySet()) {
            this.a.c(str2, true, hkz.INTERRUPTED);
            this.a.i(str2);
        }
        this.c.clear();
        this.b.clear();
    }
}
