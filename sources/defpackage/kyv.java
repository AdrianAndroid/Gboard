package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@alf
/* renamed from: kyv  reason: default package */
/* loaded from: classes.dex */
public class kyv extends HorizontalScrollView {
    private static final xx x = new xz(16);
    private int A;
    private final int B;
    private final int C;
    private final int D;
    private int E;
    private final ArrayList F;
    private ValueAnimator G;
    private ald H;
    private DataSetObserver I;
    private kyt J;
    private boolean K;
    private final xx L;
    private nos M;
    private jlr N;
    final kyr a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ColorStateList g;
    ColorStateList h;
    Drawable i;
    float j;
    float k;
    final int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    boolean r;
    public boolean s;
    int t;
    boolean u;
    public ViewPager v;
    public laq w;
    private final ArrayList y;
    private kys z;

    public kyv(Context context) {
        this(context, null);
    }

    private final int m(int i, float f) {
        View childAt;
        int i2 = this.q;
        int i3 = 0;
        if ((i2 == 0 || i2 == 2) && (childAt = this.a.getChildAt(i)) != null) {
            int i4 = i + 1;
            View childAt2 = i4 < this.a.getChildCount() ? this.a.getChildAt(i4) : null;
            int width = childAt.getWidth();
            if (childAt2 != null) {
                i3 = childAt2.getWidth();
            }
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i5 = (int) ((width + i3) * 0.5f * f);
            return aad.f(this) == 0 ? left + i5 : left - i5;
        }
        return 0;
    }

    private final int n() {
        int i = this.B;
        if (i != -1) {
            return i;
        }
        int i2 = this.q;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        return this.D;
    }

