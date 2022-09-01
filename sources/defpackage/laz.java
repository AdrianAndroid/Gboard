package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: laz  reason: default package */
/* loaded from: classes.dex */
public final class laz implements lay {
    public final lax a;
    private final lbg b;
    private final lav c;
    private final lbi d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public laz(lbg lbgVar, lax laxVar, lav lavVar, lbi lbiVar) {
        this.b = lbgVar;
        this.a = laxVar;
        this.c = lavVar;
        this.d = lbiVar;
    }

    public static List h(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // defpackage.lay
    public final gen a(List list) {
        Object obj;
        lbg lbgVar = this.b;
        if (lbgVar.b == null) {
            obj = lbg.b();
        } else {
            lbg.c.g("deferredInstall(%s)", list);
            fxa fxaVar = new fxa();
            lbgVar.b.e(new lbd(lbgVar, fxaVar, list, fxaVar, null), fxaVar);
            obj = fxaVar.a;
        }
        return (gen) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r2.containsAll(r4) != false) goto L43;
     */
    @Override // defpackage.lay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gen b(defpackage.lbb r14) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.laz.b(lbb):gen");
    }

    @Override // defpackage.lay
    public final Set c() {
        Set c = this.c.c();
        return c == null ? Collections.emptySet() : c;
    }

    @Override // defpackage.lay
    public final Set d() {
        return this.c.b();
    }

    @Override // defpackage.lay
    public final synchronized void e(hgo hgoVar) {
        this.a.b(hgoVar);
    }

    @Override // defpackage.lay
    public final synchronized void f(hgo hgoVar) {
        this.a.c(hgoVar);
    }

    @Override // defpackage.lay
    public final boolean g(lbh lbhVar, Activity activity) {
        PendingIntent pendingIntent;
        if (lbhVar.b != 8 || (pendingIntent = lbhVar.g) == null) {
            return false;
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 0, 0, 0);
        return true;
    }
}
