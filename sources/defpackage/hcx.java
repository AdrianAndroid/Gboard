package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;

/* compiled from: PG */
/* renamed from: hcx  reason: default package */
/* loaded from: classes.dex */
public final class hcx extends mo {
    private final CustomImageView s;

    public hcx(ViewGroup viewGroup, int i, int i2, View.OnClickListener onClickListener) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f135020_resource_name_obfuscated_res_0x7f0e00dc, viewGroup, false));
        CustomImageView customImageView = (CustomImageView) this.a.findViewById(R.id.f56450_resource_name_obfuscated_res_0x7f0b0283);
        this.s = customImageView;
        customImageView.setOnClickListener(onClickListener);
        this.a.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }
}
