package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bwg  reason: default package */
/* loaded from: classes.dex */
public final class bwg {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardUtils");

    public static void a(Context context) {
        ino M = ino.M(context);
        M.i("clipboard_paste_times", M.c("clipboard_paste_times", 0L) + 1);
    }

    public static void b(EditorInfo editorInfo, idk idkVar) {
        if (editorInfo != null) {
            bwa bwaVar = bwa.PASTE_EDIT_BOX_TYPE;
            int i = 1;
            Object[] objArr = new Object[1];
            if (!ham.G(editorInfo)) {
                if (ham.ad(editorInfo)) {
                    i = 2;
                } else if (ham.U(editorInfo)) {
                    i = 3;
                } else if (ham.W(editorInfo)) {
                    i = 4;
                } else if (ham.R(editorInfo)) {
                    i = 5;
                } else if (ham.E(editorInfo)) {
                    i = 6;
                } else {
                    i = ham.F(editorInfo) ? 8 : 0;
                }
            }
            objArr[0] = Integer.valueOf(i);
            idkVar.e(bwaVar, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r7, defpackage.ddd r8, long r9) {
        /*
            java.lang.String r0 = "ClipboardUtils.java"
            java.lang.String r1 = "getLastModifiedTime"
            java.lang.String r2 = "com/google/android/apps/inputmethod/libs/clipboard/ClipboardUtils"
            r3 = 0
            java.io.File r5 = new java.io.File     // Catch: java.lang.SecurityException -> L2e
            r5.<init>(r7)     // Catch: java.lang.SecurityException -> L2e
            boolean r6 = r5.exists()     // Catch: java.lang.SecurityException -> L2e
            if (r6 != 0) goto L29
            ltg r5 = defpackage.bwg.a     // Catch: java.lang.SecurityException -> L2e
            ltv r5 = r5.d()     // Catch: java.lang.SecurityException -> L2e
            ltd r5 = (defpackage.ltd) r5     // Catch: java.lang.SecurityException -> L2e
            r6 = 242(0xf2, float:3.39E-43)
            ltv r5 = r5.k(r2, r1, r6, r0)     // Catch: java.lang.SecurityException -> L2e
            ltd r5 = (defpackage.ltd) r5     // Catch: java.lang.SecurityException -> L2e
            java.lang.String r6 = "File %s does not exist"
            r5.w(r6, r7)     // Catch: java.lang.SecurityException -> L2e
            goto L4a
        L29:
            long r0 = r5.lastModified()     // Catch: java.lang.SecurityException -> L2e
            goto L4b
        L2e:
            r5 = move-exception
            ltg r6 = defpackage.bwg.a
            ltv r6 = r6.d()
            ltd r6 = (defpackage.ltd) r6
            ltv r5 = r6.i(r5)
            ltd r5 = (defpackage.ltd) r5
            r6 = 247(0xf7, float:3.46E-43)
            ltv r0 = r5.k(r2, r1, r6, r0)
            ltd r0 = (defpackage.ltd) r0
            java.lang.String r1 = "Permission Denial. Failed to get last modified time for the file %s."
            r0.w(r1, r7)
        L4a:
            r0 = r3
        L4b:
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            ieh r7 = defpackage.ieh.j()
            long r9 = r9 - r0
            r7.g(r8, r9)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwg.c(java.lang.String, ddd, long):void");
    }

    public static void d(View view) {
        hxk.a(view.getContext()).b(view, 0);
    }

    public static boolean e(Context context, EditorInfo editorInfo, String str, long j, idk idkVar) {
        View G;
        Bitmap.CompressFormat f;
        Uri a2;
        String g = bvu.g(context, str);
        Uri parse = Uri.parse(str);
        if (((Boolean) bwv.t.c()).booleanValue() && !ham.r(editorInfo, g) && (f = ham.f(editorInfo)) != null && (a2 = bvu.a(context, parse, j, f)) != null) {
            g = jbc.d(f);
            parse = a2;
        }
        if (TextUtils.isEmpty(g)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardUtils", "maybeSendImageItemToApp", 120, "ClipboardUtils.java")).w("Failed to get mime type from uri string %s.", str);
            return false;
        }
        String str2 = null;
        if (!ham.r(editorInfo, g)) {
            ltg ltgVar = a;
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardUtils", "maybeSendImageItemToApp", 125, "ClipboardUtils.java")).w("Current application does not accept MimeType %s.", g);
            if (editorInfo != null && ham.n(editorInfo).isEmpty()) {
                String m = ham.m(editorInfo);
                if (iql.a(editorInfo) && iql.b(context, parse, g, m)) {
                    ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardUtils", "maybeSendImageItemToApp", 131, "ClipboardUtils.java")).w("Started an activity to share the image to %s", m);
                    return true;
                }
            }
            if (editorInfo != null) {
                str2 = gwc.f(context, editorInfo.packageName);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = context.getString(R.string.f159100_resource_name_obfuscated_res_0x7f1405a1);
            }
            hsk b = hsx.b();
            if (b != null && (G = b.G()) != null) {
                gyc.b.execute(new bue(context, str2, hyq.g(G, b.y()), 2));
            }
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardUtils", "maybeSendImageItemToApp", 137, "ClipboardUtils.java")).t("Displayed a banner to let users know that the current application does not support pasting images.");
            return false;
        }
        hsk b2 = hsx.b();
        if (b2 == null || !b2.bR(new aqq(parse, new ClipDescription(context.getString(R.string.f154180_resource_name_obfuscated_res_0x7f140347), new String[]{g}), (Uri) null))) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardUtils", "maybeSendImageItemToApp", 158, "ClipboardUtils.java")).t("Failed to send image clip item to app.");
            return false;
        }
        idkVar.e(bwa.PASTE_EDIT_BOX_TYPE, 7);
        a((Context) b2);
        return true;
    }
}
