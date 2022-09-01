package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: da  reason: default package */
/* loaded from: classes.dex */
public abstract class da {
    static final dx a = new dx(new dy());
    public static final int b = -100;
    public static wu c = null;
    public static wu d = null;
    private static Boolean i = null;
    public static boolean e = false;
    private static Object j = null;
    public static Context f = null;
    public static final qq g = new qq();
    public static final Object h = new Object();
    private static final Object k = new Object();

    public static Object d() {
        Context a2;
        Object obj = j;
        if (obj != null) {
            return obj;
        }
        if (f == null) {
            Iterator it = g.iterator();
            while (true) {
                if (it.hasNext()) {
                    da daVar = (da) ((WeakReference) it.next()).get();
                    if (daVar != null && (a2 = daVar.a()) != null) {
                        f = a2;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Context context = f;
        if (context != null) {
            j = context.getSystemService("locale");
        }
        return j;
    }

    public static void j(da daVar) {
        synchronized (h) {
            Iterator it = g.iterator();
            while (it.hasNext()) {
                da daVar2 = (da) ((WeakReference) it.next()).get();
                if (daVar2 == daVar || daVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r7 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
        if (r7 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(android.content.Context r7) {
        /*
            java.lang.String r0 = "Storing App Locales : Failed to persist app-locales: "
            boolean r1 = p(r7)
            if (r1 != 0) goto L9
            return
        L9:
            boolean r1 = defpackage.li.f()
            if (r1 == 0) goto L1f
            boolean r0 = defpackage.da.e
            if (r0 != 0) goto L1e
            dx r0 = defpackage.da.a
            az r1 = new az
            r2 = 3
            r1.<init>(r7, r2)
            r0.execute(r1)
        L1e:
            return
        L1f:
            java.lang.Object r1 = defpackage.da.k
            monitor-enter(r1)
            wu r2 = defpackage.da.c     // Catch: java.lang.Throwable -> Lc3
            if (r2 != 0) goto L44
            wu r0 = defpackage.da.d     // Catch: java.lang.Throwable -> Lc3
            if (r0 != 0) goto L34
            java.lang.String r7 = defpackage.ce.c(r7)     // Catch: java.lang.Throwable -> Lc3
            wu r7 = defpackage.wu.c(r7)     // Catch: java.lang.Throwable -> Lc3
            defpackage.da.d = r7     // Catch: java.lang.Throwable -> Lc3
        L34:
            wu r7 = defpackage.da.d     // Catch: java.lang.Throwable -> Lc3
            boolean r7 = r7.g()     // Catch: java.lang.Throwable -> Lc3
            if (r7 == 0) goto L3e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc3
            return
        L3e:
            wu r7 = defpackage.da.d     // Catch: java.lang.Throwable -> Lc3
            defpackage.da.c = r7     // Catch: java.lang.Throwable -> Lc3
            goto Lc1
        L44:
            wu r3 = defpackage.da.d     // Catch: java.lang.Throwable -> Lc3
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lc3
            if (r2 != 0) goto Lc1
            wu r2 = defpackage.da.c     // Catch: java.lang.Throwable -> Lc3
            defpackage.da.d = r2     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = r2.e()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r3 = ""
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lc3
            if (r3 == 0) goto L62
            java.lang.String r0 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            r7.deleteFile(r0)     // Catch: java.lang.Throwable -> Lc3
            goto Lc1
        L62:
            r3 = 1
            r4 = 0
            java.lang.String r5 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileOutputStream r7 = r7.openFileOutput(r5, r4)     // Catch: java.io.FileNotFoundException -> Lb0 java.lang.Throwable -> Lc3
            org.xmlpull.v1.XmlSerializer r4 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> Lc3
            r5 = 0
            r4.setOutput(r7, r5)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            java.lang.String r6 = "UTF-8"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            r4.startDocument(r6, r3)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            java.lang.String r3 = "locales"
            r4.startTag(r5, r3)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            java.lang.String r3 = "application_locales"
            r4.attribute(r5, r3, r2)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            java.lang.String r3 = "locales"
            r4.endTag(r5, r3)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            r4.endDocument()     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            if (r7 == 0) goto Lc1
        L8f:
            r7.close()     // Catch: java.io.IOException -> Lc1 java.lang.Throwable -> Lc3
            goto Lc1
        L93:
            r0 = move-exception
            goto Laa
        L95:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L93
            r4.append(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "AppLocalesStorageHelper"
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L93
            android.util.Log.w(r0, r2, r3)     // Catch: java.lang.Throwable -> L93
            if (r7 == 0) goto Lc1
            goto L8f
        Laa:
            if (r7 == 0) goto Laf
            r7.close()     // Catch: java.io.IOException -> Laf java.lang.Throwable -> Lc3
        Laf:
            throw r0     // Catch: java.lang.Throwable -> Lc3
        Lb0:
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r0 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            r7[r4] = r0     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r0 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String r7 = java.lang.String.format(r2, r7)     // Catch: java.lang.Throwable -> Lc3
            android.util.Log.w(r0, r7)     // Catch: java.lang.Throwable -> Lc3
        Lc1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc3
            return
        Lc3:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc3
            goto Lc7
        Lc6:
            throw r7
        Lc7:
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da.o(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Context context) {
        if (i == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, dw.class), 640);
                if (serviceInfo.metaData != null) {
                    i = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                i = false;
            }
        }
        return i.booleanValue();
    }

    public static da s(Context context) {
        return new dr(context, null, context);
    }

    public static da u(Activity activity) {
        return new dr(activity, null, activity);
    }

    public static da v(Dialog dialog) {
        return new dr(dialog.getContext(), dialog.getWindow(), dialog);
    }

    public Context a() {
        throw null;
    }

    public abstract cm b();

    public abstract View c(int i2);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void k(int i2);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);

    public void q() {
        throw null;
    }

    public abstract void r();

    public abstract void t(int i2);
}
