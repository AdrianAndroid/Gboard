package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.inputmethod.latin.R;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hob  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hob implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hob(InputConnection inputConnection, int i) {
        this.b = i;
        this.a = inputConnection;
    }

    public /* synthetic */ hob(hoe hoeVar, int i) {
        this.b = i;
        this.a = hoeVar;
    }

    public hob(hoe hoeVar, int i, byte[] bArr) {
        this.b = i;
        this.a = hoeVar;
    }

    public hob(hoe hoeVar, int i, char[] cArr) {
        this.b = i;
        this.a = hoeVar;
    }

    public /* synthetic */ hob(hpx hpxVar, int i) {
        this.b = i;
        this.a = hpxVar;
    }

    public /* synthetic */ hob(hrx hrxVar, int i) {
        this.b = i;
        this.a = hrxVar;
    }

    public /* synthetic */ hob(huk hukVar, int i) {
        this.b = i;
        this.a = hukVar;
    }

    public /* synthetic */ hob(hus husVar, int i) {
        this.b = i;
        this.a = husVar;
    }

    public hob(hus husVar, int i, byte[] bArr) {
        this.b = i;
        this.a = husVar;
    }

    public hob(hus husVar, int i, char[] cArr) {
        this.b = i;
        this.a = husVar;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        imn imnVar;
        boolean z = true;
        switch (this.b) {
            case 0:
                hoe hoeVar = (hoe) this.a;
                AppCompatTextView appCompatTextView = hoeVar.u;
                if (appCompatTextView == null) {
                    return;
                }
                if (hoeVar.J == null) {
                    hoeVar.J = new hoo();
                }
                hoeVar.J.b(hoeVar.k, appCompatTextView, hoeVar.h, hoeVar.w, new gxd(hoeVar, 18), null, new gxd(hoeVar, 19));
                return;
            case 1:
                hoe hoeVar2 = (hoe) this.a;
                imn imnVar2 = hoeVar2.Q;
                if (imnVar2 != null) {
                    imnVar2.c(hoeVar2.U, null, true);
                    hoeVar2.U = null;
                }
                hoeVar2.l(hok.PROMO_TOOLTIP_V2_DURATION);
                return;
            case 2:
                hoe hoeVar3 = (hoe) this.a;
                AppCompatTextView appCompatTextView2 = hoeVar3.u;
                if (appCompatTextView2 == null) {
                    return;
                }
                if (hoeVar3.K == null) {
                    hoeVar3.K = new hoo();
                }
                hoo hooVar = hoeVar3.K;
                Context context = hoeVar3.k;
                hooVar.b(context, appCompatTextView2, hoeVar3.h, hoeVar3.w, new hob(hoeVar3, 3), context.getString(R.string.f154240_resource_name_obfuscated_res_0x7f140356), new hob(hoeVar3, 4));
                return;
            case 3:
                hoe hoeVar4 = (hoe) this.a;
                hoeVar4.S = true;
                hoeVar4.m();
                if (hoeVar4.P != null && (imnVar = hoeVar4.Q) != null) {
                    if (hoeVar4.M == null) {
                        hoeVar4.M = imnVar.a(R.layout.f135080_resource_name_obfuscated_res_0x7f0e00e7);
                    }
                    ((LottieAnimationView) hoeVar4.M.findViewById(R.id.f56640_resource_name_obfuscated_res_0x7f0b0299)).f(0.0f);
                    hoeVar4.Q.e(hoeVar4.M, hoeVar4.P, 614, 0, 0, null);
                }
                int i = hoeVar4.T + 1;
                hoeVar4.T = i;
                hoeVar4.l.h("pref_key_inline_suggestion_swipe_on_space_promo_tooltip_shown_count", i);
                hoeVar4.l.i("pref_key_inline_suggestion_swipe_on_space_promo_tooltip_last_shown_ms", System.currentTimeMillis());
                return;
            case 4:
                hoe hoeVar5 = (hoe) this.a;
                hoeVar5.l(hok.PROMO_SPACE_TOOLTIP_DURATION);
                hoeVar5.b();
                return;
            case 5:
                hoe hoeVar6 = (hoe) this.a;
                if (!hoeVar6.I) {
                    return;
                }
                hoeVar6.A = true;
                if (!hoeVar6.u() || hoeVar6.z == 0) {
                    z = false;
                }
                hoeVar6.m = z;
                hln hlnVar = hoeVar6.r;
                if (hlnVar == null) {
                    return;
                }
                hoeVar6.v(hlnVar, false);
                return;
            case 6:
                hoe hoeVar7 = (hoe) this.a;
                if (!hoeVar7.I || !hoeVar7.C) {
                    return;
                }
                hoo.a();
                ((hoe) this.a).b();
                return;
            case 7:
                Object obj = this.a;
                ltg ltgVar = hpr.a;
                hpw.a.a("performSpellCheck()");
                jbt.t(InputConnection.class, "performSpellCheck", true, obj, new Object[0], new Class[0]);
                return;
            case 8:
                ?? r0 = this.a;
                ltg ltgVar2 = hpr.a;
                hpw.k(r0, "", 1, null);
                hpw.m(r0, 0, 0);
                hpw.j(r0, Integer.MAX_VALUE, Integer.MAX_VALUE);
                return;
            case 9:
                ?? r02 = this.a;
                ltg ltgVar3 = hpr.a;
                hpw.a.a("finishComposingText()");
                r02.finishComposingText();
                return;
            case 10:
                ?? r03 = this.a;
                hpw.a(r03, hpr.c, 1);
                hpw.a(r03, hpr.c, 0);
                return;
            case 11:
                ((hpx) this.a).i = ((Long) hpx.d.c()).longValue();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hpx hpxVar = (hpx) this.a;
                long j = hpxVar.i;
                if (j <= 0) {
                    return;
                }
                hpxVar.i = j - 1;
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj2 = this.a;
                hrx hrxVar = (hrx) obj2;
                hrxVar.r = null;
                hrxVar.X(false);
                hrxVar.k.f(hrxVar.i);
                if (hrxVar.u != null) {
                    hsb hsbVar = hrxVar.u;
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    kdr kdrVar = hsbVar.e;
                    hsb.b(sparseIntArray, (int[]) kdrVar.a, (int[]) kdrVar.g, (int[]) kdrVar.b, (int[]) kdrVar.f);
                    lsz it = ((llw) hsbVar.e.d).entrySet().iterator();
                    while (it.hasNext()) {
                        iaw iawVar = (iaw) ((Map.Entry) it.next()).getValue();
                        hsb.b(sparseIntArray, iawVar.g, iawVar.h, iawVar.i, iawVar.j);
                    }
                    boolean z2 = false;
                    for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
                        z2 = hsbVar.d.g(sparseIntArray.keyAt(i2)).c() || z2;
                    }
                    if (z2 && hrxVar.o != null) {
                        hrxVar.o.a();
                    }
                }
                synchronized (hrxVar.y) {
                    for (mko mkoVar : ((hrx) obj2).z.values()) {
                        if (mkoVar != null) {
                            mkoVar.cancel(true);
                        }
                    }
                    ((hrx) obj2).z.clear();
                    ((hrx) obj2).y.clear();
                }
                hrxVar.L();
                ijf.j(hrx.b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((hrx) this.a).T();
                return;
            case 15:
                hrx hrxVar2 = (hrx) this.a;
                hrxVar2.s = null;
                if (hrxVar2.v != null) {
                    return;
                }
                lmz b = hrxVar2.k.b();
                if (b.isEmpty()) {
                    hrxVar2.Y();
                    b = hrxVar2.E();
                } else {
                    hrxVar2.Z();
                }
                hrxVar2.aa(hrxVar2.B(b), false);
                return;
            case 16:
                ((huk) this.a).e();
                return;
            case 17:
                ((huk) this.a).e();
                return;
            case 18:
                ((hus) this.a).f();
                return;
            case 19:
                hus husVar = (hus) this.a;
                View view = husVar.l;
                if (view != null) {
                    jdy.j(view, husVar.c);
                }
                hus husVar2 = (hus) this.a;
                View view2 = husVar2.n;
                if (view2 != null) {
                    jdy.j(view2, husVar2.d);
                    return;
                }
                View view3 = husVar2.m;
                if (view3 == null) {
                    return;
                }
                jdy.j(view3, husVar2.d);
                return;
            default:
                hus husVar3 = (hus) this.a;
                if (husVar3.f == null) {
                    return;
                }
                husVar3.f();
                return;
        }
    }
}
