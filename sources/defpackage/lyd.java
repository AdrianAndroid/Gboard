package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: lyd  reason: default package */
/* loaded from: classes.dex */
final class lyd extends lxo {
    private long a = 0;
    private long b = 0;
    private int c = 0;

    private static long h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private static long i(long j) {
        return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
    }

    private static long j(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
    }

    @Override // defpackage.lxo
    protected final lxt c() {
        long j = this.a;
        long j2 = this.c;
        long j3 = this.b ^ j2;
        long j4 = (j ^ j2) + j3;
        this.a = j4;
        long j5 = j3 + j4;
        this.b = j5;
        long h = h(j4);
        this.a = h;
        long h2 = h(j5);
        long j6 = h + h2;
        this.a = j6;
        this.b = h2 + j6;
        return lxt.g(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.a).putLong(this.b).array());
    }

    @Override // defpackage.lxo
    protected final void f(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long i = i(j) ^ this.a;
        this.a = i;
        long rotateLeft = Long.rotateLeft(i, 27);
        long j3 = this.b;
        this.a = ((rotateLeft + j3) * 5) + 1390208809;
        long j4 = j(j2) ^ j3;
        this.b = j4;
        this.b = ((Long.rotateLeft(j4, 31) + this.a) * 5) + 944331445;
        this.c += 16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.lxo
    protected final void g(ByteBuffer byteBuffer) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long b;
        this.c += byteBuffer.remaining();
        long j7 = 0;
        switch (byteBuffer.remaining()) {
            case 1:
                j = 0;
                b = j ^ mhq.b(byteBuffer.get(0));
                break;
            case 2:
                j2 = 0;
                j = j2 ^ (mhq.b(byteBuffer.get(1)) << 8);
                b = j ^ mhq.b(byteBuffer.get(0));
                break;
            case 3:
                j3 = 0;
                j2 = j3 ^ (mhq.b(byteBuffer.get(2)) << 16);
                j = j2 ^ (mhq.b(byteBuffer.get(1)) << 8);
                b = j ^ mhq.b(byteBuffer.get(0));
                break;
            case 4:
                j4 = 0;
                j3 = j4 ^ (mhq.b(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (mhq.b(byteBuffer.get(2)) << 16);
                j = j2 ^ (mhq.b(byteBuffer.get(1)) << 8);
                b = j ^ mhq.b(byteBuffer.get(0));
                break;
            case 5:
                j5 = 0;
                j4 = j5 ^ (mhq.b(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (mhq.b(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (mhq.b(byteBuffer.get(2)) << 16);
                j = j2 ^ (mhq.b(byteBuffer.get(1)) << 8);
                b = j ^ mhq.b(byteBuffer.get(0));
                break;
            case 6:
                j6 = 0;
                j5 = (mhq.b(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (mhq.b(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (mhq.b(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (mhq.b(byteBuffer.get(2)) << 16);
                j = j2 ^ (mhq.b(byteBuffer.get(1)) << 8);
                b = j ^ mhq.b(byteBuffer.get(0));
                break;
            case 7:
                j6 = mhq.b(byteBuffer.get(6)) << 48;
                j5 = (mhq.b(byteBuffer.get(5)) << 40) ^ j6;
                j4 = j5 ^ (mhq.b(byteBuffer.get(4)) << 32);
                j3 = j4 ^ (mhq.b(byteBuffer.get(3)) << 24);
                j2 = j3 ^ (mhq.b(byteBuffer.get(2)) << 16);
                j = j2 ^ (mhq.b(byteBuffer.get(1)) << 8);
                b = j ^ mhq.b(byteBuffer.get(0));
                break;
            case 8:
                b = byteBuffer.getLong();
                break;
            case 9:
                j7 ^= mhq.b(byteBuffer.get(8));
                b = byteBuffer.getLong();
                break;
            case 10:
                j7 ^= mhq.b(byteBuffer.get(9)) << 8;
                j7 ^= mhq.b(byteBuffer.get(8));
                b = byteBuffer.getLong();
                break;
            case 11:
                j7 ^= mhq.b(byteBuffer.get(10)) << 16;
                j7 ^= mhq.b(byteBuffer.get(9)) << 8;
                j7 ^= mhq.b(byteBuffer.get(8));
                b = byteBuffer.getLong();
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                j7 ^= mhq.b(byteBuffer.get(11)) << 24;
                j7 ^= mhq.b(byteBuffer.get(10)) << 16;
                j7 ^= mhq.b(byteBuffer.get(9)) << 8;
                j7 ^= mhq.b(byteBuffer.get(8));
                b = byteBuffer.getLong();
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                j7 ^= mhq.b(byteBuffer.get(12)) << 32;
                j7 ^= mhq.b(byteBuffer.get(11)) << 24;
                j7 ^= mhq.b(byteBuffer.get(10)) << 16;
                j7 ^= mhq.b(byteBuffer.get(9)) << 8;
                j7 ^= mhq.b(byteBuffer.get(8));
                b = byteBuffer.getLong();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                j7 ^= mhq.b(byteBuffer.get(13)) << 40;
                j7 ^= mhq.b(byteBuffer.get(12)) << 32;
                j7 ^= mhq.b(byteBuffer.get(11)) << 24;
                j7 ^= mhq.b(byteBuffer.get(10)) << 16;
                j7 ^= mhq.b(byteBuffer.get(9)) << 8;
                j7 ^= mhq.b(byteBuffer.get(8));
                b = byteBuffer.getLong();
                break;
            case 15:
                j7 = mhq.b(byteBuffer.get(14)) << 48;
                j7 ^= mhq.b(byteBuffer.get(13)) << 40;
                j7 ^= mhq.b(byteBuffer.get(12)) << 32;
                j7 ^= mhq.b(byteBuffer.get(11)) << 24;
                j7 ^= mhq.b(byteBuffer.get(10)) << 16;
                j7 ^= mhq.b(byteBuffer.get(9)) << 8;
                j7 ^= mhq.b(byteBuffer.get(8));
                b = byteBuffer.getLong();
                break;
            default:
                throw new AssertionError("Should never get here.");
        }
        this.a = i(b) ^ this.a;
        this.b ^= j(j7);
    }
}
