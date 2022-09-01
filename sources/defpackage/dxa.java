package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dxa  reason: default package */
/* loaded from: classes.dex */
public final class dxa {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerController");
    public final Context b;
    public View c;
    public PopupWindow d;
    public final jav e;

    public dxa(Context context, jav javVar) {
        this.b = context;
        this.e = javVar;
    }

    public static boolean e(Context context) {
        dsx b = dsz.b();
        llw llwVar = b.h;
        boolean z = b.e;
        if (dzg.f(context).size() >= 2 && z) {
            if (!((Boolean) dsu.s.c()).booleanValue()) {
                return llwVar.containsValue(fgt.ELIGIBLE);
            }
            return llwVar.containsValue(fgt.ELIGIBLE) || llwVar.containsValue(fgt.NON_ELIGIBLE_MODEL_DOWNLOAD_NEEDS_USER_REQUEST) || llwVar.containsValue(fgt.NON_ELIGIBLE_MODEL_DOWNLOAD_IN_PROGRESS);
        }
        return false;
    }

    private final View f() {
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.f143700_resource_name_obfuscated_res_0x7f0e0482, (ViewGroup) new FrameLayout(this.b), false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: dwy
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
                if (r11 != 32) goto L11;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0022 A[SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r17) {
                /*
                    Method dump skipped, instructions count: 512
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dwy.onClick(android.view.View):void");
            }
        });
        inflate.addOnAttachStateChangeListener(new ge(this, 4));
        return inflate;
    }

    public final View a() {
        if (this.c == null) {
            this.c = f();
            d(R.string.f158820_resource_name_obfuscated_res_0x7f14057a);
        }
        return this.c;
    }

    public final String b(jav javVar) {
        jau H = jav.H();
        H.e(javVar.g);
        return H.a().m(this.b);
    }

    public final void c() {
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void d(int i) {
        String b;
        if (this.c == null) {
            this.c = f();
        }
        dxf b2 = dxf.b(this.b);
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.c.findViewById(R.id.f66220_resource_name_obfuscated_res_0x7f0b07d7);
        jav javVar = this.e;
        if (javVar == null) {
            b = this.b.getString(R.string.f158810_resource_name_obfuscated_res_0x7f140579);
        } else {
            b = b(javVar);
        }
        String string = this.b.getString(i, b);
        appCompatTextView.getViewTreeObserver().addOnPreDrawListener(new dwz(this, appCompatTextView, b, b2));
        appCompatTextView.setText(b2.a(string));
        appCompatTextView.requestLayout();
    }
}
