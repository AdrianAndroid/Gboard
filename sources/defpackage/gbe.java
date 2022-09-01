package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: gbe  reason: default package */
/* loaded from: classes.dex */
final class gbe extends fpn {
    final /* synthetic */ gau a;
    final /* synthetic */ fxa b;

    public gbe(fxa fxaVar, gau gauVar, byte[] bArr) {
        this.b = fxaVar;
        this.a = gauVar;
    }

    @Override // defpackage.fpo
    public final void b(Status status) {
        if (status.f == 0) {
            this.b.d(new gbh(this.a));
        } else {
            this.b.c(new fnx(status));
        }
    }
}
