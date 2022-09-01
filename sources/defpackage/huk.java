package defpackage;

import android.content.Context;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: huk  reason: default package */
/* loaded from: classes.dex */
public final class huk implements AutoCloseable {
    private static final qv c = new qv();
    public final LruCache a;
    public boolean b;
    private final Set d = Collections.newSetFromMap(new WeakHashMap());
    private final ino e;
    private final String f;
    private final String g;
    private final ija h;

    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0133 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public huk(defpackage.ino r9, defpackage.ibz r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huk.<init>(ino, ibz):void");
    }

    public static huk a(Context context, ibz ibzVar) {
        qv qvVar = c;
        huk hukVar = (huk) qvVar.get(ibzVar);
        if (hukVar == null) {
            huk hukVar2 = new huk(ino.K(context, null), ibzVar);
            qvVar.put(ibzVar, hukVar2);
            return hukVar2;
        }
        return hukVar;
    }

    public static String b(ibz ibzVar) {
        return "recent_softkeys_".concat(String.valueOf(ibzVar == null ? "default" : ibzVar.l));
    }

    public static void c() {
        int i = 0;
        while (true) {
            qv qvVar = c;
            if (i < qvVar.d) {
                ((huk) qvVar.f(i)).close();
                i++;
            } else {
                qvVar.clear();
                return;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        d();
        this.a.evictAll();
        this.h.f();
    }

    public final void d() {
        if (!this.b) {
            return;
        }
        this.e.j(this.f, htq.b(this.a.snapshot().values().iterator()));
        this.b = false;
    }

    public final void e() {
        if (this.a.size() > 0) {
            f();
        }
    }

    public final void f() {
        synchronized (this.d) {
            Set set = this.d;
            if (set == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(set);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((huj) arrayList.get(i)).w();
            }
        }
    }

    public final void g(huj hujVar) {
        synchronized (this.d) {
            this.d.add(hujVar);
        }
    }

    public final void h(huj hujVar) {
        synchronized (this.d) {
            this.d.remove(hujVar);
        }
    }

    public final hui[] i() {
        if (!irs.d()) {
            return hui.a;
        }
        hui[] huiVarArr = new hui[this.a.size()];
        int size = this.a.size();
        for (hui huiVar : this.a.snapshot().values()) {
            size--;
            huiVarArr[size] = huiVar;
        }
        return huiVarArr;
    }
}
