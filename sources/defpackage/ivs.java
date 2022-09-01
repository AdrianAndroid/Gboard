package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ivs  reason: default package */
/* loaded from: classes.dex */
public final class ivs implements ifx {
    public static final hhl a = hhq.a("enable_lc_task_manager", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        mks b = gxo.b(19);
        return new ivr(context, hyy.a(), hze.a(), new ivn(context, b), b, ieh.j());
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(ivt.class, ivr.class, igf.AUTO_ASYNC_BACKGROUND);
        ify a2 = igb.a();
        a2.a = new iiy[]{gwu.b, itl.b, hgl.a};
        a2.c = context.getResources().getString(R.string.f162280_resource_name_obfuscated_res_0x7f140705);
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
