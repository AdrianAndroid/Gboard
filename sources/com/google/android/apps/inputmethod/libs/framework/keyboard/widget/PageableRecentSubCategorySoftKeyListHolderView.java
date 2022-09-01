package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PageableRecentSubCategorySoftKeyListHolderView extends dfh {
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final SparseBooleanArray m = new SparseBooleanArray();
    public long n;
    public dez o;
    public int p;
    public ict[] q;
    aky r;

    public PageableRecentSubCategorySoftKeyListHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dey deyVar = new dey(this);
        this.r = deyVar;
        this.g = deyVar;
    }

    private static ict[] M(ict[] ictVarArr, ict[] ictVarArr2) {
        int length;
        int length2;
        if (ictVarArr == null || (length = ictVarArr.length) == 0) {
            return ictVarArr2;
        }
        if (ictVarArr2 == null || (length2 = ictVarArr2.length) == 0) {
            return ictVarArr;
        }
        ict[] ictVarArr3 = new ict[length + length2];
        System.arraycopy(ictVarArr, 0, ictVarArr3, 0, 1);
        System.arraycopy(ictVarArr2, 0, ictVarArr3, 1, length2);
        System.arraycopy(ictVarArr, 1, ictVarArr3, length2 + 1, length - 1);
        return ictVarArr3;
    }

    @Override // defpackage.dfh
    public final void B() {
        der G = G();
        this.z = null;
        this.B = 1;
        this.J.append(0, 0);
        G.f(new bwt(this, G, 17));
        this.C.d();
    }

    public final void C(long j, int i) {
        if (this.n == j) {
            return;
        }
        z(j, false);
        int indexOf = this.j.indexOf(Long.valueOf(j));
        if (indexOf != -1) {
            i = indexOf;
        } else if (i == -1) {
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((Integer) this.l.get(i3)).intValue();
        }
        fG(i2, false);
    }

    public final boolean D(int i) {
        return this.m.get(i) || !((ArrayList) this.i.get(i)).isEmpty();
    }

    @Override // defpackage.dfh
    public final ict[] E() {
        ict[] M;
        ict[] e;
        if (this.M) {
            if (!this.L.b()) {
                e = ian.d(this.q, Integer.MAX_VALUE);
            } else {
                e = ian.e(this.q, this.L, Integer.MAX_VALUE);
            }
            M = M(super.E(), e);
        } else {
            M = M(super.E(), this.q);
        }
        return M == null ? ict.a : M;
    }

    @Override // defpackage.dfh, defpackage.jda
    public final void gw(ict[] ictVarArr) {
        if (this.v != ictVarArr) {
            this.v = ictVarArr;
            L();
        }
    }

    public final int s(int i) {
        return i - u(this.p);
    }

    public final int u(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((Integer) this.l.get(i3)).intValue();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dfh
    public final Runnable v(int i, der derVar, int i2) {
        return new dfe(this, i, derVar, i2, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dfh
    public final void w() {
        dfa dfaVar = this.I;
        if (dfaVar != null) {
            dfaVar.gs(this, s(this.u));
        }
    }

    @Override // defpackage.dfh
    public final void x() {
        ArrayList arrayList;
        if (this.I == null || (arrayList = this.l) == null || arrayList.isEmpty()) {
            return;
        }
        long j = this.n;
        if (j != 0) {
            this.p = this.j.indexOf(Long.valueOf(j));
        }
        int i = this.p;
        if (i < 0 || i >= this.l.size()) {
            return;
        }
        this.I.gt(((Integer) this.l.get(this.p)).intValue());
    }

    public final void z(long j, boolean z) {
        if (this.n != 0) {
            ieh.j().e(dda.SUBCATEGORY_KEYBOARD_SWITCHED_BY_SWIPE, Boolean.valueOf(z));
        }
        this.n = j;
        x();
        dez dezVar = this.o;
        if (dezVar != null) {
            dezVar.x(this.n, z);
        }
    }
}
