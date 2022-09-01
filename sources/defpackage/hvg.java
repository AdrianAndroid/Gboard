package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.keyboardmode.MultiTouchDelegateView;
import com.google.android.libraries.inputmethod.widgets.KeyboardHolder;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hvg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hvg implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hvg(hva hvaVar, int i) {
        this.b = i;
        this.a = hvaVar;
    }

    public /* synthetic */ hvg(hvh hvhVar, int i) {
        this.b = i;
        this.a = hvhVar;
    }

    public /* synthetic */ hvg(hvi hviVar, int i) {
        this.b = i;
        this.a = hviVar;
    }

    public hvg(hvx hvxVar, int i) {
        this.b = i;
        this.a = hvxVar;
    }

    public hvg(hwg hwgVar, int i) {
        this.b = i;
        this.a = hwgVar;
    }

    public /* synthetic */ hvg(idz idzVar, int i) {
        this.b = i;
        this.a = idzVar;
    }

    public /* synthetic */ hvg(igr igrVar, int i) {
        this.b = i;
        this.a = igrVar;
    }

    public hvg(ihj ihjVar, int i) {
        this.b = i;
        this.a = ihjVar;
    }

    public /* synthetic */ hvg(Throwable th, int i) {
        this.b = i;
        this.a = th;
    }

    public /* synthetic */ hvg(WeakReference weakReference, int i) {
        this.b = i;
        this.a = weakReference;
    }

    public /* synthetic */ hvg(CountDownLatch countDownLatch, int i) {
        this.b = i;
        this.a = countDownLatch;
    }

    public /* synthetic */ hvg(lmz lmzVar, int i) {
        this.b = i;
        this.a = lmzVar;
    }

    public hvg(mti mtiVar, int i) {
        this.b = i;
        this.a = mtiVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, hvh] */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = -1;
        switch (this.b) {
            case 0:
                ((hvp) this.a).h(4, true);
                return;
            case 1:
                hva hvaVar = (hva) this.a;
                if (hvaVar.s) {
                    return;
                }
                hvaVar.g(0.75f, 300);
                return;
            case 2:
                this.a.b();
                return;
            case 3:
                hvi hviVar = (hvi) this.a;
                hviVar.e = true;
                int i2 = hviVar.f;
                if (i2 != -1) {
                    hviVar.a.a(i2);
                }
                int i3 = hviVar.g;
                if (i3 != -1) {
                    hviVar.b.a(i3);
                }
                int i4 = hviVar.h;
                if (i4 == -1) {
                    return;
                }
                hviVar.c.a(i4);
                return;
            case 4:
                ((hvi) this.a).e = false;
                return;
            case 5:
                ((hvp) this.a).h(2, true);
                return;
            case 6:
                ((hvp) this.a).h(3, true);
                return;
            case 7:
                hvx hvxVar = (hvx) this.a;
                if (hvxVar.f == null || hvxVar.g == null || hvxVar.h == null) {
                    return;
                }
                hvxVar.n();
                hvx hvxVar2 = (hvx) this.a;
                if (!hvxVar2.x || (view = hvxVar2.j) == null || view.getHeight() <= 0) {
                    return;
                }
                int g = hvxVar2.g();
                KeyboardViewHolder keyboardViewHolder = hvxVar2.m;
                int paddingBottom = keyboardViewHolder == null ? -1 : keyboardViewHolder.getPaddingBottom();
                int i5 = g + paddingBottom;
                boolean q = hvxVar2.q(true != jam.r(hvxVar2.f) ? "normal_mode_keyboard_bottom_gap_portrait" : "normal_mode_keyboard_bottom_gap_landscape", i5);
                WindowInsets windowInsets = ((dck) hvxVar2.g.c()).a.l;
                int stableInsetBottom = windowInsets == null ? -1 : windowInsets.getStableInsetBottom();
                boolean q2 = hvxVar2.q(true != jam.r(hvxVar2.f) ? "normal_mode_decor_view_stable_inset_bottom_portrait" : "normal_mode_decor_view_stable_inset_bottom_landscape", stableInsetBottom) | q;
                hvxVar2.x = false;
                luc lucVar = (luc) ((luc) hvx.a.b()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardViewManager", "saveKeyboardBottomGap", 282, "KeyboardViewManager.java");
                Integer valueOf = Integer.valueOf(hvxVar2.i.y);
                Float valueOf2 = Float.valueOf(jam.b(hvxVar2.f));
                KeyboardHolder keyboardHolder = hvxVar2.o;
                if (keyboardHolder != null) {
                    i = keyboardHolder.getHeight();
                }
                lucVar.V(valueOf, valueOf2, Integer.valueOf(i), Integer.valueOf(g), Integer.valueOf(hvxVar2.a()), Integer.valueOf(hvxVar2.b()), Integer.valueOf(i5), Integer.valueOf(paddingBottom), Integer.valueOf(stableInsetBottom), Boolean.valueOf(q2));
                if (!q2) {
                    return;
                }
                ieh.j().e(hvq.ON_KEYBOARD_BOTTOM_LAYOUT_UPDATED, new Object[0]);
                return;
            case 8:
                MultiTouchDelegateView multiTouchDelegateView = ((hwg) this.a).f;
                if (multiTouchDelegateView == null) {
                    return;
                }
                multiTouchDelegateView.a();
                hwg hwgVar = (hwg) this.a;
                hwg.f(hwgVar.q, hwgVar.f);
                hwg hwgVar2 = (hwg) this.a;
                hwg.f(hwgVar2.o, hwgVar2.f);
                hwg hwgVar3 = (hwg) this.a;
                hwg.f(hwgVar3.p, hwgVar3.f);
                hwg hwgVar4 = (hwg) this.a;
                hwg.f(hwgVar4.n, hwgVar4.f);
                return;
            case 9:
                hwg hwgVar5 = (hwg) this.a;
                if (!hwgVar5.b || hwgVar5.a == null) {
                    return;
                }
                hwgVar5.i();
                return;
            case 10:
                hyq.c(((mti) this.a).ar, true);
                return;
            case 11:
                hyq.c(((mti) this.a).ar, false);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((idz) this.a).e.g();
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj = this.a;
                if (obj instanceof RuntimeException) {
                    throw ((RuntimeException) obj);
                }
                throw new IllegalStateException((Throwable) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((CountDownLatch) this.a).countDown();
                return;
            case 15:
                igr.f((lmz) this.a, true);
                return;
            case 16:
                igr.f((lmz) this.a, false);
                return;
            case 17:
                Object obj2 = this.a;
                for (igq igqVar : ((igr) obj2).c.values()) {
                    String f = igqVar.a.a.f();
                    if (f != null) {
                        igqVar.p = igqVar.b.al(f, false, false) == igqVar.a.a.h();
                        igqVar.a();
                    }
                }
                synchronized (obj2) {
                    ((igr) obj2).f = null;
                }
                return;
            case 18:
                Object obj3 = this.a;
                int i6 = ihj.D;
                View view2 = (View) ((WeakReference) obj3).get();
                if (view2 == null) {
                    return;
                }
                view2.setPressed(false);
                return;
            case 19:
                ihj ihjVar = (ihj) this.a;
                ihjVar.r(ihjVar.w);
                ihj ihjVar2 = (ihj) this.a;
                if (!ihjVar2.l) {
                    return;
                }
                ihjVar2.q.j(ihjVar2);
                return;
            default:
                ihj ihjVar3 = (ihj) this.a;
                if (!ihjVar3.H()) {
                    return;
                }
                ial ialVar = ihjVar3.n;
                if (!ialVar.f) {
                    return;
                }
                ihjVar3.p(ialVar, ihjVar3.l(), true, 0L);
                ict l = ihjVar3.l();
                if (l == null) {
                    return;
                }
                ihjVar3.x = ihjVar3.r.a(ihjVar3.y, l.h, TimeUnit.MILLISECONDS);
                return;
        }
    }
}
