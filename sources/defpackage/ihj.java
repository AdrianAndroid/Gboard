package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.AccessibilityFullScreenPopupView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ihj  reason: default package */
/* loaded from: classes.dex */
public final class ihj implements AutoCloseable, jdp {
    public static final /* synthetic */ int D = 0;
    private static final hhl E = hhq.a("use_touch_down_for_key", true);
    private static final hhl F = hhq.e("key_sliding_threshold", 0.8d);
    public mko A;
    public final igv C;
    private int H;
    private mko I;
    private int K;
    private mko M;
    private boolean O;
    public float g;
    public float h;
    public iah i;
    public int j;
    public boolean k;
    public boolean l;
    public SoftKeyView m;
    public ilu p;
    public final ihk q;
    public boolean s;
    public long t;
    public ArrayList u;
    public long v;
    public long w;
    public mko x;
    public mko z;
    public int a = -1;
    public float b = Float.NEGATIVE_INFINITY;
    public float c = Float.NEGATIVE_INFINITY;
    public float d = Float.NEGATIVE_INFINITY;
    public float e = Float.NEGATIVE_INFINITY;
    public float f = Float.NEGATIVE_INFINITY;
    private final Rect G = new Rect();
    public ial n = null;
    public boolean o = false;
    public final mks r = gyc.b;
    private final Runnable J = new hvg(this, 19);
    public final Runnable y = new hvg(this, 20);
    private final Runnable L = new ihi(this, 1);
    public final Runnable B = new ihi(this, 0);
    private final Runnable N = new ihi(this, 2);

    static {
        lug.i("softKeyDebugMgr");
    }

    public ihj(Context context, ihk ihkVar) {
        mko mkoVar = mkk.a;
        this.I = mkoVar;
        this.x = mkoVar;
        this.z = mkoVar;
        this.A = mkoVar;
        this.M = mkoVar;
        this.q = ihkVar;
        Resources resources = context.getResources();
        this.C = new igv(resources.getDimension(R.dimen.f33510_resource_name_obfuscated_res_0x7f070144), resources.getInteger(R.integer.f131210_resource_name_obfuscated_res_0x7f0c0020));
    }

    public static boolean J(iah iahVar) {
        return iahVar == iah.SLIDE_UP || iahVar == iah.SLIDE_DOWN || iahVar == iah.SLIDE_LEFT || iahVar == iah.SLIDE_RIGHT;
    }

    public static boolean K(ial ialVar) {
        return ialVar != null && J(ialVar.c);
    }

    public static boolean M(ial ialVar) {
        if (!ialVar.i) {
            return false;
        }
        iah iahVar = ialVar.c;
        return iahVar == iah.PRESS || iahVar == iah.DOUBLE_TAP || (iahVar == iah.LONG_PRESS && ialVar.e);
    }

    public static final float O(MotionEvent motionEvent) {
        return motionEvent.getRawX() - motionEvent.getX();
    }

    public static final float P(MotionEvent motionEvent) {
        return motionEvent.getRawY() - motionEvent.getY();
    }

    private final long Q(ict ictVar) {
        float f = true != this.k ? 1.0f : 1.6f;
        hhl hhlVar = ictVar.j;
        return ((float) Math.max(hhlVar != null ? ((Long) hhlVar.c()).longValue() : ictVar.i, this.q.a())) * f;
    }

    private final long R(ict ictVar) {
        return Math.max(Math.min(250L, Q(ictVar) - 100), 0L);
    }

    private static iah S(iah iahVar) {
        return (iahVar == iah.PRESS || iahVar == iah.DOUBLE_TAP) ? iah.PRESS : iahVar;
    }

    private final void T() {
        U();
        o();
        n();
        this.A.cancel(true);
        V();
    }

    private final void U() {
        this.w = 0L;
        this.I.cancel(false);
    }

    private final void V() {
        this.M.cancel(false);
    }

