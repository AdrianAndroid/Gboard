package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jwb  reason: default package */
/* loaded from: classes.dex */
public final class jwb {
    public final jvr a;
    public final List b;
    public long g;
    public long h;
    public long i;
    private final long k;
    private final long l;
    private final Set j = new HashSet();
    public final List c = new ArrayList();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public final jvy f = new jvy();

    public jwb(jvr jvrVar, jwa jwaVar, List list, long j) {
        Collection<jwa> values;
        this.a = jvrVar;
        this.b = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.j.add(((jvw) it.next()).e());
        }
        this.g = j;
        synchronized (jvrVar.b) {
            values = jvrVar.c.values();
        }
        for (jwa jwaVar2 : values) {
            if (!jwaVar2.c) {
                Map m = jvrVar.m(jwaVar2.a, jvr.a);
                this.e.putAll(m);
                if (jwaVar2.equals(jwaVar)) {
                    this.d.putAll(m);
                }
            }
        }
        this.k = lwm.q(this.d.values());
        this.l = lwm.q(this.e.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        return lwm.p(this.e.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        return lwm.p(this.d.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long c() {
        return (this.l + this.h) - this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long d() {
        return (this.k + this.h) - this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(long j, jvw jvwVar, final int i, int i2) {
        long j2;
        long b;
        lug lugVar = jsh.a;
        Map map = i == 3 ? this.e : this.d;
        Set set = this.j;
        jvu jvuVar = this.a.i;
        ArrayList<jvn> arrayList = new ArrayList();
        for (jvn jvnVar : map.values()) {
            if (!jvuVar.b(jvnVar.b) && !set.contains(jvnVar.a) && jvnVar.c().b() != 2) {
                arrayList.add(jvnVar);
            }
        }
        for (jvn jvnVar2 : arrayList) {
            jvnVar2.c();
        }
        Collections.sort(arrayList, new Comparator() { // from class: jvx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i3 = i;
                jvn jvnVar3 = (jvn) obj;
                jvn jvnVar4 = (jvn) obj2;
                try {
                    jup c = jvnVar3.c();
                    int a = jvnVar3.a();
                    jup c2 = jvnVar4.c();
                    int a2 = jvnVar4.a();
                    long b2 = c.b();
                    long b3 = c2.b();
                    int i4 = (b2 > b3 ? 1 : (b2 == b3 ? 0 : -1));
                    if (b2 != b3) {
                        return i4;
                    }
                    long j3 = a;
                    long j4 = a2;
                    int i5 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
                    if (j3 != j4) {
                        return i5;
                    }
                    long d = c.d();
                    long d2 = c2.d();
                    int i6 = (d > d2 ? 1 : (d == d2 ? 0 : -1));
                    if (d != d2) {
                        return i6;
                    }
                    if (i3 == 3 || i3 == 2) {
                        return (jvnVar3.b() > jvnVar4.b() ? 1 : (jvnVar3.b() == jvnVar4.b() ? 0 : -1));
                    }
                    return (c.e() > c2.e() ? 1 : (c.e() == c2.e() ? 0 : -1));
                } catch (IOException e) {
                    throw new IllegalStateException("Failed to get metadata", e);
                }
            }
        });
        lug lugVar2 = jsh.a;
        int f = jvwVar.f();
        ArrayList<jvn> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            j2 = 0;
            if (!it.hasNext()) {
                break;
            }
            jvn jvnVar3 = (jvn) it.next();
            jup c = jvnVar3.c();
            int b2 = c.b();
            if (b2 > i2) {
                lug lugVar3 = jsh.a;
                Set set2 = jtq.a;
            } else {
                int a = jvnVar3.a();
                if (b2 <= 0 || a < f) {
                    arrayList2.add(jvnVar3);
                    if (i == 3 || i == 2) {
                        b = jvnVar3.b();
                    } else {
                        b = c.e();
                    }
                    j -= b;
                    if (j <= 0) {
                        break;
                    }
                } else {
                    lug lugVar4 = jsh.a;
                }
            }
        }
        lug lugVar5 = jsh.a;
        for (jvn jvnVar4 : arrayList2) {
            this.e.remove(jvnVar4.a);
            this.d.remove(jvnVar4.a);
            long b3 = jvnVar4.b();
            this.c.add(jvnVar4);
            j2 = Math.max(j2, j2 + b3);
            long j3 = this.g;
            this.g = Math.max(j3, b3 + j3);
        }
        long j4 = this.i;
        this.i = Math.max(j4, j2 + j4);
        lug lugVar6 = jsh.a;
        arrayList2.size();
    }
}
