package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ily  reason: default package */
/* loaded from: classes.dex */
public class ily {
    public float a;
    protected LinearLayout b;
    protected final imb e;
    private float h;
    private final ils i;
    private final fws j;
    private int f = -1;
    private int g = -1;
    public final List c = new ArrayList();
    public iay[] d = new iay[0];

    public ily(Context context, AttributeSet attributeSet, ilx ilxVar) {
        ilz ilzVar = new ilz(context, attributeSet);
        imi imiVar = new imi(context, attributeSet);
        ils ilsVar = new ils(context);
        this.i = ilsVar;
        this.j = new fws(ilzVar, imiVar, ilsVar);
        this.e = (imb) ilxVar.a(context, ilzVar);
    }

    private static int l(int i, int i2) {
        return Math.max(Math.min(i, i2), 0);
    }

    private final void m(View view, boolean z) {
        view.setPressed(z);
        ils ilsVar = this.i;
        if (z) {
            view.post(new idx(ilsVar, view, 8));
        } else {
            ilsVar.b.k(view);
        }
    }

    private static boolean n(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        float f7 = i;
        return f3 - f > f7 || f4 - f2 > f7 || f - f5 > f7 || f2 - f6 > f7;
    }

    public iay a() {
        int i = this.f;
        if (i != -1) {
            return this.d[i];
        }
        return null;
    }

    public void b() {
        if (this.f != -1) {
            if (!this.c.isEmpty()) {
                m((View) this.c.get(this.f), false);
            }
            this.f = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021d A[EDGE_INSN: B:81:0x021d->B:82:0x021d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.widget.LinearLayout r22, com.google.android.libraries.inputmethod.widgets.SoftKeyboardView r23, android.view.View r24, float r25, float r26, defpackage.ial r27, int[] r28) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ily.c(android.widget.LinearLayout, com.google.android.libraries.inputmethod.widgets.SoftKeyboardView, android.view.View, float, float, ial, int[]):void");
    }

    public void d() {
        this.f = -1;
        this.g = -1;
    }

    public void e() {
        if (this.c.isEmpty()) {
            return;
        }
        imb imbVar = this.e;
        ilz ilzVar = imbVar.c;
        int i = 0;
        if (!ilzVar.d && !ilzVar.f) {
            i = imbVar.d.f;
        }
        m((View) this.c.get(i), true);
        this.f = i;
        this.g = i;
    }

    public final void f(int i, int i2) {
        ima imaVar = this.e.d;
        imaVar.j = i;
        imaVar.k = i2;
    }

    public final void g(View.OnClickListener onClickListener) {
        this.i.a = onClickListener;
    }

    public final void h(View view) {
        int id;
        int i;
        View view2;
        if (view.getVisibility() == 0 && (id = view.getId()) >= 0 && id < this.c.size() && (i = this.f) != id) {
            if (i != -1 && (view2 = (View) this.c.get(i)) != null) {
                m(view2, false);
            }
            this.f = id;
            m(view, true);
        }
    }

    protected void i(int i, int i2) {
        ima imaVar = this.e.d;
        int i3 = i2 / imaVar.b;
        int i4 = i / imaVar.a;
        View view = null;
        if (imaVar.b()) {
            LinearLayout linearLayout = this.b;
            ViewGroup viewGroup = (ViewGroup) linearLayout.getChildAt(l(i3, linearLayout.getChildCount() - 1));
            if (viewGroup != null) {
                view = viewGroup.getChildAt(l(i4, viewGroup.getChildCount() - 1));
            }
        } else {
            LinearLayout linearLayout2 = this.b;
            ViewGroup viewGroup2 = (ViewGroup) linearLayout2.getChildAt(l(i4, linearLayout2.getChildCount() - 1));
            if (viewGroup2 != null) {
                view = viewGroup2.getChildAt(l(i3, viewGroup2.getChildCount() - 1));
            }
        }
        if (view != null) {
            h(view);
        }
    }

    public final boolean j() {
        return this.f == -1 && !this.i.b.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.iay k(float r11, float r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ily.k(float, float):iay");
    }
}
