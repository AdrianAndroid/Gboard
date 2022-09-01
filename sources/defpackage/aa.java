package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aa  reason: default package */
/* loaded from: classes.dex */
public final class aa extends ab {
    private final boolean c;
    private boolean d = false;
    private azp e;

    public aa(bz bzVar, wq wqVar, boolean z) {
        super(bzVar, wqVar);
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final azp a(Context context) {
        if (!this.d) {
            bz bzVar = this.a;
            azp A = cd.A(context, bzVar.a, bzVar.e == 2, this.c);
            this.e = A;
            this.d = true;
            return A;
        }
        return this.e;
    }
}
