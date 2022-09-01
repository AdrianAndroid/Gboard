package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: nxw  reason: default package */
/* loaded from: classes2.dex */
public final class nxw extends ntz {
    final ntt a;
    final obw b;
    final ntm c;
    final nyj d;
    final nyk e;
    public List f;
    obf g;
    public boolean h;
    boolean i;
    public final /* synthetic */ oce j;
    oqv k;

    public nxw() {
    }

    @Override // defpackage.ntz
    public final nry a() {
        return this.a.b;
    }

    @Override // defpackage.ntz
    public final Object b() {
        jdg.G(this.h, "Subchannel is not started");
        return this.g;
    }

    @Override // defpackage.ntz
    public final void c() {
        this.j.m.c();
        jdg.G(this.h, "not started");
        this.g.a();
    }

    @Override // defpackage.ntz
    public final void d() {
        oqv oqvVar;
        this.j.m.c();
        if (this.g == null) {
            this.i = true;
            return;
        }
        if (!this.i) {
            this.i = true;
        } else if (!this.j.A || (oqvVar = this.k) == null) {
            return;
        } else {
            oqvVar.j();
            this.k = null;
        }
        oce oceVar = this.j;
        if (!oceVar.A) {
            this.k = oceVar.m.d(new obj(new obv(this, 5)), 5L, TimeUnit.SECONDS, this.j.i.b());
        } else {
            this.g.h(oce.c);
        }
    }

    @Override // defpackage.ntz
    public final void e(nub nubVar) {
        this.j.m.c();
        jdg.G(!this.h, "already started");
        jdg.G(!this.i, "already shutdown");
        jdg.G(!this.j.A, "Channel is being terminated");
        this.h = true;
        List list = this.a.a;
        String b = this.j.b();
        oce oceVar = this.j;
        String str = oceVar.p;
        nyz nyzVar = oceVar.i;
        ScheduledExecutorService b2 = nyzVar.b();
        nvz nvzVar = this.j.m;
        obb obbVar = new obb(this, nubVar);
        oce oceVar2 = this.j;
        obf obfVar = new obf(list, b, str, nyzVar, b2, nvzVar, obbVar, oceVar2.G, oceVar2.C.a(), this.c, this.d);
        nyk nykVar = this.j.E;
        ntf ntfVar = new ntf();
        ntfVar.a = "Child Subchannel started";
        ntfVar.b = ntg.CT_INFO;
        ntfVar.b(this.j.l.a());
        ntfVar.c = obfVar;
        nykVar.b(ntfVar.a());
        this.g = obfVar;
        ntj.b(this.j.G.e, obfVar);
        this.j.u.add(obfVar);
    }

    @Override // defpackage.ntz
    public final void f(List list) {
        this.j.m.c();
        this.f = list;
        obf obfVar = this.g;
        jdg.Q(list, "newAddressGroups");
        obf.b(list, "newAddressGroups contains null entry");
        jdg.w(!list.isEmpty(), "newAddressGroups is empty");
        obfVar.e.execute(new nzm(obfVar, Collections.unmodifiableList(new ArrayList(list)), 9));
    }

    public final String toString() {
        return this.c.toString();
    }

    public nxw(oce oceVar, ntt nttVar, obw obwVar) {
        this.j = oceVar;
        this.f = nttVar.a;
        this.a = nttVar;
        this.b = obwVar;
        ntm b = ntm.b("Subchannel", oceVar.b());
        this.c = b;
        long a = oceVar.l.a();
        StringBuilder sb = new StringBuilder("Subchannel for ");
        List list = nttVar.a;
        sb.append(list);
        nyk nykVar = new nyk(b, a, "Subchannel for ".concat(list.toString()));
        this.e = nykVar;
        this.d = new nyj(nykVar, oceVar.l);
    }
}
