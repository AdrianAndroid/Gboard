package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: azq  reason: default package */
/* loaded from: classes.dex */
final class azq implements avj, avi {
    private final List a;
    private final xx b;
    private int c = 0;
    private atk d;
    private avi e;
    private List f;
    private boolean g;

    public azq(List list, xx xxVar) {
        this.b = xxVar;
        ce.p(list);
        this.a = list;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            f(this.d, this.e);
            return;
        }
        ce.m(this.f);
        this.e.e(new axd("Fetch failed", new ArrayList(this.f)));
    }

    @Override // defpackage.avj
    public final Class a() {
        return ((avj) this.a.get(0)).a();
    }

    @Override // defpackage.avi
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.avj
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        for (avj avjVar : this.a) {
            avjVar.d();
        }
    }

    @Override // defpackage.avi
    public final void e(Exception exc) {
        List list = this.f;
        ce.m(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        this.d = atkVar;
        this.e = aviVar;
        this.f = (List) this.b.a();
        ((avj) this.a.get(this.c)).f(atkVar, this);
        if (this.g) {
            fh();
        }
    }

    @Override // defpackage.avj
    public final void fh() {
        this.g = true;
        for (avj avjVar : this.a) {
            avjVar.fh();
        }
    }

    @Override // defpackage.avj
    public final int g() {
        return ((avj) this.a.get(0)).g();
    }
}
