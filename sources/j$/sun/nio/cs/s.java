package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
public abstract class s extends CharsetEncoder {
    private int a;
    private boolean b;
    private boolean c;
    private final e d;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(java.nio.charset.Charset r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L7
            r1 = 1082130432(0x40800000, float:4.0)
            goto L9
        L7:
            r1 = 1073741824(0x40000000, float:2.0)
        L9:
            r2 = 2
            byte[] r2 = new byte[r2]
            if (r5 != 0) goto L12
            r2 = {x0026: FILL_ARRAY_DATA  , data: [-1, -3} // fill-array
            goto L15
        L12:
            r2 = {x002c: FILL_ARRAY_DATA  , data: [-3, -1} // fill-array
        L15:
            r3.<init>(r4, r0, r1, r2)
            j$.sun.nio.cs.e r4 = new j$.sun.nio.cs.e
            r4.<init>()
            r3.d = r4
            r3.c = r6
            r3.b = r6
            r3.a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.sun.nio.cs.s.<init>(java.nio.charset.Charset, int, boolean):void");
    }

    private void a(char c, ByteBuffer byteBuffer) {
        int i;
        if (this.a == 0) {
            byteBuffer.put((byte) (c >> '\b'));
            i = c & 255;
        } else {
            byteBuffer.put((byte) (c & 255));
            i = c >> '\b';
        }
        byteBuffer.put((byte) i);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return !j$.desugar.sun.nio.fs.a.d(c);
    }

    @Override // java.nio.charset.CharsetEncoder
    protected final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResult;
        e eVar = this.d;
        int position = charBuffer.position();
        if (this.c && charBuffer.hasRemaining()) {
            if (byteBuffer.remaining() < 2) {
                return CoderResult.OVERFLOW;
            }
            a((char) 65279, byteBuffer);
            this.c = false;
        }
        while (true) {
            try {
                if (!charBuffer.hasRemaining()) {
                    coderResult = CoderResult.UNDERFLOW;
                    break;
                }
                char c = charBuffer.get();
                if (j$.desugar.sun.nio.fs.a.d(c)) {
                    int b = eVar.b(c, charBuffer);
                    if (b < 0) {
                        coderResult = eVar.a();
                        break;
                    } else if (byteBuffer.remaining() < 4) {
                        break;
                    } else {
                        position += 2;
                        a((char) ((b >>> 10) + 55232), byteBuffer);
                        c = (char) ((b & 1023) + 56320);
                        a(c, byteBuffer);
                    }
                } else if (byteBuffer.remaining() < 2) {
                    break;
                } else {
                    position++;
                    a(c, byteBuffer);
                }
            } finally {
                CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(position);
            }
        }
        coderResult = CoderResult.OVERFLOW;
        return coderResult;
    }

    @Override // java.nio.charset.CharsetEncoder
    protected final void implReset() {
        this.c = this.b;
    }
}
