package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.AccessibilityFullScreenPopupView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: ihh  reason: default package */
/* loaded from: classes.dex */
public final class ihh implements AutoCloseable, ihk, inm {
    public static final hhl a = hhq.f("double_tap_timeout", ViewConfiguration.getDoubleTapTimeout());
    private final ihg A;
    private final irm B;
    public AccessibilityFullScreenPopupView b;
    public final Context c;
    public final ino d;
    public final igy e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final int k;
    public final ihf n;
    public SoftKeyboardView o;
    public SoftKeyView p;
    public int q;
    public final kai r;
    private final float s;
    private final float t;
    private final float u;
    private final float v;
    private final float w;
    private boolean z;
    private int x = 300;
    private int y = 3000;
    public boolean l = false;
    public boolean m = false;

    public ihh(Context context, ihf ihfVar, igy igyVar) {
        ihg ihgVar = new ihg();
        this.A = ihgVar;
        this.c = context;
        this.n = ihfVar;
        this.e = igyVar;
        this.r = new kai(context, this);
        ino M = ino.M(context);
        this.d = M;
        this.z = M.aj(R.string.f160940_resource_name_obfuscated_res_0x7f14067e);
        ihe iheVar = new ihe(this);
        this.B = iheVar;
        iheVar.f(gyc.b);
        this.k = (int) (((jam.c(context) + jam.g(context)) / 2) * 0.3f);
        ihgVar.a = this;
        Resources resources = context.getResources();
        this.s = resources.getDimension(R.dimen.f41910_resource_name_obfuscated_res_0x7f07065a);
        this.t = resources.getDimension(R.dimen.f41920_resource_name_obfuscated_res_0x7f07065b);
        this.u = resources.getDimension(R.dimen.f41950_resource_name_obfuscated_res_0x7f07065e);
        this.v = resources.getDimension(R.dimen.f41930_resource_name_obfuscated_res_0x7f07065c);
        this.w = resources.getDimension(R.dimen.f41940_resource_name_obfuscated_res_0x7f07065d);
        o();
        n();
        M.Z(this, R.string.f161530_resource_name_obfuscated_res_0x7f1406ba, R.string.f161560_resource_name_obfuscated_res_0x7f1406bd, R.string.f160940_resource_name_obfuscated_res_0x7f14067e);
    }

    private static void s(ihj ihjVar, MotionEvent motionEvent, int i) {
        ihjVar.u(motionEvent);
        int findPointerIndex = motionEvent.findPointerIndex(ihjVar.a);
        if (findPointerIndex >= 0) {
            ihjVar.d = motionEvent.getX(findPointerIndex);
            ihjVar.e = motionEvent.getY(findPointerIndex);
            ihjVar.f = motionEvent.getPressure(findPointerIndex);
            ArrayList arrayList = ihjVar.u;
            if (arrayList != null) {
                arrayList.add(new ici(motionEvent, findPointerIndex, ihjVar.v));
            }
            ict l = ihjVar.l();
            if (l != null && !ihjVar.F(motionEvent, l, findPointerIndex, i)) {
                iah h = ihjVar.h();
                if (findPointerIndex == i) {
                    h = ihjVar.g(ihjVar.d, ihjVar.e, h);
                }
                ial i2 = ihjVar.i(h);
                ihjVar.t(i2, ihjVar.l(), false, i2 == null || i2.c != iah.PRESS || ihjVar.k, motionEvent.getEventTime());
                if (ihjVar.i == iah.PRESS) {
                    ihk ihkVar = ihjVar.q;
                    SoftKeyView softKeyView = ihjVar.m;
                    int i3 = ihjVar.j;
                    ihh ihhVar = (ihh) ihkVar;
                    ihhVar.t();
                    if (softKeyView != null) {
                        ihg ihgVar = ihhVar.A;
                        ihgVar.sendMessageDelayed(ihgVar.obtainMessage(1), ((Long) a.c()).longValue());
                        ihhVar.p = softKeyView;
                        ihhVar.q = i3;
                    }
                } else if (ihjVar.i == iah.DOUBLE_TAP) {
                    ihk ihkVar2 = ihjVar.q;
                    SoftKeyView softKeyView2 = ihjVar.m;
                    ihh ihhVar2 = (ihh) ihkVar2;
                    SoftKeyView softKeyView3 = ihhVar2.p;
                    if (softKeyView3 != null && softKeyView2 == softKeyView3) {
                        ihhVar2.t();
                    }
                }
                if (!ihjVar.A.isDone()) {
                    ihjVar.A.cancel(true);
                    ihjVar.B.run();
                } else {
                    ihjVar.v(l, h);
                }
                ihjVar.n = null;
                ihjVar.o = false;
            }
        }
        ihjVar.z(motionEvent.getEventTime());
    }

    private final void t() {
        this.A.removeMessages(1);
        this.p = null;
        this.q = 0;
    }

    @Override // defpackage.ihk
    public final int a() {
        return (!c().o() || c().q()) ? this.x : this.y;
    }

