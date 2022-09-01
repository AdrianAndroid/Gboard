package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cph  reason: default package */
/* loaded from: classes.dex */
final class cph extends coy {
    private static final ltg u = ltg.j("com/google/android/apps/inputmethod/libs/expression/header/ImageElementViewHolder");
    private final hjr v;
    private final ImageView w;

    public cph(View view, cor corVar) {
        super(view, corVar);
        ImageView imageView = (ImageView) aad.q(view, R.id.f54580_resource_name_obfuscated_res_0x7f0b01b1);
        this.w = imageView;
        this.v = new hjr(imageView);
    }

    @Override // defpackage.coy
    public final void F(coq coqVar) {
        super.F(coqVar);
        col colVar = col.UNSPECIFIED;
        if (coqVar.a.ordinal() == 4) {
            com comVar = coqVar.d;
            if (comVar == null) {
                ((ltd) u.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ImageElementViewHolder", "bind", 31, "ImageElementViewHolder.java")).w("Element of type %s doesn't have required field set.", coqVar.a);
                return;
            }
            this.v.t(comVar.a);
            this.w.setContentDescription(this.t.d(!TextUtils.isEmpty(comVar.b) ? comVar.b : this.t.e(comVar.c, new Object[0])));
            return;
        }
        ((ltd) u.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/ImageElementViewHolder", "bind", 44, "ImageElementViewHolder.java")).t("Non-Image Element attempted to bind to Image viewholder.");
    }
}
