package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* renamed from: hir  reason: default package */
/* loaded from: classes.dex */
public final class hir implements ifx {
    private static final hhl a = hhq.a("activity_font_scale_restriction", true);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new hiq((Application) context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(hiq.class, hiq.class, igf.AUTO_UI);
        ify a2 = igb.a();
        a2.d(a);
        b.g = a2;
        return b.a();
    }
}
