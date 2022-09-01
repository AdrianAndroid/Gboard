package defpackage;

import java.net.SocketTimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ote  reason: default package */
/* loaded from: classes2.dex */
public final class ote extends oup {
    final /* synthetic */ otf a;

    public ote(otf otfVar) {
        this.a = otfVar;
    }

    @Override // defpackage.oup
    protected final void a() {
        this.a.k(9);
    }

    public final void b() {
        if (!oix.h(this)) {
            return;
        }
        throw new SocketTimeoutException("timeout");
    }
}
