package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* renamed from: dfh  reason: default package */
/* loaded from: classes.dex */
public class dfh extends alc implements dfb {
    public static final ltg s = ltg.j("com/google/android/apps/inputmethod/libs/framework/keyboard/widget/PageableSoftKeyListHolderView");
    der A;
    public int B;
    protected final akt C;
    public jdr D;
    public gqc E;
    public float F;
    public float G;
    protected final int H;
    protected dfa I;
    public final SparseIntArray J;
    mko K;
    protected hdl L;
    protected final boolean M;
    public final xy N;
    private final dfk i;
    private final boolean j;
    private final boolean k;
    private int l;
    private final hdm m;
    int t;
    public int u;
    protected ict[] v;
    public ict[] w;
    protected final SparseArray x;
    public final Context y;
    public der z;

    public dfh(Context context) {
        this(context, null);
    }

    @Override // defpackage.jdb
    public final void A(jdr jdrVar) {
        this.D = jdrVar;
    }

    public void B() {
        this.J.clear();
        ict[] E = E();
        if (E != null && E.length > 0) {
            this.J.append(0, 0);
        }
        this.z = null;
        this.u = 0;
        this.B = 1;
        der G = G();
        G.f(new dfd(this, G));
        this.C.d();
    }

    public ict[] E() {
        ict[] ictVarArr = this.w;
        return ictVarArr != null ? ictVarArr : ict.a;
    }

    public final View F() {
        View view = (View) this.N.a();
        return view == null ? View.inflate(this.y, this.H, null) : view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final der G() {
        if (this.A == null) {
            this.A = (der) F();
        }
        return this.A;
    }

    @Override // defpackage.deu
    public final boolean H() {
        return this.u == 0;
    }

    @Override // defpackage.deu
    public final boolean I() {
        return this.u + 1 == this.B;
    }

    @Override // defpackage.deu
    public final boolean J() {
        if (I()) {
            return false;
        }
        fG(this.u + 1, false);
        return true;
    }

    @Override // defpackage.deu
    public final boolean K() {
        if (H()) {
            return false;
        }
        fG(this.u - 1, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L() {
        ict[] e;
        mko b;
        mko mkoVar = this.K;
        if (mkoVar != null) {
            mkoVar.cancel(true);
        }
        if (!this.M || this.v == null) {
            this.w = this.v;
            B();
            return;
        }
        int c = this.k ? G().c() : Integer.MAX_VALUE;
        if (!this.L.b()) {
            e = ian.d(this.v, c);
        } else {
            e = ian.e(this.v, this.L, c);
        }
        this.w = e;
        B();
        if (!this.k) {
            return;
        }
        mks a = gxo.a(2);
        if (!this.L.b()) {
            b = ian.a(this.v, a);
        } else {
            b = ian.b(this.v, this.L, a);
        }
        this.K = b;
        kcu.U(this.K, new buo(this, 13), gyc.a);
    }

    @Override // defpackage.dfb
    public final int a() {
        return G().c();
    }

    @Override // defpackage.dfb
    public final void b(dfa dfaVar) {
        this.I = dfaVar;
        x();
        w();
    }

    public void gw(ict[] ictVarArr) {
        int width;
        if (this.v != ictVarArr) {
            if (this.t > 0 && (width = getWidth()) != this.l) {
                this.l = width;
                fE(this.C);
            }
            this.v = ictVarArr;
            L();
            this.d = 0;
        }
    }

    @Override // defpackage.jda
    public final boolean i(int i, ict ictVar) {
        der derVar = this.z;
        if (derVar == null) {
            derVar = G();
        }
        if (derVar.i(i, ictVar)) {
            this.x.put(i, ictVar);
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                der derVar2 = (der) getChildAt(i2);
                if (derVar2 != this.z) {
                    derVar2.i(i, ictVar);
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hdn.instance.i(this.m);
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hdn.instance.j(this.m);
        if (this.j) {
            gw(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alc, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int measuredWidth;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.t <= 0 || (measuredWidth = getMeasuredWidth() / this.t) == (-this.e)) {
            return;
        }
        fI(-measuredWidth);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).setPadding(0, 0, measuredWidth, 0);
        }
    }

    @Override // defpackage.alc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.i.a(motionEvent);
        return onTouchEvent;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            w();
        }
    }

    @Override // defpackage.jdb
    public final void t(gqc gqcVar) {
        this.E = gqcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Runnable v(int i, der derVar, int i2) {
        return new dfe(this, derVar, i2, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
        dfa dfaVar = this.I;
        if (dfaVar != null) {
            dfaVar.gs(this, this.u);
        }
    }

    public void x() {
        dfa dfaVar = this.I;
        if (dfaVar != null) {
            dfaVar.gt(this.B);
        }
    }

    @Override // defpackage.jdb
    public final void y(float f, float f2) {
        this.F = f;
        this.G = f2;
        der derVar = this.z;
        if (derVar != null) {
            derVar.y(f, f2);
        }
    }

    public dfh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = -1;
        this.x = new SparseArray();
        dfg dfgVar = new dfg(this);
        this.C = dfgVar;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = new SparseIntArray();
        this.L = hdl.a;
        this.N = new xy(5);
        this.m = new dfc(this);
        this.y = context;
        if (attributeSet == null) {
            throw new IllegalArgumentException("PageableSoftKeyListHolder needs attributes.");
        }
        int attributeIntValue = attributeSet.getAttributeIntValue(null, "page_margin_ratio", 0);
        this.t = attributeIntValue;
        if (attributeIntValue > 0) {
            int attributeIntValue2 = attributeSet.getAttributeIntValue(null, "offscreen_page_limit", 0);
            if (attributeIntValue2 <= 0) {
                ((ltd) ((ltd) alc.a.d()).k("androidx/viewpager/widget/FourDirectionalViewPager", "setOffscreenPageLimit", 717, "FourDirectionalViewPager.java")).y("Requested offscreen page limit %d too small; defaulting to %d", attributeIntValue2, 1);
                attributeIntValue2 = 1;
            }
            if (attributeIntValue2 != this.f) {
                this.f = attributeIntValue2;
                e();
            }
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "page_layout", 0);
        this.H = attributeResourceValue;
        if (attributeResourceValue == 0) {
            throw new IllegalArgumentException("SubView must have a valid layout id.");
        }
        this.M = jgd.o(context, attributeSet, null, "emoji_filter", false);
        this.k = jgd.o(context, attributeSet, null, "background_emoji_filter", true);
        this.j = jgd.o(context, attributeSet, null, "clear_on_detach", false);
        fE(dfgVar);
        this.g = new dff(this);
        dfk dfkVar = new dfk(context);
        this.i = dfkVar;
        dfkVar.a = this.h;
    }
}
