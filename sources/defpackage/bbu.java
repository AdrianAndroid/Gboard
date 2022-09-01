package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: bbu  reason: default package */
/* loaded from: classes.dex */
final class bbu implements auy {
    private final ByteBuffer a = ByteBuffer.allocate(4);
    private final /* synthetic */ int b;

    public bbu(int i, byte[] bArr) {
        this.b = i;
    }

    public bbu(int i) {
        this.b = i;
    }

    @Override // defpackage.auy
    public final /* synthetic */ void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        if (this.b == 0) {
            Integer num = (Integer) obj;
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
            return;
        }
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putLong(l.longValue()).array());
        }
    }
}
