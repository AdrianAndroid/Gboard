package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: gez  reason: default package */
/* loaded from: classes.dex */
final class gez extends gfi {
    final /* synthetic */ fxa a;

    public gez(fxa fxaVar, byte[] bArr) {
        this.a = fxaVar;
    }

    @Override // defpackage.gfi
    public final void b(Status status, gfh gfhVar) {
        fhr.q(status, new oir((foi) new gfk(gfhVar)), this.a);
    }
}