    @Override // defpackage.ihk
    public final gqc c() {
        return this.e.g();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b = null;
        this.A.a = null;
        this.d.ag(this, R.string.f161530_resource_name_obfuscated_res_0x7f1406ba, R.string.f161560_resource_name_obfuscated_res_0x7f1406bd, R.string.f160940_resource_name_obfuscated_res_0x7f14067e);
        this.B.h();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    public final ihj d(MotionEvent motionEvent, boolean z) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getActionMasked() == 0) {
            this.r.e();
        } else {
            for (ihj ihjVar : this.r.c) {
                ict l = ihjVar.l();
                if (l != null && !l.r) {
                    s(ihjVar, motionEvent, actionIndex);
                }
                if (this.o == null) {
                    return null;
                }
            }
        }
        ihj d = this.r.d(motionEvent, actionIndex);
        d.d = motionEvent.getX(actionIndex);
        d.e = motionEvent.getY(actionIndex);
        d.f = motionEvent.getPressure(actionIndex);
        d.E(motionEvent, actionIndex);
        d.m(d.k(), d.q.r(), false, z, motionEvent.getEventTime());
        ihk ihkVar = d.q;
        SoftKeyView softKeyView = d.m;
        ihh ihhVar = (ihh) ihkVar;
        SoftKeyView softKeyView2 = ihhVar.p;
        if (softKeyView2 != null && softKeyView != softKeyView2) {
            ihhVar.t();
        }
        return d;
    }

    public final imn e() {
        return this.e.k();
    }

    @Override // defpackage.ihk
    public final void f(ihj ihjVar, iah iahVar, iay iayVar, ict ictVar, boolean z, boolean z2, int i, boolean z3, long j) {
        this.n.i(ihjVar, iahVar, iayVar, ictVar, z, z2, i, z3, j);
    }

    public final void g() {
        this.r.e();
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if (inoVar.an(str, R.string.f161560_resource_name_obfuscated_res_0x7f1406bd)) {
            o();
        } else if (inoVar.an(str, R.string.f161530_resource_name_obfuscated_res_0x7f1406ba)) {
            n();
        } else if (!inoVar.an(str, R.string.f160940_resource_name_obfuscated_res_0x7f14067e)) {
        } else {
            this.z = inoVar.ak(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (r3 > r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
        r2.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
        if (r3 < (-r5)) goto L41;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihh.h(android.view.MotionEvent):void");
    }

    public final void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int actionMasked = motionEvent.getActionMasked();
        ihj c = this.r.c(motionEvent.getPointerId(actionIndex));
        if (c != null) {
            if (c.N(motionEvent, actionIndex)) {
                s(c, motionEvent, actionIndex);
            } else {
                c.z(motionEvent.getEventTime());
            }
        }
        if (actionMasked == 1) {
            this.r.e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xx, java.lang.Object] */
    @Override // defpackage.ihk
    public final void j(ihj ihjVar) {
        kai kaiVar = this.r;
        if (((CopyOnWriteArrayList) kaiVar.a).remove(ihjVar)) {
            ihjVar.close();
            kaiVar.e.b(ihjVar);
        }
    }

    @Override // defpackage.ihk
    public final void k() {
        if (c().o()) {
            if (this.b != null) {
                e().c(this.b, null, false);
            }
            this.n.p(false);
        }
    }

    @Override // defpackage.ihk
    public final void l(iay iayVar) {
        hxk.a(this.c).c(this.o, iayVar);
    }

    public final void m() {
        Iterator it = ((CopyOnWriteArrayList) this.r.c).iterator();
        while (it.hasNext()) {
            ihj ihjVar = (ihj) it.next();
            ihjVar.q.p(ihjVar);
            ihjVar.q(0L);
            ihjVar.B();
            ihjVar.q.j(ihjVar);
        }
        t();
    }

    public final void n() {
        this.x = this.d.F(R.string.f161530_resource_name_obfuscated_res_0x7f1406ba, 300);
        this.y = this.d.F(R.string.f161540_resource_name_obfuscated_res_0x7f1406bb, 3000);
    }

    public final void o() {
        float B = this.d.B(this.c.getString(R.string.f161560_resource_name_obfuscated_res_0x7f1406bd), 1.0f);
        this.f = (int) (this.s * B);
        this.g = (int) (this.t * B);
        this.h = (int) (this.u * B);
        this.i = (int) (this.v * B);
        this.j = (int) this.w;
    }

    @Override // defpackage.ihk
    public final void p(ihj ihjVar) {
        kai kaiVar = this.r;
        if (((CopyOnWriteArrayList) kaiVar.c).remove(ihjVar)) {
            ((CopyOnWriteArrayList) kaiVar.a).add(ihjVar);
        }
    }

    public final boolean q() {
        return !((CopyOnWriteArrayList) this.r.c).isEmpty();
    }

    @Override // defpackage.ihk
    public final boolean r() {
        return this.z && !c().o();
    }
}
