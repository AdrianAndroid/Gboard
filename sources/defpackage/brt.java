package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;

/* compiled from: PG */
/* renamed from: brt  reason: default package */
/* loaded from: classes.dex */
public final class brt implements iyg {
    public final Context a;
    private final mks b = gxo.c(10);

    static {
        lug.i("CloudSync");
    }

    public brt(Context context) {
        this.a = context;
    }

    @Override // defpackage.iyg
    public final mko a() {
        Context context = this.a;
        mko hQ = this.b.hQ(new brs(this, new ewj(context, Delight5Facilitator.h(context)), 0, null, null));
        ino.K(this.a, "japanese_mozc").f("clear_all_history", true);
        ijl.b().g(new iyf());
        return hQ;
    }
}
