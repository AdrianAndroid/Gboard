package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: lwm  reason: default package */
/* loaded from: classes.dex */
public class lwm {
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
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            default:
                return 0;
        }
    }

    public static lyl e(File file, lyw... lywVarArr) {
        return new lyx(file, lywVarArr);
    }

    public static lym f(File file) {
        return new lyy(file);
    }

    public static String g(String str) {
        jdg.u(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : name.substring(lastIndexOf + 1);
    }

    public static void h(File file, File file2) {
        jdg.D(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        f(file).e(e(file2, new lyw[0]));
    }

    public static void i(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        new StringBuilder("Unable to create parent directories of ").append(file);
        throw new IOException("Unable to create parent directories of ".concat(file.toString()));
    }

    public static void j(File file, File file2) {
        jdg.u(file);
        jdg.u(file2);
        jdg.D(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (!file.renameTo(file2)) {
            h(file, file2);
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                new StringBuilder("Unable to delete ").append(file2);
                throw new IOException("Unable to delete ".concat(String.valueOf(file2)));
            } else {
                new StringBuilder("Unable to delete ").append(file);
                throw new IOException("Unable to delete ".concat(String.valueOf(file)));
            }
        }
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int l(int i) {
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
            default:
                return 0;
        }
    }

    public static int m(int i) {
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
            default:
                return 0;
        }
    }

    public static int n(int i) {
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
            case 15:
                return 16;
            default:
                return 0;
        }
    }

    public static String o(int i) {
        return Integer.toString(i - 1);
    }

    public static long p(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            jvn jvnVar = (jvn) it.next();
            jup c = jvnVar.c();
            int b = c.b();
            if (b == 1 || b == 2) {
                j += Math.max(jvnVar.b(), c.e());
            }
        }
        return j;
    }

    public static long q(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            jvn jvnVar = (jvn) it.next();
            if (jvnVar.b.exists()) {
                j += jvnVar.b();
            }
        }
        return j;
    }

    public static void r(String str, long j, jxz jxzVar, long j2, long j3, long j4, long j5) {
        ((luc) jsh.a.a(Level.INFO).k("com/google/android/libraries/micore/superpacks/gc/GcUtil", "logGcPerformance", 215, "GcUtil.java")).N("GC for '%s' (%s) with ttl of %d ms took %d ms (%d/%d/%d)", str == null ? "global" : str, jxzVar, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
    }

    public static String s(Object obj) {
        String simpleName;
        if (obj == null) {
            return "-";
        }
        if (obj instanceof jsj) {
            simpleName = ((jsj) obj).d();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        return simpleName + ":" + hashCode;
    }

    static int t(String str, int i) {
        int length = str.length();
        if (i >= length) {
            return -1;
        }
        int indexOf = str.indexOf(10, i);
        return indexOf == -1 ? length - 1 : indexOf;
    }

    public static jrt u(String str, int i) {
        int t = t(str, i);
        jrt jrtVar = null;
        while (t > 0) {
            int length = t >= str.length() ? str.length() - 1 : t;
            int i2 = i;
            while (i2 <= length && Character.isWhitespace(str.charAt(i2))) {
                i2++;
            }
            if (i2 > i && i2 <= length - 2 && str.charAt(i2) == 'a' && str.charAt(i2 + 1) == 't' && Character.isWhitespace(str.charAt(i2 + 2))) {
                if (jrtVar == null) {
                    jrtVar = new jrt();
                    jrtVar.a = i;
                    jrtVar.c = str;
                }
                jrtVar.b = t;
            } else if (jrtVar != null) {
                break;
            }
            i = t + 1;
            t = t(str, i);
        }
        return jrtVar;
    }

    public static String v(Throwable th, int i) {
        String str = th.getClass().getName() + ": " + th.getMessage();
        Throwable cause = th.getCause();
        if (cause != null) {
            if (i >= 5) {
                return str.concat("\n(...)");
            }
            return str + "\nCaused by: " + v(cause, i + 1);
        }
        return str;
    }

    public static Throwable w(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null) {
            return th;
        }
        Class<?> cls = th.getClass();
        return (cls.equals(ExecutionException.class) || cls.equals(lzc.class)) ? w(cause) : th;
    }

    public lur a() {
        return luq.a;
    }

    public lwt b() {
        return lwt.b;
    }

    public void c(String str, Level level, boolean z) {
    }
}
