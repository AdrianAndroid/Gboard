package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fxb  reason: default package */
/* loaded from: classes.dex */
public final class fxb implements jnq {
    private final Context a;

    public fxb(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.jnq
    public final void a(String str, Map map, jop jopVar) {
        Context context = this.a;
        opu opuVar = new opu(jopVar);
        kju.f(context);
        ijk ijkVar = new ijk(context, (byte[]) null);
        fsn fsnVar = new fsn(ijkVar, str, map, opuVar, null, null, null, null);
        long a = fsnVar.e.a();
        ((Handler) ijkVar.b).postAtTime(new fsm(ijkVar, fsnVar, a, 0, null, null), fsnVar, a + SystemClock.uptimeMillis());
        ?? r2 = ijkVar.a;
        fsnVar.f.c(2, fti.COARSE);
        fsu fsuVar = (fsu) r2;
        fsuVar.a.offer(fsnVar);
        fsuVar.c.post(r2);
    }
}
