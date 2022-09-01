package defpackage;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: orh  reason: default package */
/* loaded from: classes2.dex */
public final class orh {
    public int a;
    public final Object b;
    public Object c;
    public Object d;
    public final Object e;
    public final Object f;

    public orh(gwj gwjVar, gwl gwlVar) {
        this.b = new HashSet();
        this.a = Integer.MAX_VALUE;
        this.f = gwjVar;
        this.e = gwlVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final boolean a() {
        return b() || !this.e.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final boolean b() {
        return this.a < this.c.size();
    }

    public orh(oou oouVar, mlu mluVar, byte[] bArr) {
        List m;
        this.c = Collections.emptyList();
        this.d = Collections.emptyList();
        this.e = new ArrayList();
        this.b = oouVar;
        this.f = mluVar;
        opz opzVar = oouVar.a;
        Proxy proxy = oouVar.h;
        if (proxy != null) {
            this.c = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = oouVar.g.select(opzVar.i());
            if (select == null || select.isEmpty()) {
                m = oqs.m(Proxy.NO_PROXY);
            } else {
                m = oqs.l(select);
            }
            this.c = m;
        }
        this.a = 0;
    }
}
