package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bc  reason: default package */
/* loaded from: classes.dex */
public final class bc implements pe {
    final /* synthetic */ bi a;

    public bc(bi biVar) {
        this.a = biVar;
    }

    @Override // defpackage.pe
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = true != ((Boolean) arrayList.get(i)).booleanValue() ? -1 : 0;
        }
        bf bfVar = (bf) this.a.m.pollFirst();
        if (bfVar == null) {
            new StringBuilder("No permissions were requested for ").append(this);
            Log.w("FragmentManager", "No permissions were requested for ".concat(toString()));
            return;
        }
        String str = bfVar.a;
        int i2 = bfVar.b;
        an b = this.a.a.b(str);
        if (b == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(str)));
        } else {
            b.ar(i2, iArr);
        }
    }
}
