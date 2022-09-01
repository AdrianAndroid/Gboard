package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: ecw  reason: default package */
/* loaded from: classes.dex */
public final class ecw implements AutoCloseable {
    public final ecv a;
    public final View b;
    public final ViewGroup c;
    public final ImageView d;
    public final MaterialButton e;
    public final View f;
    public final View.OnClickListener g;
    public final int h;

    public ecw(ecv ecvVar, View view, View.OnClickListener onClickListener) {
        this.a = ecvVar;
        this.b = view;
        this.g = onClickListener;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.f55170_resource_name_obfuscated_res_0x7f0b01ee);
        if (viewStub != null) {
            viewStub.inflate();
            dbf.a(view.getContext()).inflate(R.layout.f134550_resource_name_obfuscated_res_0x7f0e00a8, (ViewGroup) ((LinearLayout) aad.q(view, R.id.f55160_resource_name_obfuscated_res_0x7f0b01ed)), true);
        }
        this.c = (ViewGroup) aad.q(view, R.id.f55140_resource_name_obfuscated_res_0x7f0b01eb);
        this.d = (ImageView) aad.q(view, R.id.f66780_resource_name_obfuscated_res_0x7f0b0814);
        MaterialButton materialButton = (MaterialButton) aad.q(view, R.id.f66800_resource_name_obfuscated_res_0x7f0b0816);
        this.e = materialButton;
        this.f = aad.q(view, R.id.f66790_resource_name_obfuscated_res_0x7f0b0815);
        this.h = view.getResources().getDimensionPixelSize(R.dimen.f34130_resource_name_obfuscated_res_0x7f070186);
        if (((Boolean) ecq.s.c()).booleanValue()) {
            materialButton.setContentDescription(materialButton.getResources().getText(R.string.f152080_resource_name_obfuscated_res_0x7f140257));
        }
    }

    public final void a() {
        if (this.c.getVisibility() == 0) {
            new elj(this.c, this.h).b(new ecr(this, 3));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a();
        this.d.setOnClickListener(null);
        this.f.setOnClickListener(null);
        this.e.setOnClickListener(null);
    }
}
