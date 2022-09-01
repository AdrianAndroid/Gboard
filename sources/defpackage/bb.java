package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bb  reason: default package */
/* loaded from: classes.dex */
public final class bb implements pe {
    final /* synthetic */ bi a;
    private final /* synthetic */ int b;

    public bb(bi biVar, int i) {
        this.b = i;
        this.a = biVar;
    }

    @Override // defpackage.pe
    public final /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            pd pdVar = (pd) obj;
            bf bfVar = (bf) this.a.m.pollFirst();
            if (bfVar == null) {
                new StringBuilder("No IntentSenders were started for ").append(this);
                Log.w("FragmentManager", "No IntentSenders were started for ".concat(toString()));
                return;
            }
            String str = bfVar.a;
            int i = bfVar.b;
            an b = this.a.a.b(str);
            if (b == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(str)));
                return;
            } else {
                b.P(i, pdVar.a, pdVar.b);
                return;
            }
        }
        pd pdVar2 = (pd) obj;
        bf bfVar2 = (bf) this.a.m.pollFirst();
        if (bfVar2 == null) {
            new StringBuilder("No Activities were started for result for ").append(this);
            Log.w("FragmentManager", "No Activities were started for result for ".concat(toString()));
            return;
        }
        String str2 = bfVar2.a;
        int i2 = bfVar2.b;
        an b2 = this.a.a.b(str2);
        if (b2 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(str2)));
        } else {
            b2.P(i2, pdVar2.a, pdVar2.b);
        }
    }
}
