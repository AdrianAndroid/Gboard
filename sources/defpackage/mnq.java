package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* renamed from: mnq  reason: default package */
/* loaded from: classes2.dex */
final class mnq extends mnu {
    private final fxa a;

    public mnq(fxa fxaVar, byte[] bArr) {
        this.a = fxaVar;
    }

    @Override // defpackage.mnu
    public final void b(Status status, mnx mnxVar) {
        fhr.q(status, mnxVar, this.a);
    }
}
