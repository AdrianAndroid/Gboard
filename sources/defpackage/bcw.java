package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bcw  reason: default package */
/* loaded from: classes.dex */
public final class bcw implements bcv {
    public static final bcw a = new bcw(0);
    private final /* synthetic */ int b;

    public bcw(int i) {
        this.b = i;
    }

    @Override // defpackage.bcv
    public final axh a(axh axhVar, ava avaVar) {
        byte[] bArr;
        if (this.b != 0) {
            ByteBuffer b = ((bck) axhVar.c()).b();
            int i = bfw.a;
            oth othVar = null;
            if (!b.isReadOnly() && b.hasArray()) {
                othVar = new oth(b.array(), b.arrayOffset(), b.limit());
            }
            if (othVar == null || othVar.b != 0 || othVar.a != ((byte[]) othVar.c).length) {
                ByteBuffer asReadOnlyBuffer = b.asReadOnlyBuffer();
                byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
                bfw.d(asReadOnlyBuffer);
                asReadOnlyBuffer.get(bArr2);
                bArr = bArr2;
            } else {
                bArr = b.array();
            }
            return new bcc(bArr, 0);
        }
        return axhVar;
    }
}
