package defpackage;

import android.animation.Animator;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.google.android.apps.inputmethod.libs.framework.core.InputView;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcn  reason: default package */
/* loaded from: classes.dex */
public final class dcn implements htw {
    final /* synthetic */ dcu a;

    public dcn(dcu dcuVar) {
        this.a = dcuVar;
    }

    @Override // defpackage.htw
    public final void a(ibz ibzVar, ice iceVar, View view) {
        hxi hxiVar = this.a.S;
        if (hxiVar != null) {
            hxc hxcVar = hxiVar.g;
            hxcVar.a = ibzVar;
            hxcVar.b(iceVar.ordinal(), ibzVar, 1, true);
            hxd a = hxd.a(ibzVar, iceVar);
            hwy hwyVar = hwy.c;
            hxd a2 = hxd.a(null, iceVar);
            hxc hxcVar2 = hxiVar.g;
            int ordinal = iceVar.ordinal();
            hxcVar2.a = ibzVar;
            hxe hxeVar = hxcVar2.b[ordinal];
            hxeVar.a = view;
            hxeVar.b = (qq) hxi.p(hxiVar.d, a, hwyVar);
            hxeVar.c = (qq) hxi.p(hxiVar.d, a2, hwyVar);
            if (hxiVar.f.put(hxd.a(ibzVar, iceVar), view) == view) {
                ((ltd) hxi.b.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "onKeyboardViewAttached", 1087, "KeyboardViewController.java")).G("The keyboardView %s %s attached again before it's detached", ibzVar, iceVar);
            } else {
                hxiVar.r(ibzVar, iceVar, new dzw(ibzVar, iceVar, view, 5));
            }
        }
    }

    @Override // defpackage.htw
    public final void b(ibz ibzVar, ice iceVar, View view) {
        hxi hxiVar = this.a.S;
        if (hxiVar != null) {
            hxd a = hxd.a(ibzVar, iceVar);
            View view2 = (View) hxiVar.f.get(a);
            if (view2 != view) {
                ((ltd) ((ltd) hxi.b.b()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "onKeyboardViewDetached", 1296, "KeyboardViewController.java")).K("the keyboard view %s %s %s is detaching is not the one saved %s", ibzVar, iceVar, view, view2);
                return;
            }
            hxiVar.r(ibzVar, iceVar, new ehz(ibzVar, 16));
            hxiVar.g.b(iceVar.ordinal(), ibzVar, 5, false);
            hxc hxcVar = hxiVar.g;
            hxe hxeVar = hxcVar.b[iceVar.ordinal()];
            hxeVar.a = null;
            SparseArray sparseArray = hxeVar.e;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            SparseArray sparseArray2 = hxeVar.d;
            if (sparseArray2 != null) {
                sparseArray2.clear();
            }
            SparseArray sparseArray3 = hxeVar.f;
            if (sparseArray3 != null) {
                for (int i = 0; i < sparseArray3.size(); i++) {
                    ((Animator) sparseArray3.valueAt(i)).cancel();
                }
                sparseArray3.clear();
            }
            hxeVar.b = null;
            hxeVar.c = null;
            hxiVar.f.remove(a);
            hxiVar.r(ibzVar, iceVar, new ebj(10));
        }
    }

    @Override // defpackage.htw
    public final void c(ibz ibzVar, ice iceVar, View view) {
        hxi hxiVar = this.a.S;
        if (hxiVar != null) {
            hxiVar.g.b(iceVar.ordinal(), ibzVar, 2, true);
            hxiVar.r(ibzVar, iceVar, new ehz(view, 15));
        }
    }

    @Override // defpackage.htw
    public final void d(ibz ibzVar, ice iceVar, View view) {
        boolean z;
        hpc hpcVar;
        Rect rect;
        dcu dcuVar = this.a;
        InputView inputView = dcuVar.q;
        if (inputView != null) {
            dcuVar.updateFullscreenMode();
            inputView.c(this.a.isFullscreenMode());
            dcu dcuVar2 = this.a;
            InputView inputView2 = dcuVar2.q;
            if (inputView2 != null) {
                int y = dcuVar2.y();
                if (!dcuVar2.m || !(y == 1 || y == 4)) {
                    rect = null;
                } else {
                    int i = dcuVar2.n;
                    int height = inputView2.getHeight() - dcuVar2.U().d();
                    rect = new Rect(0, height, inputView2.getWidth(), i + height);
                }
                inputView2.e = rect;
            }
        }
        hox b = this.a.o.b();
        if (b != null && iceVar != null && view != null) {
            hpi hpiVar = b.e;
            hsy hsyVar = hpiVar.c;
            if (hsyVar != null) {
                hsyVar.fw(iceVar, view);
                if (hpiVar.k > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - hpiVar.k;
                    idk a = hpiVar.a();
                    if (hpiVar.i) {
                        hpcVar = hpc.ACTIVATE_KEYBOARD_REQUEST_KEYBOARD;
                    } else {
                        hpcVar = hpc.ACTIVATE_KEYBOARD_INTERNAL;
                    }
                    a.g(hpcVar, elapsedRealtime);
                }
                hpiVar.k = 0L;
            }
            hxi hxiVar = this.a.S;
            if (hxiVar != null && ibzVar != null) {
                hxiVar.g.b(iceVar.ordinal(), ibzVar, 3, true);
                hxiVar.r(ibzVar, iceVar, new ebj(9));
                qq n = hxiVar.n(iceVar.ordinal());
                if (n != null && !n.isEmpty()) {
                    SparseArray m = hxiVar.m(iceVar.ordinal());
                    Iterator it = n.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View findViewById = view.findViewById(num.intValue());
                        if (findViewById != null) {
                            View view2 = findViewById;
                            while (view2.getVisibility() == 0) {
                                view2 = (View) view2.getParent();
                                if (view2 != null) {
                                    if (view2 == view) {
                                    }
                                }
                                z = true;
                            }
                            z = false;
                            int intValue = num.intValue();
                            hxf hxfVar = (hxf) m.get(intValue);
                            if (hxfVar != null) {
                                hxfVar.a = z;
                            } else {
                                m.put(intValue, new hxf(findViewById, z));
                            }
                            if (z) {
                                eii eiiVar = new eii(hxiVar, num, 11);
                                eiiVar.a(hxh.a(ibzVar, iceVar, num.intValue()));
                                eiiVar.a(hxh.a(null, iceVar, num.intValue()));
                            }
                        }
                    }
                }
            }
        }
        if (this.a.p != iau.SOFT) {
            this.a.aF();
        }
        if (iceVar == ice.BODY) {
            this.a.o();
            ifh.d();
            ieh.j().e(hsp.KEYBOARD_BODY_SHOWN, new Object[0]);
            this.a.aF();
        }
    }

    @Override // defpackage.htw
    public final void e(ibz ibzVar, ice iceVar, final boolean z) {
        hxi hxiVar = this.a.S;
        if (hxiVar != null) {
            hxiVar.g.b(iceVar.ordinal(), ibzVar, 4, false);
            hxiVar.r(ibzVar, iceVar, new hiu() { // from class: hwx
                @Override // defpackage.hiu
                public final void a(Object obj) {
                    ((hwu) obj).c(z);
                }
            });
            hxiVar.u(ibzVar, iceVar, hht.u, true);
        }
    }
}