    private final void W(float f) {
        if (f > ((ihh) this.q).k) {
            aa();
        }
    }

    private final void X(View view, Rect rect) {
        jdy.i(view, ((ihh) this.q).o, rect);
    }

    private final void Y(int i) {
        View findViewById;
        Drawable background;
        SoftKeyView softKeyView = this.m;
        if (softKeyView == null || (findViewById = softKeyView.findViewById(R.id.f56220_resource_name_obfuscated_res_0x7f0b0266)) == null || (background = findViewById.getBackground()) == null || !background.setLevel(i)) {
            return;
        }
        background.invalidateSelf();
    }

    private final void Z(long j) {
        if (this.I.isDone()) {
            this.w = j;
            long j2 = 0;
            if (this.t > 0) {
                ilu iluVar = this.p;
                long j3 = iluVar != null ? iluVar.n : 0L;
                if (j3 > 0) {
                    j2 = Math.max(0L, SystemClock.uptimeMillis() - j3);
                }
                this.I = this.r.a(this.J, this.t - j2, TimeUnit.MILLISECONDS);
                return;
            }
            this.I = this.r.hP(this.J);
        }
    }

    private final void aa() {
        A(null, this.b, this.c, 0L);
    }

    private final void ab() {
        boolean z = !this.M.isDone();
        SoftKeyView softKeyView = this.m;
        T();
        SoftKeyView softKeyView2 = this.m;
        if (softKeyView2 != null) {
            softKeyView2.g(this);
            if (this.m.isPressed()) {
                this.m.setPressed(false);
            }
            Y(0);
            f().k(this.m);
            this.m = null;
        }
        if (softKeyView != null && z) {
            softKeyView.setPressed(true);
            gyc.b.a(new hvg(new WeakReference(softKeyView), 18), 100L, TimeUnit.MILLISECONDS);
        }
        this.a = -1;
        this.n = null;
        this.o = false;
        this.m = null;
        this.b = Float.NEGATIVE_INFINITY;
        this.c = Float.NEGATIVE_INFINITY;
        this.d = Float.NEGATIVE_INFINITY;
        this.e = Float.NEGATIVE_INFINITY;
        this.f = Float.NEGATIVE_INFINITY;
        this.i = null;
        this.j = 0;
        this.k = false;
        this.l = false;
        this.H = 0;
        this.C.b();
    }

    private final boolean ac(ial ialVar) {
        ial j = j(iah.LONG_PRESS);
        iah iahVar = ialVar != null ? ialVar.c : null;
        if ((iahVar == null || iahVar == iah.PRESS || iahVar == iah.DOUBLE_TAP) && j != null) {
            return !j.e || !((ihh) this.q).n.q();
        }
        return false;
    }

    private final boolean ad(ict ictVar, ial ialVar, float f) {
        if (ialVar == null) {
            return true;
        }
        if (!this.s) {
            return false;
        }
        return !ictVar.l || ((double) f) > 1.0d;
    }

    private static boolean ae(ial ialVar) {
        if (ialVar == null) {
            return false;
        }
        iah iahVar = ialVar.c;
        return (!ialVar.f || iahVar == iah.DOUBLE_TAP || iahVar == iah.LONG_PRESS) ? false : true;
    }

    private final boolean af() {
        View view;
        ilu iluVar = this.p;
        return iluVar == null || (view = iluVar.d) == null || !((ilv) view).i();
    }

    final void A(SoftKeyView softKeyView, float f, float f2, long j) {
        int i = this.a;
        SoftKeyView softKeyView2 = this.m;
        q(j);
        ab();
        if (softKeyView == null || softKeyView.b == null) {
            r(j);
        } else {
            this.m = softKeyView;
            softKeyView.f(this);
            X(this.m, this.G);
            if (this.O) {
                r(j);
            }
        }
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f;
        this.e = f2;
        if (softKeyView2 != null && softKeyView2 != this.m) {
            this.k = true;
        }
        ial j2 = j(iah.DOWN);
        if (j2 != null) {
            this.q.f(this, iah.DOWN, j2.d(), l(), true, false, 0, true, j);
        }
    }

