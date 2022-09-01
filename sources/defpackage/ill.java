package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: ill  reason: default package */
/* loaded from: classes.dex */
public class ill extends LinearLayout implements ilv {
    protected final imi a;
    protected Animator[] b;
    private final jdx c;

    public ill(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public iay a(float f, float f2, boolean z) {
        return null;
    }

    public iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        c();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.c.b(this);
    }

    @Override // defpackage.ilv
    public final /* synthetic */ void d(int i) {
    }

    public /* synthetic */ void e() {
    }

    public /* synthetic */ void f(View.OnClickListener onClickListener) {
    }

    public /* synthetic */ boolean g() {
        return false;
    }

    public /* synthetic */ boolean h() {
        return true;
    }

    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.ilv
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.ilv
    public final void k() {
        setPivotX(getMeasuredWidth() * 0.5f);
        setPivotY(getMeasuredHeight());
    }

    @Override // defpackage.ilv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.ilv
    public final Animator m(hek hekVar) {
        Animator[] animatorArr = this.b;
        if (animatorArr == null) {
            return null;
        }
        hekVar.g(animatorArr[1], this, 1);
        return this.b[1];
    }

    @Override // defpackage.ilv
    public final Animator n(hek hekVar, boolean z) {
        Animator[] animatorArr = this.b;
        if (animatorArr == null || z) {
            return null;
        }
        hekVar.g(animatorArr[0], this, 0);
        return this.b[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public ill(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new jdx();
        this.a = new imi(context, attributeSet);
        this.b = hek.h(this, context, attributeSet);
    }
}
