package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: awl  reason: default package */
/* loaded from: classes.dex */
public final class awl {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public ath c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public ava h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public auw m;
    public atk n;
    public awt o;
    public boolean p;
    public boolean q;
    public bnc r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ave a(Class cls) {
        ave aveVar = (ave) this.i.get(cls);
        if (aveVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aveVar = (ave) entry.getValue();
                    break;
                }
            }
        }
        if (aveVar == null) {
            if (!this.i.isEmpty() || !this.p) {
                return bak.b;
            }
            String valueOf = String.valueOf(cls);
            throw new IllegalArgumentException("Missing transformation for " + valueOf + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        }
        return aveVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r4v6, types: [xx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [xx, java.lang.Object] */
    public final axf b(Class cls) {
        axf axfVar;
        bmf b = this.c.b();
        Class cls2 = this.g;
        Class cls3 = this.j;
        Object obj = b.c;
        bej bejVar = (bej) obj;
        bgh bghVar = (bgh) bejVar.c.getAndSet(null);
        if (bghVar == null) {
            bghVar = new bgh();
        }
        bghVar.a(cls, cls2, cls3);
        synchronized (bejVar.b) {
            axfVar = (axf) ((bej) obj).b.get(bghVar);
        }
        bejVar.c.set(bghVar);
        Object obj2 = b.c;
        if (bej.a.equals(axfVar)) {
            return null;
        }
        if (axfVar != null) {
            return axfVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : ((bek) b.j).b(cls, cls2)) {
            for (Class cls5 : ((aqr) b.f).g(cls4, cls3)) {
                arrayList.add(new awp(cls, cls4, cls5, ((bek) b.j).a(cls, cls4), ((aqr) b.f).f(cls4, cls5), b.d));
            }
        }
        axf axfVar2 = arrayList.isEmpty() ? null : new axf(cls, cls2, cls3, arrayList, b.d);
        Object obj3 = b.c;
        synchronized (((bej) obj3).b) {
            ((bej) obj3).b.put(new bgh(cls, cls2, cls3), axfVar2 != null ? axfVar2 : bej.a);
        }
        return axfVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final axn c() {
        return this.c.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aye d() {
        return this.r.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.Object] */
    public final List e() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            List f = f();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                fws fwsVar = (fws) f.get(i);
                if (!this.b.contains(fwsVar.c)) {
                    this.b.add(fwsVar.c);
                }
                for (int i2 = 0; i2 < fwsVar.b.size(); i2++) {
                    if (!this.b.contains(fwsVar.b.get(i2))) {
                        this.b.add((auw) fwsVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            List d = this.c.b().d(this.d);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                fws b = ((azn) d.get(i)).b(this.d, this.e, this.f, this.h);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List g(File file) {
        return this.c.b().d(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(Class cls) {
        return b(cls) != null;
    }
}
