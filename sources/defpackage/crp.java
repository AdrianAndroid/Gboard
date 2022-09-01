package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import com.google.android.libraries.inputmethod.webp.WebPDecodeException;
import com.google.android.libraries.inputmethod.webp.WebPJni;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: crp  reason: default package */
/* loaded from: classes.dex */
public final class crp {
    static final hic b;
    static final hic c;
    private static final lmz e;
    private final Context f;
    private final idk g;
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/expression/image/WhatsAppWebpConverter");
    static final hhl a = hhq.f("webp_minimum_whatsapp_version", 210116001);

    static {
        nfh t = nrt.j.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nrt nrtVar = (nrt) t.b;
        nrtVar.g = 0;
        nrtVar.a |= 512;
        nrt.c(nrtVar);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nrt nrtVar2 = (nrt) t.b;
        int i = nrtVar2.a | 128;
        nrtVar2.a = i;
        nrtVar2.e = 70.0f;
        nrtVar2.a = i | 256;
        nrtVar2.f = 5;
        int b2 = (int) gvu.KILOBYTES.b(100L);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nrt nrtVar3 = (nrt) t.b;
        nrtVar3.b |= 4;
        nrtVar3.i = b2;
        int millis = (int) TimeUnit.SECONDS.toMillis(15L);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nrt nrtVar4 = (nrt) t.b;
        nrtVar4.b |= 2;
        nrtVar4.h = millis;
        b = hhq.k("webp_sticker_static_options", (nrt) t.cz());
        nfh t2 = nrt.j.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nrt nrtVar5 = (nrt) t2.b;
        nrtVar5.g = 0;
        nrtVar5.a |= 512;
        nrt.c(nrtVar5);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nrt nrtVar6 = (nrt) t2.b;
        int i2 = nrtVar6.a | 128;
        nrtVar6.a = i2;
        nrtVar6.e = 25.0f;
        int i3 = i2 | 256;
        nrtVar6.a = i3;
        nrtVar6.f = 2;
        int i4 = i3 | 2;
        nrtVar6.a = i4;
        nrtVar6.c = 9;
        nrtVar6.a = i4 | 4;
        nrtVar6.d = 17;
        int b3 = (int) gvu.KILOBYTES.b(500L);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nrt nrtVar7 = (nrt) t2.b;
        nrtVar7.b |= 4;
        nrtVar7.i = b3;
        int millis2 = (int) TimeUnit.SECONDS.toMillis(15L);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nrt nrtVar8 = (nrt) t2.b;
        nrtVar8.b |= 2;
        nrtVar8.h = millis2;
        c = hhq.k("webp_sticker_animated_options", (nrt) t2.cz());
        e = lmz.t("image/jpeg", "image/png", "image/gif");
    }

