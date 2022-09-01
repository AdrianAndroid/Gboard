package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.CRC32;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: ols  reason: default package */
/* loaded from: classes2.dex */
public class ols {
    public static float a(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int c(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int d(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            default:
                return 0;
        }
    }

    public static void e(Appendable appendable, Object obj, okq okqVar) {
        if (okqVar != null) {
            appendable.append((CharSequence) okqVar.a(obj));
        } else if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static String f(char[] cArr) {
        oll.e(cArr, "<this>");
        return new String(cArr);
    }

    public static boolean g(CharSequence charSequence) {
        oll.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            oll.e(charSequence, "<this>");
            oju it = new olw(0, charSequence.length() - 1).iterator();
            while (it.a) {
                if (!oll.k(charSequence.charAt(it.a()))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static int h(CharSequence charSequence) {
        oll.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int i(CharSequence charSequence, String str, int i) {
        oll.e(charSequence, "<this>");
        oll.e(str, "string");
        if (!(charSequence instanceof String)) {
            olw olwVar = new olw(b(i, 0), c(charSequence.length(), charSequence.length()));
            int i2 = olwVar.a;
            int i3 = olwVar.b;
            if (i2 > i3) {
                return -1;
            }
            while (!k(str, charSequence, i2, str.length())) {
                if (i2 == i3) {
                    return -1;
                }
                i2++;
            }
            return i2;
        }
        return ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ int j(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return i(charSequence, str, i);
    }

    public static boolean k(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        oll.e(charSequence, "<this>");
        oll.e(charSequence2, "other");
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!oll.m(charSequence.charAt(i3), charSequence2.charAt(i + i3))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String l(String str, String str2, String str3) {
        oll.e(str, "<this>");
        int i = 0;
        int i2 = i(str, str2, 0);
        if (i2 >= 0) {
            int length = str2.length();
            int b = b(length, 1);
            int length2 = (str.length() - length) + str3.length();
            if (length2 < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, i2);
                sb.append(str3);
                i = i2 + length;
                if (i2 >= str.length()) {
                    break;
                }
                i2 = i(str, str2, i2 + b);
            } while (i2 > 0);
            sb.append((CharSequence) str, i, str.length());
            return sb.toString();
        }
        return str;
    }

    public static /* synthetic */ boolean m(String str, String str2, int i) {
        oll.e(str, "<this>");
        oll.e(str2, "prefix");
        return str.startsWith(str2, i);
    }

    public static /* synthetic */ String n(String str) {
        int lastIndexOf;
        oll.e(str, "<this>");
        oll.e(str, "missingDelimiterValue");
        int h = h(str);
        oll.e(str, "<this>");
        if (!(str instanceof String)) {
            char[] cArr = {'.'};
            oll.e(str, "<this>");
            lastIndexOf = c(h, h(str));
            loop0: while (true) {
                if (lastIndexOf < 0) {
                    lastIndexOf = -1;
                    break;
                }
                char charAt = str.charAt(lastIndexOf);
                for (int i = 0; i <= 0; i++) {
                    if (oll.m(cArr[i], charAt)) {
                        break loop0;
                    }
                }
                lastIndexOf--;
            }
        } else {
            lastIndexOf = str.lastIndexOf(46, h);
        }
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        oll.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static void o(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            Throwable th = (Throwable) list.get(0);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
        throw new paf(list);
    }

    public static void p(Throwable th) {
        if (th instanceof pai) {
            throw ((pai) th);
        }
        if (th instanceof pah) {
            throw ((pah) th);
        }
        if (th instanceof pag) {
            throw ((pag) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static int q(long j) {
        int i = 0;
        do {
            i++;
            j >>= 7;
        } while (j != 0);
        return i;
    }

    public static long r(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            long j = read & 127;
            int i = 0;
            while ((read & 128) != 0) {
                i++;
                if (i < 9) {
                    read = inputStream.read();
                    if (read == -1) {
                        throw new EOFException();
                    }
                    if (read == 0) {
                        throw new oxz();
                    }
                    j |= (read & 127) << (i * 7);
                } else {
                    throw new oxz();
                }
            }
            return j;
        }
        throw new EOFException();
    }

    public static oyv s(byte[] bArr, int i) {
        if (bArr[i] == 0) {
            byte b = bArr[i + 1];
            if ((b & 255) < 16) {
                oyv oyvVar = new oyv();
                oyvVar.a = b;
                return oyvVar;
            }
        }
        throw new oyl();
    }

    public static boolean t(byte[] bArr, int i, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) (value >>> (i4 * 8))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static int u(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int v(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 14;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 15;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            case 22:
                return 24;
            case 23:
                return 25;
            default:
                switch (i) {
                    case 101:
                        return 103;
                    case 102:
                        return 104;
                    case 103:
                        return 105;
                    case 104:
                        return 106;
                    case 105:
                        return 107;
                    case 106:
                        return 108;
                    case 107:
                        return 109;
                    case 108:
                        return 110;
                    case 109:
                        return 111;
                    case 110:
                        return 112;
                    case 111:
                        return 113;
                    case 112:
                        return 114;
                    case 113:
                        return 115;
                    case 114:
                        return 116;
                    case 115:
                        return 117;
                    case 116:
                        return 118;
                    case 117:
                        return 119;
                    case 118:
                        return 120;
                    case 119:
                        return 121;
                    case 120:
                        return 122;
                    case 121:
                        return 123;
                    case 122:
                        return 124;
                    case 123:
                        return 125;
                    default:
                        return 0;
                }
        }
    }
}
