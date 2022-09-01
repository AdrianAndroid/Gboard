package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
final class g extends CharsetEncoder {
    private final e a = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Charset charset) {
        super(charset, 1.0f, 1.0f);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c < 128;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.nio.charset.CharsetEncoder
    protected final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResult;
        CoderResult coderResult2;
        boolean hasArray = charBuffer.hasArray();
        e eVar = this.a;
        if (hasArray && byteBuffer.hasArray()) {
            char[] array = charBuffer.array();
            int position = charBuffer.position() + charBuffer.arrayOffset();
            int limit = charBuffer.limit() + charBuffer.arrayOffset();
            if (position > limit) {
                position = limit;
            }
            byte[] array2 = byteBuffer.array();
            int position2 = byteBuffer.position() + byteBuffer.arrayOffset();
            int limit2 = byteBuffer.limit() + byteBuffer.arrayOffset();
            if (position2 > limit2) {
                position2 = limit2;
            }
            while (true) {
                if (position < limit) {
                    try {
                        char c = array[position];
                        if (c < 128) {
                            if (position2 >= limit2) {
                                coderResult2 = CoderResult.OVERFLOW;
                                break;
                            }
                            array2[position2] = (byte) c;
                            position++;
                            position2++;
                        } else if (eVar.c(c, array, position, limit) < 0) {
                            coderResult2 = eVar.a();
                        } else {
                            coderResult2 = eVar.d();
                        }
                    } finally {
                        CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(position - charBuffer.arrayOffset());
                        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position2 - byteBuffer.arrayOffset());
                    }
                } else {
                    coderResult2 = CoderResult.UNDERFLOW;
                    break;
                }
            }
            return coderResult2;
        }
        int position3 = charBuffer.position();
        while (true) {
            try {
                if (charBuffer.hasRemaining()) {
                    char c2 = charBuffer.get();
                    if (c2 < 128) {
                        if (!byteBuffer.hasRemaining()) {
                            coderResult = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c2);
                        position3++;
                    } else if (eVar.b(c2, charBuffer) < 0) {
                        coderResult = eVar.a();
                    } else {
                        coderResult = eVar.d();
                    }
                } else {
                    coderResult = CoderResult.UNDERFLOW;
                    break;
                }
            } catch (Throwable th) {
                CharBuffer charBuffer3 = (CharBuffer) charBuffer.position(position3);
                throw th;
            }
        }
        CharBuffer charBuffer4 = (CharBuffer) charBuffer.position(position3);
        return coderResult;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
    }
}
