package com.google.android.apps.inputmethod.libs.framework.keyboard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ScrollableCandidatesHolderView extends RecyclerView implements ddw, jdb {
    public final ArrayList S;
    public final deb T;
    public final dfi U;
    public jdr V;
    public gqc W;
    public hln aa;
    public float ab;
    public final int ac;
    public hcr ad;
    private boolean ae;
    private boolean af;

    public ScrollableCandidatesHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void a(hln hlnVar, boolean z) {
        hcr hcrVar;
        int indexOf = this.S.indexOf(hlnVar);
        if (indexOf == -1 || (hcrVar = (hcr) gA(indexOf)) == null) {
            return;
        }
        ((SoftKeyView) hcrVar.s).setSelected(z);
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.V = jdrVar;
    }

    @Override // defpackage.ddw
    public final boolean D() {
        return false;
    }

    @Override // defpackage.ddw
    public final boolean E() {
        throw null;
    }

    @Override // defpackage.ded
    public final boolean F(hln hlnVar) {
        if (this.S.contains(hlnVar) || hlnVar == null) {
            hln hlnVar2 = this.aa;
            if (hlnVar2 == hlnVar) {
                return true;
            }
            if (hlnVar2 != null) {
                a(hlnVar2, false);
            }
            this.aa = hlnVar;
            if (hlnVar != null) {
                a(hlnVar, true);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ddw
    public final int b() {
        return this.S.size();
    }

    @Override // defpackage.ded
    public final hln f(iay iayVar) {
        return null;
    }

    @Override // defpackage.ded
    public final hln g() {
        return null;
    }

    @Override // defpackage.ded
    public final hln h() {
        return null;
    }

    @Override // defpackage.ddw
    public final SoftKeyView i() {
        hcr hcrVar = this.ad;
        if (hcrVar == null) {
            return null;
        }
        return (SoftKeyView) hcrVar.s;
    }

    @Override // defpackage.ddw
    public final List k(List list) {
        throw null;
    }

    @Override // defpackage.ddw
    public final void l(List list) {
        if (!this.af) {
            this.af = true;
            aa(this.U);
            getContext();
            ab(new LinearLayoutManager(0));
        }
        this.S.addAll(list);
        ai();
        this.U.fc();
        Y(0);
    }

    @Override // defpackage.ded
    public final void n() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
        if (r8.getAction() != 3) goto L9;
     */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = super.onTouchEvent(r8)
            boolean r1 = r7.ae
            int r2 = r8.getAction()
            r3 = 2
            r4 = 3
            r5 = 0
            r6 = 1
            if (r2 != r3) goto L1a
            boolean r2 = r7.ae
            if (r2 != 0) goto L27
            int r1 = r7.C
            if (r1 != r6) goto L26
            r1 = 1
            goto L27
        L1a:
            int r2 = r8.getAction()
            if (r2 == r6) goto L26
            int r2 = r8.getAction()
            if (r2 != r4) goto L27
        L26:
            r1 = 0
        L27:
            boolean r2 = r7.ae
            if (r2 == 0) goto L2e
            r8.setAction(r4)
        L2e:
            r7.ae = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.framework.keyboard.widget.ScrollableCandidatesHolderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.ded
    public final void q(boolean z) {
        throw null;
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.W = gqcVar;
    }

    @Override // defpackage.ded
    public final void v(int[] iArr) {
        throw null;
    }

    @Override // defpackage.ded
    public final void w(float f) {
        this.ab = f;
        this.U.fc();
        Y(0);
    }

    @Override // defpackage.ddw
    public final void x(ddv ddvVar) {
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        w(f2);
    }

    public ScrollableCandidatesHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Throwable th;
        TypedArray typedArray;
        this.S = new ArrayList();
        this.U = new dfi(this);
        this.ab = 1.0f;
        this.T = new deb(context, new dec(attributeSet));
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, dby.d);
            try {
                this.ac = typedArray.getDimensionPixelSize(0, 0);
                if (typedArray == null) {
                    return;
                }
                typedArray.recycle();
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }
}
