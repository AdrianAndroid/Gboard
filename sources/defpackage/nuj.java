package defpackage;

import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: nuj  reason: default package */
/* loaded from: classes2.dex */
public abstract class nuj {
    private static final BitSet c;
    public final String a;
    public final byte[] b;
    private final String d;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        c = bitSet;
    }

    public nuj(String str, boolean z) {
        this.d = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        jdg.Q(lowerCase, "name");
        jdg.w(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            num.a.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if (z && charAt == ':') {
                if (i == 0) {
                    i = 0;
                    i++;
                } else {
                    charAt = ':';
                }
            }
            if (!c.get(charAt)) {
                throw new IllegalArgumentException(jdg.p("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
            i++;
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(lel.a);
    }

    public static nuj c(String str, nui nuiVar) {
        return new nuh(str, nuiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nuj d(String str, boolean z, nul nulVar) {
        return new nuk(str, z, nulVar);
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((nuj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Key{name='" + this.a + "'}";
    }
}
