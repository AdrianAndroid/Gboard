package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkw  reason: default package */
/* loaded from: classes.dex */
public final class jkw implements jkl {
    public final Executor a;
    public final kqr b;
    private final jjd c;

    public jkw(jjd jjdVar, kqr kqrVar, Executor executor) {
        this.c = jjdVar;
        this.b = kqrVar;
        this.a = executor;
    }

    @Override // defpackage.jkl
    public final mko a(jig jigVar) {
        int i = jmk.a;
        jig az = lre.az(jigVar, (this.c.a() / 1000) + jigVar.i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(az);
        return m(arrayList);
    }

    @Override // defpackage.jkl
    public final mko b() {
        return jnd.c(k()).g(new jku(this, 7), this.a);
    }

    @Override // defpackage.jkl
    public final mko c() {
        ArrayList arrayList = new ArrayList();
        return jnd.c(this.b.b(new jks(arrayList, 11), this.a)).e(new jks(arrayList, 4), this.a);
    }

    @Override // defpackage.jkl
    public final mko d() {
        ArrayList arrayList = new ArrayList();
        return jnd.c(this.b.b(new jks(arrayList, 9), this.a)).e(new jks(arrayList, 10), this.a);
    }

    @Override // defpackage.jkl
    public final mko e() {
        return jco.i(this.b.a(), jkc.r, this.a);
    }

    @Override // defpackage.jkl
    public final mko f() {
        return mkk.a;
    }

    @Override // defpackage.jkl
    public final mko g(jiq jiqVar) {
        return jco.i(this.b.a(), new jks(lre.av(jiqVar), 8), this.a);
    }

    @Override // defpackage.jkl
    public final mko h(jiq jiqVar) {
        return jco.i(this.b.a(), new jks(lre.av(jiqVar), 3), this.a);
    }

    @Override // defpackage.jkl
    public final mko i(jiq jiqVar) {
        return jnd.c(this.b.b(new jks(lre.av(jiqVar), 6), this.a)).e(jkc.n, this.a).a(IOException.class, jkc.o, this.a);
    }

    @Override // defpackage.jkl
    public final mko j(List list) {
        return jnd.c(this.b.b(new jks(list, 5), this.a)).e(jkc.i, this.a).a(IOException.class, jkc.j, this.a);
    }

    @Override // defpackage.jkl
    public final mko k() {
        return this.b.b(jkc.s, this.a);
    }

    @Override // defpackage.jkl
    public final mko l(jiq jiqVar, jig jigVar) {
        return jnd.c(this.b.b(new fyn(lre.av(jiqVar), jigVar, 20), this.a)).e(jkc.l, this.a).a(IOException.class, jkc.m, this.a);
    }

    @Override // defpackage.jkl
    public final mko m(List list) {
        return jnd.c(this.b.b(new jks(list, 7), this.a)).e(jkc.p, this.a).a(IOException.class, jkc.q, this.a);
    }
}
