package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hgx  reason: default package */
/* loaded from: classes.dex */
public final class hgx implements ifx {
    private final /* synthetic */ int a;

    public hgx(int i) {
        this.a = i;
    }

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        int i = this.a;
        if (i == 0) {
            oll.e(context, "applicationContext");
            return new hgy();
        } else if (i != 1) {
            oll.e(context, "applicationContext");
            return new ioo();
        } else {
            oll.e(context, "applicationContext");
            return new hgn();
        }
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        int i = this.a;
        if (i == 0) {
            oll.e(context, "applicationContext");
            ige b = igg.b(hgz.class, hgy.class, igf.ON_DEMAND);
            ify a = igb.a();
            a.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
            b.g = a;
            return b.a();
        } else if (i == 1) {
            oll.e(context, "applicationContext");
            return igg.b(hgm.class, hgn.class, igf.AUTO_ASYNC_BACKGROUND).a();
        } else {
            oll.e(context, "applicationContext");
            ige b2 = igg.b(ioo.class, ioo.class, igf.AUTO_UI);
            ify a2 = igb.a();
            a2.c = context.getString(R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
            a2.a = new iiy[]{gwu.b};
            b2.g = a2;
            return b2.a();
        }
    }
}
