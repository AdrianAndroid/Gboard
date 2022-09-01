package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: nza  reason: default package */
/* loaded from: classes2.dex */
final class nza implements nzc {
    private final /* synthetic */ int a;

    public nza(int i) {
        this.a = i;
    }

    @Override // defpackage.nzd
    public final /* synthetic */ int a(odg odgVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            Void r6 = (Void) obj;
            odgVar.l(i);
            return 0;
        } else if (i3 == 1) {
            Void r62 = (Void) obj;
            return odgVar.e();
        } else if (i3 == 2) {
            odgVar.k((byte[]) obj, i2, i);
            return i2 + i;
        } else {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            odgVar.i(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }
}
