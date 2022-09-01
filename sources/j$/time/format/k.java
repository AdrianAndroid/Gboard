package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k implements g {
    static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    static final k e = new k("+HH:MM:ss", "Z");
    private final String a;
    private final int b;
    private final int c;

    static {
        new k("+HH:MM:ss", "0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, String str2) {
        int i = 0;
        while (true) {
            String[] strArr = d;
            if (i < 22) {
                if (strArr[i].equals(str)) {
                    this.b = i;
                    this.c = i % 11;
                    this.a = str2;
                    return;
                }
                i++;
            } else {
                throw new IllegalArgumentException(j$.net.a.a("Invalid zone offset pattern: ", str));
            }
        }
    }

    private static void b(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // j$.time.format.g
    public final boolean a(r rVar, StringBuilder sb) {
        String str;
        boolean z;
        boolean z2;
        Long e2 = rVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z3 = false;
        if (e2 == null) {
            return false;
        }
        long longValue = e2.longValue();
        int i = (int) longValue;
        if (longValue == i) {
            if (i != 0) {
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                int length = sb.length();
                if (i < 0) {
                    str = "-";
                } else {
                    str = "+";
                }
                sb.append(str);
                if (this.b < 11) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && abs < 10) {
                    sb.append((char) (abs + 48));
                } else {
                    b(false, abs, sb);
                }
                int i2 = this.c;
                if ((i2 >= 3 && i2 <= 8) || ((i2 >= 9 && abs3 > 0) || (i2 >= 1 && abs2 > 0))) {
                    if (i2 > 0 && i2 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b(z2, abs2, sb);
                    abs += abs2;
                    if (i2 == 7 || i2 == 8 || (i2 >= 5 && abs3 > 0)) {
                        if (i2 > 0 && i2 % 2 == 0) {
                            z3 = true;
                        }
                        b(z3, abs3, sb);
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.a);
            return true;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        String replace = this.a.replace("'", "''");
        String str = d[this.b];
        return "Offset(" + str + ",'" + replace + "')";
    }
}
