package defpackage;

import com.google.android.keyboard.client.delight5.DynamicLm;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdj  reason: default package */
/* loaded from: classes.dex */
public final class cdj extends cav {
    private final List a;

    public cdj(List list) {
        this.a = list;
    }

    @Override // defpackage.cav
    protected final void a(mvm mvmVar, DynamicLm dynamicLm) {
        dynamicLm.openDynamicLm(mvmVar);
        dynamicLm.clearDynamicLm(mvmVar);
        for (mur murVar : this.a) {
            nfh t = muk.e.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            muk mukVar = (muk) t.b;
            mvmVar.getClass();
            mukVar.d = mvmVar;
            int i = mukVar.a | 4;
            mukVar.a = i;
            murVar.getClass();
            mukVar.b = murVar;
            int i2 = i | 1;
            mukVar.a = i2;
            int i3 = murVar.d;
            mukVar.a = i2 | 2;
            mukVar.c = i3;
            dynamicLm.incrementNgramInDynamicLm((muk) t.cz());
        }
        dynamicLm.flushDynamicLm(mvmVar);
        dynamicLm.closeDynamicLm(mvmVar);
    }
}
