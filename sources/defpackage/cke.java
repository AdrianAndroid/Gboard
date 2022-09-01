package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: cke  reason: default package */
/* loaded from: classes.dex */
public final class cke implements bet {
    private final idk a;

    public cke(idk idkVar) {
        this.a = idkVar;
    }

    @Override // defpackage.bet
    public final /* bridge */ /* synthetic */ boolean b(Object obj, bfh bfhVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        if (z) {
            this.a.e(ciu.IMAGE_CANDIDATE_USAGE, 1);
        }
        return false;
    }

    @Override // defpackage.bet
    public final boolean fi(axd axdVar, bfh bfhVar, boolean z) {
        if (z) {
            this.a.e(ciu.IMAGE_CANDIDATE_USAGE, 2);
        }
        return false;
    }
}
