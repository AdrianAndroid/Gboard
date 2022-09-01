package j$.sun.nio.cs;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
final class n extends CharsetDecoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Charset charset) {
        super(charset, 1.0f, 1.0f);
    }

    private static boolean a(int i, int i2) {
        return (i == 240 && (i2 < 144 || i2 > 191)) || (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
    }

    private static CoderResult b(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i);
        CoderResult e = e(byteBuffer, i2);
        ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(i);
        return e;
    }

    private static CoderResult c(ByteBuffer byteBuffer, int i, CharBuffer charBuffer, int i2, int i3) {
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i - byteBuffer.arrayOffset());
        CoderResult e = e(byteBuffer, i3);
        p.a(byteBuffer, i, charBuffer, i2);
        return e;
    }

    private static CoderResult d(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i);
        return CoderResult.malformedForLength(i2);
    }

    private static CoderResult e(ByteBuffer byteBuffer, int i) {
        int i2 = 1;
        if (i == 1 || i == 2) {
            return CoderResult.malformedForLength(1);
        }
        boolean z = false;
        if (i == 3) {
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            if (b != -32 || (b2 & 224) != 128) {
                if ((b2 & 192) != 128) {
                    z = true;
                }
                if (!z) {
                    i2 = 2;
                }
            }
            return CoderResult.malformedForLength(i2);
        } else if (i != 4) {
            return null;
        } else {
            int i3 = byteBuffer.get() & 255;
            int i4 = byteBuffer.get() & 255;
            if (i3 <= 244 && ((i3 != 240 || (i4 >= 144 && i4 <= 191)) && (i3 != 244 || (i4 & 240) == 128))) {
                if (!((i4 & 192) != 128)) {
                    if ((byteBuffer.get() & 192) == 128) {
                        i2 = 0;
                    }
                    return i2 != 0 ? CoderResult.malformedForLength(2) : CoderResult.malformedForLength(3);
                }
            }
            return CoderResult.malformedForLength(1);
        }
    }

    private static CoderResult f(Buffer buffer, int i, int i2) {
        buffer.position(i);
        return (i2 == 0 || buffer.remaining() < i2) ? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0102, code lost:
        if (r10 <= 1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0104, code lost:
        r2 = r2[r3 + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0108, code lost:
        if (r4 != (-32)) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x010c, code lost:
        if ((r2 & 224) == 128) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0112, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0115, code lost:
        if (r9 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0110, code lost:
        if ((r2 & 192) == 128) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0114, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0119, code lost:
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0288, code lost:
        if (r9 != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b4, code lost:
        j$.sun.nio.cs.p.a(r24, r3, r25, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return java.nio.charset.CoderResult.malformedForLength(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return c(r24, r3, r25, r5, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0184, code lost:
        r4 = r4 & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0188, code lost:
        if (r4 > 244) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018a, code lost:
        if (r10 <= 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
        if (a(r4, r2[r3 + 1] & 255) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019a, code lost:
        if (r10 <= 2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
        if ((r2[r3 + 2] & 192) == 128) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a4, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a7, code lost:
        if (r9 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a9, code lost:
        j$.sun.nio.cs.p.a(r24, r3, r25, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        return java.nio.charset.CoderResult.malformedForLength(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a6, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
        r9 = 4;
     */
    @Override // java.nio.charset.CharsetDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.nio.charset.CoderResult decodeLoop(java.nio.ByteBuffer r24, java.nio.CharBuffer r25) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.sun.nio.cs.n.decodeLoop(java.nio.ByteBuffer, java.nio.CharBuffer):java.nio.charset.CoderResult");
    }
}
