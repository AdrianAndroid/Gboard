package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: edi  reason: default package */
/* loaded from: classes.dex */
public final class edi extends cum {
    private final ConstraintLayout s;
    private final View.OnClickListener u;
    private final ImageView v;
    private final AppCompatTextView w;
    private final AtomicBoolean x;

    public edi(View view, View.OnClickListener onClickListener, AtomicBoolean atomicBoolean) {
        super(view);
        this.s = (ConstraintLayout) view;
        this.u = onClickListener;
        this.v = (ImageView) aad.q(view, R.id.f66840_resource_name_obfuscated_res_0x7f0b081c);
        this.w = (AppCompatTextView) aad.q(view, R.id.f66860_resource_name_obfuscated_res_0x7f0b081e);
        this.x = atomicBoolean;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        String string;
        ecz eczVar = (ecz) obj;
        this.s.setOnClickListener(this.u);
        this.w.setSelected(true);
        this.s.setClickable(this.x.get());
        this.w.setEnabled(this.x.get());
        this.v.setEnabled(this.x.get());
        if (((Boolean) ecq.s.c()).booleanValue()) {
            if (this.x.get()) {
                string = this.v.getResources().getString(R.string.f152080_resource_name_obfuscated_res_0x7f140257);
            } else {
                string = this.v.getResources().getString(R.string.f152090_resource_name_obfuscated_res_0x7f140258);
            }
        } else if (this.x.get()) {
            string = this.v.getResources().getString(R.string.f152060_resource_name_obfuscated_res_0x7f140255);
        } else {
            string = this.v.getResources().getString(R.string.f152070_resource_name_obfuscated_res_0x7f140256);
        }
        this.v.setContentDescription(string);
    }

    @Override // defpackage.cum
    public final void G() {
        this.s.setOnClickListener(null);
    }
}
