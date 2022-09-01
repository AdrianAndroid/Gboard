package defpackage;

import com.google.android.apps.inputmethod.libs.latin5.PeriodicTaskRunner;
import com.google.android.keyboard.client.delight5.DynamicLm;

/* compiled from: PG */
/* renamed from: dos  reason: default package */
/* loaded from: classes.dex */
public final class dos extends cay {
    final /* synthetic */ PeriodicTaskRunner b;

    public dos(PeriodicTaskRunner periodicTaskRunner) {
        this.b = periodicTaskRunner;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cay, defpackage.cav
    public final void a(mvm mvmVar, DynamicLm dynamicLm) {
        super.a(mvmVar, dynamicLm);
        muq muqVar = this.a;
        if (muqVar == null) {
            ((ltd) ((ltd) PeriodicTaskRunner.a.d()).k("com/google/android/apps/inputmethod/libs/latin5/PeriodicTaskRunner$TrackOperation", "performInternal", 337, "PeriodicTaskRunner.java")).t("Failed to get DynamicLmStats");
            return;
        }
        idk idkVar = this.b.f;
        hxx hxxVar = hxx.DYNAMIC_LM_STATS;
        Object[] objArr = new Object[6];
        mvl b = mvl.b(mvmVar.b);
        if (b == null) {
            b = mvl.UNKNOWN;
        }
        objArr[0] = b.name();
        objArr[1] = Long.valueOf(cbw.a(mvmVar));
        objArr[2] = Integer.valueOf(muqVar.a);
        objArr[3] = Integer.valueOf(muqVar.b);
        objArr[4] = Integer.valueOf(muqVar.c);
        objArr[5] = Long.valueOf(muqVar.d);
        idkVar.e(hxxVar, objArr);
    }
}
