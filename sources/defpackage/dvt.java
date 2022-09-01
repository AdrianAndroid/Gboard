package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* compiled from: PG */
/* renamed from: dvt  reason: default package */
/* loaded from: classes.dex */
public final class dvt implements kli {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/ui/MicRingHandler");
    private static float[] c;
    public boolean a;
    private final dvs d = new dvs();
    private ViewGroup e;
    private View f;
    private AssistantP6GlowView g;
    private klo h;
    private ImageView i;
    private Runnable j;
    private boolean k;

    private static void k(View view, float f) {
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    private final void l() {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility(true != this.k ? 4 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.j == null) {
            return;
        }
        this.j = null;
        klo kloVar = this.h;
        if (kloVar != null) {
            kloVar.b(klj.LISTENING);
        }
        k(this.f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Runnable runnable) {
        klo kloVar = this.h;
        if (kloVar == null) {
            runnable.run();
        } else if (this.j != null) {
        } else {
            this.j = runnable;
            k(this.f, 0.0f);
            kloVar.b(klj.GONE);
        }
    }

    public final void c() {
        klj kljVar;
        if (this.j != null) {
            return;
        }
        dvs dvsVar = this.d;
        int i = 0;
        while (true) {
            if (i >= 4) {
                kljVar = klj.LISTENING;
                break;
            } else if (dvsVar.a[i] >= 70) {
                kljVar = klj.USER_INPUT;
                break;
            } else {
                i++;
            }
        }
        klo kloVar = this.h;
        if (kloVar == null || kloVar.a() == kljVar) {
            return;
        }
        this.h.b(kljVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        ViewGroup viewGroup;
        AssistantP6GlowView assistantP6GlowView = this.g;
        if (assistantP6GlowView != null) {
            c = assistantP6GlowView.p();
        }
        if (this.f != null && (viewGroup = this.e) != null) {
            viewGroup.removeAllViews();
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.kli
    public final void e() {
        Runnable runnable = this.j;
        if (runnable != null) {
            this.j = null;
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z) {
        this.k = z;
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(Context context, ViewGroup viewGroup, boolean z) {
        float[] fArr;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.f66430_resource_name_obfuscated_res_0x7f0b07ec);
        if (viewGroup2 == null) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/MicRingHandler", "showRingOnSoftKeyView", 55, "MicRingHandler.java")).t("getMicRingContainer returned null");
            return;
        }
        this.e = viewGroup2;
        View inflate = LayoutInflater.from(context).inflate(true != z ? R.layout.f143860_resource_name_obfuscated_res_0x7f0e0492 : R.layout.f143870_resource_name_obfuscated_res_0x7f0e0493, viewGroup2, false);
        viewGroup2.addView(inflate);
        this.i = (ImageView) viewGroup2.findViewById(R.id.f66620_resource_name_obfuscated_res_0x7f0b07ff);
        l();
        AssistantP6GlowView assistantP6GlowView = (AssistantP6GlowView) viewGroup2.findViewById(R.id.f66610_resource_name_obfuscated_res_0x7f0b07fe);
        assistantP6GlowView.getViewTreeObserver().addOnGlobalLayoutListener(new dvr(assistantP6GlowView, context));
        klo kloVar = new klo(assistantP6GlowView, new giw(), this, null);
        this.f = inflate;
        this.g = assistantP6GlowView;
        this.h = kloVar;
        if (this.a) {
            if (inflate != null) {
                inflate.setAlpha(0.0f);
            }
            k(this.f, 1.0f);
            kloVar.b(klj.LISTENING);
            return;
        }
        if (assistantP6GlowView != null && (fArr = c) != null) {
            assistantP6GlowView.m(fArr);
        }
        kloVar.b(klj.LISTENING);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i) {
        if (!((Boolean) dsu.c.c()).booleanValue() || this.j != null) {
            return;
        }
        dvs dvsVar = this.d;
        long j = 1 + dvsVar.d;
        dvsVar.d = j;
        if (i == 0) {
            if (dvsVar.b != 0) {
                dvsVar.b = 0;
                kki.i(new fsm(dvsVar, j, new dvd(this, 2), 1), 500L);
                c();
            }
            i = 0;
        }
        dvsVar.b = i;
        int[] iArr = dvsVar.a;
        int i2 = dvsVar.c;
        iArr[i2] = i;
        dvsVar.c = (i2 + 1) & 3;
        kki.i(new fsm(dvsVar, j, new dvd(this, 2), 1), 500L);
        c();
    }

    public final boolean i(ViewGroup viewGroup) {
        View view = this.f;
        if (view == null) {
            return true;
        }
        ViewGroup viewGroup2 = this.e;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.f66430_resource_name_obfuscated_res_0x7f0b07ec);
        if (viewGroup2 != null && viewGroup3 != viewGroup2) {
            if (viewGroup3 == null) {
                return false;
            }
            this.e = viewGroup3;
            viewGroup2.removeAllViews();
            viewGroup3.removeAllViews();
            viewGroup3.addView(view);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return this.f != null;
    }
}
