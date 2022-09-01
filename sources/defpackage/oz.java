package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* renamed from: oz  reason: default package */
/* loaded from: classes2.dex */
public final class oz implements ou {
    final /* synthetic */ bek a;
    private final oy b;

    public oz(bek bekVar, oy oyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bekVar;
        this.b = oyVar;
    }

    @Override // defpackage.ou
    public final void b() {
        ((ArrayDeque) this.a.a).remove(this.b);
        this.b.b(this);
    }
}
