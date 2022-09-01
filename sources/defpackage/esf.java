package defpackage;

import android.graphics.Typeface;
import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: esf  reason: default package */
/* loaded from: classes.dex */
public final class esf implements eqs {
    private final /* synthetic */ int a;

    public esf(int i) {
        this.a = i;
    }

    private static int b(SparseArray sparseArray) {
        eut i = era.i(sparseArray, euu.TEXT_STYLE);
        if (i == null) {
            return 0;
        }
        return era.e(i);
    }

    @Override // defpackage.eqs
    public final /* synthetic */ eqr a(SparseArray sparseArray) {
        int i = this.a;
        if (i == 0) {
            eqq eqqVar = (eqq) sparseArray.get(2);
            eqq eqqVar2 = (eqq) sparseArray.get(9);
            if (eqqVar != null || eqqVar2 != null) {
                return new esg(eqq.a(eqqVar, eqqVar2));
            }
            return null;
        } else if (i == 1) {
            eqq eqqVar3 = (eqq) sparseArray.get(57);
            if (eqqVar3 != null) {
                return new esi(eqq.b(eqqVar3), 1);
            }
            return null;
        } else if (i == 2) {
            eqq eqqVar4 = (eqq) sparseArray.get(8);
            eqq eqqVar5 = (eqq) sparseArray.get(10);
            if (eqqVar4 != null || eqqVar5 != null) {
                return new esi(eqq.a(eqqVar4, eqqVar5), 0);
            }
            return null;
        } else if (i == 3) {
            eqq eqqVar6 = (eqq) sparseArray.get(56);
            if (eqqVar6 != null) {
                return new esi(eqq.b(eqqVar6), 2);
            }
            return null;
        } else if (i == 4) {
            eut i2 = era.i(sparseArray, euu.FONT_FAMILY);
            if (i2 != null) {
                Typeface create = Typeface.create(i2.c, 0);
                if (create == null) {
                    create = Typeface.DEFAULT;
                }
                return new eso(create, b(sparseArray));
            }
            eut i3 = era.i(sparseArray, euu.TYPEFACE);
            if (i3 == null) {
                return null;
            }
            return new eso(era.h(i3), b(sparseArray));
        } else {
            eut i4 = era.i(sparseArray, euu.VISIBILITY);
            if (i4 != null) {
                return new esp(era.f(i4));
            }
            return null;
        }
    }
}
