package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dyq  reason: default package */
/* loaded from: classes.dex */
public final class dyq implements dyf {
    private dyp a;

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.a = new dyp();
    }

    @Override // defpackage.ifw
    public final void gn() {
        dyp dypVar = this.a;
        if (dypVar != null) {
            hww c = hsx.c();
            c.d(ice.HEADER, R.id.key_pos_proactive_suggestions);
            c.l(ice.HEADER, dypVar.d);
            ijl.b().d(dypVar.n, ior.class);
            ijl.b().d(dypVar.o, ioq.class);
            this.a = null;
        }
    }
}
