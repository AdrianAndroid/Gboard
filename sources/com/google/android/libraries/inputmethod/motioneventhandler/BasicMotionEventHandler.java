package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dxl  reason: default package */
/* loaded from: classes.dex */
public final class dxl extends ddz {
    final /* synthetic */ dxm a;

    /* JADX INFO: Access modifiers changed from: protected */
    public dxl(dxm dxmVar) {
        this.a = dxmVar;
    }

    @Override // defpackage.ald
    public final int a() {
        return this.a.h.length;
    }

    @Override // defpackage.ald
    public final Object b(ViewGroup viewGroup, int i) {
        int i2 = this.a.h[l(i)];
        if (i2 == 0) {
            return null;
        }
        View inflate = View.inflate(this.a.k, i2, null);
        ((AppCompatTextView) inflate.findViewById(R.id.f56930_resource_name_obfuscated_res_0x7f0b02bc)).setText(dxm.b[i]);
        ArrayList arrayList = new ArrayList(2);
        View findViewById = inflate.findViewById(R.id.f55370_resource_name_obfuscated_res_0x7f0b0202);
        arrayList.add(findViewById);
        findViewById.setSelected(true);
        this.a.d.add(i, findViewById);
        View findViewById2 = inflate.findViewById(R.id.f68200_resource_name_obfuscated_res_0x7f0b08cd);
        arrayList.add(findViewById2);
        findViewById2.setSelected(false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((View) arrayList.get(i3)).setOnClickListener(new dxk(this, i, 0));
        }
        this.a.c.add(i, arrayList);
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    @Override // defpackage.ald
    public final void c(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.ald
    public final boolean h(View view, Object obj) {
        return view == obj;
    }
}f (actionMasked2 != 0) {
                    Object obj = null;
                    if (iguVar.i == null && (iguVar.o != null || iguVar.p != null)) {
                        if (iguVar.p == null) {
                            iguVar.e();
                        }
                        SoftKeyboardView softKeyboardView = iguVar.g;
                        View c = (softKeyboardView == null || (motionEvent2 = iguVar.p) == null) ? null : softKeyboardView.c(motionEvent2, motionEvent2.getActionIndex());
                        if (c instanceof SoftKeyView) {
                            iguVar.i = (SoftKeyView) c;
                            iguVar.i.setPressed(true);
                            iguVar.j = true;
                        }
                    }
                    if (actionMasked2 == 5) {
                        iguVar.m = true;
                        iguVar.d.d(motionEvent, true);
                        iguVar.b();
                        return;
                    } else if (actionMasked2 == 2) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        int i = iguVar.k;
                        if (pointerId != i) {
                            iguVar.d.h(motionEvent);
                            return;
                        } else if (iguVar.l) {
                            iguVar.d.h(motionEvent);
                            ChordTrackOverlayView chordTrackOverlayView = iguVar.r;
                            if (chordTrackOverlayView == null) {
                                return;
                            }
                            chordTrackOverlayView.c(motionEvent);
                            return;
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(i);
                            SoftKeyboardView softKeyboardView2 = iguVar.g;
                            View c2 = softKeyboardView2 != null ? softKeyboardView2.c(motionEvent, findPointerIndex) : null;
                            if (c2 == null || c2.equals(iguVar.i)) {
                                return;
                            }
                            SoftKeyView softKeyView2 = iguVar.i;
                            if (softKeyView2 != null) {
                                softKeyView2.setPressed(false);
                            }
                            iguVar.l = true;
                            if (!iguVar.m && !iguVar.e.f(iguVar.r)) {
                                imn imnVar = iguVar.e;
                                if (imnVar != null) {
                                    if (iguVar.r == null) {
                                        iguVar.r = (ChordTrackOverlayView) imnVar.b(iguVar.a, R.layout.f133670_resource_name_obfuscated_res_0x7f0e003f);
                                        iguVar.r.setEnabled(false);
                                        MotionEvent motionEvent3 = iguVar.p;
                                        if (motionEvent3 != null) {
                                            iguVar.r.b(motionEvent3, iguVar.k);
                                        }
                                    }
                                    SoftKeyboardView softKeyboardView3 = iguVar.g;
                                    ChordTrackOverlayView chordTrackOverlayView2 = iguVar.r;
                                    if (softKeyboardView3 != null) {
                                        obj = softKeyboardView3.getWindowToken();
                                    }
                                    if (obj != null && chordTrackOverlayView2 != null) {
                                        chordTrackOverlayView2.setVisibility(0);
                                        chordTrackOverlayView2.setLayoutParams(new FrameLayout.LayoutParams(softKeyboardView3.getWidth(), softKeyboardView3.getHeight()));
                                        iguVar.e.e(chordTrackOverlayView2, softKeyboardView3, 1058, 0, 0, null);
                                    }
                                }
                                ChordTrackOverlayView chordTrackOverlayView3 = iguVar.r;
                                if (chordTrackOverlayView3 != null) {
                                    chordTrackOverlayView3.c(motionEvent);
                                }
                                iguVar.c.m();
                            }
                            if (!iguVar.q) {
                                return;
                            }
                            int actionIndex = motionEvent.getActionIndex();
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setLocation(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
                            obtain.setAction(5);
                            iguVar.d.d(obtain, false);
                            obtain.recycle();
                            return;
                        }
                    } else if (actionMasked2 == 1 || actionMasked2 == 6) {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (iguVar.m) {
                            iguVar.d.i(motionEvent);
                            if (motionEvent.getPointerId(actionIndex2) == iguVar.k) {
                                SoftKeyView softKeyView3 = iguVar.i;
                                if (softKeyView3 != null) {
                                    softKeyView3.setPressed(false);
                                }
                                iguVar.k = -1;
                            } else {
                                idk idkVar = iguVar.f;
                                iha ihaVar = iha.a;
                                Object[] objArr = new Object[1];
                                objArr[0] = Integer.valueOf(true != iguVar.j ? 33 : 32);
                                idkVar.e(ihaVar, objArr);
                            }
                            SoftKeyView softKeyView4 = iguVar.i;
                            if (softKeyView4 == null || softKeyView4.isPressed() || iguVar.d.q()) {
                                return;
                            }
                            iguVar.a();
                            iguVar.b.m();
                            return;
                        } else if (!iguVar.l) {
                            iguVar.d.i(motionEvent);
                            iguVar.c();
                            return;
                        } else {
                            SoftKeyboardView softKeyboardView4 = iguVar.g;
                            if (softKeyboardView4 != null) {
                                obj = softKeyboardView4.c(motionEvent, actionIndex2);
                            }
                            if (obj != null && obj.equals(iguVar.i)) {
                                iguVar.d.i(motionEvent);
                                iguVar.b.m();
                                return;
                            }
                            iguVar.d.i(motionEvent);
                            idk idkVar2 = iguVar.f;
                            iha ihaVar2 = iha.a;
                            Object[] objArr2 = new Object[1];
                            objArr2[0] = Integer.valueOf(true != iguVar.j ? 31 : 30);
                            idkVar2.e(ihaVar2, objArr2);
                            if (!iguVar.h) {
                                return;
                            }
                            iguVar.a();
                            iguVar.b.m();
                            return;
                        }
                    } else if (actionMasked2 != 3) {
                        return;
                    }
                }
                iguVar.c();
            }
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        this.e.h(motionEvent);
                        return;
                    } else if (actionMasked == 3) {
                        this.e.g();
                        this.c = false;
                        return;
                    } else if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                    }
                }
                this.e.i(motionEvent);
                if (this.e.q()) {
                    return;
                }
                this.c = false;
                return;
            }
            ihj d = this.e.d(motionEvent, !c().q());
            if (d == null) {
                return;
            }
            this.c = true;
            if (c().o() || (softKeyView = d.m) == null || (ictVar = softKeyView.b) == null) {
                return;
            }
            ial b = ictVar.b(iah.DOWN);
            if (b == null) {
                ial b2 = softKeyView.b.b(iah.PRESS);
                if (b2 == null || !b2.e) {
                    return;
                }
                if (b2.d().c != -10012 && b2.d().c != -10013) {
                    return;
                }
            } else if (b.d().c != -10032) {
                return;
            }
            this.b.d(motionEvent, d.m, false);
        }
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final boolean A(MotionEvent motionEvent) {
        boolean z = motionEvent.getActionMasked() == 0;
        if (z) {
            this.c = true;
        }
        return z;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final boolean B(MotionEvent motionEvent) {
        h(motionEvent);
        return true;
    }

    public View a(MotionEvent motionEvent, int i) {
        return this.l.d(motionEvent, i);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, java.lang.AutoCloseable
    public final void close() {
        m();
        this.d = false;
        this.e.close();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public void e() {
        this.e.n();
        ihh ihhVar = this.e;
        ihhVar.l = ihhVar.d.aj(R.string.f161000_resource_name_obfuscated_res_0x7f140684);
        ihh ihhVar2 = this.e;
        ihhVar2.m = ihhVar2.d.aj(R.string.f160990_resource_name_obfuscated_res_0x7f140683);
    }

    @Override // defpackage.ihf
    public final ilu f() {
        ilu iluVar = (ilu) this.f.a();
        return iluVar == null ? new ilu(this.k, this.l.h().d, this.l.k(), this.g, this.a, this.l.f(), null, null) : iluVar;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public void g() {
        m();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void gP(long j, long j2) {
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.igx
    public void h(MotionEvent motionEvent) {
        SoftKeyboardView softKeyboardView;
        ilu iluVar;
        SoftKeyView softKeyView;
        SoftKeyboardView softKeyboardView2;
        if (c().o() && motionEvent.getDeviceId() != 0) {
            if (c().q()) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7) {
                    for (ihj ihjVar : this.e.r.c) {
                        ihjVar.u(motionEvent);
                        int findPointerIndex = motionEvent.findPointerIndex(ihjVar.a);
                        if (findPointerIndex >= 0) {
                            SoftKeyView softKeyView2 = ihjVar.m;
                            ihjVar.s(motionEvent, findPointerIndex);
                            if (ihjVar.L()) {
                                ihjVar.d = motionEvent.getX(findPointerIndex);
                                ihjVar.e = motionEvent.getY(findPointerIndex);
                                ihjVar.f = motionEvent.getPressure(findPointerIndex);
                                if (ihjVar.m != softKeyView2 || (iluVar = ihjVar.p) == null || !iluVar.c(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), false)) {
                                    iah g = ihjVar.g((int) motionEvent.getX(findPointerIndex), (int) motionEvent.getY(findPointerIndex), ihjVar.h());
                                    ial i = ihjVar.i(g);
                                    if (ihj.J(g)) {
                                        ihjVar.m(i, ihjVar.q.r(), true, false, motionEvent.getEventTime());
                                    } else {
                                        if (ihj.K(ihjVar.n) && i != null && !TextUtils.isEmpty(i.l)) {
                                            ihjVar.f().g(i.l);
                                        } else if (ihjVar.m != null) {
                                            ihjVar.f().j(ihjVar.m);
                                        }
                                        ihjVar.n = i;
                                    }
                                }
                            }
                        }
                    }
                    return;
                } else if (actionMasked == 9) {
                    ihh ihhVar = this.e;
                    ihhVar.r.e();
                    int actionIndex = motionEvent.getActionIndex();
                    ihj d = ihhVar.r.d(motionEvent, actionIndex);
                    d.d = motionEvent.getX(actionIndex);
                    d.e = motionEvent.getY(actionIndex);
                    d.f = motionEvent.getPressure(actionIndex);
                    d.E(motionEvent, actionIndex);
                    SoftKeyView softKeyView3 = d.m;
                    if (softKeyView3 != null) {
                        softKeyView3.h();
                        d.f().j(d.m);
                    }
                    ial k = d.k();
                    if (k == null || !ihj.M(k)) {
                        return;
                    }
                    d.q.l(k.d());
                    return;
                } else if (actionMasked == 10) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (!this.d && (x < 0.0f || (softKeyboardView2 = this.a) == null || x >= softKeyboardView2.getWidth() || y < 0.0f || y >= this.a.getHeight())) {
                        this.e.g();
                        return;
                    }
                    ihh ihhVar2 = this.e;
                    int actionIndex2 = motionEvent.getActionIndex();
                    ihj c = ihhVar2.r.c(motionEvent.getPointerId(actionIndex2));
                    if (c != null) {
                        if (c.N(motionEvent, actionIndex2)) {
                            c.u(motionEvent);
                            int findPointerIndex2 = motionEvent.findPointerIndex(c.a);
                            if (findPointerIndex2 >= 0) {
                                c.d = motionEvent.getX(findPointerIndex2);
                                c.e = motionEvent.getY(findPointerIndex2);
                                c.f = motionEvent.getPressure(findPointerIndex2);
                                ict l = c.l();
                                if (l != null && !c.F(motionEvent, l, findPointerIndex2, actionIndex2)) {
                                    iah h = c.h();
                                    if (findPointerIndex2 == actionIndex2) {
                                        h = c.g(c.d, c.e, h);
                                    }
                                    if (ihj.J(h)) {
                                        ial i2 = c.i(h);
                                        c.t(i2, c.l(), false, i2 == null || i2.c != iah.PRESS || c.k, motionEvent.getEventTime());
                                        if (c.f().q() && (softKeyView = c.m) != null) {
                                            softKeyView.setClickable(false);
                                            c.m.setLongClickable(false);
                                        }
                                    }
                                    c.n = null;
                                    c.o = false;
                                }
                            }
                        }
                        c.z(motionEvent.getEventTime());
                    }
                    ihhVar2.r.e();
                    return;
                }
            } else {
                int actionMasked2 = motionEvent.getActionMasked();
                int action = motionEvent.getAction();
                if (actionMasked2 == 7) {
                    motionEvent.setAction((action & (-8)) | 2);
                    s(motionEvent);
                    motionEvent.setAction(action);
                    return;
                } else if (actionMasked2 == 9) {
                    motionEvent.setAction(action & (-10));
                    s(motionEvent);
                    motionEvent.setAction(action);
                    return;
                } else if (actionMasked2 == 10) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (this.d || (x2 >= 0.0f && (softKeyboardView = this.a) != null && x2 < softKeyboardView.getWidth() && y2 >= 0.0f && y2 < this.a.getHeight())) {
                        motionEvent.setAction((action & (-11)) | 1);
                    } else {
                        motionEvent.setAction((action & (-11)) | 3);
                    }
                    s(motionEvent);
                    motionEvent.setAction(action);
                    return;
                }
            }
        }
        s(motionEvent);
    }

    @Override // defpackage.ihf
    public void i(ihj ihjVar, iah iahVar, iay iayVar, ict ictVar, boolean z, boolean z2, int i, boolean z3, long j) {
        if (!this.b.l || (!z && !z2)) {
            if (r(iahVar)) {
                this.l.m();
            }
            igy igyVar = this.l;
            hfd b = hfd.b();
            b.i = j;
            b.a = iahVar;
            b.j(iayVar);
            b.c = ictVar;
            b.d = ihjVar.d();
            b.e = ihjVar.G();
            b.l(ihjVar.d, ihjVar.e);
            b.n = ihjVar.f;
            b.g = x();
            b.j = i;
            ArrayList arrayList = ihjVar.u;
            b.q = arrayList != null ? (ici[]) arrayList.toArray(new ici[arrayList.size()]) : null;
            igu iguVar = this.b;
            int i2 = 1;
            if (iguVar != null && iguVar.h) {
                i2 = 2;
            }
            b.p = i2;
            igyVar.n(b);
        }
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void j() {
        this.b.b();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public void k(boolean z, int i, int i2, int i3, int i4) {
        SoftKeyView softKeyView;
        ihh ihhVar = this.e;
        Iterator it = ((CopyOnWriteArrayList) ihhVar.r.c).iterator();
        while (it.hasNext()) {
            ((ihj) it.next()).D();
        }
        AccessibilityFullScreenPopupView accessibilityFullScreenPopupView = ihhVar.b;
        if (accessibilityFullScreenPopupView != null) {
            accessibilityFullScreenPopupView.b();
        }
        igu iguVar = this.b;
        iguVar.e();
        if (!iguVar.n || (softKeyView = iguVar.i) == null) {
            return;
        }
        softKeyView.setPressed(false);
        iguVar.i = null;
    }

    @Override // defpackage.ihf
    public final void l(ilu iluVar) {
        if (!this.f.b(iluVar)) {
            iluVar.close();
        }
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public void m() {
        this.c = false;
        this.e.m();
        this.b.c();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public void n(SoftKeyboardView softKeyboardView) {
        if (this.a != softKeyboardView) {
            this.a = softKeyboardView;
            ihh ihhVar = this.e;
            if (softKeyboardView != ihhVar.o) {
                ihhVar.m();
                ihhVar.o = softKeyboardView;
                AccessibilityFullScreenPopupView accessibilityFullScreenPopupView = ihhVar.b;
                if (accessibilityFullScreenPopupView != null) {
                    accessibilityFullScreenPopupView.a(softKeyboardView);
                }
            }
            while (true) {
                ilu iluVar = (ilu) this.f.a();
                if (iluVar == null) {
                    break;
                }
                iluVar.close();
            }
            igu iguVar = this.b;
            if (softKeyboardView != iguVar.g) {
                iguVar.c();
                iguVar.g = softKeyboardView;
            }
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(boolean z) {
        this.e.r.b = z;
    }

    @Override // defpackage.ihf
    public final void p(boolean z) {
        this.d = z;
    }

    @Override // defpackage.ihf
    public final boolean q() {
        return this.b.l;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void z(MotionEvent motionEvent) {
        if (!c().o()) {
            this.b.d(motionEvent, null, true);
        }
    }
}
