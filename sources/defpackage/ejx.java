package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.expression.extension.IUniversalMediaExtension;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ejx  reason: default package */
/* loaded from: classes.dex */
public final class ejx implements ifx {
    public static final hhl a = hhq.a("enable_universal_media_access_point", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new ejw();
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ify a2 = igb.a();
        a2.d(a);
        a2.b = R.string.f175200_resource_name_obfuscated_res_0x7f140c56;
        a2.i = IUniversalMediaExtension.class;
        a2.a = new iiy[]{gqm.a};
        ige b = igg.b(ejw.class, ejw.class, igf.AUTO_ASYNC);
        b.g = a2;
        return b.a();
    }
}
