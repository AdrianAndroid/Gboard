package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: lnl  reason: default package */
/* loaded from: classes.dex */
public final class lnl extends lmx {
    private final Comparator e;

    public lnl(Comparator comparator) {
        jdg.u(comparator);
        this.e = comparator;
    }

    @Override // defpackage.lmx, defpackage.llf
    public final /* synthetic */ void d(Object obj) {
        super.d(obj);
    }

    @Override // defpackage.lmx
    /* renamed from: l */
    public final lnn g() {
        lrs lrsVar;
        Object[] objArr = this.a;
        Comparator comparator = this.e;
        int i = this.b;
        if (i == 0) {
            lrsVar = lnn.G(comparator);
        } else {
            lre.i(objArr, i);
            Arrays.sort(objArr, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < (objArr.length >> 1)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            lrsVar = new lrs(llp.h(objArr, i2), comparator);
        }
        this.b = lrsVar.size();
        this.c = true;
        return lrsVar;
    }

    public final void m(Object... objArr) {
        super.i(objArr);
    }
}
