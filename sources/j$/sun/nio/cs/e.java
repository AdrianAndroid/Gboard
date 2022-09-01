package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* loaded from: classes3.dex */
public final class e {
    private CoderResult a = CoderResult.UNDERFLOW;
    private boolean b;

    public final CoderResult a() {
        return this.a;
    }

    public final int b(char c, CharBuffer charBuffer) {
        CoderResult malformedForLength;
        int i;
        if (!Character.isHighSurrogate(c)) {
            if (!Character.isLowSurrogate(c)) {
                this.b = false;
                i = c;
                this.a = null;
                return i;
            }
            malformedForLength = CoderResult.malformedForLength(1);
        } else if (!charBuffer.hasRemaining()) {
            malformedForLength = CoderResult.UNDERFLOW;
        } else {
            char c2 = charBuffer.get();
            if (Character.isLowSurrogate(c2)) {
                int codePoint = Character.toCodePoint(c, c2);
                this.b = true;
                i = codePoint;
                this.a = null;
                return i;
            }
            malformedForLength = CoderResult.malformedForLength(1);
        }
        this.a = malformedForLength;
        return -1;
    }

    public final int c(char c, char[] cArr, int i, int i2) {
        CoderResult malformedForLength;
        int i3;
        if (!Character.isHighSurrogate(c)) {
            if (!Character.isLowSurrogate(c)) {
                this.b = false;
                i3 = c;
                this.a = null;
                return i3;
            }
            malformedForLength = CoderResult.malformedForLength(1);
        } else if (i2 - i < 2) {
            malformedForLength = CoderResult.UNDERFLOW;
        } else {
            char c2 = cArr[i + 1];
            if (Character.isLowSurrogate(c2)) {
                int codePoint = Character.toCodePoint(c, c2);
                this.b = true;
                i3 = codePoint;
                this.a = null;
                return i3;
            }
            malformedForLength = CoderResult.malformedForLength(1);
        }
        this.a = malformedForLength;
        return -1;
    }

    public final CoderResult d() {
        return CoderResult.unmappableForLength(this.b ? 2 : 1);
    }
}
