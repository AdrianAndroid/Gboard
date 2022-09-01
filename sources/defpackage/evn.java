package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaintenance;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;

/* compiled from: PG */
/* renamed from: evn  reason: default package */
/* loaded from: classes.dex */
public final class evn implements ewc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/ekho/BackgroundEkhoMaintenance");
    public final lgb b;
    public final idk c;
    private final mkr d;
    private boolean e = false;

    public evn(lgb lgbVar, mkr mkrVar, idk idkVar) {
        this.b = lgbVar;
        this.d = mkrVar;
        this.c = idkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final EkhoMaintenance a() {
        if (this.e) {
            throw new UnsatisfiedLinkError("Previously failed to load native library.");
        }
        try {
            NativeLibHelper.a("gboard_soda_jni", true);
            return new EkhoMaintenance();
        } catch (UnsatisfiedLinkError e) {
            this.e = true;
            throw e;
        }
    }

    @Override // defpackage.ewc
    public final mko b() {
        this.c.e(evu.CLEANUP_START, new Object[0]);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mko hQ = this.d.hQ(new evl(this, 0));
        kcu.U(hQ, new evm(this, elapsedRealtime, 1), this.d);
        return hQ;
    }

    @Override // defpackage.ewc
    public final mko c() {
        this.c.e(evu.RECORD_STATS_START, new Object[0]);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mko hQ = this.d.hQ(new evl(this, 2));
        kcu.U(hQ, new evm(this, elapsedRealtime, 0), this.d);
        return hQ;
    }
}
