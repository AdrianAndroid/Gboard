package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: eaf  reason: default package */
/* loaded from: classes.dex */
public final class eaf extends cum {
    private final ImageView s;
    private final atw u;
    private final leq v;

    public eaf(View view, leq leqVar) {
        super(view);
        this.v = leqVar;
        this.s = (ImageView) aad.q(view, R.id.f54140_resource_name_obfuscated_res_0x7f0b0182);
        this.u = hjq.a(view.getContext());
    }

    @Override // defpackage.cum
    public final /* synthetic */ void F(Object obj, int i) {
        ead eadVar = (ead) this.v.a((dzq) obj);
        if (!dau.c(eadVar)) {
            return;
        }
        this.s.setImageAlpha(eadVar.c);
        eadVar.a.r(this.s);
        this.s.setContentDescription(eadVar.b);
    }

    @Override // defpackage.cum
    public final void G() {
        this.u.l(new atu(this.s));
    }
}