    public final void B() {
        r(0L);
        ab();
    }

    public final void C(long j) {
        U();
        if (H() && this.n.f() && L()) {
            ict l = l();
            iah iahVar = this.n.c;
            if (l.f != icq.NONE && (iahVar != iah.PRESS || l.f == icq.ON_TOUCH)) {
                SoftKeyboardView softKeyboardView = ((ihh) this.q).o;
                if (softKeyboardView == null || softKeyboardView.getWindowToken() == null) {
                    return;
                }
                if (this.p == null) {
                    this.p = ((ihh) this.q).n.f();
                }
                if (this.n.c == iah.LONG_PRESS) {
                    ihh ihhVar = (ihh) this.q;
                    if (ihhVar.c().o()) {
                        if (ihhVar.b == null) {
                            ihhVar.b = (AccessibilityFullScreenPopupView) View.inflate(ihhVar.c, R.layout.f133470_resource_name_obfuscated_res_0x7f0e001f, null);
                            ihhVar.b.a(ihhVar.o);
                        }
                        ihhVar.e().e(ihhVar.b, ihhVar.o, 0, 0, 0, null);
                        ihhVar.b.b();
                        ihhVar.n.p(true);
                    }
                    this.O = true;
                } else {
                    this.q.k();
                    this.O = false;
                }
                ilu iluVar = this.p;
                if (iluVar != null) {
                    float f = this.d;
                    float f2 = this.e;
                    ViewGroup b = this.m.b();
                    ial ialVar = this.n;
                    ict ictVar = this.m.b;
                    boolean z = ictVar != null && ictVar.f(iah.LONG_PRESS);
                    if (iluVar.l == 0) {
                        iluVar.l = j;
                        iluVar.m = 0L;
                    }
                    int i = ialVar.g;
                    if (i == 0) {
                        i = iluVar.g;
                    }
                    if (i == 0) {
                        iluVar.a(j);
                    } else {
                        if (i != iluVar.f) {
                            iluVar.f = i;
                            iluVar.d = (View) iluVar.h.get(i);
                            if (iluVar.d == null) {
                                iluVar.d = View.inflate(iluVar.a, iluVar.f, null);
                                iluVar.h.put(iluVar.f, iluVar.d);
                            }
                            iluVar.c.removeAllViews();
                            iluVar.c.addView(iluVar.d);
                        }
                        int[] iArr = {0, 0, 34};
                        iluVar.j.g(R.string.f159360_resource_name_obfuscated_res_0x7f1405d1, new Object[0]);
                        ilv ilvVar = (ilv) iluVar.d;
                        ilvVar.f(iluVar.k);
                        iluVar.e = ilvVar.b(softKeyboardView, b, f, f2, ialVar, iArr, z && ialVar.c == iah.PRESS);
                        if (ilvVar.j() && iluVar.o != null) {
                            if (iluVar.p == null) {
                                iluVar.p = View.inflate(iluVar.a, R.layout.f144480_resource_name_obfuscated_res_0x7f0e04e3, null);
                            }
                            iluVar.i.e(iluVar.p, iluVar.o, 1638, 0, 0, null);
                        }
                        ilvVar.l();
                        Animator n = ((ilv) iluVar.d).n(iluVar.q, iluVar.i.f(iluVar.c));
                        iluVar.i.e(iluVar.c, b, iArr[2], iArr[0], iArr[1], n);
                        if (z && ialVar.c == iah.LONG_PRESS && iluVar.b.e()) {
                            if (n != null) {
                                n.addListener(new dyg(iluVar, b, 2));
                            } else {
                                iluVar.b.b(b, 2);
                            }
                        }
                    }
                }
                if (af()) {
                    return;
                }
                V();
                if (!this.m.isPressed()) {
                    return;
                }
                this.m.setPressed(false);
                f().k(this.m);
                return;
            }
        }
        if (I()) {
            Z(j);
        }
    }

