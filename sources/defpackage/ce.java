package defpackage;

import android.content.Context;
import android.media.MediaDescription;
import android.net.Uri;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ce */
/* loaded from: classes.dex */
public final class ce {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r3 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0040, code lost:
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0050, code lost:
        if (r3 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Context r8) {
        /*
            java.lang.String r0 = "AppLocalesStorageHelper"
            java.lang.String r1 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r8.openFileInput(r1)     // Catch: java.io.FileNotFoundException -> L63
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4b
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4b
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4b
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4b
            r7 = 1
            if (r6 == r7) goto L41
            r7 = 3
            if (r6 != r7) goto L28
            int r6 = r4.getDepth()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4b
            if (r6 <= r5) goto L41
            r6 = 3
        L28:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 == r7) goto L17
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4b
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4b
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r0 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L4b
            r2 = r0
        L41:
            if (r3 == 0) goto L53
        L43:
            r3.close()     // Catch: java.io.IOException -> L47
            goto L53
        L47:
            goto L53
        L49:
            r8 = move-exception
            goto L5d
        L4b:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L53
            goto L43
        L53:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5c
            r8.deleteFile(r1)
        L5c:
            return r2
        L5d:
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.io.IOException -> L62
        L62:
            throw r8
        L63:
            java.lang.String r8 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.c(android.content.Context):java.lang.String");
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static mko e(ats atsVar) {
        return mio.g(iq.b(new aul(atsVar)), new lrf(1), bgb.b);
    }

    protected static final File f(Context context) {
        return context.getDir("lib", 0);
    }

    protected static final File h(Context context, String str) {
        String n = cf.n(str);
        if (cf.m(null)) {
            return new File(f(context), n);
        }
        return new File(f(context), String.valueOf(n).concat(".null"));
    }

    public static final void i(String str, knh knhVar) {
        if (knhVar != null) {
            ((ltd) ((ltd) kni.a.d()).k("com/google/android/libraries/speech/encoding/OggOpusInputStream", "lambda$maybeInitNativeOggOpusLib$0", 57, "OggOpusInputStream.java")).w("%s", str);
        }
    }

    public static final void j(String str, Object[] objArr, knh knhVar) {
        i(String.format(Locale.US, str, objArr), knhVar);
    }

    public static final void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int l(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -678927291) {
            if (str.equals("percent")) {
                c = '\b';
            }
            c = 65535;
        } else if (hashCode == 3178) {
            if (str.equals("cm")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode == 3240) {
            if (str.equals("em")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3251) {
            if (str.equals("ex")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 3365) {
            if (str.equals("in")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == 3488) {
            if (str.equals("mm")) {
                c = 5;
            }
            c = 65535;
        } else if (hashCode == 3571) {
            if (str.equals("pc")) {
                c = 7;
            }
            c = 65535;
        } else if (hashCode != 3588) {
            if (hashCode == 3592 && str.equals("px")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("pt")) {
                c = 6;
            }
            c = 65535;
        }
        switch (c) {
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
            case '\b':
                return 9;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static Object m(Object obj) {
        q(obj, "Argument must not be null");
        return obj;
    }

    public static void n(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void o(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static void p(Collection collection) {
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
        r5 = new defpackage.ewj(r13, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void r(android.content.Context r19, java.lang.String r20, java.util.Set r21, defpackage.knh r22) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.r(android.content.Context, java.lang.String, java.util.Set, knh):void");
    }

    public static final void g(Context context, String str, Set set, knh knhVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (cf.m(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        j("Beginning load of %s...", new Object[]{str}, knhVar);
        r(context, str, set, knhVar);
    }
}
