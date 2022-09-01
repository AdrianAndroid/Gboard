package defpackage;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: brq  reason: default package */
/* loaded from: classes.dex */
public final class brq extends iny {
    @Override // defpackage.iny, com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment, defpackage.aih, defpackage.an
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View G = super.G(layoutInflater, viewGroup, bundle);
        ImageView imageView = (ImageView) aV(16908294);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.f50330_resource_name_obfuscated_res_0x7f080347);
            ViewParent parent = imageView.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                viewGroup2.setPadding(viewGroup2.getPaddingRight(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingLeft(), viewGroup2.getPaddingBottom());
            }
        }
        TextView textView = (TextView) aV(16908310);
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) aV(16908304);
        if (textView2 != null) {
            textView2.setMaxLines(5);
            textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
            textView2.setText(R.string.f188210_resource_name_obfuscated_res_0x7f1411b9);
        }
        return G;
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.CommonPreferenceFragment
    protected final int gc() {
        return R.layout.f144630_resource_name_obfuscated_res_0x7f0e04f4;
    }
}