    public final void D() {
        SoftKeyView softKeyView = this.m;
        if (softKeyView != null) {
            X(softKeyView, this.G);
        }
    }

    public final void E(MotionEvent motionEvent, int i) {
        View a = ((ihh) this.q).n.a(motionEvent, i);
        if (a instanceof SoftKeyView) {
            SoftKeyView softKeyView = (SoftKeyView) a;
            Iterator it = ((CopyOnWriteArrayList) ((ihh) this.q).r.c).iterator();
            while (it.hasNext()) {
                if (((ihj) it.next()).m == softKeyView) {
                    return;
                }
            }
            A(softKeyView, motionEvent.getX(i), motionEvent.getY(i), motionEvent.getEventTime());
        }
    }

    public final boolean F(MotionEvent motionEvent, ict ictVar, int i, int i2) {
        ilu iluVar = this.p;
        if (iluVar == null || !iluVar.b()) {
            return false;
        }
        if (i == i2) {
            this.p.c(this.d, this.e, true);
        }
        iay iayVar = this.p.e;
        if (iayVar != null) {
            this.i = h();
            this.j = iayVar.c;
            iah iahVar = this.i;
            if (iahVar != null) {
                this.q.f(this, iahVar, iayVar, l(), false, false, 0, true, motionEvent.getEventTime());
                v(ictVar, this.i);
            }
        }
        return true;
    }

    public final boolean G() {
        SoftKeyView softKeyView = this.m;
        if (softKeyView == null || !softKeyView.isEnabled()) {
            return false;
        }
        return this.m.e;
    }

    public final boolean H() {
        return this.n != null;
    }

    public final boolean I() {
        ilu iluVar = this.p;
        return iluVar != null && iluVar.d();
    }

    public final boolean L() {
        return l() != null;
    }

    public final boolean N(MotionEvent motionEvent, int i) {
        u(motionEvent);
        if (motionEvent.findPointerIndex(this.a) != i) {
            return false;
        }
        return L();
    }

    @Override // defpackage.jdp
    public final void a(SoftKeyView softKeyView) {
        if (this.m == softKeyView) {
            aa();
        }
    }

    @Override // defpackage.jdp
    public final void b(SoftKeyView softKeyView) {
        if (this.m != softKeyView) {
            return;
        }
        ial d = softKeyView.d(h());
        this.n = d;
        boolean ae = ae(d);
        if (this.x.isDone() || ae) {
            if (this.x.isDone() && ae) {
                y();
            }
        } else {
            o();
        }
        boolean ac = ac(this.n);
        if (this.z.isDone() || ac) {
            if (!this.z.isDone() || !ac) {
                return;
            }
            x();
            return;
        }
        n();
    }

    @Override // defpackage.jdp
    public final void c(SoftKeyView softKeyView) {
        if (this.m != softKeyView || softKeyView.isShown()) {
            return;
        }
        aa();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        B();
        ilu iluVar = this.p;
        if (iluVar != null) {
            ((ihh) this.q).n.l(iluVar);
            this.p = null;
        }
    }

    public final int d() {
        SoftKeyView softKeyView = this.m;
        if (softKeyView == null || !softKeyView.isEnabled()) {
            return 0;
        }
        return this.m.getId();
    }

    public final int e() {
        ial j = j(iah.PRESS);
        if (j == null) {
            return 0;
        }
        return j.d().c;
    }

    public final gqc f() {
        return this.q.c();
    }

