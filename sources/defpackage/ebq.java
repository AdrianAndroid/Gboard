package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ebq  reason: default package */
/* loaded from: classes.dex */
public final class ebq implements ifx {
    public static final hhl a = hhq.a("download_emoticon_content_descriptions", false);

    @Override // defpackage.ifx
    public final ifw a(Context context) {
        return new ebp(context);
    }

    @Override // defpackage.ifx
    public final igg b(Context context) {
        ige b = igg.b(ebp.class, ebp.class, igf.AUTO_ASYNC_BACKGROUND);
        ify q = fgy.q();
        q.d(a);
        b.g = q;
        return b.a();
    }
}
