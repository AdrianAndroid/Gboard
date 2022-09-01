package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* renamed from: ksk  reason: default package */
/* loaded from: classes.dex */
public class ksk extends tp {
    private int a = 0;
    private oze b;

    public ksk() {
    }

    public ksk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int F() {
        oze ozeVar = this.b;
        if (ozeVar != null) {
            return ozeVar.a;
        }
        return 0;
    }

    public final boolean G(int i) {
        oze ozeVar = this.b;
        if (ozeVar != null) {
            return ozeVar.h(i);
        }
        this.a = i;
        return false;
    }

    protected void S(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.l(view, i);
    }

    @Override // defpackage.tp
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        S(coordinatorLayout, view, i);
        if (this.b == null) {
            this.b = new oze(view);
        }
        this.b.g();
        this.b.f();
        int i2 = this.a;
        if (i2 != 0) {
            this.b.h(i2);
            this.a = 0;
            return true;
        }
        return true;
    }
}
