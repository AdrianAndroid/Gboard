package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.UUID;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: goh  reason: default package */
/* loaded from: classes.dex */
public class goh implements gpa {
    private static final ltg a = ltg.j("com/google/android/libraries/gsa/s3/lib/AudioS3RequestProducerFactory");
    public final Context b;
    protected final gow c;
    protected final String d;
    protected final lgb e;
    public final blc f;
    public final bnc g;
    public final int h;
    public final int i;
    public gol j;
    public final int k;
    protected final fxa l;
    public final opu m;
    private final String n;
    private final String o;

    public goh(Context context, gow gowVar, String str, opu opuVar, bnc bncVar, int i, blc blcVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        String str2;
        int e = e(i);
        fxa fxaVar = new fxa(context);
        this.b = context;
        this.c = gowVar;
        this.d = str;
        String packageName = context.getPackageName();
        this.n = packageName;
        try {
            str2 = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            ((ltd) ((ltd) a.d().h(luh.a, "AudioS3ReqProdFactory")).k("com/google/android/libraries/gsa/s3/lib/AudioS3RequestProducerFactory", "initApplicationVersion", 203, "AudioS3RequestProducerFactory.java")).w("Could not get application version for %s", this.n);
            str2 = null;
        }
        this.o = str2;
        this.e = new gog(this);
        this.m = opuVar;
        this.g = bncVar;
        this.k = i;
        this.h = e;
        this.i = 16;
        this.f = blcVar;
        this.l = fxaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String c() {
        return UUID.randomUUID().toString();
    }

    public static int e(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return 16000;
            }
            if (i2 != 3 && i2 != 9) {
                if (i2 != 10) {
                    throw new RuntimeException("Unsupported encoding: ".concat(ndb.ac(i)));
                }
                return 16000;
            } else if (i == 4) {
                return 8000;
            } else {
                if (i != 10 && i != 11) {
                    throw new RuntimeException("Unsupported AMR encoding: ".concat(ndb.ac(i)));
                }
                return 16000;
            }
        }
        throw null;
    }

    @Override // defpackage.gpa
    public gpd a() {
        return new gpd(new gox(d(), b(), c(), this.d, this.c), this.l.i(((gog) this.e).a(), this.k));
    }

    public final nkl b() {
        nfh t = nkl.f.t();
        int i = this.k;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nkl nklVar = (nkl) t.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        nklVar.b = i2;
        int i3 = nklVar.a | 1;
        nklVar.a = i3;
        int i4 = this.h;
        nklVar.a = i3 | 2;
        nklVar.c = i4;
        int bitCount = Integer.bitCount(this.i);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nkl nklVar2 = (nkl) t.b;
        nklVar2.a |= 4;
        nklVar2.d = bitCount;
        return (nkl) t.cz();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Future d() {
        mld e = mld.e();
        nfh t = nkq.l.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nkq nkqVar = (nkq) t.b;
        int i = nkqVar.a | 1;
        nkqVar.a = i;
        nkqVar.b = "";
        nkqVar.a = i | 4;
        nkqVar.c = "Android";
        String str = Build.DISPLAY;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nkq nkqVar2 = (nkq) t.b;
        str.getClass();
        int i2 = nkqVar2.a | 8;
        nkqVar2.a = i2;
        nkqVar2.d = str;
        String str2 = this.n;
        str2.getClass();
        nkqVar2.a = i2 | 16;
        nkqVar2.e = str2;
        String str3 = Build.MODEL;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nkq nkqVar3 = (nkq) t.b;
        str3.getClass();
        int i3 = nkqVar3.a | 64;
        nkqVar3.a = i3;
        nkqVar3.g = str3;
        String str4 = this.o;
        if (str4 != null) {
            nkqVar3.a = i3 | 32;
            nkqVar3.f = str4;
        }
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i4 = displayMetrics.widthPixels;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nkq nkqVar4 = (nkq) t.b;
            nkqVar4.a |= 128;
            nkqVar4.h = i4;
            int i5 = displayMetrics.heightPixels;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nkq nkqVar5 = (nkq) t.b;
            nkqVar5.a |= 256;
            nkqVar5.i = i5;
            int i6 = displayMetrics.densityDpi;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nkq nkqVar6 = (nkq) t.b;
            nkqVar6.a |= 512;
            nkqVar6.j = i6;
        }
        e.c((nkq) t.cz());
        return e;
    }
}
