package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: itc  reason: default package */
/* loaded from: classes.dex */
public final class itc implements ifw {
    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        hsk b = hsx.b();
        if (b != null) {
            gqe a = gqh.a();
            a.i(context.getString(R.string.f153990_resource_name_obfuscated_res_0x7f140334));
            a.f(R.drawable.f47080_resource_name_obfuscated_res_0x7f0801b2);
            a.g(R.string.f156410_resource_name_obfuscated_res_0x7f140435);
            a.d(R.string.f176530_resource_name_obfuscated_res_0x7f140cde);
            a.e(true);
            Objects.requireNonNull(b);
            a.l(new ihi(b, 8));
            gqq.b(0, a.a());
        }
        igr.d(context).g(itc.class);
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
