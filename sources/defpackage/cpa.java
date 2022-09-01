package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: PG */
/* renamed from: cpa  reason: default package */
/* loaded from: classes.dex */
public final class cpa {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/header/EndAdapter");
    public final cpf c;
    public final cpe d;
    public final LinearLayout e;
    private final ViewGroup.OnHierarchyChangeListener g;
    public int b = -1;
    public final View.OnClickListener f = new cjr(this, 6);

    public cpa(cpe cpeVar, cpf cpfVar, LinearLayout linearLayout) {
        coz cozVar = new coz(this, 0);
        this.g = cozVar;
        this.d = cpeVar;
        this.c = cpfVar;
        this.e = linearLayout;
        linearLayout.setOnHierarchyChangeListener(cozVar);
    }

    public static void a(View view, coq coqVar, boolean z) {
        if (c(coqVar) == 2) {
            view.setSelected(z);
        } else {
            view.setSelected(false);
        }
    }

    public static int c(coq coqVar) {
        com comVar;
        if (coqVar == null || coqVar.a != col.IMAGE_RESOURCE || (comVar = coqVar.d) == null) {
            return 0;
        }
        return comVar.d;
    }

    public final boolean b(int i) {
        View childAt;
        View childAt2;
        boolean z = false;
        if (i >= -1 && i < ((lrl) this.c.b().d).c) {
            int i2 = this.b;
            if (i2 == i) {
                return false;
            }
            this.b = i;
            cov b = this.c.b();
            if (i2 != -1 && (childAt2 = this.e.getChildAt(i2)) != null) {
                a(childAt2, (coq) b.d.get(i2), false);
            }
            z = true;
            if (i != -1 && (childAt = this.e.getChildAt(i)) != null) {
                a(childAt, (coq) b.d.get(i), true);
            }
        }
        return z;
    }
}
