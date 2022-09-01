package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
abstract class r extends CharsetDecoder {
    private final int a;
    private int b;
    private int c = 1;

    public r(Charset charset, int i) {
        super(charset, 0.5f, 1.0f);
        this.b = i;
        this.a = i;
    }

    @Override // java.nio.charset.CharsetDecoder
    protected final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        CoderResult coderResult;
        int i;
        int position = byteBuffer.position();
        while (byteBuffer.remaining() > 1) {
            try {
                int i2 = byteBuffer.get() & 255;
                int i3 = byteBuffer.get() & 255;
                if (this.b == 0) {
                    char c = (char) ((i2 << 8) | i3);
                    if (c == 65279) {
                        this.b = 1;
                    } else if (c == 65534) {
                        this.b = 2;
                    } else {
                        this.b = this.c;
                    }
                    position += 2;
                }
                if (this.b == 1) {
                    i2 <<= 8;
                } else {
                    i3 <<= 8;
                }
                char c2 = (char) (i2 | i3);
                if (c2 != 65534) {
                    if (j$.desugar.sun.nio.fs.a.d(c2)) {
                        if (Character.isHighSurrogate(c2)) {
                            if (byteBuffer.remaining() < 2) {
                                break;
                            }
                            int i4 = byteBuffer.get() & 255;
                            int i5 = byteBuffer.get() & 255;
                            if (this.b == 1) {
                                i = (i4 << 8) | i5;
                            } else {
                                i = (i5 << 8) | i4;
                            }
                            char c3 = (char) i;
                            if (!Character.isLowSurrogate(c3)) {
                                coderResult = CoderResult.malformedForLength(4);
                                break;
                            } else if (charBuffer.remaining() >= 2) {
                                position += 4;
                                charBuffer.put(c2);
                                charBuffer.put(c3);
                            } else {
                                coderResult = CoderResult.OVERFLOW;
                                break;
                            }
                        }
                    } else if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    } else {
                        position += 2;
                        charBuffer.put(c2);
                    }
                }
                coderResult = CoderResult.malformedForLength(2);
            } finally {
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position);
            }
        }
        coderResult = CoderResult.UNDERFLOW;
        return coderResult;
    }

    @Override // java.nio.charset.CharsetDecoder
    protected final void implReset() {
        this.b = this.a;
    }
}
