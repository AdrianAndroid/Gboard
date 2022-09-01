package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cjt  reason: default package */
/* loaded from: classes.dex */
public final class cjt {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ImageCandidatePopupController");
    public final Context b;
    public final oiy c;
    public final hso d;
    public final ibz e;
    public final ibz f;
    public final idk g;
    public final int h;
    public final leq i;
    public cin j;
    public cjs k;
    public cjo l;
    public float m = -1.0f;
    public final hhk n = new bvl(this, 6);

    public cjt(Context context, hso hsoVar, oiy oiyVar, ibz ibzVar, ibz ibzVar2, idk idkVar, leq leqVar) {
        this.b = context;
        this.d = hsoVar;
        this.c = oiyVar;
        this.e = ibzVar;
        this.f = ibzVar2;
        this.h = context.getResources().getDimensionPixelSize(R.dimen.f36620_resource_name_obfuscated_res_0x7f0702e6);
        this.g = idkVar;
        this.i = leqVar;
    }

    public static hfd b(ibz ibzVar, Map map) {
        return hfd.d(new iay(-10104, null, new icz(ibzVar.l, map)));
    }

    static final ViewGroup g() {
        hsk b = hsx.b();
        if (b == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ImageCandidatePopupController", "getKeyboardHeaderView", 160, "ImageCandidatePopupController.java")).t("InputMethodService is null");
            return null;
        } else if (b.G() == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ImageCandidatePopupController", "getKeyboardHeaderView", 166, "ImageCandidatePopupController.java")).t("keyboardArea is null");
            return null;
        } else {
            ViewGroup L = b.L(ice.HEADER);
            if (L != null) {
                return L;
            }
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ImageCandidatePopupController", "getKeyboardHeaderView", 172, "ImageCandidatePopupController.java")).t("keyboardHeader is null");
            return null;
        }
    }

    public static final void h(float f) {
        ViewGroup g = g();
        ViewGroup viewGroup = g == null ? null : (ViewGroup) g.findViewById(lre.aF());
        if (viewGroup != null) {
            viewGroup.setAlpha(f);
        }
    }

    public final View.OnClickListener a(EditorInfo editorInfo, cjo cjoVar) {
        return new buw(this, editorInfo, cjoVar, 4);
    }

    public final void c() {
        cjs cjsVar = this.k;
        if (cjsVar != null) {
            cjsVar.close();
            this.k = null;
        }
        cin cinVar = this.j;
        if (cinVar != null) {
            cinVar.a();
            this.j = null;
        }
        this.l = null;
    }

    public final void d() {
        c();
        hkp.b("expression_candidate_image_tooltip", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(float f) {
        ViewGroup g = g();
        ViewGroup viewGroup = g == null ? null : (ViewGroup) g.findViewById(R.id.f66020_resource_name_obfuscated_res_0x7f0b07b8);
        if (viewGroup != null) {
            viewGroup.setAlpha(f);
        }
        this.m = f;
        h(f);
    }

    public final void f() {
        e(1.0f);
    }
}
