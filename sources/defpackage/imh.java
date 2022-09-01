package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* renamed from: imh  reason: default package */
/* loaded from: classes.dex */
public final class imh extends ily {
    public final ime f;
    public View g;
    private final ilo h;

    public imh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, imc.a);
        ime imeVar = new ime(this);
        this.f = imeVar;
        this.h = new ilo(imeVar, new img(this));
    }

    public static float l(View view) {
        if (view instanceof jcp) {
            jcp jcpVar = (jcp) view;
            float f = jcpVar.n;
            if (f == 0.0f) {
                int measuredWidth = jcpVar.getMeasuredWidth();
                int measuredHeight = jcpVar.getMeasuredHeight();
                if (jcpVar.m) {
                    jcpVar.g(measuredWidth, measuredHeight);
                }
                f = Math.min(Math.max((Math.min((jcpVar.i + jcpVar.f().left) - jcpVar.getPaddingLeft(), ((measuredWidth - jcpVar.getPaddingRight()) - jcpVar.i) - jcpVar.f().right) / jcpVar.f().width()) + 1.0f, jcpVar.k), Math.max((Math.min((jcpVar.j + jcpVar.f().top) - jcpVar.getPaddingTop(), ((measuredHeight - jcpVar.getPaddingBottom()) - jcpVar.j) - jcpVar.f().bottom) / jcpVar.f().height()) + 1.0f, jcpVar.l));
                jcpVar.n = f;
            }
            return Math.max(1.0f, Math.min(f, 1.32f));
        }
        return 1.32f;
    }

    private final void o() {
        ime imeVar = this.f;
        Point point = imeVar.b;
        jdg.l(imeVar, point);
        ilm i = jdg.i(this.f, point);
        if (i != null) {
            n(i);
            m(i);
            View view = this.g;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
        }
    }

    @Override // defpackage.ily
    public final iay a() {
        int i;
        ilm k = jdg.k(this.f);
        if (k != null && (i = k.b) >= 0) {
            iay[] iayVarArr = this.d;
            if (i < iayVarArr.length) {
                return iayVarArr[i];
            }
        }
        return null;
    }

    @Override // defpackage.ily
    public final void b() {
        super.b();
        ilm k = jdg.k(this.f);
        jdg.l(this.f, iln.a);
        n(k);
        View view = this.g;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // defpackage.ily
    public final void c(LinearLayout linearLayout, SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr) {
        super.c(linearLayout, softKeyboardView, view, f, f2, ialVar, iArr);
        ime imeVar = this.f;
        ima imaVar = this.e.d;
        int i = imaVar.f;
        int i2 = (imaVar.d() || imaVar.c()) ? 0 : imaVar.d - 1;
        imeVar.b.set(i, i2);
        imeVar.c.set(i, i2);
        imeVar.d.clear();
        for (int i3 = 0; i3 < imeVar.d(); i3++) {
            ViewGroup viewGroup = (ViewGroup) linearLayout.getChildAt(i3);
            for (int i4 = 0; i4 < imeVar.c(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getId() != -1) {
                    List list = imeVar.d;
                    Point point = new Point(i4, i3);
                    int id = childAt.getId();
                    if (childAt != null) {
                        View findViewById = childAt.findViewById(R.id.f67320_resource_name_obfuscated_res_0x7f0b0850);
                        if (findViewById == null) {
                            findViewById = childAt.findViewById(R.id.f67310_resource_name_obfuscated_res_0x7f0b084f);
                        }
                        if (findViewById != null) {
                            list.add(new ilm(point, id, childAt, findViewById));
                        } else {
                            throw new NullPointerException("Null labelView");
                        }
                    } else {
                        throw new NullPointerException("Null view");
                    }
                } else {
                    imeVar.d.add(null);
                }
            }
        }
        o();
    }

    @Override // defpackage.ily
    public final void d() {
        super.d();
        ime imeVar = this.f;
        imeVar.b.set(ime.a.x, ime.a.y);
        imeVar.c.set(ime.a.x, ime.a.y);
        imeVar.d.clear();
    }

    @Override // defpackage.ily
    public final void e() {
        super.e();
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    @Override // defpackage.ily
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void i(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imh.i(int, int):void");
    }

    public final void m(ilm ilmVar) {
        Point point = ilmVar.a;
        View view = this.g;
        if (view != null) {
            view.setTranslationX(point.x * this.f.b());
            this.g.setTranslationY(point.y * this.f.a());
            this.g.setScaleX(1.0f);
            this.g.setScaleY(1.0f);
            this.g.setAlpha(1.0f);
        }
    }

    public final void n(ilm ilmVar) {
        if (ilmVar == null) {
            return;
        }
        View view = ilmVar.d;
        float l = ilmVar.a.equals(this.f.c) ? l(view) : 1.0f;
        view.setScaleX(l);
        view.setScaleY(l);
    }
}
