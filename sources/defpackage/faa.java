package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: faa  reason: default package */
/* loaded from: classes.dex */
public final class faa implements eyn, eze {
    public static final ope b;
    private final Context d;
    private final String e;
    private final oqd f;
    private ezf h;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/translate/TwsTranslator");
    private static final int c = (int) gvu.MEBIBYTES.b(2);
    private long i = 0;
    private final idk g = ieh.j();

    static {
        opd opdVar = new opd();
        long seconds = TimeUnit.DAYS.toSeconds(3L);
        opdVar.b = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
        opdVar.b(3, TimeUnit.DAYS);
        b = opdVar.a();
    }

    public faa(Context context) {
        this.d = context;
        this.e = "GoogleTranslate/" + jam.l(context) + " (Linux; U; Android" + Build.VERSION.RELEASE + "; " + Build.MODEL + ")";
        File file = new File(context.getCacheDir(), "translate_cache");
        if (!file.exists()) {
            file.mkdir();
        }
        oqc oqcVar = new oqc();
        oqcVar.b(5000L, TimeUnit.MILLISECONDS);
        oqcVar.c(2000L, TimeUnit.MILLISECONDS);
        oqcVar.d(2000L, TimeUnit.MILLISECONDS);
        oqcVar.f.add(new orm(1));
        oqcVar.i = new opc(file, c);
        oqcVar.t = false;
        this.f = oqcVar.a();
    }

    @Override // defpackage.eyn
    public final void a(Locale locale, eyl eylVar) {
        Map d = ezz.d(this.d, locale);
        Map e = ezz.e(locale);
        if (eylVar != null) {
            eylVar.a(d, e);
        }
    }

    @Override // defpackage.eyn
    public final void b() {
        this.i = 0L;
        if (this.h == null) {
            this.h = new ezf(this);
        }
        ezf ezfVar = this.h;
        if (ezfVar != null) {
            ezfVar.b = 0L;
            ezfVar.c = ((Long) ezg.a.c()).longValue();
            ezfVar.d = ((Long) ezg.b.c()).longValue();
            ezfVar.e = ((Long) ezg.c.c()).longValue();
        }
    }

    @Override // defpackage.eyn
    public final void c() {
        ezf ezfVar = this.h;
        if (ezfVar != null) {
            ezfVar.a();
        }
    }

    @Override // defpackage.eyn
    public final void d(ezq ezqVar, eym eymVar) {
        ezf ezfVar;
        if (TextUtils.isEmpty(ezqVar.a)) {
            eymVar.a(new ezr(2));
        } else if (ezqVar.e || (ezfVar = this.h) == null) {
            e(ezqVar, eymVar);
        } else {
            ezfVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            long j = ezfVar.b;
            long j2 = currentTimeMillis - j;
            if (j == 0 || j2 >= ezfVar.d) {
                ezfVar.b(ezqVar, eymVar);
                return;
            }
            ezfVar.a = new epv(ezfVar, ezqVar, eymVar, 5);
            kki.i(ezfVar.a, Math.max(ezfVar.e, ezfVar.c - j2));
        }
    }

    @Override // defpackage.eze
    public final void e(ezq ezqVar, eym eymVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.i != 0) {
            this.g.g(ezs.QUERY_INTERVAL, currentTimeMillis - this.i);
        }
        this.i = currentTimeMillis;
        kcu.U(gxo.a(6).hQ(new brs(this, ezqVar, 20)), new eay(eymVar, 9), gyc.b);
    }

    @Override // defpackage.eyn
    public final /* synthetic */ boolean f(String str, String str2) {
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:139:0x02ee
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public final defpackage.ezr g(defpackage.ezq r21) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.faa.g(ezq):ezr");
    }
}
