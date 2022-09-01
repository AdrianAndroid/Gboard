package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ayu  reason: default package */
/* loaded from: classes.dex */
final class ayu implements ays {
    private final /* synthetic */ int a;

    public ayu(int i) {
        this.a = i;
    }

    @Override // defpackage.ays
    public final Class a() {
        return this.a != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.ays
    public final /* synthetic */ Object b(byte[] bArr) {
        return this.a != 0 ? ByteBuffer.wrap(bArr) : new ByteArrayInputStream(bArr);
    }
}
