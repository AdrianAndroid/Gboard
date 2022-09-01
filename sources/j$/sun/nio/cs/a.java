package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
final class a extends CharsetDecoder {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Charset charset) {
        super(charset, 1.0f, 1.0f);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.nio.CharBuffer] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // java.nio.charset.CharsetDecoder
    protected final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        CoderResult coderResult;
        CoderResult coderResult2;
        if (byteBuffer.hasArray() && charBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            int limit = byteBuffer.limit() + byteBuffer.arrayOffset();
            if (position > limit) {
                position = limit;
            }
            char[] array2 = charBuffer.array();
            int position2 = charBuffer.position() + charBuffer.arrayOffset();
            int limit2 = charBuffer.limit() + charBuffer.arrayOffset();
            if (position2 > limit2) {
                position2 = limit2;
            }
            while (true) {
                if (position < limit) {
                    try {
                        byte b = array[position];
                        if (position2 >= limit2) {
                            coderResult2 = CoderResult.OVERFLOW;
                            break;
                        }
                        int i = position2 + 1;
                        try {
                            array2[position2] = (char) (b & 255);
                            position++;
                            position2 = i;
                        } catch (Throwable th) {
                            th = th;
                            position2 = i;
                            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position - byteBuffer.arrayOffset());
                            CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(position2 - charBuffer.arrayOffset());
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    coderResult2 = CoderResult.UNDERFLOW;
                    break;
                }
            }
            position -= byteBuffer.arrayOffset();
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(position);
            position2 -= charBuffer.arrayOffset();
            byteBuffer = (CharBuffer) charBuffer.position(position2);
            return coderResult2;
        }
        int position3 = byteBuffer.position();
        while (true) {
            try {
                if (byteBuffer.hasRemaining()) {
                    byte b2 = byteBuffer.get();
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    }
                    charBuffer.put((char) (b2 & 255));
                    position3++;
                } else {
                    coderResult = CoderResult.UNDERFLOW;
                    break;
                }
            } catch (Throwable th3) {
                ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer.position(position3);
                throw th3;
            }
        }
        ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer.position(position3);
        return coderResult;
    }
}