    public crp(Context context, idk idkVar) {
        this.f = context;
        this.g = idkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r1.equals(r0) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.content.Context r4, android.view.inputmethod.EditorInfo r5) {
        /*
            java.lang.String r0 = defpackage.ham.m(r5)
            java.lang.String r1 = "com.whatsapp"
            boolean r2 = r1.equals(r0)
            r3 = 0
            if (r2 == 0) goto Le
            goto L16
        Le:
            java.lang.String r1 = "com.whatsapp.w4b"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
        L16:
            java.lang.String r0 = "image/webp.wasticker"
            boolean r5 = defpackage.ham.r(r5, r0)
            if (r5 == 0) goto L35
            int r4 = defpackage.jam.f(r4, r1)
            long r4 = (long) r4
            hhl r0 = defpackage.crp.a
            java.lang.Object r0 = r0.c()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L35
            r4 = 1
            return r4
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crp.b(android.content.Context, android.view.inputmethod.EditorInfo):boolean");
    }

    public static boolean c(File file, String str) {
        return cqp.s.contains(str) && e.contains(jbc.f(file));
    }

    private final cro d(File file, boolean z, String str) {
        File c2 = crk.c(this.f, str, jbc.c("image/webp.wasticker"));
        try {
            nrt nrtVar = (nrt) (z ? c.j() : b.j());
            boolean z2 = WebPJni.a;
            File canonicalFile = file.getCanonicalFile();
            File canonicalFile2 = c2.getCanonicalFile();
            String f = jbc.f(canonicalFile);
            if (f.isEmpty()) {
                if (!canonicalFile.exists()) {
                    throw new FileNotFoundException("Failed to open ".concat(String.valueOf(canonicalFile.getPath())));
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(canonicalFile.getPath(), options);
                if (TextUtils.isEmpty(options.outMimeType)) {
                    throw new WebPDecodeException("Failed to decode file mime-type");
                }
                f = options.outMimeType;
            }
            nfh t = nru.g.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nru nruVar = (nru) t.b;
            f.getClass();
            nruVar.a |= 8;
            nruVar.d = f;
            String path = canonicalFile.getPath();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nru nruVar2 = (nru) t.b;
            path.getClass();
            nruVar2.b = 1;
            nruVar2.c = path;
            String path2 = canonicalFile2.getPath();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nru nruVar3 = (nru) t.b;
            path2.getClass();
            int i = nruVar3.a | 16;
            nruVar3.a = i;
            nruVar3.e = path2;
            nrtVar.getClass();
            nruVar3.f = nrtVar;
            nruVar3.a = i | 32;
            byte[] q = ((nru) t.cz()).q();
            hjg.p();
            if (!WebPJni.a) {
                synchronized (WebPJni.class) {
                    if (!WebPJni.a) {
                        NativeLibHelper.a("jni_webp", true);
                        WebPJni.a = true;
                    }
                }
            }
            WebPJni.nativeEncodeForWhatsApp(q);
            return new cro(c2, false);
        } catch (IOException | Error | RuntimeException e2) {
            if (!c2.delete()) {
                ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/expression/image/WhatsAppWebpConverter", "convertToWebpWithLibwebp", 224, "WhatsAppWebpConverter.java")).t("Failed to cleanup webp file");
            }
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x004b A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:9:0x0020, B:12:0x0033, B:40:0x0047, B:42:0x004b, B:45:0x0057, B:46:0x0064, B:22:0x0066, B:24:0x006a, B:26:0x006e, B:28:0x0072, B:30:0x0077, B:34:0x0085, B:35:0x0092), top: B:8:0x0020, inners: #4, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File a(java.io.File r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "image/gif"
            java.lang.String r1 = defpackage.jbc.f(r7)
            boolean r0 = r0.equals(r1)
            idk r1 = r6.g
            if (r0 == 0) goto L11
            crh r2 = defpackage.crh.CREATE_ANIMATED_WHATSAPP_WEBP
            goto L13
        L11:
            crh r2 = defpackage.crh.CREATE_STATIC_WHATSAPP_WEBP
        L13:
            idn r1 = r1.a(r2)
            if (r0 == 0) goto L1c
            cqw r2 = defpackage.cqw.WHATSAPP_WEBP_CONVERT_ANIMATED_RESPONSE
            goto L1e
        L1c:
            cqw r2 = defpackage.cqw.WHATSAPP_WEBP_CONVERT_STATIC_RESPONSE
        L1e:
            r3 = 0
            r4 = 1
            cro r7 = r6.d(r7, r0, r8)     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            idk r8 = r6.g     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            java.lang.Boolean r5 = r7.b     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            if (r4 == r5) goto L32
            r5 = 1
            goto L33
        L32:
            r5 = 2
        L33:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            r0[r3] = r5     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            r8.e(r2, r0)     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            java.io.File r7 = r7.a     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L44 java.lang.RuntimeException -> L46 java.io.IOException -> L65
            r1.a()
            return r7
        L42:
            r7 = move-exception
            goto L93
        L44:
            r7 = move-exception
            goto L47
        L46:
            r7 = move-exception
        L47:
            boolean r8 = r7 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L55
            boolean r8 = r7 instanceof java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L52
            r8 = 10
            goto L57
        L52:
            r8 = 12
            goto L57
        L55:
            r8 = 11
        L57:
            idk r0 = r6.g     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L42
            r4[r3] = r8     // Catch: java.lang.Throwable -> L42
            r0.e(r2, r4)     // Catch: java.lang.Throwable -> L42
            throw r7     // Catch: java.lang.Throwable -> L42
        L65:
            r7 = move-exception
            boolean r8 = r7 instanceof com.google.android.libraries.inputmethod.webp.WebPFileTooLargeException     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L84
            boolean r8 = r7 instanceof com.google.android.libraries.inputmethod.webp.WebPTimeoutException     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L81
            boolean r8 = r7 instanceof java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L7e
            boolean r8 = r7 instanceof defpackage.cqm     // Catch: java.lang.Throwable -> L42
            r0 = 7
            if (r8 != 0) goto L85
            boolean r8 = r7 instanceof com.google.android.libraries.inputmethod.webp.WebPDecodeException     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L7c
            goto L85
        L7c:
            r0 = 4
            goto L85
        L7e:
            r0 = 9
            goto L85
        L81:
            r0 = 8
            goto L85
        L84:
            r0 = 5
        L85:
            idk r8 = r6.g     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L42
            r4[r3] = r0     // Catch: java.lang.Throwable -> L42
            r8.e(r2, r4)     // Catch: java.lang.Throwable -> L42
            throw r7     // Catch: java.lang.Throwable -> L42
        L93:
            r1.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crp.a(java.io.File, java.lang.String):java.io.File");
    }
}
