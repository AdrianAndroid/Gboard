package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* renamed from: aor  reason: default package */
/* loaded from: classes.dex */
public final class aor extends aoh {
    private final apy e = new apy();
    private final Path f = new Path();

    public aor(List list) {
        super(list);
    }

    @Override // defpackage.aoh
    public final /* bridge */ /* synthetic */ Object f(asi asiVar, float f) {
        List list;
        apy apyVar = (apy) asiVar.b;
        apy apyVar2 = (apy) asiVar.c;
        apy apyVar3 = this.e;
        if (apyVar3.b == null) {
            apyVar3.b = new PointF();
        }
        boolean z = true;
        if (!apyVar.c && !apyVar2.c) {
            z = false;
        }
        apyVar3.c = z;
        if (apyVar.a.size() != apyVar2.a.size()) {
            asa.a("Curves must have the same number of control points. Shape 1: " + apyVar.a.size() + "\tShape 2: " + apyVar2.a.size());
        }
        int min = Math.min(apyVar.a.size(), apyVar2.a.size());
        if (apyVar3.a.size() < min) {
            for (int size = apyVar3.a.size(); size < min; size++) {
                apyVar3.a.add(new fws());
            }
        } else if (apyVar3.a.size() > min) {
            int size2 = apyVar3.a.size();
            while (true) {
                size2--;
                if (size2 < min) {
                    break;
                }
                apyVar3.a.remove(list.size() - 1);
            }
        }
        PointF pointF = apyVar.b;
        PointF pointF2 = apyVar2.b;
        float c = asc.c(pointF.x, pointF2.x, f);
        float c2 = asc.c(pointF.y, pointF2.y, f);
        if (apyVar3.b == null) {
            apyVar3.b = new PointF();
        }
        apyVar3.b.set(c, c2);
        int size3 = apyVar3.a.size();
        while (true) {
            size3--;
            if (size3 >= 0) {
                fws fwsVar = (fws) apyVar.a.get(size3);
                fws fwsVar2 = (fws) apyVar2.a.get(size3);
                Object obj = fwsVar.a;
                Object obj2 = fwsVar.c;
                Object obj3 = fwsVar.b;
                Object obj4 = fwsVar2.a;
                Object obj5 = fwsVar2.c;
                Object obj6 = fwsVar2.b;
                PointF pointF3 = (PointF) obj;
                PointF pointF4 = (PointF) obj4;
                ((PointF) ((fws) apyVar3.a.get(size3)).a).set(asc.c(pointF3.x, pointF4.x, f), asc.c(pointF3.y, pointF4.y, f));
                PointF pointF5 = (PointF) obj2;
                PointF pointF6 = (PointF) obj5;
                ((PointF) ((fws) apyVar3.a.get(size3)).c).set(asc.c(pointF5.x, pointF6.x, f), asc.c(pointF5.y, pointF6.y, f));
                PointF pointF7 = (PointF) obj3;
                PointF pointF8 = (PointF) obj6;
                ((PointF) ((fws) apyVar3.a.get(size3)).b).set(asc.c(pointF7.x, pointF8.x, f), asc.c(pointF7.y, pointF8.y, f));
            } else {
                asc.g(this.e, this.f);
                return this.f;
            }
        }
    }
}
