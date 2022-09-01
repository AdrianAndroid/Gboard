package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: bcn  reason: default package */
/* loaded from: classes.dex */
public final class bcn implements ave {
    private final ave b;

    public bcn(ave aveVar) {
        ce.m(aveVar);
        this.b = aveVar;
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.ave
    public final axh b(Context context, axh axhVar, int i, int i2) {
        bck bckVar = (bck) axhVar.c();
        bbn bbnVar = new bbn(bckVar.a(), atb.b(context).a, 1);
        axh b = this.b.b(context, bbnVar, i, i2);
        if (!bbnVar.equals(b)) {
            bbnVar.e();
        }
        ave aveVar = this.b;
        bckVar.a.a.e(aveVar, (Bitmap) b.c());
        return axhVar;
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof bcn) {
            return this.b.equals(((bcn) obj).b);
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return this.b.hashCode();
    }
}
