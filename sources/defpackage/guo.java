package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: PG */
/* renamed from: guo  reason: default package */
/* loaded from: classes.dex */
public final class guo extends gun {
    public guo(Context context, int i) {
        super(new ktu(context, i), i);
        Drawable drawable = ((ktu) this.e).b;
        if (drawable instanceof kxe) {
            Resources.Theme theme = r().getTheme();
            TypedValue typedValue = new TypedValue();
            if (!theme.resolveAttribute(R.attr.f9360_resource_name_obfuscated_res_0x7f040313, typedValue, true)) {
                return;
            }
            ((kxe) drawable).l(ColorStateList.valueOf(typedValue.data));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gtz
    public final void e(Dialog dialog) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        if (gul.a()) {
            View findViewById4 = dialog.findViewById(R.id.f52320_resource_name_obfuscated_res_0x7f0b0073);
            if (findViewById4 instanceof AppCompatTextView) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById4;
                CharSequence text = appCompatTextView.getText();
                if (!TextUtils.isEmpty(text) && (findViewById = dialog.findViewById(R.id.f53720_resource_name_obfuscated_res_0x7f0b013f)) != null && findViewById.getVisibility() != 0 && (findViewById2 = dialog.findViewById(R.id.f53560_resource_name_obfuscated_res_0x7f0b012a)) != null && findViewById2.getVisibility() == 8 && (findViewById3 = findViewById2.findViewById(16908299)) != null) {
                    ViewGroup viewGroup = (ViewGroup) appCompatTextView.getParent();
                    viewGroup.removeViewAt(viewGroup.indexOfChild(appCompatTextView));
                    MaterialTextView materialTextView = new MaterialTextView(appCompatTextView.getContext(), null, R.attr.f14560_resource_name_obfuscated_res_0x7f040563);
                    materialTextView.setText(text);
                    materialTextView.setMaxLines(Integer.MAX_VALUE);
                    materialTextView.setSingleLine(false);
                    materialTextView.setPadding(findViewById3.getPaddingLeft(), findViewById3.getPaddingTop(), findViewById3.getPaddingRight(), findViewById3.getPaddingBottom());
                    ViewGroup viewGroup2 = (ViewGroup) findViewById3.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(findViewById3);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(materialTextView, indexOfChild);
                    findViewById2.setVisibility(0);
                }
            }
            kki.z(guw.c(dialog, -2));
            kki.z(guw.c(dialog, -3));
            kki.z(guw.c(dialog, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gun, defpackage.gtz
    public final void g(String str, Activity activity) {
        if (activity instanceof cx) {
            new guq().av((cx) activity, str, this.b);
        } else {
            super.g(str, activity);
        }
    }
}
