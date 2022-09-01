package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cwn  reason: default package */
/* loaded from: classes.dex */
public final class cwn implements lgb, gzv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/sticker/ExpressiveStickerClientSupplier");
    public static final mlp b;
    private static volatile cwn d;
    private final lgb e;
    private mko g;
    private final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    static {
        nfh t = mlp.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mlp) t.b).a = kcu.w(5);
        b = (mlp) t.cz();
    }

    public cwn(final Context context, final lgb lgbVar, final lgb lgbVar2, final leq leqVar, lgb lgbVar3) {
        lgb n = jdg.n(new lgb() { // from class: cwj
            @Override // defpackage.lgb
            public final Object a() {
                dpe dpeVar;
                Uri uri;
                Context context2 = context;
                lgb lgbVar4 = lgbVar;
                lgb lgbVar5 = lgbVar2;
                leq leqVar2 = leqVar;
                gjz gjzVar = gvs.a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                flo floVar = !iec.b() ? null : (flo) iec.a(new buf(context2, 7));
                fma fmaVar = (floVar == null || !iec.b()) ? null : (fma) iec.a(new buf(floVar, 8));
                ihq a2 = ihq.a(3);
                mks mksVar = gxp.a().c;
                iic iicVar = iic.b;
                iicVar.a(bzg.m, mbn.EXPRESSIVE_STICKER_METADATA);
                iicVar.a(bzg.n, mbn.EXPRESSIVE_STICKER_AUTOCOMPLETE);
                iicVar.a(bzg.o, mbn.EXPRESSIVE_STICKER_SEARCH);
                Context applicationContext = context2.getApplicationContext();
                mlp mlpVar = cwn.b;
                lgb n2 = jdg.n(new boh(a2, 14));
                String str = (String) cwz.l.c();
                String str2 = (String) cwz.i.c();
                if (!TextUtils.isEmpty(str2)) {
                    dpe dpeVar2 = new dpe(ihq.a(3));
                    uri = Uri.parse(str2);
                    dpeVar = dpeVar2;
                } else {
                    dpeVar = null;
                    uri = null;
                }
                if (floVar == null) {
                    floVar = null;
                }
                if (fmaVar == null) {
                    fmaVar = null;
                }
                if (mlpVar != null) {
                    if (n2 == null) {
                        throw new IllegalStateException("rpcChannelSupplier and rpcChannel both null");
                    }
                    if (str == null) {
                        throw new IllegalStateException("apiKey == null");
                    }
                    cwl cwlVar = new cwl(new knn(applicationContext, mksVar, mlpVar, n2, str, new kcq(applicationContext), new kns(applicationContext, mlpVar, floVar, fmaVar), dpeVar, uri, null, null, null), lgbVar4, lgbVar5, leqVar2, gjzVar, gxp.a().b, null);
                    ieh.j().g(ctg.EXPRESSIVE_STICKER_CLIENT_INITIALIZE, SystemClock.elapsedRealtime() - elapsedRealtime);
                    return cwlVar;
                }
                throw new IllegalStateException("clientInfo == null");
            }
        });
        this.e = n;
        gzt.a.a(this);
    }

    public static cwn c(Context context) {
        cwn cwnVar = d;
        if (cwnVar == null) {
            synchronized (cwn.class) {
                cwnVar = d;
                if (cwnVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    cwn cwnVar2 = new cwn(applicationContext, cqg.c, new boh(applicationContext, 13), cuv.e, cqg.d);
                    d = cwnVar2;
                    cwnVar = cwnVar2;
                }
            }
        }
        return cwnVar;
    }

    public static void d(knk knkVar) {
        kog kogVar = ((knn) knkVar).f;
        synchronized (kogVar.c) {
            kof kofVar = kogVar.e;
            if (kofVar != null) {
                kofVar.c();
                kogVar.e = null;
            }
        }
        synchronized (kogVar.b) {
            kof kofVar2 = kogVar.d;
            if (kofVar2 != null) {
                kofVar2.c();
            }
        }
    }

    private static cwm e(mko mkoVar) {
        if (mkoVar != null) {
            try {
                return (cwm) kcu.S(mkoVar);
            } catch (IllegalStateException | ExecutionException e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/sticker/ExpressiveStickerClientSupplier", "getMetadataConfig", (char) 344, "ExpressiveStickerClientSupplier.java")).t("getMetadataConfig()");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011e A[Catch: all -> 0x0227, TryCatch #3 {, blocks: (B:12:0x008a, B:14:0x008e, B:15:0x0090, B:20:0x00be, B:22:0x00c2, B:23:0x00cd, B:37:0x0116, B:39:0x011e, B:40:0x012c, B:42:0x012e, B:43:0x0132, B:70:0x00d4, B:72:0x00da, B:73:0x00de, B:87:0x00fc, B:89:0x0106, B:90:0x0111, B:16:0x0091, B:18:0x0095, B:61:0x0097, B:64:0x00b9, B:65:0x00bd, B:66:0x00a7, B:69:0x00b2, B:74:0x00df, B:76:0x00e3, B:79:0x00ea, B:80:0x00ef, B:84:0x00f2, B:85:0x00f9, B:91:0x00fb), top: B:11:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e A[Catch: all -> 0x0227, TryCatch #3 {, blocks: (B:12:0x008a, B:14:0x008e, B:15:0x0090, B:20:0x00be, B:22:0x00c2, B:23:0x00cd, B:37:0x0116, B:39:0x011e, B:40:0x012c, B:42:0x012e, B:43:0x0132, B:70:0x00d4, B:72:0x00da, B:73:0x00de, B:87:0x00fc, B:89:0x0106, B:90:0x0111, B:16:0x0091, B:18:0x0095, B:61:0x0097, B:64:0x00b9, B:65:0x00bd, B:66:0x00a7, B:69:0x00b2, B:74:0x00df, B:76:0x00e3, B:79:0x00ea, B:80:0x00ef, B:84:0x00f2, B:85:0x00f9, B:91:0x00fb), top: B:11:0x008a }] */
    @Override // defpackage.lgb
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cwl a() {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwn.a():cwl");
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        cwm e = e(this.g);
        boolean z2 = this.f.get();
        printer.println("metadataConfig = ".concat(String.valueOf(String.valueOf(e))));
        printer.println("initialized = " + z2);
        boolean z3 = this.c.get();
        printer.println("syncing = " + z3);
        if (z2) {
            List a2 = ((knn) ((cwl) this.e.a()).a).g.a();
            if (!z) {
                printer.println("favorites = ".concat(a2.toString()));
                return;
            }
            int size = a2.size();
            printer.println("numFavorites = " + size);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ExpressiveStickerClientSupplier";
    }
}
