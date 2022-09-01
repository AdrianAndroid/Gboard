package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: jps  reason: default package */
/* loaded from: classes.dex */
public final class jps implements jpt {
    public static final /* synthetic */ jps a = new jps(1);
    private final /* synthetic */ int b;

    public jps(int i) {
        this.b = i;
    }

    private final Object b(mov movVar, int i) {
        int p;
        if (i >= 5) {
            throw new jpz("Array has a depth greater than max of 5: ".concat(movVar.d()));
        }
        int p2 = movVar.p() - 1;
        if (p2 == 0) {
            movVar.j();
            ArrayList arrayList = new ArrayList();
            while (movVar.n()) {
                arrayList.add(b(movVar, i + 1));
            }
            movVar.l();
            return arrayList;
        } else if (p2 == 5) {
            return movVar.h();
        } else {
            if (p2 == 6) {
                return Integer.valueOf(movVar.b());
            }
            if (p2 == 7) {
                return Boolean.valueOf(movVar.o());
            }
            throw new jpz("Unsupported extra type found: " + msc.h(p) + ": " + movVar.d());
        }
    }

    @Override // defpackage.jpt
    public final Object a(String str, mov movVar) {
        if (this.b == 0) {
            return b(movVar, 0);
        }
        ltg ltgVar = dkc.a;
        if ("version".equals(str)) {
            return Integer.valueOf(movVar.b());
        }
        return movVar.h();
    }
}