    private final void o(View view) {
        if (view instanceof kyo) {
            kyo kyoVar = (kyo) view;
            kys d = d();
            CharSequence charSequence = kyoVar.a;
            Drawable drawable = kyoVar.b;
            int i = kyoVar.c;
            if (!TextUtils.isEmpty(kyoVar.getContentDescription())) {
                d.b = kyoVar.getContentDescription();
                d.b();
            }
            e(d, this.y.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private final void p(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && aad.ah(this)) {
            kyr kyrVar = this.a;
            int childCount = kyrVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (kyrVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int m = m(i, 0.0f);
            if (scrollX != m) {
                if (this.G == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.G = valueAnimator;
                    valueAnimator.setInterpolator(krt.b);
                    this.G.setDuration(this.o);
                    this.G.addUpdateListener(new ksq(this, 6));
                }
                this.G.setIntValues(scrollX, m);
                this.G.start();
            }
            kyr kyrVar2 = this.a;
            int i3 = this.o;
            ValueAnimator valueAnimator2 = kyrVar2.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                kyrVar2.a.cancel();
            }
            kyrVar2.d(true, i, i3);
            return;
        }
        l(i);
    }

    private final void q(int i) {
        int childCount = this.a.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.a.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    private final boolean s() {
        int i = this.q;
        return i == 0 || i == 2;
    }

    private final void t(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.v;
        if (viewPager2 != null) {
            kyt kytVar = this.J;
            if (kytVar != null && (list2 = viewPager2.f) != null) {
                list2.remove(kytVar);
            }
            nos nosVar = this.M;
            if (nosVar != null && (list = this.v.g) != null) {
                list.remove(nosVar);
            }
        }
        jlr jlrVar = this.N;
        if (jlrVar != null) {
            this.F.remove(jlrVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.v = viewPager;
            if (this.J == null) {
                this.J = new kyt(this);
            }
            kyt kytVar2 = this.J;
            kytVar2.b = 0;
            kytVar2.a = 0;
            viewPager.e(kytVar2);
            jlr jlrVar2 = new jlr(viewPager);
            this.N = jlrVar2;
            if (!this.F.contains(jlrVar2)) {
                this.F.add(jlrVar2);
            }
            ald aldVar = viewPager.b;
            if (aldVar != null) {
                i(aldVar, true);
            }
            if (this.M == null) {
                this.M = new nos(this);
            }
            nos nosVar2 = this.M;
            nosVar2.a = true;
            if (viewPager.g == null) {
                viewPager.g = new ArrayList();
            }
            viewPager.g.add(nosVar2);
            l(viewPager.a());
        } else {
            this.v = null;
            i(null, false);
        }
        this.K = z;
    }

    public final int a() {
        kys kysVar = this.z;
        if (kysVar != null) {
            return kysVar.c;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        o(view);
    }

    public final int b() {
        return this.y.size();
    }

    public final kys c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (kys) this.y.get(i);
    }

    public final kys d() {
        kys kysVar = (kys) x.a();
        if (kysVar == null) {
            kysVar = new kys();
        }
        kysVar.f = this;
        xx xxVar = this.L;
        kyu kyuVar = xxVar != null ? (kyu) xxVar.a() : null;
        if (kyuVar == null) {
            kyuVar = new kyu(this, getContext());
        }
        kyuVar.a(kysVar);
        kyuVar.setFocusable(true);
        kyuVar.setMinimumWidth(n());
        if (!TextUtils.isEmpty(kysVar.b)) {
            kyuVar.setContentDescription(kysVar.b);
        } else {
            kyuVar.setContentDescription(null);
        }
        kysVar.g = kyuVar;
        if (kysVar.h != -1) {
            kysVar.g.setId(0);
        }
        return kysVar;
    }

    public final void e(kys kysVar, boolean z) {
        int size = this.y.size();
        if (kysVar.f == this) {
            kysVar.c = size;
            this.y.add(size, kysVar);
            int size2 = this.y.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                ((kys) this.y.get(size)).c = size;
            }
            kyu kyuVar = kysVar.g;
            kyuVar.setSelected(false);
            kyuVar.setActivated(false);
            kyr kyrVar = this.a;
            int i = kysVar.c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            r(layoutParams);
            kyrVar.addView(kyuVar, i, layoutParams);
            if (!z) {
                return;
            }
            kysVar.a();
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        int a;
        for (int childCount = this.a.getChildCount() - 1; childCount >= 0; childCount--) {
            kyu kyuVar = (kyu) this.a.getChildAt(childCount);
            this.a.removeViewAt(childCount);
            if (kyuVar != null) {
                kyuVar.a(null);
                kyuVar.setSelected(false);
                this.L.b(kyuVar);
            }
            requestLayout();
        }
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            kys kysVar = (kys) it.next();
            it.remove();
            kysVar.f = null;
            kysVar.g = null;
            kysVar.h = -1;
            kysVar.a = null;
            kysVar.b = null;
            kysVar.c = -1;
            kysVar.d = null;
            x.b(kysVar);
        }
        this.z = null;
        ald aldVar = this.H;
        if (aldVar != null) {
            int a2 = aldVar.a();
            for (int i = 0; i < a2; i++) {
                kys d = d();
                if (TextUtils.isEmpty(d.b) && !TextUtils.isEmpty(null)) {
                    d.g.setContentDescription(null);
                }
                d.a = null;
                d.b();
                e(d, false);
            }
            ViewPager viewPager = this.v;
            if (viewPager == null || a2 <= 0 || (a = viewPager.a()) == a() || a >= b()) {
                return;
            }
            g(c(a));
        }
    }

    public final void g(kys kysVar) {
        h(kysVar, true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h(kys kysVar, boolean z) {
        kys kysVar2 = this.z;
        if (kysVar2 == kysVar) {
            if (kysVar2 == null) {
                return;
            }
            for (int size = this.F.size() - 1; size >= 0; size--) {
                jlr jlrVar = (jlr) this.F.get(size);
            }
            p(kysVar.c);
            return;
        }
        int i = kysVar != null ? kysVar.c : -1;
        if (z) {
            if ((kysVar2 != null && kysVar2.c != -1) || i == -1) {
                p(i);
            } else {
                l(i);
            }
            if (i != -1) {
                q(i);
            }
        }
        this.z = kysVar;
        if (kysVar2 != null) {
            for (int size2 = this.F.size() - 1; size2 >= 0; size2--) {
                jlr jlrVar2 = (jlr) this.F.get(size2);
            }
        }
        if (kysVar == null) {
            return;
        }
        for (int size3 = this.F.size() - 1; size3 >= 0; size3--) {
            ((ViewPager) ((jlr) this.F.get(size3)).a).l(kysVar.c);
        }
    }

    public final void i(ald aldVar, boolean z) {
        DataSetObserver dataSetObserver;
        ald aldVar2 = this.H;
        if (aldVar2 != null && (dataSetObserver = this.I) != null) {
            aldVar2.g(dataSetObserver);
        }
        this.H = aldVar;
        if (z && aldVar != null) {
            if (this.I == null) {
                this.I = new kyp(this);
            }
            aldVar.e(this.I);
        }
        f();
    }

    public final void j(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.a.getChildCount()) {
            return;
        }
        if (z2) {
            kyr kyrVar = this.a;
            ValueAnimator valueAnimator = kyrVar.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                kyrVar.a.cancel();
            }
            kyrVar.c(kyrVar.getChildAt(i), kyrVar.getChildAt(i + 1), f);
        }
        ValueAnimator valueAnimator2 = this.G;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.G.cancel();
        }
        scrollTo(i < 0 ? 0 : m(i, f), 0);
        if (!z) {
            return;
        }
        q(round);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(boolean z) {
        for (int i = 0; i < this.a.getChildCount(); i++) {
            View childAt = this.a.getChildAt(i);
            childAt.setMinimumWidth(n());
            r((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final void l(int i) {
        j(i, 0.0f, true, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        laq.i(this);
        if (this.v == null) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewPager)) {
                return;
            }
            t((ViewPager) parent, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.K) {
            t(null, false);
            this.K = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        kyu kyuVar;
        Drawable drawable;
        for (int i = 0; i < this.a.getChildCount(); i++) {
            View childAt = this.a.getChildAt(i);
            if ((childAt instanceof kyu) && (drawable = (kyuVar = (kyu) childAt).c) != null) {
                drawable.setBounds(kyuVar.getLeft(), kyuVar.getTop(), kyuVar.getRight(), kyuVar.getBottom());
                kyuVar.c.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        abj.b(accessibilityNodeInfo).i(aqq.E(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return s() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        r7.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(r8, getPaddingTop() + getPaddingBottom(), r7.getLayoutParams().height));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L30;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            java.util.ArrayList r1 = r6.y
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L19
            java.util.ArrayList r4 = r6.y
            java.lang.Object r4 = r4.get(r3)
            kys r4 = (defpackage.kys) r4
            int r3 = r3 + 1
            goto Lc
        L19:
            r1 = 48
            float r0 = defpackage.kvj.a(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r3) goto L40
            if (r1 == 0) goto L31
            goto L53
        L31:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L53
        L40:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L53
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L53
            android.view.View r1 = r6.getChildAt(r2)
            r1.setMinimumHeight(r0)
        L53:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L71
            int r1 = r6.C
            if (r1 <= 0) goto L62
            goto L6f
        L62:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r3 = 56
            float r1 = defpackage.kvj.a(r1, r3)
            float r0 = r0 - r1
            int r1 = (int) r0
        L6f:
            r6.m = r1
        L71:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lbe
            android.view.View r7 = r6.getChildAt(r2)
            int r0 = r6.q
            if (r0 == 0) goto L93
            if (r0 == r5) goto L88
            r1 = 2
            if (r0 == r1) goto L93
            goto Lbe
        L88:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L9e
            goto L9d
        L93:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L9e
        L9d:
            r2 = 1
        L9e:
            if (r2 == 0) goto Lbe
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            int r2 = r2.height
            int r0 = r0 + r1
            int r8 = getChildMeasureSpec(r8, r0, r2)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyv.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || s()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        laq.h(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public kyv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f17730_resource_name_obfuscated_res_0x7f040710);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        o(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final FrameLayout.LayoutParams mo65generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x023b, code lost:
        if (r13 != 2) goto L36;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kyv(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyv.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private final void r(LinearLayout.LayoutParams layoutParams) {
        if (this.q != 1 || this.n != 0) {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            return;
        }
        layoutParams.width = 0;
        layoutParams.weight = 1.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }
}
