package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: lxj  reason: default package */
/* loaded from: classes.dex */
public final class lxj {
    private lxj() {
    }

    public static void A(Context context, String str, Uri uri, jig jigVar, jie jieVar, kcq kcqVar, boolean z) {
        String str2 = "";
        int i = 0;
        try {
            Uri v = v(context, str);
            InputStream inputStream = (InputStream) kcqVar.q(uri, kpo.b());
            try {
                OutputStream outputStream = (OutputStream) kcqVar.q(v, kps.b());
                lyp.b(inputStream, outputStream);
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        z(th, th2);
                    }
                }
                throw th;
            }
        } catch (kpa e) {
            if (!TextUtils.isEmpty(e.getMessage())) {
                str2 = e.getMessage();
            }
            String str3 = jieVar.b;
            String str4 = jigVar.c;
            str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
            int i2 = jmk.a;
            i = 24;
        } catch (IOException unused) {
            jmk.d("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", jieVar.b, jigVar.c);
            int i3 = true != z ? 21 : 22;
            str2 = String.format("Error while copying file %s, group %s, to the shared blob storage", jieVar.b, jigVar.c);
            i = i3;
        } catch (kox unused2) {
            jmk.d("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", jieVar.b, jigVar.c);
            str2 = String.format("System limit exceeded for file %s, group %s", jieVar.b, jigVar.c);
            i = 25;
        } catch (koy unused3) {
            jmk.d("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", jieVar.b, jigVar.c);
            str2 = String.format("Malformed blob Uri for file %s, group %s", jieVar.b, jigVar.c);
            i = 17;
        }
        if (i == 0) {
            return;
        }
        throw new jmo(i, str2);
    }

    public static boolean B(Context context, String str, jig jigVar, jie jieVar, kcq kcqVar) {
        boolean z;
        String str2 = "";
        int i = 0;
        try {
            z = kcqVar.v(v(context, str));
        } catch (koy unused) {
            jmk.d("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", jieVar.b, jigVar.c);
            str2 = String.format("Malformed blob Uri for file %s, group %s", jieVar.b, jigVar.c);
            z = false;
            i = 17;
        } catch (kpa e) {
            if (!TextUtils.isEmpty(e.getMessage())) {
                str2 = e.getMessage();
            }
            String str3 = jieVar.b;
            String str4 = jigVar.c;
            str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
            int i2 = jmk.a;
            z = false;
            i = 24;
        } catch (IOException unused2) {
            jmk.d("%s: Failed to check existence in the shared storage for file %s, file group %s", "AndroidSharingUtil", jieVar.b, jigVar.c);
            str2 = String.format("Error while checking if file %s, group %s, exists in the shared blob storage.", jieVar.b, jigVar.c);
            z = false;
            i = 19;
        }
        if (i == 0) {
            return z;
        }
        throw new jmo(i, str2);
    }

    public static void a(String str, Object... objArr) {
        PrintStream printStream = System.err;
        printStream.println(lxj.class + ": " + String.format(str, objArr));
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static void c(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static boolean d(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static int e(int i) {
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

    public static int f(int i) {
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
            default:
                return 0;
        }
    }

    public static String g(int i) {
        return Integer.toString(i - 1);
    }

    public static /* synthetic */ void h(int i) {
        if (i != 0) {
            return;
        }
        throw null;
    }

    public static int i(int i) {
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

    public static int j(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
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
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            return i != 2 ? 0 : 4;
        }
        return 2;
    }

    public static jsx n(int i) {
        boolean z = true;
        boolean z2 = (i & 8) > 0;
        boolean z3 = (i & 16) > 0;
        boolean z4 = (i & 32) > 0;
        if ((i & 64) <= 0) {
            z = false;
        }
        jsw e = jsx.e();
        e.e(z2);
        e.c(z3);
        e.d(z4);
        e.b(z);
        return e.a();
    }

    public static boolean o(int i) {
        return (i & 3) == 0;
    }

    public static int p(jsx jsxVar, int i) {
        jrk jrkVar = (jrk) jsxVar;
        if (jrkVar.a) {
            i |= 8;
        }
        if (jrkVar.b) {
            i |= 16;
        }
        if (jrkVar.c) {
            i |= 32;
        }
        return jrkVar.d ? i | 64 : i;
    }

    public static int q(int i) {
        return i - 2;
    }

    public static int r(int i) {
        return i - 2;
    }

    public static int s(int i) {
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
            case 24:
                return 26;
            case 25:
                return 27;
            default:
                return 0;
        }
    }

    public static void t() {
        jlr.b();
        new HashMap();
    }

    public static Uri u(Context context, lfb lfbVar) {
        kor a = kos.a(context);
        a.d((lfbVar == null || !lfbVar.e()) ? "datadownload" : (String) lfbVar.a());
        if (lfbVar != null && lfbVar.e()) {
            a.e("datadownload");
        }
        return a.a();
    }

    public static Uri v(Context context, String str) {
        lfy lfyVar = kot.a;
        return kqn.g(str, context.getPackageName(), 0L);
    }

    public static String w(String str, lfb lfbVar) {
        if (lfbVar != null && lfbVar.e()) {
            str = str.concat((String) lfbVar.a());
        }
        return str.concat(".pb");
    }

    public static String x(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public";
    }

    public static /* synthetic */ void z(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }

    public static Uri y(Context context, int i, String str, String str2, lfb lfbVar, boolean z) {
        try {
            if (!z) {
                return u(context, lfbVar).buildUpon().appendPath(x(i)).build().buildUpon().appendPath(str).build();
            }
            return v(context, str2);
        } catch (Exception e) {
            jmk.e(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            return null;
        }
    }
}
