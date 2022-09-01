package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: ebm  reason: default package */
/* loaded from: classes.dex */
public final class ebm extends cum {
    public final his s;
    private final Context u;
    private final AppCompatTextView v;
    private final AppCompatImageView w;
    private ebd x;

    public ebm(Context context, View view, his hisVar) {
        super(view);
        this.u = context;
        this.v = (AppCompatTextView) aad.q(view, R.id.f52850_resource_name_obfuscated_res_0x7f0b00df);
        this.w = (AppCompatImageView) aad.q(view, R.id.f52830_resource_name_obfuscated_res_0x7f0b00dd);
        this.s = hisVar;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        ebd ebdVar = (ebd) obj;
        this.x = ebdVar;
        this.a.setOnClickListener(new bsx(this, ebdVar, 15));
        if (ebdVar.b() - 1 != 0) {
            this.v.setText(jbs.p(ebdVar.a().toLowerCase(Locale.getDefault())));
            this.w.setImageDrawable(this.u.getDrawable(R.drawable.f50270_resource_name_obfuscated_res_0x7f080341));
            return;
        }
        this.v.setText(jbs.p(ebdVar.c().toLowerCase(Locale.getDefault())));
        this.w.setImageDrawable(this.u.getDrawable(R.drawable.f49980_resource_name_obfuscated_res_0x7f080320));
    }

    @Override // defpackage.cum
    public final void G() {
        this.x = null;
        this.v.setText("");
        this.w.setImageDrawable(null);
        this.a.setOnClickListener(null);
        this.a.setClickable(true);
        this.a.setSelected(false);
    }

    @Override // defpackage.cum
    public final boolean H(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.a.setSelected(booleanValue);
            this.a.setClickable(!booleanValue);
            ebd ebdVar = this.x;
            if (ebdVar != null && ebdVar.b() - 1 == 1) {
                this.w.setImageDrawable(this.u.getDrawable(true != booleanValue ? R.drawable.f50270_resource_name_obfuscated_res_0x7f080341 : R.drawable.f46790_resource_name_obfuscated_res_0x7f08018f));
            }
            return true;
        }
        return false;
    }
}
