package defpackage;

import com.google.android.keyboard.client.delight5.DynamicLm;

/* compiled from: PG */
/* renamed from: cay  reason: default package */
/* loaded from: classes.dex */
public class cay extends cav {
    public muq a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cav
    public void a(mvm mvmVar, DynamicLm dynamicLm) {
        dynamicLm.openDynamicLm(mvmVar);
        this.a = dynamicLm.getDynamicLmStats(mvmVar);
        dynamicLm.closeDynamicLm(mvmVar);
    }

    @Override // defpackage.cav
    protected final boolean c() {
        return ((Boolean) cas.T.c()).booleanValue();
    }
}
