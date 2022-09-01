package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.button.MaterialButton;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: dvx  reason: default package */
/* loaded from: classes.dex */
public final class dvx implements dwj {
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaLearningCenterController");
    public final dwh a;
    public dwk b;
    private AppCompatTextView e;
    private dxf f;
    private LayoutInflater g;
    private View h;
    private View i = null;
    private boolean j = false;
    public fid c = fid.c;

    public dvx(dwh dwhVar) {
        this.a = dwhVar;
    }

    private final View i(ViewGroup viewGroup, fie fieVar) {
        LayoutInflater layoutInflater = this.g;
        if (layoutInflater == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(true != this.j ? R.layout.f143830_resource_name_obfuscated_res_0x7f0e048f : R.layout.f143840_resource_name_obfuscated_res_0x7f0e0490, viewGroup, false);
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.f66360_resource_name_obfuscated_res_0x7f0b07e5);
        bkj bkjVar = fieVar.a;
        if (bkjVar == null) {
            bkjVar = bkj.h;
        }
        m(appCompatTextView, bkjVar.a);
        bkj bkjVar2 = fieVar.a;
        if (bkjVar2 == null) {
            bkjVar2 = bkj.h;
        }
        if (bkjVar2.e != null) {
            appCompatTextView.setOnClickListener(new bsx(this, fieVar, 12));
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) inflate.findViewById(R.id.f66370_resource_name_obfuscated_res_0x7f0b07e6);
        bkj bkjVar3 = fieVar.a;
        if (bkjVar3 == null) {
            bkjVar3 = bkj.h;
        }
        m(appCompatTextView2, bkjVar3.b);
        return inflate;
    }

    private final View j(int i) {
        View view = this.h;
        if (view == null) {
            return null;
        }
        return view.findViewById(i);
    }

