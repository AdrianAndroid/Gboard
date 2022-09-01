package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: hha  reason: default package */
/* loaded from: classes.dex */
public abstract class hha implements ifw {
    protected abstract iiy c();

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        oll.e(context, "applicationContext");
        ijf.j(c());
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
