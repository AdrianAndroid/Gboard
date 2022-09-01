package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fng  reason: default package */
/* loaded from: classes.dex */
public final class fng {
    static final fne a = new fnb(fri.c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final fne b = new fnc(fri.c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object c = new Object();
    private static Context d;
    private static volatile frm e;

    static {
        new fmz(fri.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new fna(fri.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (fng.class) {
            if (d != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context == null) {
            } else {
                d = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                e();
                frm frmVar = e;
                Parcel hG = frmVar.hG(7, frmVar.a());
                boolean g = bkh.g(hG);
                hG.recycle();
                return g;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | ftu e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fnk c(String str, fri friVar, boolean z, boolean z2) {
        fnk b2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                e();
                fyb.ax(d);
                fnj fnjVar = new fnj(str, friVar, z, z2);
                try {
                    frm frmVar = e;
                    ftm b3 = ftl.b(d.getPackageManager());
                    Parcel a2 = frmVar.a();
                    bkh.d(a2, fnjVar);
                    bkh.f(a2, b3);
                    Parcel hG = frmVar.hG(5, a2);
                    boolean g = bkh.g(hG);
                    hG.recycle();
                    b2 = g ? fnk.a : new fnk(false);
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    b2 = fnk.b();
                }
            } catch (ftu e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                e3.getMessage();
                b2 = fnk.b();
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return b2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r8v0, types: [ftm, android.os.IBinder] */
    public static fnk d(String str, boolean z) {
        fnk b2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fyb.ax(d);
            try {
                e();
                fnh fnhVar = new fnh(str, z, false, ftl.b(d), false);
                try {
                    frm frmVar = e;
                    Parcel a2 = frmVar.a();
                    bkh.d(a2, fnhVar);
                    Parcel hG = frmVar.hG(6, a2);
                    fni fniVar = (fni) bkh.a(hG, fni.CREATOR);
                    hG.recycle();
                    if (fniVar.a) {
                        fniVar.b();
                        b2 = new fnk(true);
                    } else {
                        String str2 = fniVar.b;
                        if (fniVar.a() == 4) {
                            new PackageManager.NameNotFoundException();
                        }
                        fniVar.b();
                        fniVar.a();
                        b2 = new fnk(false);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    b2 = fnk.b();
                }
            } catch (ftu e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                e3.getMessage();
                b2 = fnk.b();
            }
            return b2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void e() {
        frm frmVar;
        if (e != null) {
            return;
        }
        fyb.ax(d);
        synchronized (c) {
            if (e == null) {
                IBinder d2 = fty.c(d, fty.b, "com.google.android.gms.googlecertificates").d();
                if (d2 == null) {
                    frmVar = null;
                } else {
                    IInterface queryLocalInterface = d2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    frmVar = queryLocalInterface instanceof frm ? (frm) queryLocalInterface : new frm(d2);
                }
                e = frmVar;
            }
        }
    }
}
