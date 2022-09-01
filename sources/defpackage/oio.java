package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: oio  reason: default package */
/* loaded from: classes2.dex */
public final class oio implements nub {
    final /* synthetic */ ntz a;
    final /* synthetic */ nuc b;
    private final /* synthetic */ int c;

    public oio(odd oddVar, ntz ntzVar, int i) {
        this.c = i;
        this.b = oddVar;
        this.a = ntzVar;
    }

    public oio(oit oitVar, ntz ntzVar, int i) {
        this.c = i;
        this.b = oitVar;
        this.a = ntzVar;
    }

    @Override // defpackage.nub
    public final void a(nsm nsmVar) {
        nua odbVar;
        boolean z = true;
        if (this.c != 0) {
            nuc nucVar = this.b;
            ntz ntzVar = this.a;
            nsl nslVar = nsmVar.a;
            if (nslVar == nsl.SHUTDOWN) {
                return;
            }
            if (nslVar == nsl.TRANSIENT_FAILURE || nslVar == nsl.IDLE) {
                ((odd) nucVar).b.c();
            }
            int ordinal = nslVar.ordinal();
            if (ordinal == 0) {
                odbVar = new odb(ntw.a);
            } else if (ordinal == 1) {
                odbVar = new odb(ntw.c(ntzVar));
            } else if (ordinal == 2) {
                odbVar = new odb(ntw.b(nsmVar.b));
            } else if (ordinal == 3) {
                odbVar = new odc((odd) nucVar, ntzVar);
            } else {
                new StringBuilder("Unsupported state:").append(nslVar);
                throw new IllegalArgumentException("Unsupported state:".concat(nslVar.toString()));
            }
            ((odd) nucVar).b.d(nslVar, odbVar);
            return;
        }
        nuc nucVar2 = this.b;
        ntz ntzVar2 = this.a;
        oit oitVar = (oit) nucVar2;
        Map map = oitVar.d;
        nxw nxwVar = (nxw) ntzVar2;
        nxwVar.j.m.c();
        jdg.G(nxwVar.h, "not started");
        List list = nxwVar.f;
        if (list.size() != 1) {
            z = false;
        }
        jdg.J(z, "%s does not have exactly one group", list);
        if (map.get(oit.d((nsz) list.get(0))) != ntzVar2) {
            return;
        }
        nsl nslVar2 = nsmVar.a;
        if (nslVar2 == nsl.TRANSIENT_FAILURE || nslVar2 == nsl.IDLE) {
            oitVar.c.c();
        }
        if (nsmVar.a == nsl.IDLE) {
            ntzVar2.c();
        }
        oir e = oit.e(ntzVar2);
        if (((nsm) e.a).a.equals(nsl.TRANSIENT_FAILURE) && (nsmVar.a.equals(nsl.CONNECTING) || nsmVar.a.equals(nsl.IDLE))) {
            return;
        }
        e.a = nsmVar;
        oitVar.g();
    }
}
