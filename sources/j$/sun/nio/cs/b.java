package j$.sun.nio.cs;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
final class b extends CharsetEncoder {
    private final e a = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Charset charset) {
        super(charset, 1.0f, 1.0f);
    }

    private static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i3 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        int i5 = (i + i3) - 1;
        if (i5 < 0 || i5 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i5);
        }
        int i6 = (i2 + i3) - 1;
        if (i6 < 0 || i6 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
        while (i4 < i3) {
            int i7 = i + 1;
            char c = cArr[i];
            if (c > 255) {
                break;
            }
            bArr[i2] = (byte) c;
            i4++;
            i = i7;
            i2++;
        }
        return i4;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
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
            int arrayOffset = charBuffer.arrayOffset();
            int position = charBuffer.position() + arrayOffset;
            int limit = charBuffer.limit() + arrayOffset;
            if (position > limit) {
                position = limit;
            }
            byte[] array2 = byteBuffer.array();
            int arrayOffset2 = byteBuffer.arrayOffset();
            int position2 = byteBuffer.position() + arrayOffset2;
            int limit2 = byteBuffer.limit() + arrayOffset2;
            if (position2 > limit2) {
                position2 = limit2;
            }
            int i = limit2 - position2;
            int i2 = limit - position;
            if (i >= i2) {
                i = i2;
            }
            try {
                int a = a(array, position, array2, position2, i);
                position += a;
                position2 += a;
                if (a != i) {
                    if (eVar.c(array[position], array, position, limit) < 0) {
                        coderResult2 = eVar.a();
                    } else {
                        coderResult2 = eVar.d();
                    }
                } else if (i < i2) {
                    coderResult2 = CoderResult.OVERFLOW;
                } else {
                    coderResult2 = CoderResult.UNDERFLOW;
                }
                return coderResult2;
            } finally {
                CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(position - arrayOffset);
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position2 - arrayOffset2);
            }
        }
        int position3 = charBuffer.position();
        while (true) {
            try {
                if (charBuffer.hasRemaining()) {
                    char c = charBuffer.get();
                    if (c <= 255) {
                        if (!byteBuffer.hasRemaining()) {
                            coderResult = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c);
                        position3++;
                    } else if (eVar.b(c, charBuffer) < 0) {
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
        return true;
    }
}
