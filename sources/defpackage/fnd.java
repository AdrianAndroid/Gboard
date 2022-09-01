package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fnd  reason: default package */
/* loaded from: classes.dex */
final class fnd extends fri {
    public final byte[] a;

    public fnd(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.fri
    public final byte[] hF() {
        return this.a;
    }
}