    private static GridLayout.LayoutParams k() {
        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
        layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, GridLayout.FILL, 1.0f);
        layoutParams.width = 0;
        return layoutParams;
    }

    private static void l(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setSelected(z);
    }

    private final void m(AppCompatTextView appCompatTextView, String str) {
        dxf dxfVar = this.f;
        if (dxfVar == null) {
            return;
        }
        appCompatTextView.setText(dxfVar.a(str));
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private static void n(int i) {
        hsk b = hsx.b();
        ViewGroup L = b != null ? b.L(ice.BODY) : null;
        if (L != null) {
            L.setVisibility(i);
        } else {
            ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaLearningCenterController", "setKeyboardBodyVisibility", 174, "NgaLearningCenterController.java")).t("Unable to find keyboard body view.");
        }
    }

    @Override // defpackage.dwj
    public final int a() {
        return R.layout.f143850_resource_name_obfuscated_res_0x7f0e0491;
    }

    @Override // defpackage.dwj
    public final /* synthetic */ Optional b() {
        return Optional.empty();
    }

    @Override // defpackage.dwj
    public final void c(dwk dwkVar, View view, Context context) {
        ViewGroup L;
        this.f = dxf.c(context, llw.l("voicetypingsettingslink", dug.c));
        this.b = dwkVar;
        this.h = view;
        hsk b = hsx.b();
        if (b != null && (L = b.L(ice.BODY)) != null) {
            this.j = ((float) L.getWidth()) >= gvv.a(context, 700) && ((float) L.getHeight()) >= gvv.a(context, 250);
        }
        LayoutInflater from = LayoutInflater.from(context);
        this.g = from;
        from.inflate(true != this.j ? R.layout.f143790_resource_name_obfuscated_res_0x7f0e048b : R.layout.f143800_resource_name_obfuscated_res_0x7f0e048c, (ViewGroup) view, true);
        view.findViewById(R.id.f66350_resource_name_obfuscated_res_0x7f0b07e4).setOnClickListener(new cjr(this, 18));
        this.e = (AppCompatTextView) view.findViewById(R.id.f66420_resource_name_obfuscated_res_0x7f0b07eb);
        if (dxe.e()) {
            view.findViewById(R.id.f66390_resource_name_obfuscated_res_0x7f0b07e8).setOnClickListener(new cjr(this, 19));
            view.findViewById(R.id.f66390_resource_name_obfuscated_res_0x7f0b07e8).setVisibility(0);
        }
        m((AppCompatTextView) view.findViewById(R.id.f66480_resource_name_obfuscated_res_0x7f0b07f1), context.getString(R.string.f158940_resource_name_obfuscated_res_0x7f140586));
        m((AppCompatTextView) view.findViewById(R.id.f66310_resource_name_obfuscated_res_0x7f0b07e0), context.getString(R.string.f158880_resource_name_obfuscated_res_0x7f140580));
        d();
    }

    public final void d() {
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView != null) {
            m(appCompatTextView, this.c.a);
        }
        if (this.j) {
            LayoutInflater layoutInflater = this.g;
            dxf dxfVar = this.f;
            if (layoutInflater == null || dxfVar == null) {
                return;
            }
            LinearLayout linearLayout = (LinearLayout) j(R.id.f66320_resource_name_obfuscated_res_0x7f0b07e1);
            if (linearLayout == null) {
                ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaLearningCenterController", "applyContentsLargeDisplay", 226, "NgaLearningCenterController.java")).t("applyContentsLargeDisplay: categories container is null");
                return;
            }
            linearLayout.removeAllViews();
            for (int i = 0; i < this.c.b.size(); i++) {
                MaterialButton materialButton = (MaterialButton) layoutInflater.inflate(R.layout.f143820_resource_name_obfuscated_res_0x7f0e048e, (ViewGroup) linearLayout, false);
                linearLayout.addView(materialButton);
                materialButton.setText(dxfVar.a(((fic) this.c.b.get(i)).a));
                materialButton.setOnClickListener(new dxk(this, i, 1));
            }
            h(0);
            return;
        }
        LayoutInflater layoutInflater2 = this.g;
        if (layoutInflater2 == null) {
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) j(R.id.f66380_resource_name_obfuscated_res_0x7f0b07e7);
        if (linearLayout2 == null) {
            ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaLearningCenterController", "applyContentsDefaultDisplay", 196, "NgaLearningCenterController.java")).t("applyContentsDefaultDisplay: container is null");
            return;
        }
        linearLayout2.removeAllViews();
        for (fic ficVar : this.c.b) {
            ViewGroup viewGroup = (ViewGroup) layoutInflater2.inflate(R.layout.f143810_resource_name_obfuscated_res_0x7f0e048d, (ViewGroup) linearLayout2, false);
            linearLayout2.addView(viewGroup);
            m((AppCompatTextView) viewGroup.findViewById(R.id.f66340_resource_name_obfuscated_res_0x7f0b07e3), ficVar.a);
            for (fie fieVar : ficVar.b) {
                View i2 = i(viewGroup, fieVar);
                if (i2 != null) {
                    viewGroup.addView(i2);
                }
            }
        }
    }

    @Override // defpackage.dwj
    public final void e() {
        this.e = null;
        this.f = null;
        this.b = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.dwj
    public final void f() {
        n(4);
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView != null) {
            appCompatTextView.performAccessibilityAction(64, null);
        }
    }

    @Override // defpackage.dwj
    public final void g() {
        n(0);
    }

    public final void h(int i) {
        View childAt;
        View view;
        LinearLayout linearLayout = (LinearLayout) j(R.id.f66320_resource_name_obfuscated_res_0x7f0b07e1);
        GridLayout gridLayout = (GridLayout) j(R.id.f66400_resource_name_obfuscated_res_0x7f0b07e9);
        ScrollView scrollView = (ScrollView) j(R.id.f66410_resource_name_obfuscated_res_0x7f0b07ea);
        if (linearLayout == null || gridLayout == null || scrollView == null || i < 0 || i >= linearLayout.getChildCount() || (childAt = linearLayout.getChildAt(i)) == (view = this.i)) {
            return;
        }
        l(view, false);
        l(childAt, true);
        this.i = childAt;
        scrollView.scrollTo(0, 0);
        gridLayout.removeAllViews();
        for (fie fieVar : ((fic) this.c.b.get(i)).b) {
            View i2 = i(gridLayout, fieVar);
            if (i2 != null) {
                gridLayout.addView(i2, k());
            }
        }
        if (gridLayout.getChildCount() != 1) {
            return;
        }
        gridLayout.addView(new FrameLayout(gridLayout.getContext()), k());
    }
}
