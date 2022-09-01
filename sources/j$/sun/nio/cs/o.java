package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
final class o extends CharsetEncoder {
    private e a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Charset charset) {
        super(charset, 1.1f, 3.0f);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return !j$.desugar.sun.nio.fs.a.d(c);
    }

    @Override // java.nio.charset.CharsetEncoder
    protected final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        int i;
        char c;
        int i2;
        int i3 = 2;
        if (charBuffer.hasArray() && byteBuffer.hasArray()) {
            char[] array = charBuffer.array();
            int position = charBuffer.position() + charBuffer.arrayOffset();
            int limit = charBuffer.limit() + charBuffer.arrayOffset();
            byte[] array2 = byteBuffer.array();
            int position2 = byteBuffer.position() + byteBuffer.arrayOffset();
            int limit2 = byteBuffer.limit() + byteBuffer.arrayOffset();
            int min = Math.min(limit - position, limit2 - position2) + position2;
            while (position2 < min) {
                char c2 = array[position];
                if (c2 >= 128) {
                    break;
                }
                position++;
                array2[position2] = (byte) c2;
                position2++;
            }
            while (position < limit) {
                char c3 = array[position];
                if (c3 < 128) {
                    if (position2 >= limit2) {
                        p.a(charBuffer, position, byteBuffer, position2);
                        return CoderResult.OVERFLOW;
                    }
                    i2 = position2 + 1;
                    array2[position2] = (byte) c3;
                    position2 = i2;
                } else if (c3 < 2048) {
                    if (limit2 - position2 < i3) {
                        p.a(charBuffer, position, byteBuffer, position2);
                        return CoderResult.OVERFLOW;
                    }
                    int i4 = position2 + 1;
                    array2[position2] = (byte) ((c3 >> 6) | 192);
                    array2[i4] = (byte) ((c3 & '?') | 128);
                    position2 = i4 + 1;
                } else {
                    if (j$.desugar.sun.nio.fs.a.d(c3)) {
                        if (this.a == null) {
                            this.a = new e();
                        }
                        int c4 = this.a.c(c3, array, position, limit);
                        if (c4 < 0) {
                            p.a(charBuffer, position, byteBuffer, position2);
                            return this.a.a();
                        } else if (limit2 - position2 >= 4) {
                            int i5 = position2 + 1;
                            array2[position2] = (byte) ((c4 >> 18) | 240);
                            int i6 = i5 + 1;
                            array2[i5] = (byte) (((c4 >> 12) & 63) | 128);
                            int i7 = i6 + 1;
                            array2[i6] = (byte) (((c4 >> 6) & 63) | 128);
                            position2 = i7 + 1;
                            array2[i7] = (byte) ((c4 & 63) | 128);
                            position++;
                        }
                    } else if (limit2 - position2 >= 3) {
                        int i8 = position2 + 1;
                        array2[position2] = (byte) ((c3 >> '\f') | 224);
                        int i9 = i8 + 1;
                        array2[i8] = (byte) (((c3 >> 6) & 63) | 128);
                        i2 = i9 + 1;
                        array2[i9] = (byte) ((c3 & '?') | 128);
                        position2 = i2;
                    }
                    p.a(charBuffer, position, byteBuffer, position2);
                    return CoderResult.OVERFLOW;
                }
                position++;
                i3 = 2;
            }
            p.a(charBuffer, position, byteBuffer, position2);
            return CoderResult.UNDERFLOW;
        }
        int position3 = charBuffer.position();
        while (charBuffer.hasRemaining()) {
            char c5 = charBuffer.get();
            if (c5 < 128) {
                if (!byteBuffer.hasRemaining()) {
                    CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(position3);
                    return CoderResult.OVERFLOW;
                }
                c = c5;
                byteBuffer.put((byte) c);
            } else {
                if (c5 < 2048) {
                    if (byteBuffer.remaining() < 2) {
                        CharBuffer charBuffer22 = (CharBuffer) charBuffer.position(position3);
                        return CoderResult.OVERFLOW;
                    }
                    i = (c5 >> 6) | 192;
                    byteBuffer.put((byte) i);
                    c = (c5 & '?') | 128;
                } else {
                    if (j$.desugar.sun.nio.fs.a.d(c5)) {
                        if (this.a == null) {
                            this.a = new e();
                        }
                        int b = this.a.b(c5, charBuffer);
                        if (b < 0) {
                            CharBuffer charBuffer3 = (CharBuffer) charBuffer.position(position3);
                            return this.a.a();
                        } else if (byteBuffer.remaining() >= 4) {
                            byteBuffer.put((byte) ((b >> 18) | 240));
                            byteBuffer.put((byte) (((b >> 12) & 63) | 128));
                            byteBuffer.put((byte) (((b >> 6) & 63) | 128));
                            byteBuffer.put((byte) ((b & 63) | 128));
                            position3++;
                        }
                    } else if (byteBuffer.remaining() >= 3) {
                        byteBuffer.put((byte) ((c5 >> '\f') | 224));
                        i = ((c5 >> 6) & 63) | 128;
                        byteBuffer.put((byte) i);
                        c = (c5 & '?') | 128;
                    }
                    CharBuffer charBuffer222 = (CharBuffer) charBuffer.position(position3);
                    return CoderResult.OVERFLOW;
                }
                byteBuffer.put((byte) c);
            }
            position3++;
        }
        CharBuffer charBuffer4 = (CharBuffer) charBuffer.position(position3);
        return CoderResult.UNDERFLOW;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
    }
}
