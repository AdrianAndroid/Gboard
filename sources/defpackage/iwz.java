package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: iwz  reason: default package */
/* loaded from: classes.dex */
public abstract class iwz implements ixa {
    protected abstract llp c();

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ijl.b().g(new ixc(c()));
        igr.d(context).g(ixa.class);
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
