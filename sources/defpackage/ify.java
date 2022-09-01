package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ify  reason: default package */
/* loaded from: classes.dex */
public final class ify {
    public int b;
    public String c;
    public int f;
    public Class i;
    public iiy[] a = igb.c;
    public boolean d = true;
    public final lls e = llw.h();
    public long g = 0;
    public long h = Long.MAX_VALUE;
    public final List j = new ArrayList();
    public final List k = new ArrayList();
    public final List l = new ArrayList();
    public final List m = new ArrayList();
    public final List n = new ArrayList();

    public final void a(String str) {
        this.l.add(str);
    }

    public final void b(iga igaVar) {
        this.j.add(igaVar);
    }

    public final void c(hhl hhlVar, Object obj) {
        this.e.a(hhlVar, new lfj(obj));
    }

    public final void d(hhl hhlVar) {
        c(hhlVar, true);
    }
}
