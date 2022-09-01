package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: igq  reason: default package */
/* loaded from: classes.dex */
public final class igq {
    public final igk a;
    public hqo e;
    public hqq f;
    public hho g;
    public hho h;
    public hho i;
    public inm j;
    public ifu k;
    public irm l;
    public inm m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile boolean p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public volatile boolean u;
    final /* synthetic */ igr v;
    private volatile boolean w;
    public final AtomicReference c = new AtomicReference(llp.q());
    public final AtomicReference d = new AtomicReference(llp.q());
    public final ino b = ino.L();

    public igq(igr igrVar, igk igkVar) {
        this.v = igrVar;
        this.a = igkVar;
    }

    public final void b(List list) {
        this.r = false;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (igb.b((hqt) it.next(), (llp) this.d.get())) {
                    this.r = true;
                    break;
                }
            } else {
                break;
            }
        }
        a();
    }

    public final void c(hqt hqtVar) {
        boolean z = false;
        if (hqtVar != null && igb.b(hqtVar, (llp) this.c.get())) {
            z = true;
        }
        this.q = z;
        a();
    }

    public final void d(String str) {
        this.u = this.a.a.g().contains(Integer.valueOf(this.b.b(str, 1)));
    }

    public final void e(String str) {
        d(hyq.l(str));
    }

    public final void a() {
        boolean z = this.n && this.s && this.o && this.p && this.q && this.r && this.t && this.u;
        if (z == this.w) {
            return;
        }
        this.w = z;
        if (!z) {
            this.a.c(false);
            igk igkVar = this.a;
            ifv.f(igkVar.a.a, igkVar, false);
            return;
        }
        igk igkVar2 = this.a;
        igg iggVar = igkVar2.a;
        ifv.f(iggVar.a, igkVar2, true);
        iggVar.b.getSimpleName();
        igf igfVar = igf.ON_DEMAND;
        int ordinal = iggVar.d.ordinal();
        if (ordinal == 1) {
            this.a.b(this.v.b);
        } else if (ordinal == 2) {
            igk igkVar3 = this.a;
            igr igrVar = this.v;
            igkVar3.d(igrVar.b, igrVar.e);
        } else if (ordinal == 3) {
            igk igkVar4 = this.a;
            igr igrVar2 = this.v;
            igkVar4.d(igrVar2.b, igrVar2.d);
        }
        iggVar.a.getSimpleName();
    }
}
