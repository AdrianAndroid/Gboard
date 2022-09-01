package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: lr  reason: default package */
/* loaded from: classes.dex */
public class lr extends mb {
    private lp c;
    private lp d;

    public static final int e(View view, lp lpVar) {
        return (lpVar.d(view) + (lpVar.b(view) / 2)) - (lpVar.j() + (lpVar.k() / 2));
    }

    private static final View g(ly lyVar, lp lpVar) {
        int as = lyVar.as();
        View view = null;
        if (as == 0) {
            return null;
        }
        int j = lpVar.j() + (lpVar.k() / 2);
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < as) {
            View aE = lyVar.aE(i2);
            int abs = Math.abs((lpVar.d(aE) + (lpVar.b(aE) / 2)) - j);
            int i3 = abs < i ? abs : i;
            if (abs < i) {
                view = aE;
            }
            i2++;
            i = i3;
        }
        return view;
    }

    public final lp a(ly lyVar) {
        lp lpVar = this.d;
        if (lpVar == null || lpVar.a != lyVar) {
            this.d = lp.p(lyVar);
        }
        return this.d;
    }

    public final lp b(ly lyVar) {
        lp lpVar = this.c;
        if (lpVar == null || lpVar.a != lyVar) {
            this.c = lp.r(lyVar);
        }
        return this.c;
    }

    @Override // defpackage.mb
    public View c(ly lyVar) {
        if (lyVar.af()) {
            return g(lyVar, b(lyVar));
        }
        if (!lyVar.ae()) {
            return null;
        }
        return g(lyVar, a(lyVar));
    }

    @Override // defpackage.mb
    public final int[] d(ly lyVar, View view) {
        int[] iArr = new int[2];
        if (lyVar.ae()) {
            iArr[0] = e(view, a(lyVar));
        } else {
            iArr[0] = 0;
        }
        if (lyVar.af()) {
            iArr[1] = e(view, b(lyVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
