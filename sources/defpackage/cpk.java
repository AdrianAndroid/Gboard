package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cpk  reason: default package */
/* loaded from: classes.dex */
public final class cpk extends coy {
    private static final ltg v = ltg.j("com/google/android/apps/inputmethod/libs/expression/header/TextElementViewHolder");
    public final AppCompatTextView u;
    private final Locale w;
    private final boolean x;
    private final boolean y;

    public cpk(View view, cor corVar, Locale locale, boolean z, boolean z2) {
        super(view, corVar);
        this.w = locale;
        this.x = z;
        this.y = z2;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f54600_resource_name_obfuscated_res_0x7f0b01b3);
        this.u = appCompatTextView == null ? (AppCompatTextView) view.findViewById(R.id.f54590_resource_name_obfuscated_res_0x7f0b01b2) : appCompatTextView;
    }

    private final String H(String str) {
        return this.x ? str.toLowerCase(this.w) : str;
    }

    @Override // defpackage.coy
    public final void F(coq coqVar) {
        super.F(coqVar);
        col colVar = col.UNSPECIFIED;
        int ordinal = coqVar.a.ordinal();
        if (ordinal == 1) {
            coo cooVar = coqVar.b;
            if (cooVar == null) {
                ((ltd) v.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/TextElementViewHolder", "bind", 43, "TextElementViewHolder.java")).w("Element of type %s doesn't have required field set.", coqVar.a);
                return;
            }
            this.u.setText(H(cooVar.a));
            this.u.setContentDescription(this.t.d(cooVar.b));
            if (cooVar.c != 0) {
                Resources resources = this.u.getContext().getResources();
                Drawable drawable = resources.getDrawable(cooVar.c);
                this.u.setCompoundDrawablePadding(resources.getDimensionPixelOffset(R.dimen.f33520_resource_name_obfuscated_res_0x7f070147));
                this.u.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                this.u.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else if (ordinal == 2) {
            cop copVar = coqVar.c;
            if (copVar == null) {
                ((ltd) v.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/TextElementViewHolder", "bind", 66, "TextElementViewHolder.java")).w("Element of type %s doesn't have required field set.", coqVar.a);
                return;
            } else {
                this.u.setText((CharSequence) null);
                this.u.setHint(H(this.a.getContext().getString(copVar.a)));
            }
        } else if (ordinal == 3) {
            cop copVar2 = coqVar.c;
            if (copVar2 == null) {
                ((ltd) v.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/TextElementViewHolder", "bind", 77, "TextElementViewHolder.java")).w("Element of type %s doesn't have required field set.", coqVar.a);
                return;
            }
            this.u.setText(H(this.a.getContext().getString(copVar2.a)));
        } else {
            ((ltd) v.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/header/TextElementViewHolder", "bind", 86, "TextElementViewHolder.java")).t("Non-Text Element attempted to bind to Text viewholder.");
        }
        if (this.y) {
            this.a.post(new cbq(this, 18));
        }
    }

    @Override // defpackage.coy
    public final void G(boolean z) {
        super.G(z);
        this.u.refreshDrawableState();
    }
}