    public final iah g(float f, float f2, iah iahVar) {
        int i;
        if (!L()) {
            return null;
        }
        if (iahVar == iah.LONG_PRESS) {
            return iahVar;
        }
        if (this.b == Float.NEGATIVE_INFINITY || this.c == Float.NEGATIVE_INFINITY) {
            return iahVar == iah.DOUBLE_TAP ? iahVar : iah.PRESS;
        }
        ict l = l();
        if (!this.s || (l != null && l.l)) {
            float f3 = f - this.b;
            float f4 = f2 - this.c;
            ihk ihkVar = this.q;
            SoftKeyView softKeyView = this.m;
            icr icrVar = icr.ABSOLUTE;
            int ordinal = softKeyView.b.d.ordinal();
            if (ordinal == 0) {
                i = ((ihh) ihkVar).f;
            } else if (ordinal == 1) {
                i = ((ihh) ihkVar).g;
            } else if (ordinal != 3) {
                i = ordinal != 4 ? ((ihh) ihkVar).h : ((ihh) ihkVar).j;
            } else {
                i = ((ihh) ihkVar).i;
            }
            if (Math.abs(f4) > Math.abs(f3)) {
                if (f4 > i) {
                    return iah.SLIDE_DOWN;
                }
                if (f4 < (-i)) {
                    return iah.SLIDE_UP;
                }
            } else if (f3 > i) {
                return iah.SLIDE_RIGHT;
            } else {
                if (f3 < (-i)) {
                    return iah.SLIDE_LEFT;
                }
            }
        }
        return iahVar == iah.DOUBLE_TAP ? iahVar : iah.PRESS;
    }

    public final iah h() {
        if (H()) {
            return this.n.c;
        }
        return null;
    }

    public final ial i(iah iahVar) {
        SoftKeyView softKeyView = this.m;
        if (softKeyView == null || iahVar == null) {
            return null;
        }
        return softKeyView.d(iahVar);
    }

    public final ial j(iah iahVar) {
        ict l = l();
        if (l != null) {
            return l.b(iahVar);
        }
        return null;
    }

    public final ial k() {
        ial j;
        ial j2 = j(iah.PRESS);
        if (j2 != null && this.i == null) {
            ihk ihkVar = this.q;
            SoftKeyView softKeyView = this.m;
            int i = j2.d().c;
            if (softKeyView != null) {
                ihh ihhVar = (ihh) ihkVar;
                if (ihhVar.p == softKeyView && ihhVar.q == i && (j = j(iah.DOUBLE_TAP)) != null) {
                    return j;
                }
            }
        }
        return j2;
    }

    public final ict l() {
        SoftKeyView softKeyView = this.m;
        if (softKeyView == null || !softKeyView.isEnabled()) {
            return null;
        }
        return this.m.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.ial r13, boolean r14, boolean r15, boolean r16, long r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihj.m(ial, boolean, boolean, boolean, long):void");
    }

    public final void n() {
        this.z.cancel(false);
    }

    public final void o() {
        this.x.cancel(false);
    }

    public final void p(ial ialVar, ict ictVar, boolean z, long j) {
        iay d = ialVar.d();
        iah iahVar = ialVar.c;
        this.i = iahVar;
        this.j = d.c;
        ihk ihkVar = this.q;
        boolean z2 = ialVar.e;
        boolean z3 = ialVar.f;
        int i = this.K;
        this.K = i + 1;
        ihkVar.f(this, iahVar, d, ictVar, z2, z3, i, z, j);
    }

    public final void q(long j) {
        ial j2 = j(iah.UP);
        if (j2 != null) {
            this.q.f(this, iah.UP, j2.d(), l(), false, false, 0, true, j);
        }
    }

    public final void r(long j) {
        ilu iluVar = this.p;
        if (iluVar != null) {
            iluVar.a(j);
        }
        this.q.k();
        this.O = false;
    }

