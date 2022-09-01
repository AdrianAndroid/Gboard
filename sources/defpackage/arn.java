package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: arn  reason: default package */
/* loaded from: classes.dex */
public final class arn implements art {
    public static final arn a = new arn();
    private static final azp b = azp.k("c", "v", "i", "o");

    private arn() {
    }

    @Override // defpackage.art
    public final /* bridge */ /* synthetic */ Object a(arw arwVar, float f) {
        if (arwVar.q() == 1) {
            arwVar.h();
        }
        arwVar.i();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (arwVar.o()) {
            int r = arwVar.r(b);
            if (r == 0) {
                z = arwVar.p();
            } else if (r == 1) {
                list = are.d(arwVar, f);
            } else if (r == 2) {
                list2 = are.d(arwVar, f);
            } else if (r == 3) {
                list3 = are.d(arwVar, f);
            } else {
                arwVar.m();
                arwVar.n();
            }
        }
        arwVar.k();
        if (arwVar.q() == 2) {
            arwVar.j();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new apy(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = (PointF) list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) list.get(i);
            int i2 = i - 1;
            arrayList.add(new fws(asc.f((PointF) list.get(i2), (PointF) list3.get(i2)), asc.f(pointF2, (PointF) list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) list.get(0);
            int i3 = size - 1;
            arrayList.add(new fws(asc.f((PointF) list.get(i3), (PointF) list3.get(i3)), asc.f(pointF3, (PointF) list2.get(0)), pointF3));
        }
        return new apy(pointF, z, arrayList);
    }
}
