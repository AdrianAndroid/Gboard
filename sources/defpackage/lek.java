package defpackage;

/* compiled from: PG */
/* renamed from: lek  reason: default package */
/* loaded from: classes.dex */
public abstract class lek implements lfe {
    public static lek e(char c, char c2) {
        return new led(c, c2);
    }

    public static lek f(char c) {
        return new lee(c);
    }

    public static String i(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    @Override // defpackage.lfe
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public int c(CharSequence charSequence) {
        return d(charSequence, 0);
    }

    public int d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        jdg.P(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final lek g(lek lekVar) {
        return new lei(this, lekVar);
    }

    public final String h(CharSequence charSequence) {
        String obj = charSequence.toString();
        int c = c(obj);
        if (c == -1) {
            return obj;
        }
        char[] charArray = obj.toCharArray();
        int i = 1;
        while (true) {
            c++;
            while (c != charArray.length) {
                if (b(charArray[c])) {
                    break;
                }
                charArray[c - i] = charArray[c];
                c++;
            }
            return new String(charArray, 0, c - i);
            i++;
        }
    }

    public boolean j(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (b(charSequence.charAt(length)));
        return false;
    }
}