    public final void s(MotionEvent motionEvent, int i) {
        if (L()) {
            SoftKeyView softKeyView = this.m;
            if (softKeyView != null) {
                if (!this.s && softKeyView.c) {
                    return;
                }
                ilu iluVar = this.p;
                if (iluVar != null && iluVar.d() && !((ilv) iluVar.d).h()) {
                    return;
                }
            }
            float x = motionEvent.getX(i);
            float y = motionEvent.getY(i);
            ict l = l();
            int max = Math.max(1, this.G.width());
            int max2 = Math.max(1, this.G.height());
            float abs = Math.abs(x - this.b) / max;
            float abs2 = Math.abs(y - this.c) / max2;
            float floatValue = ((Double) F.c()).floatValue();
            if (!((Boolean) E.c()).booleanValue() || abs >= floatValue || abs2 >= floatValue) {
                float f = this.G.left - x;
                if (!ad(l, l.b(iah.SLIDE_LEFT), abs) || abs <= abs2 || f <= 0.0f) {
                    float f2 = x - this.G.right;
                    if (!ad(l, l.b(iah.SLIDE_RIGHT), abs) || abs <= abs2 || f2 <= 0.0f) {
                        float f3 = this.G.top - y;
                        if (!ad(l, l.b(iah.SLIDE_UP), abs2) || abs >= abs2 || f3 <= 0.0f) {
                            float f4 = y - this.G.bottom;
                            if (ad(l, l.b(iah.SLIDE_DOWN), abs2) && abs < abs2 && f4 > 0.0f) {
                                W(f4);
                                this.H = 4;
                            }
                        } else {
                            W(f3);
                            this.H = 2;
                        }
                    } else {
                        W(f2);
                        this.H = 3;
                    }
                } else {
                    W(f);
                    this.H = 1;
                }
            }
            if (this.H == 0) {
                return;
            }
        }
        E(motionEvent, i);
    }

    public final void t(ial ialVar, ict ictVar, boolean z, boolean z2, long j) {
        if (ialVar != null) {
            iah iahVar = ialVar.c;
            boolean z3 = false;
            if ((!this.s || iahVar == iah.LONG_PRESS) && ialVar.e) {
                z3 = true;
            }
            if (iahVar == iah.LONG_PRESS) {
                if (!z3 || !z) {
                    return;
                }
            } else if (iahVar == null || z3 != z || S(iahVar) == S(this.i)) {
                return;
            }
            p(ialVar, ictVar, z2, j);
        }
    }

    public final void u(MotionEvent motionEvent) {
        float O = O(motionEvent);
        float P = P(motionEvent);
        float f = this.g;
        if (O == f && P == this.h) {
            return;
        }
        float f2 = O - f;
        float f3 = P - this.h;
        this.d -= f2;
        this.e -= f3;
        this.b -= f2;
        this.c -= f3;
        D();
        this.g = O;
        this.h = P;
    }

    public final void v(ict ictVar, iah iahVar) {
        ial b = iahVar != null ? ictVar.b(iahVar) : null;
        if (b == null || !M(b)) {
            return;
        }
        ihk ihkVar = this.q;
        View view = this.m;
        if (view == null) {
            view = ((ihh) ihkVar).o;
        }
        hxk.a(((ihh) ihkVar).c).b(view, 1);
    }

    public final void w() {
        ict ictVar;
        SoftKeyView softKeyView = this.m;
        if (softKeyView == null || (ictVar = softKeyView.b) == null || !ictVar.e()) {
            return;
        }
        softKeyView.setPressed(true);
    }

    public final void x() {
        ict l;
        if (!this.z.isDone() || (l = l()) == null || !l.f(iah.LONG_PRESS)) {
            return;
        }
        this.z = this.r.a(this.L, Q(l), TimeUnit.MILLISECONDS);
    }

    public final void y() {
        int i;
        if (this.x.isDone()) {
            if (this.s) {
                i = this.q.a();
            } else {
                ict l = l();
                i = l != null ? l.g : -1;
            }
            if (i < 0) {
                return;
            }
            this.x = this.r.a(this.y, i, TimeUnit.MILLISECONDS);
        }
    }

    public final void z(long j) {
        this.q.p(this);
        q(j);
        ab();
        if (I()) {
            this.l = true;
            Z(j);
            return;
        }
        this.q.j(this);
    }
}
